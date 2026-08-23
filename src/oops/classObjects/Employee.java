package oops.classObjects;

import java.util.Scanner;

public class Employee {
    String name;
    int id;
    String department;
    double salary;
    Scanner scanner = new Scanner(System.in);

    void input() {
            System.out.printf("Enter the name :");
            name = scanner.nextLine();
            System.out.printf("Enter employee id:");
            id = scanner.nextInt();
            System.out.printf("Enter the Department:");
            scanner.nextLine();
            department = scanner.nextLine();
            System.out.printf("Enter the salary of:");
            salary = scanner.nextDouble();
            scanner.nextLine();
    }

    void output() {
            System.out.println("Details of the Employee:");
            System.out.println("Name:" + name);
            System.out.println("EmployeeId:" + id);
            System.out.println("Department:" + department);
            System.out.println("Salary:" + salary);
    }
}
