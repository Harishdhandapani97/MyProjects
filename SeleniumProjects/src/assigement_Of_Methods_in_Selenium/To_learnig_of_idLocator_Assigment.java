package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_learnig_of_idLocator_Assigment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(4000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Mohammed");
		Thread.sleep(4000);
		
		driver.findElement(By.id("LastName")).sendKeys("Burhanjabir");
		Thread.sleep(4000);
		
		driver.findElement(By.id("Email")).sendKeys("Burhanjabir@gmail.com");
		Thread.sleep(4000);
		
		driver.findElement(By.id("Company")).sendKeys("Burhanjabircompany");
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirm-button")).click();
		
		
		driver.close();
		
		
		
		
		
		
		
	}

}
