package ch3.littleexp;

import ch2.hellospring.decoupled.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Exec {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/experiment.xml");
        ctx.refresh();
        MessageProvider mp = ctx.getBean("provider", MessageProvider.class);
        System.out.println(mp.getMessage());
        ctx.close();
    }
}
