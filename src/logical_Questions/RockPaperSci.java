package logical_Questions;
/*
 0-R
 1-P
 2-S
 
 public static void main(String[] args) {
		
		Random r = new Random();
		int n = r.nextInt(3);
		
		System.out.println(n);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 0 to 2");
		int userNum = sc.nextInt();
		
		System.out.println("0 as Rock ");
		System.out.println("1 as Paper ");
		System.out.println("2 as Scissor ");
		
		if(n==0 && userNum==2) {
			System.out.println("Comp is winner & User is lost");
		}
		else if(n==1 && userNum==2) {
			System.out.println("User is winner & Comp is lost");
		}
		else if(n==2 && userNum==2) {
			System.out.println("Draw");
		}
		else if(n==0 && userNum==1) {
			System.out.println("User is winner & Comp is lost");
		}
		else if(n==1 && userNum==1) {
			System.out.println("Draw");
		}
		else if(n==2 && userNum==1) {
			System.out.println("Comp is winner & User is lost");
		}
		
		
		
		else if(n==0 && userNum==0) {
			System.out.println("Draw");
		}
		else if(n==1 && userNum==0) {
			System.out.println("Comp is winner & User is lost");
		}
		else if(n==2 && userNum==0) {
			System.out.println("User is winner & Comp is lost");
		}
		else {
			System.out.println("Invalid Input");
		}
		

 
 */
import java.util.Random;
import java.util.Scanner;

public class RockPaperSci {
public static void main(String[] args) {
		
		System.out.println("Welcome to the Game of Rock,Paper,Scissors");
		
		Random r = new Random();
		int comp = r.nextInt(3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0 -> Rock");
		System.out.println("1 -> Paper");
		System.out.println("2 -> Scissor");
		
		int user= sc.nextInt();
		
		if(comp==user) {
			System.out.println("Draw");
		}else if(user==0) {
			if(comp==1) {
				System.out.println("Comp wins !!!");
			}
			else if(comp==2) {
				System.out.println("User Wins !!!");
			}
		}
		else if(user ==1) {
			if(comp==0) {
				System.out.println("User Wins !!!");
			}
			else if(comp==2) {
				System.out.println("Comp Wins !!!");
			}
		}
		else if(user==2) {
			if(comp==0) {
				System.out.println("Comp wins !!!");
			}
			else if(comp==1) {
				System.out.println("User Wins !!!");
			}
			
		}
		else {
			System.out.println("Invalid input");
		}
		
		System.out.println("Comp choice : "+comp);

			
	}

}
