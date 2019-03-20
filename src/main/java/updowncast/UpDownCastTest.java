package updowncast;

public class UpDownCastTest {

    public static void main(String[] args) {

        /**
         * 向上转型时会遗失子类自己特有的属性和方法
         */
        China chinaTeacher = new Teacher();
        China china = new China();

        //向上转型
        chinaTeacher.getAge();

        //向下转型
        Teacher teacher = (Teacher) chinaTeacher;
        teacher.getCount();
        teacher.getAge();

        //不安全的向下转型
        Teacher teacher1 = (Teacher) china;
        teacher1.getAge();
        teacher1.getCount();
    }
}
