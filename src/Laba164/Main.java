package Laba164;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<>();

        while (true) {
            String input = sc.nextLine();
            String[] data = input.split(" ");

            String name = data[0];
            if (name.equalsIgnoreCase("stop")) {
                break;
            } else if (name.equalsIgnoreCase("search")) {
                String contactName = sc.nextLine();
                if (!phoneBook.containsKey(contactName)) {
                    System.out.printf("Contact %s does not exist%n", contactName);
                } else {
                    String phoneNumber = phoneBook.get(contactName);
                    System.out.printf("%s -> %s%n", contactName, phoneNumber);
                }
                continue;
            }

            String phoneNumber = data[1];

            if (!phoneBook.containsKey(name)) {
                phoneBook.put(name, phoneNumber);
            } else
                phoneBook.replace(name, phoneNumber);
        }
    }
}