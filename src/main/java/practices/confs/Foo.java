package practices.confs;

import org.springframework.scheduling.annotation.Scheduled;

public class Foo implements Printer {
    private String info;
    private int i = 0;

    public Foo(String info) {
        this.info = info;
    }

    @Override
    public void print() {
        System.out.println(info);
    }

    @Scheduled(fixedRate=1000)
    public void digit() {
        System.out.println(i++);
    }
}
