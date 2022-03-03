package objectorientedprogramming;

public class LoanDepartment extends HDFCBank{

	public static void main(String[] args) {
		//Bank b = new Bank();
		
		//HDFCBank hb = new HDFCBank();

		LoanDepartment ld = new LoanDepartment();
		
		ld.withdraw(); // bank class
		System.out.println(ld.amount);
		ld.loan();
	}
	public void loan() {
		System.out.println("you are eligible for loan");
	}
	
}
