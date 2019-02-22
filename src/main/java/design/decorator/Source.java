package design.decorator;

public class Source implements Target {
    public void method1() {
        System.out.println(this.getClass().getName()+"--method1--");
    }

    public void method2() {

    }
}
