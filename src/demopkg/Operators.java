package demopkg;

public class Operators {
	
	public static void main(String[] args) {
		
		int a=10;
		
		System.out.println(a);
		
		int b=20;
		
		System.out.println(a+b);
		
		
//		int c=a++; //post operation thats why giving a's original value
//		System.out.println(c);
		
		
		int d=++a; 	//pre operation thats why giving a+1 value
		System.out.println(d);
		
		int e=--a; //11-1=10
		System.out.println(e);
		
		int f=a--; // 10 cause 
		System.out.println(f);
		
		
		byte b1=10;
		int i1=b1;
		
		System.out.println(b1+"&"+i1);
		
		
		int i2=101;
		
		byte b2=(byte)i2;
		
		System.out.println(i2+"&"+b2);
	}
	

}
