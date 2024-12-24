package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtbe_assigment_By_Locators {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='text' and @aria-label='Search']")).sendKeys("tauba tauba song");
//		Thread.sleep(3000);
		
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("video-title")).click();
		
		
	
		
	}

}
