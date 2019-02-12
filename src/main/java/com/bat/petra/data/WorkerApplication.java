package com.bat.petra.data;

import com.bat.petra.data.service.ReceiveMsgComponent;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
public class WorkerApplication  {


    public static void main(String[] args) {

        System.out.println("Hola Carola - 1");
        SpringApplication.run(ReceiveMsgComponent.class, args);
        
    }

}
