package ch2.hellospring.annotated;

import ch2.hellospring.decoupled.HelloSpringMessageProvider;
import ch2.hellospring.decoupled.MessageProvider;
import ch2.hellospring.decoupled.MessageRenderer;
import ch2.hellospring.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSpringConfiguration {
    @Bean
    public MessageProvider provider() {
        return new HelloSpringMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
