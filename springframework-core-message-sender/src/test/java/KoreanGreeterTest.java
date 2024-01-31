import com.nhnacademy.edu.springframework.Greeter;
import com.nhnacademy.edu.springframework.greeting.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class KoreanGreeterTest {

    @InjectMocks
    private GreetingService greetingService;


    @Mock
    private Greeter greeter;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testKoreanGreeter() {

        when(greeter.sayHello()).thenReturn(false);

        boolean actual = greetingService.doGreet();

        Assertions.assertThat(actual).isEqualTo(false);
    }
}