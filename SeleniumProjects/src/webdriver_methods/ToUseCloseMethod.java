package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();// opens empty browser and starts server
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);// waits for 5seconds
		
		//close the parent window after 5seconds but not stops the browser
		driver.close();
	}

}
