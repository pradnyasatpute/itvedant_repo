package loops;

/*
 
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int input = sc.nextInt();
		
		int count=0;
		int quotient=input;
		int remainder=0;
		int sum=0;
		while(quotient!=0){
			remainder=quotient % 10;
			sum=sum+remainder*remainder*remainder;
			quotient=quotient / 10;
		}
		if(sum==input) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("not a armstrong number");
		}
		

	}
 
 
 
 */
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int input = sc.nextInt();
		
		int count=0;
		int quotient=input;
		int remainder=0;
		int sum=0;
		while(quotient!=0) {
			quotient=quotient/10;
			count++;
		} //this while is to count number of digits of the input number.
		quotient=input;
		while(quotient!=0){ 
			remainder=quotient % 10;
			sum=(int) (sum+Math.pow(remainder,count));
			quotient=quotient / 10;
		}   
		if(sum==input) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("not a armstrong number");
		}
	}

}
