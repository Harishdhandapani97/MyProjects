package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseQuitMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();//starts server
		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);//close the webpage
		
		//close the parent window and child window after 3seconds  and stops the browser
		driver.quit();

	}

}
