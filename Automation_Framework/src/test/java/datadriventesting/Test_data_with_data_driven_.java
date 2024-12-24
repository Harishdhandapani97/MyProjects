package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_data_with_data_driven_ {

	public static void main(String[] args) throws IOException {

		//to read the data from the properties file
		FileInputStream sc = new FileInputStream(".\\src\\test\\resources\\commonfolder.properties");
		Properties prop = new Properties();
		prop.load(sc);

		String URL = prop.getProperty("url");
		String username = prop.getProperty("username");
		String Password = prop.getProperty("password");
		String browser = prop.getProperty("browser");


		//to read the data from excel file
		FileInputStream efis = new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
		Workbook work = WorkbookFactory.create(efis);
		String lastname = work.getSheet("Contacts").getRow(1).getCell(2).getStringCellValue();


		//Lanuch and Browser
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			driver = new EdgeDriver();
		}else if(browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Login to the application with vaild Credentails
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();

		//Navigate to Contact Link
		driver.findElement(By.linkText("Contacts")).click();

		//Click on Create Account Lookup Image
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

		//Step 5:- create Contact with mandatory Filelds
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		
		
	}
}
