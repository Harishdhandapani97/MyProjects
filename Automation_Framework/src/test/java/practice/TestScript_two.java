package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_two {

	public static void main(String[] args) {

		//Step1:- Lanuch the Browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Step no 2:- Login to application with valid credentails
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();

		//Step no 3:-Navigate to organization link
		driver.findElement(By.linkText("Organizations")).click();

		//Step no 4:- Click on Create Organization look up Image
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		//Step no 5:- Create Organization with Mandatory fields
		driver.findElement(By.name("accountname")).sendKeys("olava");

		//Step no 6:- Save and Verify
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String Organizationele = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(Organizationele.contains(Organizationele)) {
			System.out.println(Organizationele+"------- Passed ");
		}else {
			System.out.println(Organizationele+"------- Failed");
		}

		//Step no 7:- Logout from an application
		
		driver.quit();

	}

}
