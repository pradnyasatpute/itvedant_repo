package my_Practice;

public class FibonacciRecursion {
	
	static int a=0,b=1,c;
	public static void main(String[] args) {
		System.out.print(a+" "+b);
		FibonacciRecursion f=new FibonacciRecursion();
		f.printFibSeries(10);
	}
	void printFibSeries(int i) {
		if(i>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
			printFibSeries(i-1);
			
		}
	}

}
