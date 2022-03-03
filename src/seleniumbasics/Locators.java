package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector(".textInputContainer > input")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("[value='LOGIN']")).click();
		
		
		
		
		
		////input[@type="password"]
		////*[@value='LOGIN']
		
		/* CSS Selector:
		 * ID - 
		 *  #value
		 * class - 
		 *  .value
		 *  
		 *  input[value='LOGIN']
		 *  [value='LOGIN']
		 * 
		 *   
		 * 
		 * 
		 */
		
		//
		//cy.visit("url");
		
		

	}

}
