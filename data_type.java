package MYPROJECT;
import java.util.Scanner;
public class data_type{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee name:");
		String name = sc.nextLine();
		
		System.out.println("enter employee ID:");
		int empId = sc.nextInt();
		
		System.out.println("enter the department:");
		String department = sc.nextLine();
		sc.nextLine();
		
		System.out.println("enter the expirence:");
		int expirence = sc.nextInt();
		sc.nextInt();
				
		System.out.println("enter the salary:");
		double salary = sc.nextDouble();
		
		System.out.println("Is it full time? (True/false):");
		boolean isFullTime = sc.nextBoolean();
		
		System.out.println("----/n employee details----");
		System.out.println("name : " + name);
		System.out.println("empId : " + empId);
		System.out.println("department : " + department);
		System.out.println("expirence : "+ expirence);
		System.out.println("salary : ₹"+ salary);
		 System.out.println("Full Time       : " + (isFullTime ? "Yes" : "No"));
		
	}
}