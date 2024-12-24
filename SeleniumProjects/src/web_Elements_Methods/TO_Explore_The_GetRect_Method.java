package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Explore_The_GetRect_Method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		Rectangle values = driver.findElement(By.linkText("Digital downloads")).getRect();
		System.out.println(values.getX());
		System.out.println(values.getY());
		System.out.println(values.getHeight());
		System.out.println(values.getWidth());
		Thread.sleep(2000);
		
		driver.quit();
	}
        
}
