package oops;
/*
 Encapsulation : Keeping the data together is known as Encapsulation
 
 				Standard way to create a package :
  				< company_name>.<Project_name>.<part of project>
  				
  			    
  			    
  			    Getter : to get value
  			    
  			    int getRoll_no()
  			    {
  			        return roll_no;
  			     }
  			    Setter : to set values
  			    
  			    void setRoll_no(int roll_no)
  			    {
  			    	this.roll_no = roll_no;
  			    }
  
  
 */
class Students{
	private int roll_no;
	private String name;
	private int age;
	private int marks;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
public class EncapsulationInJava {

	public static void main(String[] args) {

		Students s = new Students();
		s.setRoll_no(1);
		s.setName("ABC");
		s.setAge(20);
		s.setMarks(35);
		
		System.out.println(s.getRoll_no());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getMarks());
		

	}

}
