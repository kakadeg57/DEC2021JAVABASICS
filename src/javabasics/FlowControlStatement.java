package javabasics;

	public class FlowControlStatement {
		
		/*
		 * 
		 * if
		 * if ----- else
		 * else if
		 * nested if
		 * 
		 * 
		 * 
		 */

	public static void main(String[] args) {
		
		int age = 20;
		String citizan = "US";
		
		if(age>=18) {
		
			if	(citizan.equalsIgnoreCase("Indian")) {
			
			 System.out.println("Eligible for voting");
			}
			
			else {
				System.out.println("**not eligible for voting");	
				}
		}
		
		else {
		System.out.println("not eligible for voting");
		}
		
		
		
		
		
		
		

		
	
		}

	}
