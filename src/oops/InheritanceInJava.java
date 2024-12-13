package oops;
/*
 
 Inheritance: inheriting variables and methods from parent class to child class is known as inheritance .
 				extends keyword is use to inherit the parent class
 
 Types : 
 1.Single level : parent_class->child_class
 2.Multi-level : grand_parent->parent_class->child_class
 3.Hierarchical : one parent and multiple childs .
 4.Multiple : as it shows ambiguity , it is not possible for classes in java
 5.Hybrid : Combination of Multiple + Hierarchical inheritance = called diamond problem which is impossible in java.
 */

class Parent{
	String name;
	void greet() {
		System.out.println("Good Morning !!!");
	}
	
}
class Child extends Parent{
	int count;
	void display() {
		System.out.println("Hello from Child Class");
	}
}
public class InheritanceInJava {

	public static void main(String[] args) {
		
		Child c1=new Child();
		c1.name="ABC";
		System.out.println(c1.name);
		
		c1.greet();
		c1.count=12;
		System.out.println("count : "+c1.count);
		c1.display();

	}

}
