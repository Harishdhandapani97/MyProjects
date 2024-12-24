package assigement_Of_Methods_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_capture_data_inthe_vitger {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

driver.get("https://demo.vtiger.com/vtigercrm/");
WebElement getv = driver.findElement(By.id("username"));
WebElement password = driver.findElement(By.id("password"));

System.out.println(getv);




	}

}
