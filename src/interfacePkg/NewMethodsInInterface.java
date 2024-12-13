package interfacePkg;
//java 8 => 1.default 2.static
//java 9 => 1.private 2.private static
interface Pradnya{
	default void defaultMethod() {
		System.out.println("Hello from default Method");
		privateMethod();
		privateStaticMethod();
	}
	static void staticMethod() {
		System.out.println("Hello from static Method");
	}
	
	private void privateMethod() {
		System.out.println("Hello from private Method");
	}
	
	private static void privateStaticMethod() {
		System.out.println("Hello from private static Method");
	}
}
class NewMethods implements Pradnya{
	
}
public class NewMethodsInInterface {

	public static void main(String[] args) {
		NewMethods n1 = new NewMethods();
		n1.defaultMethod();
		Pradnya.staticMethod();

	}

}
