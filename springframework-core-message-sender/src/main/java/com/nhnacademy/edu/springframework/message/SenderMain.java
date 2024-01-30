package com.nhnacademy.edu.springframework.message;

import com.nhnacademy.edu.springframework.greeting.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SenderMain {

    public static void main(String[] args) {


        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageSendService service = context.getBean("messageSender", MessageSendService.class);

            service.doSendMessage();

        }
    }
}
