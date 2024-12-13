package oops;

class Vehicle1{
	String color;
	public Vehicle1(String color) {
		this.color=color;
	}
}
class Bike extends Vehicle1{
	public Bike( String color) {
		super(color);
		System.out.println("Hello from Bike Class");
	}
}
public class ConstructorInheritance {
	
	public static void main(String[] args) {
		
		Bike b = new Bike("White");
		System.out.println(b.color);

	}

}
