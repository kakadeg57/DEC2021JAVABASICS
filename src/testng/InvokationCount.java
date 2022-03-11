package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvokationCount {
	
	WebDriver driver; // Instance variable: we can use under the class inside every methods
	
    @BeforeMethod
    public void init() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.google.com/");
    }
	@Test(priority = 1,invocationCount = 3) // 3 times:
	public void googleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("TestNG");
	}	
	@Test(priority = 2)
	public void gmailLinkTest() {
		driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
