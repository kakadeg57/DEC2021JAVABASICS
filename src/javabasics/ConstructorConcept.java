package javabasics;

public class ConstructorConcept {
	
	int number;
	
		ConstructorConcept(){
			System.out.println("constructor with 0 args");
		}
		
		// project level we will be passing object
		
		ConstructorConcept(int a,int b){
			System.out.println("Constructor with args");
			int c = a+b;
			number = c;
			System.out.println("value of number variable is:"+number);
		}
		
		
	
	// Default constructor:
		
//	ConstructorConcept(){
//		super();
//	}

	public static void main(String[] args) {
		//
		ConstructorConcept cc = new ConstructorConcept();
		//System.out.println("This is main method");

		// nameless object
		     new ConstructorConcept(100,200);
		     new ConstructorConcept(10,20);
	}

}
