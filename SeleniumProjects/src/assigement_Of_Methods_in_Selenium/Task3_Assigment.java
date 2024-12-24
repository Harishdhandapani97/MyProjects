package assigement_Of_Methods_in_Selenium;

import javax.swing.text.Position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_Assigment {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.tripadvisor.in/");
		
		Dimension d = new Dimension(600, 400);
		System.out.println(d);
		
	   Point g = new Point(500, 500);
	   System.out.println(g);
	   
	   driver.quit();
		

	}

}
