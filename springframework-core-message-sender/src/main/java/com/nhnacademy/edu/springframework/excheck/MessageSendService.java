package com.nhnacademy.edu.springframework.excheck;

public class MessageSendService {


    MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }




}
