package ch3.xmlann;

import ch2.hellospring.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlAnnotationsConfig {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/xml-annot-config.xml");
        ctx.refresh();
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
        ctx.close();
    }
}
