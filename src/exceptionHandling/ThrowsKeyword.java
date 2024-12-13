package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
	
	public void openFile(String fileName) throws FileNotFoundException  {
		FileInputStream fs = new FileInputStream(fileName);
	}

	public static void main(String[] args) {
		
		ThrowsKeyword t = new ThrowsKeyword();

	
	}

}
