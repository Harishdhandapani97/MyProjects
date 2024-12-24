package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Assigment_To_Send_mail {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com/mail/u/1/?ogbl#inbox");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mdburhanjabir@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
	}

}
