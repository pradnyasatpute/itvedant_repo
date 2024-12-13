package conditional_statements;

import java.util.Scanner;

public class User_Input {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		
		String name=sc.next();
		
		System.out.println("Name : "+name);
		
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		System.out.println("Age : "+age);
		
		System.out.println("Enter Salary ");
		float salary=sc.nextFloat();
		System.out.println("Salary : "+salary);
		

	}

}
