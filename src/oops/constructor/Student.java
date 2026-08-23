package oops.constructor;


public class  Student{
    String name;
    int age;
    double cgpa;

    //Parameterized Constructor

    Student(String name , int age , double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("CGPA:" + cgpa);
    }
}




