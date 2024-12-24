package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_by_offset {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");

		driver.findElement(By.id("password")).sendKeys("3456782");

		//move by offset actions class
		Actions my = new Actions(driver);
		my.moveByOffset(1213, 303).clickAndHold().perform();
		Thread.sleep(4000);
		my.release();
		

		driver.quit();


	}

}
