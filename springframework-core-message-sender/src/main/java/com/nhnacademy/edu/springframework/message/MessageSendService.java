package com.nhnacademy.edu.springframework.message;


import com.nhnacademy.edu.springframework.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private MessageSender messageSender;

    private String phoneNumber;

    public MessageSendService() {
    }

    @Autowired
    public MessageSendService(@Qualifier("smsMessageSender") MessageSender messageSender, @Value("${phoneNumber}") String phoneNumber) {

        System.out.println("---------------"+ phoneNumber);
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

        user.setPhoneNumber(phoneNumber);
        messageSender.sendMessage(user, message);
    }
}