package design.decorator;

public class Decorator implements Target {

    private Source source;

    public Decorator(Source source){
        this.source = source;
    }

    public void method1() {
        System.out.println("包装前");
        source.method1();
        System.out.println("包装后");
    }

    public void method2() {

    }

    public static void main(String[] args) {
        Target adapter = new Decorator(new Source());
        adapter.method1();
    }
}
