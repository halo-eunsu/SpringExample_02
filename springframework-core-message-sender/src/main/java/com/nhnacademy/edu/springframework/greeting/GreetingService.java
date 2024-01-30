package com.nhnacademy.edu.springframework.greeting;

//import com.nhnacademy.edu.springframework.greeting.service.Greeter;
//import com.nhnacademy.edu.springframework.greeting.stereotype.GreeterQualifier;
//import com.nhnacademy.edu.springframework.greeting.stereotype.Language;
import com.nhnacademy.edu.springframework.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class GreetingService {

    @Value("${from}")
    private String from;

    private Greeter greeter;
    //private final String name;

    public  GreetingService(){};
    public GreetingService(@Qualifier("koreanGreeter") Greeter greeter) {

        this.greeter = greeter;

    }

    public boolean greet() {
        // 인터페이스의 메소드를 호출하지만 실제 구현 객체의 메소드가 실행됩니다.
        System.out.println("From : " + from);
        return greeter.sayHello();
    }

    @Autowired
    @Required
    public void setKoreanGreeter(Greeter greeter) {
        this.greeter = greeter;
    }
    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }
}
