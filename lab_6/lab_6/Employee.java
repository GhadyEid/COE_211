package lab_6;

import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        
        Scanner jarvis = new Scanner(System.in);

        System.out.print("Please input the employee's first name: ");
        firstName = jarvis.nextLine();

        System.out.print("Please input the employee's last name: ");
        lastName=jarvis.nextLine();

        System.out.print("Please input the employee's age: ");
        age=jarvis.nextInt();

        System.out.print("Please input the employee's salary: ");
        salary=jarvis.nextDouble();

    }

    public String toString() {
    	
    	return "Employee Information: " + firstName + " " + lastName + ", " + age + ", " + salary;
  
    }
}