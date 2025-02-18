package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Main {
 public static void main(String[] args) {
 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 MyBean myBean = context.getBean(MyBean.class);
 myBean.printMessage(); // Output: Hello from MyBean!
 }
}
