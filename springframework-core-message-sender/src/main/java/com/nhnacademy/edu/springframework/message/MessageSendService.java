package com.nhnacademy.edu.springframework.message;


import com.nhnacademy.edu.springframework.SMS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private MessageSender messageSender;

    private String phoneNumber;

    public MessageSendService() {
    }


    public MessageSendService(@SMS MessageSender messageSender, @Value("${phoneNumber}") String phoneNumber) {

        this.messageSender = messageSender;
        this.phoneNumber = phoneNumber;
    }

//    public void setMessageSender(MessageSender messageSender) {
//        System.out.println("---invoked");
//        this.messageSender = messageSender;
//    }

    public void setSmsMessageSender(MessageSender messageSender) {
        System.out.println("---invoked");
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}