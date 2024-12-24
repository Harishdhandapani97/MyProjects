package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Learning_The_Get_attribute_webelement {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		
		 String values = driver.findElement(By.linkText("Try Free")).getAttribute("href");
		System.out.println(values);
		
		driver.close();
	}

}
