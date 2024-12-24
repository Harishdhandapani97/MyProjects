package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_Handle_Hidden_Division_Popup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		//we are using action class
		Actions sc= new Actions(driver);
		sc.scrollByAmount(0, 100).perform();


		for(;;) {


			try {
				driver.findElement(By.xpath("//div[text()='March 2025']/../..//p[text()='26']")).click();
			}catch (Exception e) {

				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

	}
}
