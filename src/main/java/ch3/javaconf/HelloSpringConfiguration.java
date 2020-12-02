package ch3.javaconf;

import ch2.hellospring.decoupled.MessageProvider;
import ch2.hellospring.decoupled.MessageRenderer;
import ch2.hellospring.decoupled.StandardOutMessageRenderer;
import ch3.annotation.ConfigurableMessageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSpringConfiguration {
    @Bean
    public String message() {
        return "Java Conf message";
    }

    @Bean
    public MessageProvider provider() {
        return new ConfigurableMessageProvider(message());
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
