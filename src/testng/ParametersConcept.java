package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersConcept {
	
	WebDriver driver;
    @BeforeMethod
    public void init() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    }
	
	
	@Parameters({"Admin","admin123"})
	@Test
	public void validateLoginTest(String username,String password) {
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

	@AfterMethod
	public void closeResources() {
		driver.close();
	}
	
	
}
