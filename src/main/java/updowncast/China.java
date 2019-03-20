package updowncast;

public class China implements People {

    public String name;

    public China() {

    }
    public China(String name) {
        this.name = name;
    }

    public void getAge(){
        System.out.println("18");
    }
}
