package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		
		System.out.println("Hello");
		int a=10,b=0,c;
		
		try {
			c=a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("Hello");

	}

}
