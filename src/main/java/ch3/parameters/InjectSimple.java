package ch3.parameters;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/params-xml.xml");
        ctx.refresh();
        InjectSimple conf = (InjectSimple) ctx.getBean("injectSimpleConfig");
        InjectSimple spel = (InjectSimple) ctx.getBean("injectSimpleSpel");
        System.out.println(conf);
        System.out.println();
        System.out.println(spel);
        ctx.close();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "InjectSimple{"
                + "name='" + name + '\''
                + ", age=" + age
                + ", height=" + height
                + ", programmer=" + programmer
                + ", ageInSeconds=" + ageInSeconds
                + '}';
    }
}
