package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviagte_to_demo_shop_website_Assigment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("mdburhanjabir34@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Password")).sendKeys("hand321");
		Thread.sleep(1000);
		
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("buttons")).click();
		Thread.sleep(1000);
			
		
		
	}

}
