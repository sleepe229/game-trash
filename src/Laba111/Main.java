package Laba111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] string_for_split = sc.nextLine().split(" ");
        Box box = new Box(Double.parseDouble(string_for_split[0]), Double.parseDouble(string_for_split[1]), Double.parseDouble(string_for_split[2]));
        System.out.print(box.getInfo());
    }
}