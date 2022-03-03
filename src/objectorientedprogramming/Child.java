package objectorientedprogramming;

public class Child extends Parent{
	
	// method signature
	// overriding method
	
	// AccountPage : 3 elements = 45 sec
	
	//public
	// private 
	
	public int explicitWait() {
		System.out.println("explicitWait have 45 sec of synchronization");
	return 20;
	}
	
	
//	 public void marry() {
//		 System.out.println("Educated");
//	 }


	public static void main(String[] args) {
		Child c = new Child();
		
		c.explicitWait();

	}

}
