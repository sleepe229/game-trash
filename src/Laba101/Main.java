package Laba101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++){
            String[] string_for_split = sc.nextLine().split(" ");
            cars[i] = new Car(string_for_split[0], string_for_split[1], Integer.parseInt(string_for_split[2]));
            System.out.println(cars[i].getInfo());
        }

    }
}