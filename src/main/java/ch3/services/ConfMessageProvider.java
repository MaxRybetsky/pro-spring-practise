package ch3.services;

import ch2.hellospring.decoupled.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfMessageProvider implements MessageProvider {
    private String message;

    @Autowired
    public ConfMessageProvider(String message) {
        this.message = message;
    }

    public ConfMessageProvider(int message) {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
