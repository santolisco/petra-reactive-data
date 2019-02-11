package com.bat.petra.data.worker;

import com.bat.petra.data.worker.service.WorkerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bat.petra.data")
public class WorkerApplication {



	public static void main(String[] args) {

		System.out.println("Hola Carola");

		SpringApplication.run(WorkerApplication.class, args);


	}
}
