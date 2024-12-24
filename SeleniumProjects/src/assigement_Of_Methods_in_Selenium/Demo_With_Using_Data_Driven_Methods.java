package assigement_Of_Methods_in_Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_With_Using_Data_Driven_Methods {

	public static void main(String[] args) throws IOException {

         FileInputStream gt = new FileInputStream("./TestData/Demo.properties");
          
          Properties pc = new Properties();
          
          
          pc.load(gt);
          String url = pc.getProperty("ofdemo");
          String firstname = pc.getProperty("Fistnamedemo");
          String lastname = pc.getProperty("Lastnamedemo");
          String Emailid = pc.getProperty("Emaildemo");
          String password = pc.getProperty("Passworddemo");
          String conformpassword = pc.getProperty("Confrimpassworddemo");
          
          //Script starts
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
          
         
          driver.get(url);
          driver.findElement(By.linkText("Register")).click();
          driver.findElement(By.id("gender-male")).click();
          driver.findElement(By.id("FirstName")).sendKeys(firstname);
          driver.findElement(By.id("LastName")).sendKeys(lastname);
          driver.findElement(By.id("Email")).sendKeys(Emailid);
          driver.findElement(By.id("Password")).sendKeys(password);
          driver.findElement(By.id("ConfirmPassword")).sendKeys(conformpassword);
          
          
          
	}

}
