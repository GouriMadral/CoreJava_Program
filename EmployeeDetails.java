/*Write a Java program to take Employee id,name,address & salary from user and display on to screen. */package Object;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// Create a Scanner object to take input from the user
		Scanner scanner= new Scanner(System.in);
		// Declare variables to store employee information
		int employeeId;
		String employeeName;
		String employeeAddress;
		double employeeSalary;

		System.out.println("Enter Employee ID");
		employeeId= scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Employee Name");
		employeeName= scanner.nextLine();

		System.out.println("Enter Employee Address");
		employeeAddress= scanner.nextLine();

		System.out.println("Enter Employee Salary");
		employeeSalary= scanner.nextDouble();

		// Display the employee details
		System.out.println("\nEmployee Details");
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Address:"+employeeAddress);
		System.out.println("Employee Salary:"+employeeSalary);

		scanner.close();

	}

}
/* Enter Employee ID
01
Enter Employee Name
Gouri
Enter Employee Address
Solapur
Enter Employee Salary
15000

Employee Details
Employee ID:01
Employee Name:Gouri
Employee Address:Solapur
Employee Salary:15000.0

 */
