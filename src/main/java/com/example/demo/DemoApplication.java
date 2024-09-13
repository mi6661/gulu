package com.example.demo;

import Bean.First.First;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//有参构造
		First first = (First)context.getBean("first_full");
		first.test();
		//无参构造
		First first_no = (First)context.getBean("first_no");
		first_no.test();
	}

}
