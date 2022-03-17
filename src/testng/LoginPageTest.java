package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import datadriventesting.ExcelReader;

public class LoginPageTest {

	WebDriver driver;
	Properties prop;
	FileInputStream file;
		
	@Parameters({"website","bwr"})
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
    	driver.findElement(By.cssSelector("#txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@DataProvider(name="createEmp")
	public String [][] createEmp() throws IOException {
		String empData[][]=ExcelReader.getData();
		return empData;
	}
	
	@Test(dataProvider = "createEmp")
	public void validateLoginTest1(String firstname,String lastname,String empID) {
	WebElement pim =	driver.findElement(By.xpath("//*[text()='PIM']"));
	Actions act = new Actions(driver);
	act.moveToElement(pim).build().perform();
	driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
	driver.findElement(By.id("firstName")).sendKeys(firstname);
	driver.findElement(By.id("lastName")).sendKeys(lastname);
	driver.findElement(By.id("employeeId")).clear();
	driver.findElement(By.id("employeeId")).sendKeys(empID);
	driver.findElement(By.id("btnSave")).click();
	}	

	@AfterMethod
	public void closeResources() {
		driver.close();
	}
	
	
	
}
