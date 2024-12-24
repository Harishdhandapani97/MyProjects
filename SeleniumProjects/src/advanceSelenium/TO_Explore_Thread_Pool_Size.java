package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TO_Explore_Thread_Pool_Size {

		@Test(invocationCount = 3,threadPoolSize = 4)
		public void circbuzz() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cricbuzz.com/");
			driver.quit();
			Reporter.log("Circbuzz got open",true);
		}

		@Test(invocationCount = 2,threadPoolSize = 5)
		public void baskinRobbin() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://baskinrobbinsindia.com/");
			driver.quit();
			Reporter.log("Bakinrobbin got open",true);
		}


//		@Test( invocationCount = 4,threadPoolSize = 6)
		@Test(enabled = false)
		public void Flipkart() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.quit();
			Reporter.log("Flipkart got open",true);
		}	
	}
