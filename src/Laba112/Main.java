package Laba112;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] string_for_split = sc.nextLine().split(" ");
        Laba112.Triangle triangle = new Laba112.Triangle(Double.parseDouble(string_for_split[0]), Double.parseDouble(string_for_split[1]), Double.parseDouble(string_for_split[2]));
        System.out.print(triangle.getInfo());
    }
}
