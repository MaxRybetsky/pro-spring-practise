package ch3.collections.annotated.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("someBean")
public class LittleCheck {
    @Autowired
    @Qualifier("list")
    private List<String> list;

    @Autowired
    private List<String> list1;

    public static void main(String... args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("spring/check.xml");
        ctx.refresh();
        LittleCheck ch = ctx.getBean("someBean", LittleCheck.class);
        ch.list.forEach(System.out::println);
        System.out.println();
        ch.list1.forEach(System.out::println);
        ctx.close();
    }
    /**
     * Output will be the next
     * str
     * str2
     *
     * str
     * str1
     * str2
     */
}
