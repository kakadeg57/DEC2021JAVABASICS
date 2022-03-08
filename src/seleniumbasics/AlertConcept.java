package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("Register")).click();
		
		//Alert:
		
		Alert alt =  driver.switchTo().alert();
		
		String alertText = alt.getText();
		
		System.out.println(alertText);
		
		alt.accept();
		
		
		if(alertText.contains("Please enter your name and lastname")) {
			
			System.out.println("Test is passed");
		}
		
		else {
			System.out.println("Test is failed");
		}
			
		
	}

}
