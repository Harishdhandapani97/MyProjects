package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class To_Avoid_The_Notifiction_Popup {

	public static void main(String[] args) {

		//To Change the Browser Settings//
		ChromeOptions settings = new ChromeOptions();
//		settings.addArguments("--disable-notifications");//or you can use chromeium Website 
//				settings.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.yatra.com/");
		driver.getPageSource();

	}

}
