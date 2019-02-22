package design.adapter;

public class AdapterBean implements Target {
    private Source source;

    public AdapterBean(Source source){

    }
    public void method1() {
        source.method1();
    }

    public void method2() {
    }
}

