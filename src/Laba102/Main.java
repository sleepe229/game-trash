package Laba102;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Person[] person = new Person[n];
        for (int i = 0; i < n; i++){
            String[] string_for_split = sc.nextLine().split(" ");
            person[i] = new Person(string_for_split[1], Integer.parseInt(string_for_split[0]));
            if (person[i].getAge() > 17) System.out.println(person[i].getInfo());
        }

    }
}