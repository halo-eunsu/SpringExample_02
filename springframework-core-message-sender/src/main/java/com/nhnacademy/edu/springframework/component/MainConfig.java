package com.nhnacademy.edu.springframework.component;


import com.nhnacademy.edu.springframework.EnglishGreeter;
import com.nhnacademy.edu.springframework.message.EmailMessageSender;
import com.nhnacademy.edu.springframework.message.MessageSendService;
import com.nhnacademy.edu.springframework.message.MessageSender;
import com.nhnacademy.edu.springframework.message.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework"})
@PropertySource("classpath:greeter.properties")
public class MainConfig {

    @Value("${phoneNumber}")
    private String phoneNumber;

    @Autowired
    @Qualifier("smsMessageSender")
    private MessageSender smsMessageSender;

    @Bean(name="messageSender")
    public MessageSendService messageSender() {
        return new MessageSendService(smsMessageSender, phoneNumber);
    }



}