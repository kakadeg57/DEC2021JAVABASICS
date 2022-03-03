package objectorientedprogramming;

public class ConstructorOverloading {

	ConstructorOverloading(){
		System.out.println("constructor without args");
	}
	
	ConstructorOverloading(int a){
		System.out.println("constructor with args");
	}
	
		
	{
	 System.out.println("instance block");
	}
	
	public static void main(String[] args) {
		ConstructorOverloading co1 = new ConstructorOverloading();
		
		ConstructorOverloading co2 = new ConstructorOverloading(10);

	}

}
