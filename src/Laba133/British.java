package Laba133;

public class British extends BasePerson implements Person {
    private String name;

    public British(String name){
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
