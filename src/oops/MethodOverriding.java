package oops;
/*
 
 Method Overloading :
 	Method name,return data type and parameters has to be same for method overriding.
 	- to define overriden method , we've to use @override annotation
 	- happens within different class using inheritance
 */
class Animal{
	void sound() {
		System.out.println("Sound of animal");
	}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Meow");
	}
}
class Lion extends Animal{
	@Override
	void sound() {
		System.out.println("Roar");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		Lion l = new Lion();
		l.sound();
		

	}

}
