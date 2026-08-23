package oops.encapsulation;

public class Person {
    private String name;
    private int age;

   void setName(String name){
       this.name=name;
       }
   void setAge(int age) {
       if (age < 0) {
           System.out.println("Invalid Age");
       } else {
           this.age = age;
       }
   }
   String getName(){
       return name;
   }
   int getAge(){
      return age;
   }
}
