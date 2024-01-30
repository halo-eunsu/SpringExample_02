package com.nhnacademy.edu.springframework.component;


import com.nhnacademy.edu.springframework.EnglishGreeter;
import com.nhnacademy.edu.springframework.message.EmailMessageSender;
import com.nhnacademy.edu.springframework.message.MessageSendService;
import com.nhnacademy.edu.springframework.message.MessageSender;
import com.nhnacademy.edu.springframework.message.SmsMessageSender;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework"})
@PropertySource("classpath:greeter.properties")
public class MainConfig {

    @Bean(name="smsMessageSender")

    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

    @Bean(name="emailMessageSender")

    public MessageSender emailMessageSender() {
        return new EmailMessageSender();
    }

    @Bean(name="messageSender")

    public MessageSendService messageSender() {
        return new MessageSendService();
    }

}