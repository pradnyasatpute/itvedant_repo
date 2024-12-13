package oops;
interface I1{
	public abstract void display();
	default void show() {
		System.out.println("defalt concrete method in interface");
	}
	static void print() {
		System.out.println("Print method");
	}
}

public class InterfaceInJava {
	
	public void display() {
		
		System.out.println("Dispaly method in child class");

	}
	public static void main(String[] args) {
		
		InterfaceInJava obj1 = new InterfaceInJava();
		obj1.display();
		

	}

}
