package objectorientedprogramming;

public abstract class Abstraction {
	
	/* the process of highlighting set of services 
	and hiding implementation in child class
	
	we can achieve abstraction by using:
	1) abstract class
			abstract keyword to declare class as abstract
			we will be able to achieve 0 to 100% abstraction
			we can create concrete method and abstract methods
			
	2) interface
	      the process of highlighting set of services 
	    and hiding implementation in child class 
	    
	    we can achieve 100% abstraction
	    
	*/
	
	//ATM:
	/*  withdraw
	 *  Deposit 
	 *   : implementation/code -  hide - security 
	 */
	// Remote
	/*
	 * volumeIncrease
	 * VolumeDecrease
	 * powerOn
	 * powerOff  
	 */
	
	
	public void color() {
	 System.out.println("red");	
	}
	
	
	public abstract void withdraw();
	public abstract void deposit();

	public static void main(String[] args) {
		

	}

}
