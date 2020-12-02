package ch3.fields;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/fields-xml.xml");
        ctx.refresh();
        Singer singer = ctx.getBean(Singer.class);
        singer.sing();
        ctx.close();
    }
}
