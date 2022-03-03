package javabasics;

public class StaticBlockConcept {
	
	
	
	{
		System.out.println("I am instance block 1 ");
	}
	{
		System.out.println("I am instance block 2");
	}

	public static void main(String[] args) {
		
	System.out.println("I am learning static block concept");
	
	StaticBlockConcept object = new StaticBlockConcept();
		
	}
	
	static {
		System.out.println("I am static block 2");
	}
	static {
		System.out.println("I am static block 1");
	}
	

}
