package assigement_Of_Methods_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_on_Implict_wait {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

driver.get("https://www.shoppersstack.com/products_page/23");
driver.findElement(By.id("Check Delivery")).sendKeys("563125");
driver.findElement(By.name("Check")).click();
	}

}
