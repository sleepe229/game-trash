package Laba124;

import java.util.Scanner;

public class Main {
    static Hero hero;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (string.split(" ")[0].equalsIgnoreCase("create")) {
            hero = Hero.createHero(string);
        } else if (string.split(" ")[0].equalsIgnoreCase("end")) return;
        else throw new RuntimeException("Wrong command");

        while (true) {
            String newString = sc.nextLine();
            if (newString.equalsIgnoreCase("action")) {
                System.out.print(hero.action());
            } else if (newString.equalsIgnoreCase("end")) {
               System.out.println(hero.endingGame());
               return;
            } else throw new Exception("Wrong command");
        }
    }
}
