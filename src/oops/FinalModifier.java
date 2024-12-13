package oops;
/*
 Final :
      class : 
      		final class can't be inherited by other class
      
      Method :
      		final methods  can't be override by other class
      Variable :
      		
      		we can't change value of final variable .
      		we have to give value to final variable at the time declaration OR using constructor
 */

class Aadhar{
	final int AADHAR_No; // we can give value to this variable directly like  final int AADHAR_No=129162517;
	
	public Aadhar(int ad_no) {
		this.AADHAR_No = ad_no;
	}
	final void display() {
		System.out.println("Hello from final method which can't be override by other classes");
	}
	
}
public class FinalModifier {

	public static void main(String[] args) {
		
		Aadhar ad = new Aadhar(1010252963);
		System.out.println(ad.AADHAR_No);
		ad.display();

	}

}
