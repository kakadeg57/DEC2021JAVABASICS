package objectorientedprogramming;

public class ObjectOrientedProgramming {
	
	/* Object Oriented Programming System
	 *  class = class keyword
	     Student, Human, Car
	     
	     class is logical entity
	     we do use class to write specification
	     	variable = to store data
	     	methods = to perform task
	     class is a blue-print
	        
	 *  object =  new keyword
	      ganesh, Ganesh Kakade, Creta
	      
	      object is physical entity
	      it is represting the memory
	      based on one class we can create n number of objects
	      
	      by giving the reference of object we can use the properties of class
	      
	 *  inheritance:
	       the process of acquiring properties of one class into another class is called
	         base/parent class: who provides the properties
	         sub /child class:  who acquire properties
	       to achieve inheritance we should extends class
	       Object class is root class for all the classes
	       
	      public class TestBase{
	       public void initilization(){
	       System.setProperty(webdriver,exe);
	       WebDriver driver = new ChromeDriver();
	       driver.get("url");
	       
	       }
	       }
	       
	       class LoginPage extends Base {
	       public static void main(String[] args){
	       LoginPage lp = new LoginPage();
	       lp.initilization();
	       driver.findElement(By.id("")).sendKeys(username);
	       driver.findElement(By.id("")).sendKeys(password);
	       driver.findElement(By.id("")).click();
	       }
	       
	       }
	       
	       class HomePageTest extends TestBase{
	       
	       public void validateSearchTest(){
	       
	       sendKeys("");
	       }
	       }
	       
	       types of inheritance:
	       	  class parent   , class child1 , child2
	       	
	         	single inheritance:
	       		       
	       		multilevel inheritance:
	       
	      		Hierarchical inheritance:

	       
	       this is not allowed in java:
	       
	       		Multiple inheritance:
	       
	       		hybrid inheritance:
	       
	       
	 *  polymorphism:
	 
	       poly    - many
	       morphism - forms
	       
	       water - solid ,liq, gas 
	       shapes - circle, square, rectangle 
	       
	       Synchronisation:
	          explicit:
	          
	          utility class: 
	          WebDriverWait wait = new WebDriverWait(25,driver);
	           it is applicable for 10 elements 
	           
	           
	           child class 
	           2 elements = 40 sec;
	           
	          WebDriverWait wait = new WebDriverWait(45,driver); 
	          
	         - one thing in many form
	         - the ability to appears in many forms
	         
	         1) compiletime polymorphism / static binding/ early binding
	              a) method overloading 
	              b) constructor overloading?
	              c) operator overloading
	                  // + addition and concatenate
	                   
	              
	              
	         
	         2) runtime polymorphism  / dynamic binding / late binding
	          
	   				 
	   			    
	   			    method overriding:
	   			       more than one class 
	   			       they should have inheritance
	 *  				method signature should be same
	  
	 *  abstraction
	 *  
	 *  encapsulation
	 */
	
	
	public static void main(String[] args) {
		ObjectOrientedProgramming oop = new ObjectOrientedProgramming();
	

	}

}
