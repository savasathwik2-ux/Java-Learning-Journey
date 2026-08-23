package oops.constructor;

public class MobileDemo {
    public static void main(String[] args){
        Mobile m1 = new Mobile();
        m1.display();
        Mobile m2 = new Mobile("OnePlus");
        m2.display();
        Mobile m3 = new Mobile("Pixel" , 80000);
        m3.display();
    }
}
