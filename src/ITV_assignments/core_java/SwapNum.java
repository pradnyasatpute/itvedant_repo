package ITV_assignments.core_java;
/*
 1. Using Three variables in the program.
 
 public class SwapNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int a = sc.nextInt();
		System.out.println("Enter number2 : ");
		int b = sc.nextInt();
		
		int t;
		System.out.println("Before swap a : "+a+" & b : "+b);
		t=a;
		a=b;
		b=t;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		

	}

}

2. Using two variables in the program.
 */
import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int a = sc.nextInt();
		System.out.println("Enter number2 : ");
		int b = sc.nextInt();
		
		System.out.println("Before swap a : "+a+" & b : "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		

	}

}
