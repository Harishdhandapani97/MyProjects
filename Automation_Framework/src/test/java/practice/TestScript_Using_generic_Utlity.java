package practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic_Utility.Excel_File_Utility;
import generic_Utility.Property_File_Utility;

public class TestScript_Using_generic_Utlity {

	public static void main(String[] args) throws IOException {
		
		Property_File_Utility fs = new Property_File_Utility();
		Excel_File_Utility excel = new Excel_File_Utility();
		
		//To read the data from Property File
		String URL = fs.ToReadDatafromPropertyfile("url");
		String Browser = fs.ToReadDatafromPropertyfile("browser");
		String Username = fs.ToReadDatafromPropertyfile("username");
		String Password = fs.ToReadDatafromPropertyfile("password");
		
		
		//To Read The data from the Excel File
		String Lastname = excel.ToReadTheDataFromExcelFile("Contacts", 1, 3);
		//Lanuch and Browser
		WebDriver driver = null;
		if(Browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equals("Edge")) {
			driver = new EdgeDriver();
		}else if(Browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
		//Login to the application with vaild Credentails
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(Username);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();
		
		//Navigate to Contact Link
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Create Account Lookup Image
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		//Step 5:- create Contact with mandatory Filelds
		driver.findElement(By.name("lastname")).sendKeys(Lastname);
		
	}


}
