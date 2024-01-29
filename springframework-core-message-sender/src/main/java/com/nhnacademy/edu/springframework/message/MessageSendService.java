package com.nhnacademy.edu.springframework.message;



public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService() {
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