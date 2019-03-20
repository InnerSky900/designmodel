package updowncast;

public class InstanceOfTest {

    public static void main(String[] args) {

       /**
        result = object instanceof class
        参数：
        Result：布尔类型。
        Object：必选项。任意对象表达式。
        Class：必选项。任意已定义的对象类。
        说明：
        如果 object 是 class 的一个实例，则 instanceof 运算符返回 true。
        如果 object 不是指定类的一个实例，或者 object 是 null，则返回 false。
        但是instanceof在Java的编译状态和运行状态是有区别的：
        在编译状态中，class可以是object对象的父类，自身类，子类。在这三种情况下Java编译时不会报错。
        在运行转态中，class可以是object对象的父类，自身类，不能是子类。在前两种情况下result的结果为true，最后一种为false。但是class为子类时编译不会报错。运行结果为false
        */

        People teacherPeople = new Teacher();
        Teacher teacher = new Teacher();

        China china = new China();
        People chinaPeople = new China();

        //true
        System.out.println(teacher instanceof China);

        //true
        System.out.println(teacher instanceof People);

        //true
        System.out.println(chinaPeople instanceof People);

        //true
        System.out.println(chinaPeople instanceof China);

        //false
        System.out.println(chinaPeople instanceof Teacher);

    }
}
