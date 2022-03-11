package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@BeforeMethod
	public void initilization() {
		System.out.println("chrome driver instance opened");
	}
	@Test(priority = 1) // 5 TIMES:
	public void validateloginTest() {	
		System.out.println("Login successfully");
		int a = 1/0;
	}

	@Test(priority = 2,dependsOnMethods = "validateloginTest")
	public void validateProductSearch() {
		System.out.println("product valdiated");
	}
	
	@AfterMethod
	public void closeResources() {
		System.out.println("chrome driver instance closed");
	}
}
