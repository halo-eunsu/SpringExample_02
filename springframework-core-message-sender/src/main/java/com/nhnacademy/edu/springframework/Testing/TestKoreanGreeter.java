package com.nhnacademy.edu.springframework.Testing;

import com.nhnacademy.edu.springframework.Greeter;
import org.junit.Test;

public class TestKoreanGreeter {


    @Test
    void testKoreanGreeter() {
        Greeter greeter = mock(Greeter.class);
        greetingService = new GreetingService();
        greetingService.setKoreanGreeter(greeter);

        when(greeter.sayHello()).thenReturn(false);

        boolean actual = greetingService.doGreet();

        Assertions.assertThat(actual).isEqualTo(false);
    }

}
