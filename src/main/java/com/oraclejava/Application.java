package com.oraclejava;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(Application.class, args);
		System.out.println("First Project");
		
		
		Volunteer v1 = context.getBean(Volunteer.class);
		System.out.println("id: " + v1.getVid());
		
		System.out.println("자원자이름: " + v1.getVname());
		
		System.out.println("노트북: " + v1.getNotebook());
		
		
		context.close();
		
		
	}
}
