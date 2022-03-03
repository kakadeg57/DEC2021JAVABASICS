package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver(); //
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		// title : OrangeHRM
		
		//String title =   driver.getTitle();
		
		
		// by using getCurrentUrl
		
		String url =  driver.getCurrentUrl();
		  
		System.out.println(driver.getCurrentUrl());
		
		
		if(url.contains("https://opensource-demo.orangehrmlive.com/index.php/auth/login")) {
			
			System.out.println("we have landed on LoginPage");
			
		}
		
		else {
			
			System.out.println("we are not landed on LoginPage");
			
		}
		
		
		driver.close();
		
		

	}

}
