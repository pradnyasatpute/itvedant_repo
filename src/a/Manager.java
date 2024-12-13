package a;

public class Manager extends Employee {
	@Override
	protected void display() {
		// TODO Auto-generated method stub
		System.out.println("This is hello from protected method of Manager class");
	}
	public static void main(String[] args) {
		Manager m = new Manager();
		m.display();

	}

}
