package javabasics;

public class VariableConcept {

	//  Variable
	
	// Instance variable;
		int a = 100;
		
	// static variable 
		
	 static int b = 10;
	
	
	
	public static void main(String[] args) {
		
		VariableConcept vc = new VariableConcept();
		System.out.println(vc.a); // instance variable
		System.out.println(VariableConcept.b);// static variable
		vc.a = 200;
		vc.b= 20;
		System.out.println(vc.a);
		System.out.println(vc.b);
		VariableConcept vc1 = new VariableConcept();
		System.out.println(vc1.a);
		System.out.println(vc1.b);
		
		vc1.demo();
	}
	
	public void demo() {
		
		a=300;
		
	System.out.println("static variable " +VariableConcept.b);	
	}
	

}
