package com.bat.petra.data;

import com.bat.petra.data.service.ReceiveMsgComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class WorkerApplication  {


    private static final Logger LOGGER = LoggerFactory.getLogger(WorkerApplication.class);


    public static void main(String[] args) {

        System.out.println("Hola Carola - 1");
        SpringApplication.run(ReceiveMsgComponent.class, args);
        System.out.println("Hola Carola - 1 .1");
    }



}
