package oops;

class Operation{
	
	int data=50;
	
	void change(Operation op) {
		op.data=op.data+50;
	}
}
public class PassByValue {

	public static void main(String[] args) {
		
		Operation obj1=new Operation();
		System.out.println(obj1.data);
		obj1.change(obj1);
		System.out.println(obj1.data);

	}

}
