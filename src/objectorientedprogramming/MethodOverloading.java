package objectorientedprogramming;

public class MethodOverloading {
	
	/*
	 * the class contains more than one method with same name but different 
	    datatypes, seq of args, no. of args
	 * 
	 * methods should be in same class with same name
	 *  differ args:
	      1) no of args.
	      2) datatype of args
	      3) sequence of args
	
	 */
	
	// meth.add("addition of numbers is:", 10, 20);
	public void add(String s,int a,int b) {
		int c = a+b;
		System.out.println(s+c+10);
	}
	
	public void add(String a,String b) {
		 String d = a+b;
		System.out.println(d);
	}

	public void add(int a,int b,String s) {	
		int c = a+b;
		System.out.println(c+s);	
	}
	
	
	
		
	public static void main(String[] args) {
		
		MethodOverloading meth = new MethodOverloading();
		
		//meth.add(10, 20,"");
		
		//meth.add(10, 20, 30);
		
		//meth.add("speed", "way");
		
		meth.add("addition of numbers is: ", 10, 20);
		meth.add(100, 200, " it is a addition");
		
	}
}
