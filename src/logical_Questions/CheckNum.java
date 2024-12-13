package logical_Questions;

import java.util.Scanner;
/*
 * 
 * check number positive / negative/zero
 */
public class CheckNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int number = sc.nextInt();
		
		if(number>0) {
			System.out.println("Positive Number");
		}
		else if(number<0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Zero");
		}
		

	}

}
