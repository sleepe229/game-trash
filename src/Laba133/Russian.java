package Laba133;


public class Russian extends BasePerson implements Person {
    private String name;

    public Russian(String name){
        super(name);
    }

    @Override
    public String sayHello() {
        return "Привет";
    }
}
