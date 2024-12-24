package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_Five {

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
		
		//step no 3:- navigate to Contacts Link
		driver.findElement(By.linkText("Contacts")).click();
		
		//Step  no 4:- Click om Create Contact Look up image
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		//Step no 5:- Create contact with madatory Fields
		driver.findElement(By.name("lastname")).sendKeys("KABIR");
		
		//STEP NO 6:-Select the Organization from Organization look up image
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		String parentid = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		Set<String> Childwindow = driver.getWindowHandles();
		for (String handle : Childwindow) {
			
			driver.switchTo().window(handle);
			driver.findElement(By.id()).click();
			driver.close();
			
			
		}
		driver.switchTo().window(parentid);
		
		
		//Step no 7:- Save and Verify
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		String dropdownele = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(dropdownele.contains(dropdownele)) {
			System.out.println(dropdownele+"-------- Passed ");
		}else {
			
			System.out.println(dropdownele+"------- failed");
		}
		
		//Step no 8:- quit the Browser
		
		driver.quit();
	}

}
