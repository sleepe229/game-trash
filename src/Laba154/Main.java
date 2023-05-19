package Laba154;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> order = new ArrayDeque<>();
        String line;

        while (true) {
            line = sc.nextLine();
            if (line.equalsIgnoreCase("print")) {
                break;
            } else if (line.equals("cancel")) {
                if (order.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    String cancelled = order.poll();
                    System.out.println("Canceled " + cancelled);
                }
            } else {
                order.offer(line);
            }
        }
        order.forEach(System.out::println);
    }
}
