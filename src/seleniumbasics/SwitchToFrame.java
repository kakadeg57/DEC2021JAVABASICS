package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.get("http://demo.automationtesting.in/Frames.html");
			
			//Thread.sleep(5000);
			
			// frame/iframe concpet:
			
			WebElement frame = driver.findElement(By.id("singleframe"));

			driver.switchTo().frame(frame);
			
			driver.findElement(By.cssSelector("[type='text']")).sendKeys("SpeedwayTech");
			   // xpath = //input[@type='text']
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.linkText("Practice Site")).click();
			
			
	}

}
