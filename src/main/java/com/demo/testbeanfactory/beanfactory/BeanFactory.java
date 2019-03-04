package com.demo.testbeanfactory.beanfactory;

import com.sun.org.apache.xalan.internal.xsltc.compiler.SourceLoader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
    static Properties properties=new Properties();
    static {
        try {
            //将bean.properties文件加载到输入流中
            InputStream InputStream=BeanFactory.class.getResourceAsStream("/bean.properties");

            properties.load(InputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();

        }
    }

    public static Object getBean(String key){
        String name=properties.getProperty(key);
        Object obj=null;
        try {
            Class clazz =Class.forName(name);
            obj=clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
