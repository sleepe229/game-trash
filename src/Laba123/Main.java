package Laba123;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(Polygon.createPolygon(string).getInfo());
    }
}
