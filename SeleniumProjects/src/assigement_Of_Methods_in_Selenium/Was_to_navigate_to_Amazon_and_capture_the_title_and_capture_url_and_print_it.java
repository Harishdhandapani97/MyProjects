package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Was_to_navigate_to_Amazon_and_capture_the_title_and_capture_url_and_print_it {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String UrlofAmazon = driver.getCurrentUrl();
		
		System.out.println(UrlofAmazon);
		

	}

}
