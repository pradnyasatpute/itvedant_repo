package oops;
/*
  copy constructor : used to set object value.
 */
class Product{
	String name;
	int Price;
	
	public Product(String name,int Price) {
		this.name=name;
		this.Price=Price;
		
	}
	void show() {
		System.out.println("Name : "+name+" Price : "+Price);
	}
	public Product(Product p) {
		this(p.name,p.Price);
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		
		Product obj1=new Product("mobile",20000);
		obj1.show();
		Product obj2 = new Product(obj1);
		obj2.show();

	}

}
