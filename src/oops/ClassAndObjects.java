package oops;
class Student{
	int Roll_No;
	String name;
	float Marks;
	
	void SubmitAssignment() {
		System.out.println("Assignment Submitted");
	}
	void SubmitTest() {
		System.out.println("Test Submitted");
	}
}
public class ClassAndObjects {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Roll_No=101;
		s1.name="Rani";
		s1.Marks=45;
		
		System.out.println(s1.Roll_No);
		System.out.println(s1.name);
		System.out.println(s1.Marks);
		
		s1.SubmitAssignment();
		s1.SubmitTest();
		
		Student s2 = new Student();
		
		s2.Roll_No=102;
		System.out.println(s2.Roll_No);
		

	}

}
