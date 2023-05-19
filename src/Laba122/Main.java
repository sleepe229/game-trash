package Laba122;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(
                sc.next(),
                sc.next(),
                sc.next()
        );
        Worker worker = new Worker (
                sc.next(),
                sc.next(),
                sc.nextDouble(),
                sc.nextDouble()
        );
        System.out.printf("%s\n%s%n",
                student.getInfo(),
                worker.getInfo());
    }
}
