package my_Practice;

public class ReverseString {

	public static void main(String[] args) {
		String name="Pradnya", reverse="";
		
		for(int i=name.length()-1;i>=0;i--) {
			reverse= reverse+name.charAt(i);
		}
		System.out.println(reverse);

	}

}
