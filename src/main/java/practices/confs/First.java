package practices.confs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class First {
    @Bean
    public Bar bar() {
        return new Bar("Bar First");
    }

    @Bean
    public Foo foo() {
        return new Foo("Foo First");
    }
}
