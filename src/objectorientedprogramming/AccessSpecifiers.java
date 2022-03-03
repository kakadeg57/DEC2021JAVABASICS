package objectorientedprogramming;

class AccessSpecifiers {

	/* AccessSpecifiers/modifiers
	 *  private   - variable,methods          - within the class
	 *  default   - variable , method, class  - within the package
	 *  protected -  variable , method        - within the package, outside for child class
	 *  public    - variable , method, class  - inside the project for all packages
	 */
	
	         String name1 = "Speedway";
	         String name2 = "Tech";
	
	public static void main(String[] args) {
		AccessSpecifiers  as = new AccessSpecifiers();
		System.out.println(as.name1);
	}

}
