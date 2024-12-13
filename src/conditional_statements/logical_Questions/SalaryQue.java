package conditional_statements.logical_Questions;

/*
 Basic salary <=10000: HRA=20% DA=80%
 Basic salary <=20000 : HRA=25% DA=90%
 Basic Salary >20000 : HRA=30%  DA=95%
 */
import java.util.Scanner;

public class SalaryQue {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary amount : ");
		float salary = sc.nextFloat();
		double HRA;
		double DA;
		
		if(salary<=10000) {
			HRA = salary*0.2;
			DA=salary*0.8;
			
			System.out.println("HRA : "+HRA+" "+"DA "+DA);
			
		}
		else if(salary<=20000) {
			HRA = salary*0.25;
			DA=salary*0.9;
			
			System.out.println("HRA : "+HRA+" "+"DA "+DA);
			
		}
		else if(salary>20000) {
			HRA = salary*0.3;
			DA=salary*0.95;
			
			System.out.println("HRA : "+HRA+" "+"DA "+DA);
			
		}
		else {
			System.out.println("Enter Valid amount");
		}
		
		

	}

}
