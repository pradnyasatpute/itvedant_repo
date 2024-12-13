package logical_Questions;
/*
 * 
 * Check the user input number is positive or negative
 */
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check even or odd : ");
		
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number "+num+" is Even");
		}
		else {
			System.out.println("Number "+num+" is odd");
		}

	}

}
