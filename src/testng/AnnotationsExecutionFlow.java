package testng;

import org.testng.annotations.*;


public class AnnotationsExecutionFlow {


		
		/*
		@BeforeSuite
		@BeforeTest
		@BeforeClass
		@BeforeMethod
		@Test
		@AfterMethod
		@AfterClass
		@AfterTest
		@AfterSuite
		*/
		/*
		 * 
before suite annotation - configuration:
							reporting config:
							loading data 
before test annotation - regression, sanity:
							credentials:
before class annotation - 

before Method annotation
Test annotation
after method annotation

after class annotation

after test annotation 

after suite annotation - reports generate, we want mail, we want send alert on slack (Teams)

		 */
	@Test
	public void test1() {
		System.out.println("Test annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method annotation");
	}
		
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test annotation");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test annotation");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite annotation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite annotation");
	}
	
}
