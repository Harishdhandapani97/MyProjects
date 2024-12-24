package assigement_Of_Methods_in_Selenium;

import java.util.NavigableMap;
import java.util.NavigableSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_Assigment {

	private static final String Navigation = null;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.giallozafferano.com/");
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		driver.close();
		
		

	}

}
