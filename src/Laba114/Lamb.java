package Laba114;

public class Lamb {
    public static int count = 0;
    private String name;

    private Lamb(String name) {
        this.name = name;
    }
    public static Lamb createLamb(String name){
        if (name.length() >= 5) {count+=1; return new Lamb(name);}
        return null;
    }
    public static String printCount(){return String.format("%s lamb`s", count);}

}
