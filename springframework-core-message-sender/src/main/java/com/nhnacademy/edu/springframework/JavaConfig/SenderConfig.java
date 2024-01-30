package com.nhnacademy.edu.springframework.JavaConfig;


import com.nhnacademy.edu.springframework.message.MessageSender;
import com.nhnacademy.edu.springframework.message.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:/src/test/beans.xml")
public class SenderConfig {

    @Bean(name="smsMessageSender")
    @Scope("prototype")
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }


}
