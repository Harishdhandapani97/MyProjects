package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		
		//to maximize
	//  driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//to minimize
	//  driver.manage().window().minimize();
		
		//to full screen
	//  driver.manage().window().full screen();
		
		//to capture the size of the browser
	//  Dimension sizeOfTheBrowser = driver.manage().window().getSize();
	//  System.out.println(sizeOfTheBrowser);
		
		//to set the size of the browser
	//   Dimension d = new Dimension(600,500);
	//   driver.manage().window().setSize(d);     // or driver.manage().window().setSize(new Dimension(500,600));
		
		//To get position
	//  Point position = driver.manage().window().getPosition();
	//  System.out.println(position);
		
		//To set position
		Point p = new Point(40,80);
		driver.manage().window().setPosition(p);    // or driver.manage().window().setPosition(Point(40,80));  
	}

}
