package ch3.littleexp;

import ch3.littleexp.ClassJava;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public ClassJava provider() {
        return new ClassJava();
    }
}
