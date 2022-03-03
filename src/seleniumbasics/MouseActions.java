package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("._2QfC02 button")).click();
		
		WebElement electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		//Mouse Action
		
		Actions act = new Actions(driver);
		
		act.moveToElement(electronics).perform();
		
		driver.findElement(By.linkText("Cameras & Accessories")).click();

	}

}
