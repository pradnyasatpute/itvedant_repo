package conditional_statements.logical_Questions;

import java.util.Scanner;

/*
 * 
 * Take 3 numbers and check for large number
 */
public class LargeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number1");
		int num1=sc.nextInt();
		
		System.out.println("Enter Number2");
		int num2=sc.nextInt();
		
		System.out.println("Enter Number3");
		int num3=sc.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("Number 1 is Greater");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("Number 2 is Greater");
		}
		else {
			System.out.println("Number 3 is Greater");
		}

	}

}
