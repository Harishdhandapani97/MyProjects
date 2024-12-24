package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://www.flipkart.com/");
		
		WebElement electronicsele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		
		//to perform mouse hover //
		Actions flipl = new Actions(driver);
		flipl.moveToElement(electronicsele).perform();
	}

}
