package oops.classObjects;

public class BankAccountDemo {
    public static void main(String[] args){
        BankAccount[] bank = new BankAccount[3];
        for(int i=0; i< bank.length; i++) {
            bank[i] = new BankAccount();
            bank[i].input();
        }
        for (int i=0; i< bank.length; i++){
            if(bank[i].balance >= 10000){
                System.out.println(bank[i].accountHolder);
                System.out.println(bank[i].accountNumber);
                System.out.println(bank[i].balance);
            }
        }
    }
}
