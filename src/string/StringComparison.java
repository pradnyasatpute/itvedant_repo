package string;

public class StringComparison {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		
		String s2 = "Hello";
		
		System.out.println(s1==s2); //false
		
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(s1.compareTo(s2)); //0

	}

}
