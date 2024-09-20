package com.example.demo;

import AOP.Hello;
import AOP.LogHander;
import AOP.SpringHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Proxy;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Hello original = new SpringHello();
        Hello target = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(),original.getClass().getInterfaces(),new LogHander(original));
        target.say();
    }

}
