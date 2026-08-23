package oops.abstraction;

abstract class Employees {
    String name;
    double salary;

    abstract void work();

    void display(String name , double salary){
        System.out.println(name);
        System.out.println(salary);
    }
}
