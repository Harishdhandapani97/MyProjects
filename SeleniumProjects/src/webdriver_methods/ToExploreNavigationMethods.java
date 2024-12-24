package webdriver_methods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigationMethods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		//to maximize is mandatory after launching an empty browser
		driver.manage().window().maximize();
		
		//another way to open the application
		//driver.navigate().to("https://www.instagram.com/");
		
		//open the URL  another method
		//driver.navigate().to(new URL("https://www.instagram.com/"));
		
		//to navigate to different web applications and go back and forward and refresh the application
		 driver.get("https://www.instagram.com/");
		 Thread.sleep(3000);
		 
		 driver.get("https://online.kfc.co.in/");
		 
		  Navigation nav = driver.navigate();
		  Thread.sleep(3000);
		  nav.back();
		  Thread.sleep(3000);
		  nav.forward();
		  Thread.sleep(3000);
		  nav.refresh();
		
		
		

	}

}
