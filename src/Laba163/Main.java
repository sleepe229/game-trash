package Laba163;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> carsOnParkingSpace = new HashMap<>();

        while (true) {
            String input = sc.nextLine();
            String[] data = input.split(" ");

            String direction = data[0];
            if (direction.equalsIgnoreCase("end")) {
                break;
            }

            String carNumber = data[1];

            if (direction.equalsIgnoreCase("in")) {
                carsOnParkingSpace.put(carNumber, "exist");
            } else if (direction.equalsIgnoreCase("out")) {
                carsOnParkingSpace.remove(carNumber);
            }
        }

        if (carsOnParkingSpace.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            carsOnParkingSpace.keySet().forEach(System.out::println);
        }
    }
}