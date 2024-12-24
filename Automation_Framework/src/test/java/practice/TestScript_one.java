package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript_one {

	public static void main(String[] args) {

		//Step1:- Lanuch the browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

		//Step 2:-Login to application with Valid Crendiatial
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();

		//Step 3:- Navigate to Contact Page
		driver.findElement(By.linkText("Contacts")).click();

		//Step 4:- Click on Create contact look up image
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

		//Step 5:- create Contact with mandatory Filelds
		driver.findElement(By.name("lastname")).sendKeys("mdburhanjabir");

		//Step 6:- Save and Verify
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String Lastname = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(Lastname.contains(Lastname)) {
			System.out.println(Lastname+"______ Passed");
		}else {
			System.out.println(Lastname+"--------- Fails");
		}

		//Step 7:- Logout of Application
		WebElement logoutele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions sc = new Actions(driver);
		sc.moveToElement(logoutele).perform();
		driver.findElement(By.linkText("Sign Out")).click();

		//Step 8 :- Close an Application
		driver.quit();

	}
	

}
