package design.singleton;

public class Singleton{

    private static class factory{
        private static  Singleton singleton = new Singleton();
    }

    private static Singleton getInstance(){
        return factory.singleton;
    }
}
