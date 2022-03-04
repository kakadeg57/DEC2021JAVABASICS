package objectorientedprogramming;

public class HDFCBranch extends HDFC{

	public static void main(String[] args) {
		HDFCBranch h = new HDFCBranch();
		
		h.loan();
		h.deposit();
		h.withdraw();
		h.demo();

	}

	@Override
	public void loan() {
		
		System.out.println("loan");
		
	}

	@Override
	public void matualFunds() {
		System.out.println("matualFunds");
		
	}

}
