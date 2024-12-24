package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Explore_The_Get_Locations_Method {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		
		Point location = driver.findElement(By.xpath("//span[text()='Features']")).getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		System.out.println(location.getClass());
	}

}
