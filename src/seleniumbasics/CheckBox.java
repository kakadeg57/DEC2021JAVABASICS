package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver(); //
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement moviescheckbox=driver.findElement(By.xpath("//input[@value='Movies']"));
		
		//driver.findElement(By.xpath("//input[@value='Movies']")).g
		
		//moviescheckbox.click();
		
		
		List<WebElement> checkbox =driver.findElements(By.xpath("//input[@type='checkbox']"));
		
						
		//List<String> string = string values;
		
		//System.out.println(checkbox.size());
		
		// for  or foreach loop
		 
		for(WebElement element: checkbox) {
				
			element.click();
		
		}
		
		
		
	}

}
