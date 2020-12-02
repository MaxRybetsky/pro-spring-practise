package ch3.xml;

import ch2.hellospring.decoupled.MessageProvider;
import ch2.hellospring.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlConfig {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/xml-config.xml");
        ctx.refresh();
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
        MessageProvider provider = ctx.getBean("integerProvider", MessageProvider.class);
        ctx.close();
    }
}
