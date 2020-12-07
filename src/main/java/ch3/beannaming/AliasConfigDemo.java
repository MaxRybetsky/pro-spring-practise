package ch3.beannaming;

import ch3.methinj.xml.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class AliasConfigDemo {
    @Configuration
    public static class AliasBeanConfig {
        @Bean(name = {"johnMayer", "johny", "john"})
        public Singer singer() {
            return new Singer();
        }
    }

    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(
                AliasBeanConfig.class
        );
        Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
        beans.forEach((k, v) -> System.out.println("id: " + k + "\n aliases: "
                + Arrays.toString(ctx.getAliases(k)) + "\n"));
        ctx.close();
    }
}
