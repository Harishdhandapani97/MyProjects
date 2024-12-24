package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Click_and_hold_And_Release {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");

		driver.findElement(By.id("password")).sendKeys("mdburhan@321");

		WebElement eyeicon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));


		//to perform click and hold and release

		Actions jhu = new Actions(driver);
		jhu.clickAndHold(eyeicon).perform();
		Thread.sleep(2000);

		jhu.release(eyeicon).perform();



	}

}
