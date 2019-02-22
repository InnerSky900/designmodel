package design.adapter;

public class Adapter extends Source implements Target {
    public void method2() {
        System.out.println(this.getClass().getName()+"--method2--");
    }
}
