package assigement_Of_Methods_in_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_image_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.zomato.com/");
Thread.sleep(3000);
File junm = driver.findElement(By.xpath("(//img[@class='low-res-image'])[2]")).getScreenshotAs(OutputType.FILE);
File jny = new File ("./ErrorShot/zomatologo.jpeg");
org.openqa.selenium.io.FileHandler.copy(junm, jny);


	}

}
