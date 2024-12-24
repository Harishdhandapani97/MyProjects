package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestScript_three {

	public static void main(String[] args) {

		//Step no 1:- lanuch the Browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//step no 2:- login to the application with valid Crendentails
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();

		//Step no 3:- Navigate to Organization link
		driver.findElement(By.linkText("Organizations")).click();

		//Step no 4:- click on organization look up image
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

		//Step no 5:- create Organization with mandatory Fields
		driver.findElement(By.name("accountname")).sendKeys("popuio");
		WebElement industryele = driver.findElement(By.name("industry"));
		Select cm = new Select(industryele);
		cm.selectByValue("Chemicals");


		//step no 6:- Save and Verify
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String dropdownele = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(dropdownele.contains(dropdownele)) {
			System.out.println(dropdownele+"-------  Passed");
		}else {
			System.out.println(dropdownele+"-------- Failed");
		}

		//Step no 7:-logout from the Application
		WebElement logoutele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions sc = new Actions(driver);
		sc.moveToElement(logoutele);
		driver.findElement(By.linkText("Sign Out")).click();
		
		//Step no 8:- Quit
		driver.quit();


	}

}
