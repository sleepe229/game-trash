package Laba162;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> passengersInTrain = new ArrayList<>(Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .toList());
        int maxPassengers = sc.nextInt();

        while (true) {
            String command = sc.next();
            if (command.equalsIgnoreCase("end")) {
                break;
            }
            if (command.equalsIgnoreCase("add")) {
                int numPassengersToAdd = sc.nextInt();
                passengersInTrain.add(numPassengersToAdd);
            } else {
                int numPassengersToFind = Integer.parseInt(command);
                for (int i = 0; i < passengersInTrain.size(); i++) {
                    int currentPassengers = passengersInTrain.get(i);
                    if (currentPassengers + numPassengersToFind <= maxPassengers) {
                        passengersInTrain.set(i, currentPassengers + numPassengersToFind);
                        break;
                    }
                }
            }
        }
        passengersInTrain.forEach((element) -> System.out.print(element + " "));
    }
}
