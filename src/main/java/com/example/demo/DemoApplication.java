package com.example.demo;

import Bean.Aware.*;
import Bean.Event.EventPublisher.CustomEvent;
import Bean.First.First;
import Bean.Lifecycle.test_Component;
import Bean.Second.Second;
import Bean.Third.Components.TestOne;
import Bean.Third.OneConfiguration;
import Bean.Lifecycle.Config;
import Bean.Lifecycle.UseXml.Person;
import Bean.Event.*;
import Bean.Event.EventPublisher.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.lang.Thread.*;
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
		ConfigurableApplicationContext contextAnno = new AnnotationConfigApplicationContext(OneConfiguration.class);
		TestOne beanOne = (TestOne)contextAnno.getBean("testOne");
		System.out.println(beanOne.getName());
		System.out.println(beanOne.getAge());
		contextAnno.close();

		//Bean的生命周期学习
		ConfigurableApplicationContext lifeCycle = new AnnotationConfigApplicationContext(Config.class);
		test_Component lifetest = (test_Component)lifeCycle.getBean("life_first");
		lifetest.Hello();
		lifeCycle.close();//bean的销毁

			//这里是Bean的生命周期中用xml配置的方法
		ConfigurableApplicationContext bean_lifeCycle_xml = new ClassPathXmlApplicationContext("Bean_Life_Cycle.xml");
		Person person = (Person)bean_lifeCycle_xml.getBean("xml_bean_cycle");
		person.setID(9331);
		person.Print();



		//这里学习的是Aware接口的部分
			/*这里的是用BeanFactory获取Bean*/
		ApplicationContext AwareContext = new AnnotationConfigApplicationContext(AwareConfig.class);
		MyBeanFactoryAwareBean myBean = (MyBeanFactoryAwareBean)AwareContext.getBean(MyBeanFactoryAwareBean.class);
		SimpleBean simpleBean = (SimpleBean)myBean.getBean("simpleBean");
		simpleBean.SayHello();
		((AnnotationConfigApplicationContext)AwareContext).close();
			/*输出某个特定的属性值*/
		ApplicationContext Aware_Evironment_Context = new AnnotationConfigApplicationContext(AwareConfig.class);
		MyBeanEnvironmentAware envirAware = (MyBeanEnvironmentAware) Aware_Evironment_Context.getBean(MyBeanEnvironmentAware.class);
		envirAware.printProperty("java.version ");
		((AnnotationConfigApplicationContext)AwareContext).close();
			/*获取ApplicationContext*/
		ApplicationContext Aware_Bean_Context = new AnnotationConfigApplicationContext(AwareConfig.class);
		MyBeanContextAwareBean context_aware = (MyBeanContextAwareBean) Aware_Bean_Context.getBean(MyBeanContextAwareBean.class);
		SimpleBean simpleBean1 = (SimpleBean)context_aware.getApplictionContext().getBean("simpleBean");
		simpleBean1.SayHello();


		//监听事件

		ApplicationContext EventListenerContext = new AnnotationConfigApplicationContext(EventConfig.class);

		EventListenerContext.getBean("customEventPublisher", CustomEventPublisher.class).fire();


		((AnnotationConfigApplicationContext)EventListenerContext).close();


	}

}
