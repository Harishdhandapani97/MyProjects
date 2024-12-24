package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TO_Learn_about_DataProvider {

	public String[][] toSenddata() {
		
		@DataProvider(name="myacess")
		String [] [] khan = {
				{"mdburhan@gmail.com","mdburhan@123"},
				{"khan@gmail.com","khan@123"},
				{"jabir@gmial.com","Jabir@123"},
				{"burhan@gmail.com","burhan@123"} 
				};
				
				return khan;
		};
		
		@Test(dataProvider = "myacess")
		public void toLogin(String username,String password) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
		}
		
	}

