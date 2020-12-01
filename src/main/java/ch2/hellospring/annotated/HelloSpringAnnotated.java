package ch2.hellospring.annotated;

import ch2.hellospring.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);
        MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}
