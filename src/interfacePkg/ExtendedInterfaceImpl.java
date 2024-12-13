package interfacePkg;
//Extend Interface : Interface -> Interface > extends
interface One{
	void methodOne();
}
interface Two extends One{
	void methodTwo();
}
class Number implements Two{
	@Override
	public void methodOne() {
		System.out.println("Method One");
		
	}
	@Override
	public void methodTwo() {
		System.out.println("Method Two");
		
	}
}
public class ExtendedInterfaceImpl {

	public static void main(String[] args) {
		Number obj1 = new Number();
		obj1.methodOne();
		obj1.methodTwo();

	}

}
