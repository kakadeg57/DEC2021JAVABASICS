package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {
	 
	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		int timesec = 10;
		
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(timesec, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
		
		// ExplicitWait
		
	    WebDriverWait wait = new WebDriverWait(driver,25);
	    
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		boolean status = driver.findElement(By.id("message")).isDisplayed();
		/***********/
		
		// ExplicitWait
		
		
		
		if(status==true) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
	}

}
