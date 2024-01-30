package com.nhnacademy.edu.springframework.beans;

import com.nhnacademy.edu.springframework.Greeter;
import com.nhnacademy.edu.springframework.KoreanGreeter;
import com.nhnacademy.edu.springframework.message.MessageSendService;
import com.nhnacademy.edu.springframework.message.MessageSender;
import com.nhnacademy.edu.springframework.message.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:/beans.xml")
public class SenderConfig {

    @Bean(name="smsMessageSender")
    @Scope("prototype")
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }


}
