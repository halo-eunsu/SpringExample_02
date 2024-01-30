package com.nhnacademy.edu.springframework.message;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SenderMain {

    private static final String MESSAGE = "Hi";
    public static void main(String[] args) {
        User user = new User("a@123.com", "010-1234-5678");

        try () {
        //try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/test/beans.xml")) {
            MessageSendService service = context.getBean("messageSender", MessageSendService.class);

            service.doSendMessage(user, MESSAGE);

        }
    }
}
