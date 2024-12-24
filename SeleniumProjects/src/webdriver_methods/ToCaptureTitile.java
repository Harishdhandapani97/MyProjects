package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitile {

	public static void main(String[] args) {
		 
		ChromeDriver driver = new ChromeDriver();//opens an empty browser
		driver.get("https://www.instagram.com/");//opens an application based on the URl
		// For capturing the title
		  String titleofwebpage = driver.getTitle();
		 System.out.println(titleofwebpage);

	}

}
