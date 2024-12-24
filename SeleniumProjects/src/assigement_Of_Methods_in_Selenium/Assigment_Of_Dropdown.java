package assigement_Of_Methods_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment_Of_Dropdown {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

driver.get("https://demowebshop.tricentis.com/");

driver.findElement(By.linkText("Books")).click();

WebElement sortby = driver.findElement(By.id("products-orderby"));

Select sorth= new Select(sortby);

sorth.selectByVisibleText("Price: Low to High");



	}

}
