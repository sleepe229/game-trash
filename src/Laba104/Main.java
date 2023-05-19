package Laba104;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] bank = new BankAccount[100];
        while (true) {
            String[] string = sc.nextLine().split(" ");
            switch (string[0].toLowerCase()){
                case "create":
                    if(bank[99]==null){
                        BankAccount BankAccount = new BankAccount();
                        bank[BankAccount.getId()-1] = BankAccount;
                        System.out.println(Laba104.BankAccount.getInfoNewBankAccount());
                    }else {System.out.println("The list is over");}
                        break;
                case "end":
                    return;
                case "deposit":
                    if (BankAccount.isReal(bank, string)){System.out.println("Account does not exist"); break;}
                    bank[Integer.parseInt(string[1])-1].deposit(Integer.parseInt(string[2]));
                    System.out.println("Deposited " + Integer.parseInt(string[2]) + " to ID" + bank[Integer.parseInt(string[1])-1].getId());
                    break;
                case "getinterest":
                    if (BankAccount.isReal(bank, string)) {System.out.println("Account does not exist"); break;}
                    System.out.println(bank[Integer.parseInt(string[1])-1].getInterestRate(Integer.parseInt(string[2])));
                    break;
                case "setinterest":
                    BankAccount.setInterestRate(Integer.parseInt(string[1]));
                    break;
            }
        }
    }
}

