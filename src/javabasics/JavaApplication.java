package javabasics;

public class JavaApplication {
	
	int b=10; //0
	
	/* elements of class
	 •	Variable - 
	 			1) local
	 			
	 			2) instance
	 			
	 			3) static
	•	Methods
	•	 Constructor
	•	Instance Block
	•	Static Block
	 */
	
	public static void main(String[] args) {
		//declaration
		
		JavaApplication ja = new JavaApplication(); // object
		
		ja.b =40;
		
		System.out.println("Welcome to SpeedwayTech");
		System.out.println(ja.b);

		
		
		ja.demo();  // method calling
	}
	
	public void demo() 
	{  
		b =80; // local variable
		
		System.out.println(b);  // implementation
	}	
	
//	public void demo1() {
//		
//		b = b+10;
//		
//	}
		
}
