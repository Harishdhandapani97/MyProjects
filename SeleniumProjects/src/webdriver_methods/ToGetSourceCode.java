package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSourceCode {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();//opens the empty browser
		driver.get("https://online.kfc.co.in/");//opens the website
		
		//to get source code of the webpage
		String srccode = driver.getPageSource();
		System.out.println(srccode);
	
	}
}
