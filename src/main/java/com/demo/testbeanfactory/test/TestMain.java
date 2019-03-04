package com.demo.testbeanfactory.test;

import com.demo.testbeanfactory.beanfactory.BeanFactory;
import com.demo.testbeanfactory.entity.User;

public class TestMain {
    public static void main(String[] args) {
        User user= (User) BeanFactory.getBean("userr");
        System.out.println(user);
    }
}
