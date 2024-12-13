package loops;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to print multiplication table : ");
		int num=sc.nextInt();
		int mul=1;
		for(int i= 1;i<=10;i++) {
			mul=num*i;
			System.out.println(num+" * "+i+" = "+mul);
		}
	}

}
