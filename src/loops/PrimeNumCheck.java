package loops;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number to check for prime or not : ");
		
		int input = sc.nextInt();
		int temp=0;
		for(int i=2;i<input;i++) {
			if(input%i==0) {
				temp=temp+1;
			}
			
		
		}
		if(temp>1) {
			System.out.println("Not a prime");
		}
		else {
			System.out.println("Prime number");
		}

	}

}
