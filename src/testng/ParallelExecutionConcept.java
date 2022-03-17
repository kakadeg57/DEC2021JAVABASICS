package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecutionConcept {

	 WebDriver driver;
	 
	    @BeforeMethod
	    public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
	    }
		@Test
		public void googleSearchTest() {
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("TestNG parallel execution");
		}	
		
		@Test
		public void bingSearchTest() {
			driver.get("https://www.bing.com/");
			driver.findElement(By.id("sb_form_q")).sendKeys("TestNG parallel execution");
		}
		
		@AfterMethod
		public void closeResources() {
			driver.close();
		}
	}
	
	
	
	
	
	
	
	

