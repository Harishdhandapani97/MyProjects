package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();//opens the empty browser
		driver.get("https://www.instagram.com/");//opens the web application
		
		// to capture URL of the web page
        String urlofThewebpage = driver.getCurrentUrl();
        System.out.println(urlofThewebpage);//printing URL
	}

}
