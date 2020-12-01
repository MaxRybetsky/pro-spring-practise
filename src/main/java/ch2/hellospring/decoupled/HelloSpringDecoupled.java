package ch2.hellospring.decoupled;

public class HelloSpringDecoupled {
    public static void main(String[] args) {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        MessageProvider provider = new HelloSpringMessageProvider();
        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
