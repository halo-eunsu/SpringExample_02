package com.nhnacademy.edu.springframework.message;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {

    public EmailMessageSender(){
        System.out.println("EmailMessageSender Initiated");
    }

    public void destroy(){
        System.out.println("destroy method called in EmailMessageSender");
    }

    @Override
    public void sendMessage(User user, String message){
        System.out.println("Email Message Sender to " + user.getEmail() + " : " + message);
    }
}