package javabasics;

public class MethodConcept {	

		public static void main(String[] args) {
			
			//MethodConcept meth = new MethodConcept(); //
			
				int number = new MethodConcept().addition(10,20);
		
		System.out.println("method return value:"+number);
	
		}
		
		
		
		
		
		
		public void login(String username,String password) {
			
			System.out.println("username is:"+username);
			
			System.out.println("Login sucessfully ");
			
			payment();
		}
		
//		public void login(String username,String password) {
//			
//			System.out.println("username is:"+username);
//			System.out.println("Login sucessfully ");
//		}
		
		
		
//		public void drivinglic(){
//				
//				System.out.println("Two wheeler lic");
//			}
		
		
		
		
		public int addition(int a,int b) {
			
			int c;
			
			c = a+b;
			
			System.out.println("Addition of a and b:"+c);
			
			return c;
			//String txt = driver.findElement(By.id("text")).getText();
		}
		
		
		
		
		
		
		
		
		
		
		
		// methods with parameters/args
		
		
		
		
		
		
		
		
		// methods without parameters/args
		
		
		
		void payment() {
			
			System.out.println("pay to another bank");
			
			logout();
		 }
		
		public void logout() {
			
			System.out.println("Logout successfully");
			
		}
			

	}
