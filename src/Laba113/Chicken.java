package Laba113;

public class Chicken {
    private int age;
    private String name;

    public Chicken(String name, int age) throws Exception {if (name.length() > 3)this.name = name; else throw new Exception("маленькая длина имени");if (1 <= age && age < 10)this.age = age; else throw new Exception("недопустимый возраст");}

    private void setName(String name) throws Exception {if (name.length() > 3)this.name = name; else throw new Exception("маленькая длина имени");}
    private void setAge(int age) throws Exception {if (1 <= age && age < 10)this.age = age; else throw new Exception("недопустимый возраст");}
    private int calculateProductPerDay(){
        if (this.age == 1) return 0;
        else if (this.age == 9) return 1;
        else return 5;
    }
    public String showInfo(){return String.format("Chicken %s (age %s) can produce %s egg`sper week", this.name, this.age, this.calculateProductPerDay());}
}
