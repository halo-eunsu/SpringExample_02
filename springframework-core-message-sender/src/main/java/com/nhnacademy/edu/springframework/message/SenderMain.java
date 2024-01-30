package com.nhnacademy.edu.springframework.message;

import com.nhnacademy.edu.springframework.greeting.GreetingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SenderMain {


    private static final String MESSAGE = "Hi";
        public static void main(String[] args) {
            User user = new User("a@123.com", "010-1234-5678");


            try (AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework");
            ) {
                MessageSendService service = context.getBean("messageSender", MessageSendService.class);

                service.doSendMessage(user, MESSAGE);

            }
        }
    }

