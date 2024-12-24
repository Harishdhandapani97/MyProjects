package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Explore_About_Invocation_Count {

	@Test(priority = q1asw  ,invocationCount = 3)
	public void circbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.quit();
		Reporter.log("Circbuzz got open",true);
	}

	@Test(priority = -4 ,invocationCount = 2)
	public void baskinRobbin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		driver.quit();
		Reporter.log("Bakinrobbin got open",true);
	}


	@Test( priority = 5,invocationCount = 4)
	public void Flipkart() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
		Reporter.log("Flipkart got open",true);
	}
}


