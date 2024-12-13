package a;

public class Employee {
	private int e_id=101;
	private void show() {
		System.out.println("Hello from private method");
	}
	
	protected void display() {
		System.out.println("Hello from protected method of Employee Class");
	}
	public static void main(String[] args) {
		
		Employee p1 = new Employee();
		p1.e_id=101;
		System.out.println(p1.e_id);
		p1.show();
		p1.display();
		

	}

}
