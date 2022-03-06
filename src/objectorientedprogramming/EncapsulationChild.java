package objectorientedprogramming;

public class EncapsulationChild extends EncapsulationParent{
	
	EncapsulationChild(){
		super();
	}
	
	public static void main(String[] args) {
		EncapsulationChild ec = new EncapsulationChild();
		
//		ec.getData();
//		
//		ec.setData("demo","demo123");
//		
//		System.out.println("***********************************");
//		
//		//ec.getData();
//		
//		ec.demo();
		
	}
	public void demo() {
		super.getData();
	}

}
