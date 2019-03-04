package com.demo.testspring.test;

import com.demo.testbeanfactory.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringApplicationContext {

    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        User user= (User) applicationContext.getBean("userss");
        System.out.println("user: "+user);
    }
}
