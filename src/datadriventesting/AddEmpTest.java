package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddEmpTest extends ExcelReader{
	
	WebDriver driver;
	Properties prop;
	FileInputStream file;

	 @BeforeMethod
	    public void init(String url,String browser) throws IOException {
			
	    	if(browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	}
	    	else if(browser.contains("firefox")) {
	    		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	    		driver = new FirefoxDriver();
	    	}
	    	driver.get(url);
	    	
	    	file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SpeedwaySeleniumDec\\credentials.properties");
	    	prop = new Properties();
	    	prop.load(file);
		}
		
		
		
		@Test
		public void validateLoginTest() {
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		

		@AfterMethod
		public void closeResources() {
			driver.close();
		}

}
