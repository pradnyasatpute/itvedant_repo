package oops;
/*
 Abstraction In java : hiding implementation is known as Abstraction
 
 How to achieve abstraction in java
 	-by using abstract class (0-100%)
 	- by using Interface (100%)
 	
 	
 	1.Abstract class:
 		contains abstract as well as non-abstract/ concrete methods
 		in this, we need to declare class as abstract using abstract keyword.
 	
 		Abstract methods : A method without body called as Abstract method.
 						- Abstract method should declare inside abstract class.
 						- to implement abstract method -> inherit the abstract class and override method.
 	2.Interface :
 	 - is a special class.
 	 - is a fully abstract class.
 	 -can only have abstract method 
 	 -we can't create object of the interface.
 	 - can't create constructor in interface .
 	 - every variable inside interface is public , static and final.
 	 - every method inside interface is public and abstract.
 	 - to implement abstract method -> inherit the abstract class and override method.
 	 - multiple inheritance in java can be achieve by using interface.
 */
abstract class Message{
	void display() {
		System.out.println("Hello from abstract class !!!");
	}
	abstract void greet();
}
class SocialMedia extends Message{
	
	@Override
	void greet() {
		super.display();
		System.out.println("Hello from Socialmedia class abstract method !!!");
		
	}
}
public class AbstractionInJava {

	public static void main(String[] args) {
		
		SocialMedia s = new SocialMedia();
//		s.display();
		s.greet();

	}

}
