package conditional_statements.logical_Questions;

class Info{
	String name;
	int age;
	public Info(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : "+name+"Age : "+age);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Deleted");
	}
	
	
	
}
public class GarbageCollection {

	public static void main(String[] args) {
		
		Info p = new Info("Pradnya",20);
		p.display();
		
		p=new Info("Pradnya",22);
		
		System.gc();
		
		
		
		

	}

}
