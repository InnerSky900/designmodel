package design.adapter;

/**
 *  适配模式
 */
public class MainTest {

    public static void main(String[] args) {
        /** 类的适配*/
//        Target adapter = new Adapter();
//        adapter.method1();
//        adapter.method2();

        /** 对象的适配*/
//        Target adapter = new AdapterBean(new Source());
//        adapter.method1();

        /** 接口的适配*/
        Target adapter = new SourceA();
        adapter.method1();
    }
}