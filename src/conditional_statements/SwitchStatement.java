package conditional_statements;
/*
 
 WAP to check day as per input number using switch statement
 
 	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		switch(num) {
				
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");
				break;
		case 4: System.out.println("Thursday");
				break;
		case 5: System.out.println("Friday");
				break;
		case 6: System.out.println("Saturday");
				break;
		case 7: System.out.println("Sunday");
				break;
		default : System.out.println("Invalid input");
		}
		
		
	Q.2 Take input from user for a grade  and then print remark 
	   Grade A : Excellent
	   Grade B : Well Done
	   Grade C : Very Good
	   Grade D : Good
	   Grade F : Failed

 */
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Grade to check remark: ");
		char c=sc.next().charAt(0);
		
		switch(c) {
				
		case 'A': System.out.println("Excellent");
				break;
		case 'B': System.out.println("Well Done");
				break;
		case 'C': System.out.println("Very Good");
				break;
		case 'D': System.out.println("Good");
				break;
		case 'F': System.out.println("Failed");
				break;
	
		default : System.out.println("Invalid input");
		}

	}

}
