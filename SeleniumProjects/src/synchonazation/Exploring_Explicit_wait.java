package synchonazation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exploring_Explicit_wait {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       
       
       driver.get("https://www.shoppersstack.com/products_page/24");
       
       driver.findElement(By.name("Check Delivery")).sendKeys("563125");
       
   //Explicit wait//
       WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(13));
       Wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Check"))));
       
       driver.findElement(By.id("Check")).click();
       
       driver.quit();
	}

}
