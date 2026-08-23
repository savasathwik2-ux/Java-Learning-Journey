package oops.constructor;

public class Mobile {
    String brand ;
    double price ;

    //Default Constructor
    Mobile(){
        String brand = "Samsung";
        double price = 25000;
        System.out.println("Default constructor");
    }

    //Parameterized Constructor
    Mobile(String brand){
        this.brand =brand;
        System.out.println("Single parameterised constructor");
    }

    //Parameterized Constructor
    Mobile(String brand , double price){
        System.out.println("Double parameterized Constructor");
        this.brand = brand;
        this.price = price;
    }

    void display(){
        System.out.println("Mobile Brand:" + brand);
        System.out.println("Mobile Price:" + price);
    }
}
