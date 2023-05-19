package Laba153;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        ArrayDeque<Character> symbols = new ArrayDeque<>();
        boolean balanced = true;
        if (string.length()%2 != 0) {balanced = false;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '{' || c == '(' || c == '[')
                symbols.push(c);
            else if (c == '}') {
                if (symbols.isEmpty() || symbols.pop() != '{') {
                    balanced = false;
                    break;
                }
            } else if (c == ')') {
                if (symbols.isEmpty() || symbols.pop() != '(') {
                    balanced = false;
                    break;
                }
            } else if (c == ']') {
                if (symbols.isEmpty() || symbols.pop() != '[') {
                    balanced = false;
                    break;
                }
            }
        }
        }
        System.out.print(balanced);
    }
}
