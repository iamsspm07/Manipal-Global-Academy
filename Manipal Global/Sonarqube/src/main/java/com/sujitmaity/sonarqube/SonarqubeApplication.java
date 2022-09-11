package com.sujitmaity.sonarqube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SonarqubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarqubeApplication.class, args);
//		ApplicationContext context = new AnnotationConfigApplicationContext(SonarqubeApplication.class);
	}

}
