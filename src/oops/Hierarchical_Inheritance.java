package oops;

class Tata{
	String CEO_name;
	void printCEO() {
		System.out.println(CEO_name);
	}
}
class Zudio extends Tata{
	
}
class WestSide extends Tata{
	
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
	
		Zudio z= new Zudio();
		z.CEO_name="ZudioCEO ABC";
		z.printCEO();
		
		WestSide w = new WestSide();
		w.CEO_name="WestSideCEO XYZ";
		w.printCEO();
		

	}

}
