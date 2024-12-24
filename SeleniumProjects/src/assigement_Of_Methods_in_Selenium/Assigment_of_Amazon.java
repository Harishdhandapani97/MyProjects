package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_of_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Laptop under 50000");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		driver.close();
	}

}
