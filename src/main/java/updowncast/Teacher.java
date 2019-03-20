package updowncast;

public class Teacher extends China {

    public String count;

    public Teacher() {

    }
    public Teacher(String count) {
        this.count = count;
    }

    public void getCount(){
        System.out.println("3Billion");
    }

    @Override
    public void getAge(){
        System.out.println("17");
    }
}
