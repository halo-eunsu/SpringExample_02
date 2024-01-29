package com.nhnacademy.edu.springframework.message;

public class EmailMessageSender implements  MessageSender{



    public void EmailMessageSender(User user, String message) {
        System.out.println("EmailMessageSender Initiated");
    }


    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sender to " + user.getEmail() + ":" + message);
    }

}
