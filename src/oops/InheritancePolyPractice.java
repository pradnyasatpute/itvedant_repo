package oops;

import java.util.Scanner;

/*
 WAP to create base class as shape and subclasses namely circle,rectangle,triangle and calculate area of each shape.

class Shape{
	void calculateArea() {
		
	}
}
class Circle extends Shape{
	Scanner sc = new Scanner(System.in);
	
	@Override
	void calculateArea() {
		System.out.println("Enter radius : ");
		int radius = sc.nextInt();
		float area = 3.14f * radius*radius;
		System.out.println("Area of circle is : "+area);
	}
}
class Rectangle extends Shape{
	Scanner sc = new Scanner(System.in);
	
	void calculateArea() {
		System.out.println("Enter length : ");
		int length=sc.nextInt();
		System.out.println("Enter breadth : ");
		int breadth = sc.nextInt();
		
		float area = (float) (length*breadth);
		System.out.println("Area of Rectangle is : "+area);
	};
	
}
class Triangle extends Shape{
	Scanner sc = new Scanner(System.in);
	
	void calculateArea() {
		System.out.println("Enter base of triangle :");
		int base = sc.nextInt();
		System.out.println("Enter height of triangle :");
		int height = sc.nextInt();
		
		int area = (base * height)/2;
		
		System.out.println("Area of triangle is :"+area);
	};
	
}
public class InheritancePolyPractice {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculateArea();
		
		Rectangle r = new Rectangle();
		r.calculateArea();
		
		Triangle t = new Triangle();
		t.calculateArea();
	}

}




2. WAP to create class employee with a method called calculateSalary().
create two subclasses Manager and Programmer .In each subclass ,
 override the calculateSalary() method to calculate and return salary based on specific roles.
 
 class Employee{
	void calculateSalary() {
		System.out.println("calculate employee salary");
	}
}
class Manager extends Employee{
	void calculateSalary() {
		
		System.out.println("Manager salary is 20000");
	};
}
class Programmer extends Employee{
	void calculateSalary() {
		System.out.println("Programmer salary is 25000");
	};
}
public class InheritancePolyPractice {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.calculateSalary();
		
		Programmer p = new Programmer();
		p.calculateSalary();
	}

}


3.WAP to create a class known as BankAccountwith methods called deposit() and withdraw() . 
create subclass called savingsAccount that overrides the withdraw method to prevent withdrawals
 if the bank account balance falls below one hundred. 
 */
class BankAccount{
	int balance;
	
	void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Total balance is : "+balance);
	}
	void withdraw(int amount) {
		balance = balance - amount;
		System.out.println(balance);
	}
}
class SavingsAccount extends BankAccount{
	void withdraw(int amount) {
		if(balance<100) {
			System.out.println("Balance is less than 100 that's why can not withdraw the entered amount");
		}
		else {
			super.withdraw(amount);
		}
	};
}
public class InheritancePolyPractice {

	public static void main(String[] args) {
		
		SavingsAccount s = new SavingsAccount();
		s.balance = 1000;
		s.deposit(1000);
		s.withdraw(200);
		s.withdraw(1710);
		s.withdraw(100);
	}

}
