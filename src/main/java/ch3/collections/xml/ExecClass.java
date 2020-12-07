package ch3.collections.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ExecClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/collections.xml");
        ctx.refresh();
        CollectionInjection col = ctx.getBean("injectCollections", CollectionInjection.class);
        col.displayInfo();
        ctx.close();
    }
}
