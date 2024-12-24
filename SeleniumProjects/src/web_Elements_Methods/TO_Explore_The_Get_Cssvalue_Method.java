package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Explore_The_Get_Cssvalue_Method {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		
		WebElement tryfreebutton = driver.findElement(By.linkText("Try Free"));
		System.out.println(tryfreebutton.getCssValue("border-radius"));
		System.out.println(tryfreebutton.getCssValue("font-size"));
		System.out.println(tryfreebutton.getCssValue("font-family"));
		System.out.println(tryfreebutton.getCssValue("background-color"));
		

	}
}

