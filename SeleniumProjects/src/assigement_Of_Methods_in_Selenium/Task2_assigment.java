package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_assigment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		String had = driver.getCurrentUrl();
		System.out.println(had);
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
