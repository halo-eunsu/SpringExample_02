package com.nhnacademy.edu.springframework.message;

import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender implements MessageSender {

    public SmsMessageSender(){
        System.out.println("SmsMessageSender Initiated");
    }

    public void init() {
        System.out.println("init method called in SmsMessageSender");
    }
    @Override
    public void sendMessage(User user, String message){
        System.out.println("SMS Message Sender to " + user.getPhoneNumber() + " : " + message);
    }
}