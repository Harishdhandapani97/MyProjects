package assigement_Of_Methods_in_Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Assigment_Of_Zomato {

	public static void main(String[] args) throws InterruptedException, IOException {

     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.get("https://www.zomato.com/");
     Thread.sleep(4000);
     
     //Takes Screehshot Zomato Entire Page
       TakesScreenshot rock = (TakesScreenshot) driver;
       File hang = rock.getScreenshotAs(OutputType.FILE);
       File khan = new File("./ErrorShot/Kabir.png");
       FileHandler.copy(hang, khan);
	}

}
