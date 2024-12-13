
public class WrapperClasses {

	public static void main(String[] args) {
		
		//primitive datatype
		int x=10;
		
		//Boxing-explicitly
		Integer newInt = Integer.valueOf(x);
		
		//Boxing - implicitly
		Integer autoInt = x;
		
		//UnBoxing - explicitly
		int a=newInt.intValue();
		
		//Auto-unboxing - implicitly
		int b=autoInt;

	}

}
