package ch3.collections.xml.practise;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class ArtworkManager {

    public static void printer(List<ArtworkSender> senders) {
        senders.forEach(e -> System.out.println(
                e.getFriendlyName()
        ));
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/collections-practise.xml");
        ctx.refresh();
        List<ArtworkSender> senders = (List<ArtworkSender>) ctx.getBean("senders");
        printer(senders);
        ctx.close();
    }
}
