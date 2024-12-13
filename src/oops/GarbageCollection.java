package oops;
/*
 Garbage collection :
 		System.gc(); //this method will start collecting garbage
 		Finalize method : this method will actually do deletion of object
 */
class Info{
	String name;
	int age;
	String Company;
	
	public Info(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void show(String company) {
		this.Company=company;
		
	}
	
	void display() {
		System.out.println("Name : "+name+"Age : "+age);
		System.out.println(Company);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Deleted");
	}
	
	
	
}
public class GarbageCollection {

	public static void main(String[] args) {
		
		Info p = new Info("Pradnya",20);
		p.show("TechM");
		p.display();
		
		p=new Info("Pradnya",22);
		p.show("TechMahindra");
		
		p.display();
		
		String s1 = "ABC";
		System.out.println(s1);
		
	    s1= s1 + "xy";
		System.out.println(s1);
		
	
		
		System.gc();
		
		
		
		

	}

}

