package oops.encapsulation;

public class BankAccountDemo {
    public static void main(String[] args){
        BankAccount customer1 = new BankAccount();
        customer1.setHolderName("Sathwik");
        System.out.println("Balance:" + customer1.getBalance());

        customer1.deposit(5000);
        System.out.println("Balance:" + customer1.getBalance());

        customer1.withdraw(2000);
        System.out.println("Balance:" + customer1.getBalance());
    }
}
