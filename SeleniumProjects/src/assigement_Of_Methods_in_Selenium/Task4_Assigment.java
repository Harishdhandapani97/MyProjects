package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_Assigment {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.barbequenation.com/");
		String barb = driver.getWindowHandle();
		System.out.println(barb);
		
		String current = driver.getCurrentUrl();
		System.out.println(current);
		
		driver.manage().window().getSize();
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		
		driver.close();
		
		

	}

}
