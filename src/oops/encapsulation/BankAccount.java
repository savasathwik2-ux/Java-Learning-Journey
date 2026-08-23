package oops.encapsulation;

public class BankAccount {
    private String holderName ;
    private double balance = 0.0;

    void setHolderName(String holderName){
        this.holderName = holderName;
    }
    double getBalance(){
        return balance;
    }
    String getHolderName(){
        return holderName;
    }
    void deposit(double depositMoney){
        if(depositMoney<=0){
            System.out.println("Negative amount cannot be deposited");
        }
        else {
            System.out.println("Deposited Successfully");
            balance+=depositMoney;
        }
    }
    void withdraw(double withdrawMoney){
        if(withdrawMoney > balance){
            System.out.println("Insufficient Balance");
        }
        else {
            System.out.println("Withdraw successful Collect Cash!!");
            balance-=withdrawMoney;
        }
    }
}
