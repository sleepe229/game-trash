package Laba132;

public class Chinese implements Person{
    private String name;

    public Chinese(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Ni Hao";
    }
}
