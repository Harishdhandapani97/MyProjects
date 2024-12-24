package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Learning_About_Clear_Method_in_Web_Element {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(4000);
		
		WebElement usernametextfield = driver.findElement(By.id("username"));
		usernametextfield.clear();
		usernametextfield.sendKeys("burhanjabir");
		
	
	}

}
