package conditional_statements;



/*
 * 1.print pass if marks greater than or equal to 35
 * 	if(marks>=35) {
			System.out.println("Passed");
			
		}
		
	2.print pass if marks greater than or equal to 35 or else failed
	   if(marks>=35) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
	3.Print Pass with first class if marks are more than or equal to 75 or 
	else print pass if marks greater than or equal to 35 or
	 else failed
	 
	 if(marks>=75) {
			System.out.println("Passed with First Class");
		}
		else if(marks>=35) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
	4. WAP to check for army selection - age should be greater than or equal to 18 And Height must be greater than 160cm
	
	
		int age=23;
		int height=166;
		
		if(age>=18) {
			if(height>160) {
			System.out.println("Selected");
			}
			else {
				System.out.println("Not selected");
			}
		}
		else {
			System.out.println("Not selected");
		}


 */
public class If_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int age=23;
		int height=166;
		
		if(age>=18) {
			if(height>160) {
			System.out.println("Selected");
			}
			else {
				System.out.println("Not selected");
			}
		}
		else {
			System.out.println("Not selected");
		}

	}

}
