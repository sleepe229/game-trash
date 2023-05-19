package Laba104;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;
    private double balance;

    BankAccount() {
        this.id = bankAccountCount++;
    }


    public int getId() {return id;}
    public double getInterestRate(int years) {return BankAccount.interestRate * years * this.balance;}
    public static String getInfoNewBankAccount() {return String.format("Account ID%s created", bankAccountCount - 1);}

    public static void setInterestRate(double interestRate) {BankAccount.interestRate = interestRate;}

    public static boolean isReal(BankAccount[] bank, String[] string){
        if (bank[Integer.parseInt(string[1])-1] == null) return true;
        return false;
    }

    void deposit(double amount){this.balance += amount;}
}