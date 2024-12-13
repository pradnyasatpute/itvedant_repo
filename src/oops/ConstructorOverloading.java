package oops;

class Worker{
	int id;
	String name;
	
	public Worker() {
		System.out.println("Hello from worker constructor 1");
	}
	public Worker(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println("Hello from worker constructor 2");
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Worker obj1=new Worker();
		
		Worker obj2 = new Worker(101,"Pradnya");

	}

}
