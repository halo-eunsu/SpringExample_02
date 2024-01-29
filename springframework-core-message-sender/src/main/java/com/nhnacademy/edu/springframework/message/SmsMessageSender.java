package com.nhnacademy.edu.springframework.message;

public class SmsMessageSender implements  MessageSender{


    public SmsMessageSender(User user, String message){
        System.out.println("SmsMessageSender Initiated");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sender to " + user.getPhoneNumber() + ":" + message);
    }
}
