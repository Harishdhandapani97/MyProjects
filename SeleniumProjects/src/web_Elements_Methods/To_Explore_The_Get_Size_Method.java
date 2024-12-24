package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Explore_The_Get_Size_Method {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		
		WebElement lenght = driver.findElement(By.linkText("Log in"));
		System.out.println(lenght.getSize());
	}

}
