package ch3.annotation;

import ch2.hellospring.decoupled.MessageProvider;
import ch2.hellospring.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
        MessageProvider mp = ctx.getBean("aprovider", MessageProvider.class);
        System.out.println(mp.getMessage());
        ctx.close();
    }
}
