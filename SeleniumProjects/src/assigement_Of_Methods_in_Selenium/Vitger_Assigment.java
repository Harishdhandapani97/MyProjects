package assigement_Of_Methods_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vitger_Assigment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));


		driver.get("https://www.vtiger.com/");
		WebElement company = driver.findElement(By.id("navbarLandings"));

		Actions vu = new Actions(driver);
		vu.moveToElement(company).perform();

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.partialLinkText("\r\n"+ "+91 9243602352\r\n"+ "")).getText();

	}

}
