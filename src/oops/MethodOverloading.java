package oops;
/*
 Polymorphism :
 
 poly -> many
 morphism -> forms
 
 if one method have many forms then it is known as polymorphism.
 
 Types of Polymorphism :
 
 1.Compile Time Polymorphism -> Method overloading
 
 2.Runtime Polymorphism -> Method Overriding
 
 Method Overloading:
 	-will create different methods with same name.
 	-parameter has to different
 	- method overloading should hsppen within same class
 	- return datatype also has to be same.
 	
 	Rule :
 	
 	1.Number of parameters OR 2. Data type OR 3.sequence  of parameters
 	 should be different
 */
class Calculator{
	
	void add(int x,int y) {
		System.out.println(x+y);
	}
	
	void add(int x,int y, int z) {
		System.out.println(x+y+z);
	}
	
	void add(int a,int b, int c,int d) {
		System.out.println(a+b+c+d);
	}
	
}
public class MethodOverloading {
	
	
	public static void main(String[] args) {
		
		Calculator c= new Calculator();
		
		c.add(10, 10);
		c.add(10, 10, 10);
		c.add(10, 10, 10, 10);
	}

}
