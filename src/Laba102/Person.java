package Laba102;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {this.name = name; this.age = age;}


    public int getAge() {return this.age;}

    public String getName() {return this.name;}


    public String getInfo(){
        return String.format(
                "%s, %s years old.",
                getName(), getAge()
        );
    }
}
