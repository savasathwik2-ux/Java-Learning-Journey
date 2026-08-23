package oops.abstraction;

public class UpiPayments implements Paybles , Refundable {


    @Override
    public void pay() {
        System.out.println("Payment Successful");
    }

    @Override
    public void refund() {
        System.out.println("Refund Successful");
    }
}
