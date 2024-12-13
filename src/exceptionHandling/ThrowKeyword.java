package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a=10,b=-5,c;
		
		try {
			if(b<0) {
				throw new ArithmeticException("can't divide by negative value");
			}
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
