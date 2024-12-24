package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_Locators_part2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("Email")).sendKeys("mdburahjab@gamil.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("Password")).sendKeys("jabir@321");
		Thread.sleep(3000);
		
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(3000);
		
		
	}

}
