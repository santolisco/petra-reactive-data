package com.bat.petra.data.service;

import com.bat.petra.data.model.*;
import com.bat.petra.data.model.Exception;
import com.bat.petra.data.repository.*;
import com.bat.petra.data.repository.validation.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Component
@RabbitListener(queues = {"ordertocheckmq"})
public class ReceiveMsgComponent {


        @RabbitHandler
        public void receiveMessage(PetraMessage message){
            try {
                 System.out.print(" receive message [" + message.toString() + "] ");




        } catch (JSONException e) {
            e.printStackTrace();
        }


    }



}
