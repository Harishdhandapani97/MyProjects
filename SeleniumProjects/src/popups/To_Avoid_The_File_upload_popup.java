package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_Avoid_The_File_upload_popup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	    driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();

		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.id("resumeUpload")).sendKeys("D:\\manual testing project details\\SELENIUM.pdf");
		System.out.println(driver.getTitle());
		

	}

}
