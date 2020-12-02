package ch3.littleexp;

import ch2.hellospring.decoupled.MessageProvider;

public class ClassJava implements MessageProvider {
    @Override
    public String getMessage() {
        return "Java";
    }
}
