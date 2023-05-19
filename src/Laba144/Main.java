package Laba144;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static String path = "files/example2.txt";

    public static void main(String[] args) {
        String output = "";

        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split("[+\\-*х/]");
                int num1 = Integer.parseInt(numbers[0].trim());
                int num2 = Integer.parseInt(numbers[1].trim());
                char operator = line.charAt(numbers[0].length());
                int result = switch (operator) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*', 'х' -> num1 * num2;
                    case '/' -> num1 / num2;
                    default -> 0;
                };
                String outputLine = line + " = " + result + "\n";
                output += outputLine;
                System.out.print(outputLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        } catch (Exception e) {
            System.out.println("Invalid input in file: " + path);
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(path, false))) {
            writer.println(output);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
