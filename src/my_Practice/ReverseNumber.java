package my_Practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=151,remainder,reverse=0;
		int original=num;
		while(num!=0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		System.out.println(reverse);
		
		if(original==reverse) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}

	}

}
