package exceptionhandling;
/* Exception:
 * 	 abnormal termination of program
 *    rest of the code will not execute
 *   
 *  Exception Handling:
 *  	maintain the execution flow as normal
 *  
 *  exception type:
 *  // programmer 
 *  1) checked exception / compiletime exception
 * 
 *  2) unchecked exception / runtime exception
 *  
 *  //system eng.
 *  3) Error:
 *      lack of system resources:
 *      		memory:
 *      		network:
 *  
 *  by using below keywords we will handle the exception:
 *  
 *  // try - catch -finally
 *  
 *  //throw - throws
 * 
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionConcept {
	
	//NoSuchElementException

	public static void main(String[] args) throws FileNotFoundException{
		
		// resources : database connection , driver instance
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		
		//driver.findElement(By.xpath("//")).click();
		
		
		try {
		System.out.println("try block");
		int a=1/0;
		System.out.println("rest of the code of try block");
		}
		

		catch(Exception e) {
			
		File fl = new File("d:\\demo");
		FileInputStream fis = new FileInputStream(fl);
		}
		
		finally {
			System.out.println("resources closed");
		}
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		
	}
	
	
	
		
	
}
