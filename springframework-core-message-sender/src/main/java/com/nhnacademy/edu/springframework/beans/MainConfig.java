package com.nhnacademy.edu.springframework.beans;


import com.nhnacademy.edu.springframework.Greeter;
import com.nhnacademy.edu.springframework.KoreanGreeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {

    @Bean
    @Scope("prototype")
    public Greeter koreanGreeter() {
        return new KoreanGreeter();
    }

}
