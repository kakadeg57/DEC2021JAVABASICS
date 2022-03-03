package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		
		Thread.sleep(10000);
		
		List<WebElement> languages=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
		
		System.out.println(languages.size());
		
		// loop
		
		for(WebElement element : languages) {
			
			String lang = element.getText();
			
			System.out.println(lang);
			
		}
		
		
		

	}

}
