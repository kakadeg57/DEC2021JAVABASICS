package javabasics;

public class InstanceBlockConcept {

	// 1st constr
	InstanceBlockConcept(){
		
		System.out.println("I am first constructor without args");
		
	}
	
	// 2nd constr
	InstanceBlockConcept(String s){
		
		System.out.println("I am second constructor with args:" +s);
		
	}
	
	
	// instance block
	{
		System.out.println("I am in second instance block");
	}
	{
		System.out.println("I am in first instance block");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		InstanceBlockConcept ib1 = new InstanceBlockConcept();
		
		InstanceBlockConcept ib2 = new InstanceBlockConcept("Speedway");
		
			
		
		
		System.out.println("I am learning Instance block");

	}

}
