package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetUrl {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}

}
