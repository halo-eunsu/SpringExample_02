package com.nhnacademy.edu.springframework.MessageSender;

public class MessageSendService {

    MessageSender messageSender;



    public  MessageSendService(){

    }


    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

}
