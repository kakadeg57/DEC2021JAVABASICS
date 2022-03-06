package exceptionhandling;

public class ThrowKeywordConcept {

	public static void main(String[] args) throws PowerCutException {
		
		String s = "powercut";
			try {	
		if(s.equals("powercut")) {
			throw new PowerCutException("session is interrupted due to powercut");
		}
			}
			catch(Exception e) {
				
				
			}
		System.out.println("learning throw keyword");
		//System.out.println("session is interrupted due to powercut");
	}

}

 class PowerCutException extends Exception{
	
	 PowerCutException(String msg){
		 super(msg);
	 }
}
 
 // List-Set-
