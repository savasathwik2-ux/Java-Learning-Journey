package oops.encapsulation;

public class StudentDemo {
    public static void main(String[] args){
        Student student1 = new Student();

        student1.setName("Sathwik");
        student1.setMarks(150);

        System.out.println(student1.getName());
        System.out.println(student1.getMarks());
        System.out.println(student1.getGrade());
    }
}

