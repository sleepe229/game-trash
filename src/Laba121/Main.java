package Laba121;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name_of_object = sc.nextLine().toLowerCase();
        switch (name_of_object) {
            case "car" -> {
                Car car = new Car(
                        sc.nextInt(), sc.nextInt(), sc.nextLine()
                );
                car.getInfo();
            }
            case "boat" -> {
                Boat boat = new Boat(
                        sc.nextInt(), sc.nextInt()
                );
                boat.getInfo();
            }
            case "airplane" -> {
                Airplane airplane = new Airplane(
                        sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextBoolean()
                );
                airplane.getInfo();
            }
        }
    }
}