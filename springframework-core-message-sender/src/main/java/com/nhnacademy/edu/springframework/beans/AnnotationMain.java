package com.nhnacademy.edu.springframework.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.nhnent.edu.spring.greeting");
        context.getBean()
    }
}
