package b;

public class Student {
	
	int i;
	int j;
	int sum;
	public int sum(int i,int j) {
		this.i=i;
		this.j=j;
		sum=i+j;
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.sum(10,20);
		

	}

}
