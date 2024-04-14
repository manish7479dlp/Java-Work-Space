package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// object created using xlm file
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ctx.xml");
//		Fresher f = (Fresher) context.getBean("fresh");
//		f.getSkilled();
		
		//object created using annotation
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Fresher f = (Fresher) context.getBean("fresh");
		f.getSkilled();
	}

}
