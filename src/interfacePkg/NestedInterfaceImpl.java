package interfacePkg;
//Nested Interface : Interface inside interface is the nested interface .we can implement inner interface like outerInterfaceName.innerInterfaceName
interface Outer{
	void outerMethod();
	
	interface Inner{
		void innerMethod();
	}
	
}
class NestedInterfac implements Outer,Outer.Inner{
	@Override
	public void outerMethod() {
		System.out.println("Outer Method");
		
	}
	@Override
	public void innerMethod() {
		System.out.println("Inner Method");
		
	}
}
public class NestedInterfaceImpl {

	public static void main(String[] args) {
		NestedInterfac obj = new NestedInterfac();
		obj.outerMethod();
		obj.innerMethod();

	}

}
