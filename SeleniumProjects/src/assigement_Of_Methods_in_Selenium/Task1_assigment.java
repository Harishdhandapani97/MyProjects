package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_assigment {


	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://polarbear.co.in/");

		String dev = driver.getTitle();
		System.out.																																																																																																																																																																																																																																																																				

		println(dev);

		driver.quit();


	}

}
