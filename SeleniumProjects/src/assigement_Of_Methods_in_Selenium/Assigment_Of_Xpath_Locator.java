package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_Of_Xpath_Locator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Thread.sleep(1000);
		
		driver.close();
	}

}
