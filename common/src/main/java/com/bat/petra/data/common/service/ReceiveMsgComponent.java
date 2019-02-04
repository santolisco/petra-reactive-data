package com.bat.petra.data.common.service;

import com.bat.petra.data.common.model.LineItem;
import com.bat.petra.data.common.model.Order;
import com.bat.petra.data.common.repository.*;
import com.bat.petra.data.common.repository.validation.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.bat.petra.data.common.model.Exception;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;



@Component
public class ReceiveMsgComponent {

    @RabbitListener(queues = "ordertocheckmq")
    public void receiveMessage(String message){

        try {

            JSONObject json = new JSONObject(message);
            //get fields to validate
             Map<String, String> mymap = (Map<String, String>) json.getJSONArray("metadata");
            //get rules to validate
            List myerrors = new ArrayList<String>();
            Boolean errorFlg  = false;
            Validator resultVa = new AccountValidator();
            resultVa.setRule(RuleTypes.EDI, RulesEntities.ACCOUNT);
            String myvalue;
                myvalue = resultVa.getRuleValue("Account", json.get("sold_to").toString());

            if(myvalue.isEmpty()) {
                        myerrors.add("Error account:" + json.get("sold_to"));
                        errorFlg = true;
                    }

                    //validate products
                    Validator resultProd = new ProductValidator();
                    resultProd.setRule(RuleTypes.EDI, RulesEntities.PRODUCT);
                    JSONArray myitem = json.getJSONArray("items");

                    for (int i = 0; myitem.length() > i; i++) {

                        JSONObject mysjon = myitem.getJSONObject(i);
                        String myprod = resultProd.getRuleValue("ProductId", mysjon.getString("ProductId"));
                        if(myprod.isEmpty()) {
                            myerrors.add("Error product:" + json.get("ProductId"));
                            errorFlg = true;

                        }

                    }
                    if (errorFlg) {

                        ExceptionRepository mex = new ExceptionRepositoryImpl();
                        Exception newException = new Exception();
                        newException.setMessage(json.toString());

                        StringBuilder out = new StringBuilder();
                        for (Object o : myerrors)
                        {
                            out.append(o.toString());
                            out.append("\t");
                        }


                        newException.setErrordesc(out.toString());
                        mex.save(newException);

                    } else {
                        Order myorder = new Order();
                        OrderService myServiceOrder = new OrderService();
                        AccountService accnt = new AccountService();
                        myorder.setAccountId(accnt.getAccountId(json.getString("sold_to")));
                        myServiceOrder.save(myorder);

                        for (int i = 0; myitem.length() > i; i++) {

                            JSONObject mysjon = myitem.getJSONObject(i);
                            LineItem myline = new LineItem();
                            ProductService myProdServ =  new ProductService();
                            myline.setProductId(myProdServ.getProductId(mysjon.getString("ProductId")));
                            myline.setOrderId(myorder.getHerokuId().toString());
                            LineItemService myservline = new LineItemService();
                            myservline.save(myline);

                        }

                    }


        } catch (JSONException e) {
            e.printStackTrace();
        }


    }



}
