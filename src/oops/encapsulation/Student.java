package oops.encapsulation;

public class Student {
    private String name;
    private int marks;

    void setName(String name) {
        this.name = name;
    }

    void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks should be between 0 and 100");
        }
    }

    char getGrade() {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80 && marks <= 89) {
            return 'B';
        } else if (marks >= 70 && marks <= 79) {
            return 'C';
        } else if (marks >= 60 && marks <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }
    String getName(){
        return name;
    }
    int getMarks(){
        return marks;
    }
}
