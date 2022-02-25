package StaffManagement;

import java.util.Scanner;
public class EntryPoint {
	public static void main(String[] args) {
		Scanner jarvis = new Scanner(System.in);
		String firstN, lastN;
		int age;
		double salary;
		
		System.out.println("Please input the employee's first name: ");
		firstN = jarvis.nextLine();
		
		System.out.println("Please input the employee's last name: ");
		lastN = jarvis.nextLine();
		
		System.out.println("Please input the employee's age: ");
		age = jarvis.nextInt();
		
		System.out.println("Please input the employee's salary: ");
		salary = jarvis.nextDouble();
		
		Employee empInf = new Employee(firstN, lastN, age, salary);
		System.out.println("Employee information: " + empInf.firstN + " " + empInf.lastN + ", " + empInf.age + ", " + empInf.salary);
	}

}