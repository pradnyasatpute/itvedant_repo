//MyPractice : 10/12/2024
package exceptionHandling;
class UnderAgeException extends Exception {
	public UnderAgeException() {
		super("You are under age");
	}
	UnderAgeException(String message){
		super(message);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		
		int age=17;
		try {
			if(age<18) {
				throw new UnderAgeException("You can't vote now as you are under 18");
			}
			else {
				System.out.println("You can vote now !!!");
			}
		}
		catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
