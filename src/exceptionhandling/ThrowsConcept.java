package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsConcept {
											// JVM:
	public static void main(String[] args) throws Exception {
		ThrowsConcept tc = new ThrowsConcept();
		try {
		tc.readData();
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("ThrowsConcept");
	}
		
	public void readData() throws FileNotFoundException, InterruptedException     {
		FileInputStream fis = new FileInputStream("D:\\SoftWare Testing\\SoftwareTestingDoc\\Java Index.txt");
		Thread.sleep(5000);
		System.out.println("file read sucessfully");
	}
}
