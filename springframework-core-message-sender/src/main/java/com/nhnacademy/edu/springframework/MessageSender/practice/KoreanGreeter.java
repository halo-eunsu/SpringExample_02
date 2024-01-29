package com.nhnacademy.edu.springframework.MessageSender.practice;

public class KoreanGreeter implements Greeter {

    public KoreanGreeter() {
        System.out.println("KoreanGreeter initiated!!");
    }

    @Override
    public void sayHello() {
        System.out.println("안녕 세상!");
    }
}