package objectorientedprogramming;

public class EncapsulationParent {
	
	/*
	 * Encapsulation is a mechanism of wrapping/binding the data(variable) and 
	 * code acting on that data(methods) together as a single unit.
	 * 
	 * two steps:
	 *   1) declare the variables of a class as private
	 *   2) provide public setter and getter methods to view or modify 
	 *    
	 */
	
	EncapsulationParent(){
		System.out.println("Parent class constructor");
	}
	
	// data members - variable
	private String username = "admin";
	private String password = "admin123";
	
	//action - methods
	public void getData() {
		System.out.println(username);
		System.out.println(password);
	}
	
	public void setData(String username,String password) {
		this.username = username;
		this.password = password;
	}

	public static void main(String[] args) {
		

	}
}
