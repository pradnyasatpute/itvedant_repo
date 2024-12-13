package string;

public class StringCreation {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		
		System.out.println(s1+" "+s1.hashCode());
		
		String s2 = new String("Hello");                                                          
		System.out.println(s2+" "+s2.hashCode());
		
		s2=s2+" World !!!";
		System.out.println(s2 +" "+s2.hashCode());
		
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.append(" World !!!");
		System.out.println(sb + " "+sb.hashCode());
		
		StringBuffer sb1 = new StringBuffer("Good");
		sb1.append(" Morning!!!");
		System.out.println(sb1 + " "+sb1.hashCode());
		
		System.out.println(sb1.capacity()); //20
		System.out.println(sb1.charAt(0)); //G
		
		
		
		
		String name ="Pradnya";
		System.out.println(name);
		name = name+" satpute";
		
		System.out.println(name);
		
		
		
		

	}

}
