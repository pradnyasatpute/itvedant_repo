package oops;
/*
 static members: methods & variables could be static
 				it is use when the value of variable or method is common for all objects.
 				- to use static member in different class , we've to call it by using class reference name .
 */
class Book{
	int id;
	String name;
	int price;
	
	static String website;

	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		System.out.println(id+" "+name+" "+price+" "+website);
	}
	
	
}
public class StaticKeyword {

	public static void main(String[] args) {
		
		Book.website="amazon.com"; 
		
		Book b1 = new Book(101,"Harry Potter",190);
//		System.out.println(b1.id+" "+b1.name+" "+b1.price+" "+b1.website);
		
		Book b2 = new Book(102,"Best Cricketer",280);

	}

}
