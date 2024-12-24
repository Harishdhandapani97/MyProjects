package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();//opens empty browser
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");//opens Instagram webpage
		Thread.sleep(3000);
		
		//to enter username
		driver.findElement(By.name("username")).sendKeys("sri@gmail.com");
		Thread.sleep(2000);
		
		//to enter password
		driver.findElement(By.name("password")).sendKeys("sri@123");
		
	}

}
