package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Advance_Selenium_Priority {

	@Test(priority = -3)
	public void circbuzz() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(3000);
		driver.quit();
		Reporter.log("Circbuzz got open",true);
	}

	@Test(priority = 0)	
	public void baskinRobbin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Thread.sleep(3000);
		driver.quit();
		Reporter.log("Bakinrobbin got open",true);
	}


	@Test(priority = -7)
	public void Flipkart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.quit();
		Reporter.log("Flipkart got open",true);
	}


}


