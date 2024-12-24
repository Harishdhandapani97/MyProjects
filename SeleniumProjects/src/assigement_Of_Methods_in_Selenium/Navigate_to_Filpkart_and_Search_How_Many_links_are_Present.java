package assigement_Of_Methods_in_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_to_Filpkart_and_Search_How_Many_links_are_Present {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		List<WebElement> anchor = driver.findElements(By.tagName("a"));
		System.out.println(anchor.size());
	}

}
