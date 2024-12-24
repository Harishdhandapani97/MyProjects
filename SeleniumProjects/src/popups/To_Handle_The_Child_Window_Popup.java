package popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class To_Handle_The_Child_Window_Popup {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));


		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("best iphones",Keys.ENTER);
		driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 13')]) [1]")).click();
		String handle1 = driver.getWindowHandle();
		Set<String> handel2 = driver.getWindowHandles();

		for(String url :handel2 ) {

			driver.switchTo().window(url);
			System.out.println("the title of the web page"+driver.getTitle());
			driver.close();
		}

		TakesScreenshot sc = (TakesScreenshot) driver;
		File mobiles = sc.getScreenshotAs(OutputType.FILE);
		File iknew = new File("./Errorshot/iphone.jpeg");
		FileHandler.copy(mobiles, iknew);

		driver.switchTo().window(handle1);
		System.out.println("program finished");
	}


}
