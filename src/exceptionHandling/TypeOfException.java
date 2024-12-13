package exceptionHandling;

import java.io.FileInputStream;

//checked exception:these checked exceptions - we always need to write inside try catch block
public class TypeOfException {

	public static void main(String[] args) {
		
		int[] arr= {0,1,2,3,4};
		
		//System.out.println(arr[10]);
		
		try {
			
			FileInputStream fs = new FileInputStream("Notes.txt");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
