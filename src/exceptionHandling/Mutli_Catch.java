package exceptionHandling;
/*
 Multiple catch block : if exception occurs for first statement then first catch block will get executed and output's the corresponding exception
 */
public class Mutli_Catch {

	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		
		int[] arr= {0,1,2,3,4,5};
		
		try {
			int c=a/b;
			System.out.println(arr[10]);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
