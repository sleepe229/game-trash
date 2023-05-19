package Laba132;

public class Main {
    public static void main(String[] args) {Person[]persons = new Person[3];persons[0]= new Russian("Иван");persons[1]= new British("Adam");persons[2]=new Chinese("Lee");for (Person person : persons) {System.out.println(person.getName() +": "+person.sayHello());}}
}
