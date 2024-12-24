package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_On_Double_Click {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement addbutton = driver.findElement(By.id("add"));


		//to use Actions class to perform double click
		Actions buy = new Actions(driver);
		buy.doubleClick(addbutton).perform();
		Thread.sleep(2000);
		
		buy.doubleClick(addbutton).perform();
		Thread.sleep(2000);
		
		buy.doubleClick(addbutton).perform();
		Thread.sleep(2000);
		
		buy.doubleClick(addbutton).perform();
		Thread.sleep(2000);
		
		buy.doubleClick(addbutton).perform();
		Thread.sleep(2000);
		
		buy.doubleClick(addbutton).perform();
		Thread.sleep(4000);
		
	}

}
