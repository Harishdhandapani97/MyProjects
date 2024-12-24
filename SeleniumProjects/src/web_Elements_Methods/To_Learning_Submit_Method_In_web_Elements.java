package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Learning_Submit_Method_In_web_Elements {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("mdburhanjabir2123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("burhan@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
	}

}

