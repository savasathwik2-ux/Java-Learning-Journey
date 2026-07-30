/*
 * Project: ATM Management System
 * Language: Java
 *
 * Concepts Used:
 * - Scanner
 * - Methods
 * - Loops
 * - Switch
 * - Conditional Statements
 *
 * Author: Sava Sathwik
 */

package projects;

import java.util.Scanner;

public class ATMManagement
{
    public static void main(String []  args)
    {
        Scanner scanner = new Scanner(System.in);

        final double Initial_balance = 10000;
        double Deposit_money;
        double Withdraw_money;
        double Acc_Balance = Initial_balance;
        String anotherTrnx = "yes";
        System.out.println("==============ATM MANAGEMENT SYSTEM==============");
        while (anotherTrnx.equalsIgnoreCase("yes"))
        {
            System.out.println("1.Check balance\n2.Deposit\n3.Withdraw\n4.Exit");

            System.out.println("Enter Your Choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Account balance is :" + Acc_Balance);
                case 2 -> {
                    System.out.println("Enter the Amount :");
                    Deposit_money = scanner.nextDouble();
                    Acc_Balance += Deposit_money;
                    System.out.println("Deposited successfully!!");
                    System.out.println("Your Account balance :" + Acc_Balance);
                }

                case 3 -> {
                    System.out.println("Enter the amount :");
                    Withdraw_money = scanner.nextDouble();
                    if (Withdraw_money > Acc_Balance) {
                        System.out.println("Insufficient Balance");
                    } else {
                        Acc_Balance -= Withdraw_money;
                        System.out.println("Withdrawl successful");
                        System.out.println("your Account Balance:" + Acc_Balance);
                    }
                }
                case 4 -> {
                    return;
                }
                default -> {
                    System.out.println("Invalid Choice !!!\nTry Again");
                }
            }

            System.out.println("Do you want to Make Another Transanction ?(yes/no)");
            scanner.nextLine();
            anotherTrnx = scanner.nextLine();
        }
    }
}
