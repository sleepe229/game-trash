package Laba114;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        for (int i = 0; i <= nums; i++) {Lamb.createLamb(sc.nextLine());}
        System.out.print(Lamb.printCount());
    }
}
