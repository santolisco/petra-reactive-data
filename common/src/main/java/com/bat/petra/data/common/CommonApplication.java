package com.bat.petra.data.common;

import com.bat.petra.data.common.service.subscribeService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class CommonApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(subscribeService.class, args).close();

    }
}
