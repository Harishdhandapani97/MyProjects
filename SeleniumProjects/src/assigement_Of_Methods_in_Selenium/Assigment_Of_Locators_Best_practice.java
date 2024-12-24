package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assigment_Of_Locators_Best_practice {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("FirstName")).sendKeys("mdburhan");
		Thread.sleep(1000);
		
		driver.findElement(By.id("LastName")).sendKeys("jabir");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).sendKeys("mohammedalik127@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Password")).sendKeys("33445566");
		Thread.sleep(1000);
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("33445566");
		Thread.sleep(1000);
		
		driver.findElement(By.id("register-button")).click();
		
		
		
	}

}
