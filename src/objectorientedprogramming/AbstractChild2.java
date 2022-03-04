package objectorientedprogramming;

public class AbstractChild2 extends AbstractChild{
	
	public void deposit() {
		System.out.println("you can deposit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild2 ac = new AbstractChild2();
		ac.color(); 
		
		ac.withdraw();
		
		ac.deposit();
	}

}
