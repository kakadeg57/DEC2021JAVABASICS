package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Windows.html");
		
		 String parentWindow = driver.getWindowHandle();
		
            // System.out.println(parentWindow);		
		// CDwindow-685024BADFB8CC2E137AD1290E7BB2B3 pwh
		 
		 
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		  Set<String>	windows	= driver.getWindowHandles();
		  
		  // CDwindow-685024BADFB8CC2E137AD1290E7BB2B3 pwh
		  // CDwindow-29ECA1CE315AD832DAFD1DA75BF0A7B1 cwh
		  
		  for(String win : windows) {
			  
			//System.out.println(win);
			  
			  if(!win.equals(parentWindow)) {
				  driver.switchTo().window(win);
			  }	  
		  }
		
		
		/*
		   driver.getWindowHandle
		     //alphanumeric value
		   driver.getWindowHandles 
		 */
		
		driver.findElement(By.xpath("//*[text()='Downloads']")).click();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.linkText("Practice Site")).click();
		
		driver.findElement(By.cssSelector("#dismiss-button div svg")).click();
	}

}
