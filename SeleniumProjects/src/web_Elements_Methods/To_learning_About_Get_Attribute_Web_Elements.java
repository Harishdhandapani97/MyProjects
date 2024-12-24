package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_learning_About_Get_Attribute_Web_Elements {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		
		String value = driver.findElement(By.xpath("//span[text()='Sign up']")).getAttribute("class");
		System.out.println(value);
		
		driver.close();
		
	}

}
