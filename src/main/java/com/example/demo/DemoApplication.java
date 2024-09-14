package com.example.demo;

import Bean.First.First;
import Bean.Second.Second;
import Bean.Third.Components.TestOne;
import Bean.Third.OneConfiguration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		//一、第一种

		//有参构造
		First first = (First)context.getBean("first_full");
		first.test();
		//无参构造
		First first_no = (First)context.getBean("first_no");
		first_no.test();

		//二、第二种

		Second second = (Second)context.getBean("second");
		second.test();


		//三、通过Java注解配置bean

		//创建IoC容器对象
		ApplicationContext contextAnno = new AnnotationConfigApplicationContext(OneConfiguration.class);
		TestOne beanOne = (TestOne)contextAnno.getBean("testOne");
		System.out.println(beanOne.getName());
		System.out.println(beanOne.getAge());
	}

}
