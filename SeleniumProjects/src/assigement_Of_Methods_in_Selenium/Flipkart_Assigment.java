package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Assigment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("")).sendKeys("8431136274");
		Thread.sleep(1000);
		
	}

}
