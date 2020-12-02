package ch3.annotation;

import ch2.hellospring.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

@Component("provider")
public class HelloSpringMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello Spring from Annotations!";
    }
}
