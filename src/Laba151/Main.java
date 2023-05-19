package Laba151;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        ArrayDeque<Integer> digits = new ArrayDeque<>();
        while (input > 0) {
            digits.push(input % 2);
            input /= 2;
        }
        digits.forEach(System.out::print);
    }
}
