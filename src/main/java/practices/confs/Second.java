package practices.confs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class Second {
    @Bean
    public Bar bar2() {
        return new Bar("Bar Second");
    }

    @Bean
    public Foo foo2() {
        return new Foo("Foo Second");
    }
}
