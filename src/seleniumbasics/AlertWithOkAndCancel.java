package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkAndCancel {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String alertText = alt.getText();
		
		alt.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		
		if(text.equals("You Pressed Cancel")) {
			
			System.out.println("Test is passed we clicked on Cancel");
		}
		
		else if(text.equals("You pressed Ok")) {
			System.out.println("Test is passed we clicked on ok");
		}
		
		
		
		// .btn.btn-primary
		////button[text()='click the button to display a confirm box ']
		

	}

}
