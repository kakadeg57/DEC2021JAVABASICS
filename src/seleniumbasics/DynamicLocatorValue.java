package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLocatorValue {

	public static void main(String[] args) throws InterruptedException {
		
		
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
 		// id = u_0_2_hE
	
 		// id = u_0_2_aB
 		
 		//id = u_0_2_Mg
    
    
    // //a[starts-with(@id,'u_0_2')]
    // //a[contains(@id,'u_0_2')] 
 		
    
    // /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
			//driver.findElement(By.id("email")).isDisplayed();
		
			//driver.findElement(By.id("email")).sendKeys("demo@gmail.com");
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.cssSelector("._8esa")).click();
		
		
		
		
		
	}

}
