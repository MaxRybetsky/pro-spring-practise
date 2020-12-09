package practices.confs;

public class Bar implements Printer {
    private String info;

    public Bar(String info) {
        this.info = info;
    }

    @Override
    public void print() {
        System.out.println(info);
    }
}
