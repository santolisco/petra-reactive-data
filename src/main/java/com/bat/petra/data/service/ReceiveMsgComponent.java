package com.bat.petra.data.service;

import com.bat.petra.data.model.LineItem;
import com.bat.petra.data.model.Order;
import com.bat.petra.data.repository.*;
import com.bat.petra.data.repository.validation.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import com.bat.petra.data.model.Exception;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Component
@RabbitListener(queues = {"ordertocheckmq"})
public class ReceiveMsgComponent {


        @RabbitHandler
        public void receiveMessage(String message){

        System.out.print("hola carola 2");

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
