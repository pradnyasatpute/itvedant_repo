package interfacePkg;
//Functional Interface : contains only one method and declare it with @FunctionalInterface annotation

@FunctionalInterface
interface Login{
	void userLogin();
}
class F1 implements Login{
	@Override
	public void userLogin() {
		System.out.println("User Logged In !!!");
		
	}
}
public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
		F1 obj = new F1();
		obj.userLogin();

	}

}
