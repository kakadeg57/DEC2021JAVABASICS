package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		
		//Thread.sleep(15000); // static wait  = dynamic wait 
		
		List<WebElement>  webelements=driver.findElements(By.xpath("//ul[@class='G43f7e']/descendant::span"));
		
		//int webelementsNumber= webelements.size();
		
		//System.out.println(webelementsNumber);
		
//		for(WebElement ele:webelements) {
//			
//			String name = ele.getText();
//			System.out.println(name);
//		}
		
		// Iterator
		
		for(int i=0;i<webelements.size();i++) {
			
			String name = webelements.get(i).getText();
			System.out.println(name);
			
			if(name.equalsIgnoreCase("java compiler")) {
			// click
				
				webelements.get(i).click();	
			break;
			}
			
		}
		
		
		//driver.close();
		
	}

}
