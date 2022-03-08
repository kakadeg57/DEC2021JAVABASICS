package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
// account page test:

public class Priority {
	WebDriver driver;
    @BeforeMethod
    public void init() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
    }
	@Test(priority = 1)
	public void googleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("TestNG");
	}	
	@Test(priority = 2)
	public void gmailLinkTest() throws InterruptedException {
		driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority = 3,enabled = false)
	public void imageLinkTest1() {
		driver.findElement(By.linkText("Ima")).isDisplayed();
		System.out.println("rest of the code");
	}
	
	
	@Test(priority = 4)
	public void imageLinkTest2() {
		driver.findElement(By.linkText("Image")).isDisplayed();
		System.out.println("rest of the code");
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
}
