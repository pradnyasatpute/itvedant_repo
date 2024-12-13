package conditional_statements.logical_Questions;

import java.util.Scanner;

/*
 check the given angle makes trianle or not
 */
public class Triangle_specification {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First angle value");
		
		int angle1=sc.nextInt();
		
		System.out.println("Enter Second angle value");
		int angle2 = sc.nextInt();
		
		System.out.println("Enter Third angle value");
		int angle3= sc.nextInt();
		
		int sum=angle1+angle2+angle3;
		
		if(sum == 180) {
			System.out.println("The given angle makes Triangle");
		}
		else {
			System.out.println("Not making trianle using given angles");
		}

	}

}
