package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
    WebDriver driver;
    @BeforeMethod
    public void init() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
    }
	@Test
	public void googleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("TestNG");
	}	
	@Test
	public void gmailLinkTest() throws InterruptedException {
		driver.findElement(By.linkText("Gmail")).isDisplayed();
		Thread.sleep(10000);
	}
	@Test
	public void imageLinkTest() {
		driver.findElement(By.linkText("Ima")).isDisplayed();
		System.out.println("rest of the code");
	}
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
}
