package oops.classObjects;

import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;
    Scanner scanner = new Scanner(System.in);
    void input(){
        System.out.println("Enter Holder name:");
        accountHolder = scanner.nextLine();
        System.out.println("Enter Account Number:");
        accountNumber = scanner.nextLong();
        System.out.println("Enter Balance:");
        balance = scanner.nextDouble();
    }
}
