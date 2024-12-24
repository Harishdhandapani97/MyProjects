package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_OF_Facebook {

	public static void main(String[] args) throws InterruptedException {

ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
Thread.sleep(3000);

boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
if(logo==true) {
System.out.println("logo is displayed");
}
else {
	System.out.println("logo is not displayed");
}
//System.out.println("before the data");
//System.out.println(logo.isDisplayed());


	}

}
