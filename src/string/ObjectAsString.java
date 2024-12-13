package string;

class Student{
	int id;
	String name;
	float marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	
	
}
public class ObjectAsString {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setId(101);
		s1.setName("Pradnya");
		s1.setMarks(49.8f);
		
		
		
		System.out.println(s1);
		
		
		
		

	}

}
