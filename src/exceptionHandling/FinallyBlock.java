package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		int c;
		try {
			c=a/b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Hello from finally block");
		}

	}

}
