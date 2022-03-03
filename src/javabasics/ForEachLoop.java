


package javabasics;

public class ForEachLoop {

	
	/*
	 * for(declaration: data)
	 * {
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		int []a= {10,20,30,40,50,60,70};
		
		
		//String direction = "backward";
		
		
			for(int number: a) {
				System.out.println(number);	
			}
			
		
		System.out.println("**************************************");
				
			for(int i = 6;i>=0;i--) {
				System.out.println(a[i]);
			}		
	}
}
