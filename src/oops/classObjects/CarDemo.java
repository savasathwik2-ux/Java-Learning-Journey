package oops.classObjects;

public class CarDemo {
   public static void main(String [] args){
       Car c1 = new Car();
       Car c2 = new Car();

       c1.brand = "Toyota";
       c1.model = "Forturner";
       c1.price = 50000;

       c2.brand = "BMW";
       c2.model = "X6";
       c2.price = 65000;

       System.out.println(c1.brand);
       System.out.println(c1.model);
       System.out.println(c1.price);

       System.out.println(c2.brand);
       System.out.println(c2.model);
       System.out.println(c2.price);
   }
}
