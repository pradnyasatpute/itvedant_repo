package loops;


import java.util.Scanner;

/*
 1.Build a simple program of Guess the number  by using random class
 	 import java.util.Random;
 	 public class While_Practice_Programs {

		public static void main(String[] args) {
		Random rc = new Random();
		int random_num= rc.nextInt(3);
		
		Scanner sc = new Scanner(System.in);
		
		
		int userInput = 10;
//		System.out.println(random_num);
		while(userInput != random_num) {
			System.out.println("Guess number");
			userInput = sc.nextInt();
		}
		System.out.println("You have guess the right number");
	}

  2.Calculate the number or digits of entered user number
  	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int count = 0;
		int quotient=num;
		while(quotient != 0) {
			quotient=quotient/10;
			count++;
			
		}
		System.out.println(count);
	}
}

  3. Calculate the sum of the entered number
 */
public class While_Practice_Programs {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int sum=0;
		while(num!=0) {
			int remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.println(sum);
	}
	

}
