package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic_Utility.Excel_File_Utility;
import generic_Utility.Property_File_Utility;
import generic_Utility.WebDriver_Utility;
import java.io.IOException;

public class TestScript_with_Gu {

	public static void main(String[] args) throws IOException {
		
		Property_File_Utility prop = new Property_File_Utility();
		Excel_File_Utility excel = new Excel_File_Utility();
		WebDriver_Utility ws = new WebDriver_Utility();
		
		//To read the data from property File 
		String URL = prop.ToReadDatafromPropertyfile("url");
		String Browser = prop.ToReadDatafromPropertyfile("browser");
		String Username = prop.ToReadDatafromPropertyfile("username");
		String Password = prop.ToReadDatafromPropertyfile("password");
		
		
		//To Read the Data from the Excel File
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
				driver.get(URL);
				
			ws.toMaximize(driver);
			ws.waitforElement(driver);
			
			//Step 2:-Login to application with Valid Crendiatial
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("password");
			driver.findElement(By.id("submitButton")).click();

			//Step 3:- Navigate to Contact Page
			driver.findElement(By.linkText("Contacts")).click();

			//Step 4:- Click on Create contact look up image
			driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

			//Step 5:- create Contact with mandatory Filelds
			driver.findElement(By.name("lastname")).sendKeys(Lastname);

			//Step 6:- Save and Verify
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			String Lastname1 = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			if(Lastname1.contains(Lastname1)) {
				System.out.println(Lastname1+"______ Passed");
			}else {
				System.out.println(Lastname1+"--------- Fails");
			}

			//Step 7:- Logout of Application
			WebElement logoutele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			
		
		
	}
}
