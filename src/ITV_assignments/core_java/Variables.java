package ITV_assignments.core_java;

public class Variables {
	
	int id;
	String name;
	long mob_no;
	double marks;
	
	
	public Variables(int id, String name, long mob_no, double marks) {
		this.id = id;
		this.name = name;
		this.mob_no = mob_no;
		this.marks = marks;
	}
	void display() {
		System.out.println("Id : "+id+" Name : "+name+" Mobile no. : "+mob_no+" Marks : "+marks);
	}


	public static void main(String[] args) {
		
		Variables v = new Variables(101,"Pradnya",607001010,80);
		v.display();

	}

}
