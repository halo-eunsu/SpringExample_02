package com.nhnacademy.edu.springframework.MainEx;

import com.nhnacademy.edu.springframework.message.MessageSendService;
import com.nhnacademy.edu.springframework.message.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class XMLMain {

    public static void main(String[] args) {


        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
            MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
            User user = new User("정봉수", "010-1111-2222");

            messageSendService.doSendMessage(user, "Hello, How are you?");
        }


    }
}
