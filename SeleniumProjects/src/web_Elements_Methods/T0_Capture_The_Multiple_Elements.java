package web_Elements_Methods;

import 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T0_Capture_The_Multiple_Elements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");

		for(;;)
			try {
				driver.findElement(By.id("loginclose1")).click();

			}catch(Exception e) {
				Thread.sleep(3000);
			}

	}

	private By driver;

	List<WebElement> navbar = driver.findElements((SearchContext) By.xpath("//ul[@class='container flex']/li"));
	for(WebElement ele: navbar) {
		System.out.println(ele.getText());
	}
}
}



