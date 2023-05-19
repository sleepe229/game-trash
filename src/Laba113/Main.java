package Laba113;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Chicken chick = new Chicken(sc.nextLine(), Integer.parseInt(sc.nextLine()));
        System.out.println(chick.showInfo());
    }
}
