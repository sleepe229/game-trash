package Laba161;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String input = sc.nextLine();
        String[] initialNumbers = input.split(" ");
        for (String number : initialNumbers) {
            list.add(Integer.parseInt(number));
        }
        while (true) {
            String line = sc.nextLine();
            if ("end".equalsIgnoreCase(line)) {
                break;
            }
            String[] tokens = line.split(" ");
            String command = tokens[0].toLowerCase();
            switch (command) {
                case "add" -> {
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    list.add(numberToAdd);
                }
                case "insert" -> {
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    if (indexToInsert < 0 || indexToInsert > list.size()) {
                        System.out.println("Invalid index");
                        continue;
                    }
                    list.add(indexToInsert, numberToInsert);
                }
                case "remove" -> {
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    if (indexToRemove < 0 || indexToRemove >= list.size()) {
                        System.out.println("Invalid index");
                        continue;
                    }
                    list.remove(indexToRemove);
                }
                case "shift" -> {
                    String choosingMove = tokens[1].toLowerCase();
                    int shift = Integer.parseInt(tokens[2]);
                    switch (choosingMove) {
                        case "right" -> shiftList(list, shift);
                        case "left" -> shiftList(list, -shift);
                        default -> System.out.println("Invalid command.");
                    }
                }
            }
        }
        list.forEach((element) -> System.out.print(element + " "));
    }

    private static void shiftList(List <Integer> list,int shift){
        if (shift == 0) return;
        if (shift > 0)
            Collections.rotate(list, shift);
        else
            Collections.rotate(list, list.size() + shift);
    }
}
