package objectorientedprogramming;

public class HDFCBank extends RBIBank{
	
	int amount = 10000;

	public static void main(String[] args) {
		RBIBank hdfc = new HDFCBank();
		hdfc.withdraw();
		hdfc.deposite();
		//hdfc.loan();
	}
		
//	public void loan() {
//		System.out.println("you are eligible for loan Child");
////		super.deposite();
////		this.a;
//	}
	
	/*
	 * Parent p = new Parent();  valid
	 * Child c = new Child();    valid 
	 * Parent p = new Child();   
	 * WebDriver driver = new ChromeDriver();
	 * 
	 */
}
