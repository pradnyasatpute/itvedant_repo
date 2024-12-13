package oops;
/*
 Constructor in java:
 
 	- constructor is a method having same name as that of the class name.
 	- it does not have any return type , not even void
 	- the only modifiers applicable for constructor are : public, protected, default, private
 	- it gets invoke automatically , when we create object of the class.
 	- used for setting values for variable
 */
class Department{
	int id;
	String name;
	String location;
	
	Department(int id,String name,String location){
		this.id=id;
		this.name=name;
		this.location=location;
	}
	void getInfo() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Location : "+location);
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		Department d1= new Department(101,"IT","Pune");
		d1.getInfo();
		Department d2 = new Department(102,"Electrical","Mumbai");
		d2.getInfo();

	}

}
