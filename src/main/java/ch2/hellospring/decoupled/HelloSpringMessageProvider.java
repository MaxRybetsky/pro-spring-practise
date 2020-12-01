package ch2.hellospring.decoupled;

public class HelloSpringMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello Spring!";
    }
}
