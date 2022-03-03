package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement element = driver.findElement(By.name("radiooptions"));
		
		//element.isSelected()
		
		String value = element.getAttribute("value");
		
		if(value.contains("Male")) {
			element.click();
		}
		
		//System.out.println(value);
		

	}

}
