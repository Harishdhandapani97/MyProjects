package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class The_Properties_data_Storing {

	public static void main(String[] args) throws IOException {
  
		// Step:- Create an object of FileinputStream
		FileInputStream st = new FileInputStream("./TestData/Testdata.properties");
		
		//Step 2:- Craete an object of Respective File Type
		Properties ps = new Properties();
		
		//Step 3:- Call all Methods
		ps.load(st);
		String FacebookUrl = ps.getProperty("url");
		String UsernameFacbook = ps.getProperty("username");
		String Passwordfacebook = ps.getProperty("password");
		
		//Script starts From here
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		
		driver.get(FacebookUrl);
		
		driver.findElement(By.id("email")).sendKeys(UsernameFacbook);
		driver.findElement(By.id("pass")).sendKeys(Passwordfacebook);
		
		
	}

}
