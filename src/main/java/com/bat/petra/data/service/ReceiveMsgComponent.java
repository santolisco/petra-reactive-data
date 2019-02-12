package com.bat.petra.data.service;

import com.bat.petra.data.model.*;

import org.json.JSONException;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;



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
