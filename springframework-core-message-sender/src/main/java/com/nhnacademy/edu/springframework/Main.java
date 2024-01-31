package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.greeting.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {




        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/test/beans.xml")) {
            GreetingService service = context.getBean("greetingService", GreetingService.class);
            service.greet();

        }

    }






}