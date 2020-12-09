package practices.confs;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("practices.confs");
        Printer b1 = ctx.getBean("bar", Bar.class);
        Printer f1 = ctx.getBean("foo2", Foo.class);
        b1.print();
        f1.print();
    }
}
