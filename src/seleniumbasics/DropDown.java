package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement yearDropDown = driver.findElement(By.id("yearbox"));
		
		//Select 
		Select sel1 = new Select(yearDropDown);
		sel1.selectByVisibleText("2000");
		
		WebElement monthDropDown=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel2 = new Select(monthDropDown);
		//sel2.selectByValue("February");
		
		sel2.selectByIndex(1);
		
		
		
		
		
		

	}

}
