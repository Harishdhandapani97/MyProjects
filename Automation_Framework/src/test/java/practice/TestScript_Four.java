package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript_Four {
public static void main(String[] args) {
	//Step no 1:- Launch The Browser
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	//Step no 2:- Login to application with valid Credentials
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("password");
	driver.findElement(By.id("submitButton")).click();
	
	//Step no 3:-Navigate to an organization Link
	driver.findElement(By.linkText("Organizations")).click();
	
	//Step no 4:- click on organization look up image
			driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

			//Step no 5:- create Organization with mandatory Fields
			driver.findElement(By.name("accountname")).sendKeys("jacklVER");
			
			//Step no 6:- Select Energy in the industry dropdown
			WebElement industryele = driver.findElement(By.name("industry"));
			Select sc = new Select(industryele);
			sc.selectByValue("Energy");
			
			//Step  no 7:- select customer in the type dropdown
			WebElement typeele = driver.findElement(By.name("accounttype"));
			Select sm = new Select(typeele);
			sm.selectByValue("Customer");
			
			//Step no 8:- Save and Verify
			driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
			String dropdownele = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			if(dropdownele.contains(dropdownele)) {
				System.out.println(dropdownele+"-------- Passed ");
			}else {
				
				System.out.println(dropdownele+"------- failed");
			}
		
			driver.quit();
}
}
