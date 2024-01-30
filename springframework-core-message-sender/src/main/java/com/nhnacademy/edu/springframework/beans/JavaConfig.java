package com.nhnacademy.edu.springframework.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean/*(name = "dbms")*/
    public String dbms() {
        return new String("MYSQL");
    }
}
