package ch3.littleexp;

import ch2.hellospring.decoupled.MessageProvider;
import org.springframework.stereotype.Service;

@Service("provider")
public class ClassXML implements MessageProvider {
    @Override
    public String getMessage() {
        return "XML";
    }
}
