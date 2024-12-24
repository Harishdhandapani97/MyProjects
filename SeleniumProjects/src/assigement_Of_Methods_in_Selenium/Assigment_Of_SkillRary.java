package assigement_Of_Methods_in_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_Of_SkillRary {

	public static void main(String[] args) throws InterruptedException {
    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("registerClick")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MOhammed Burhan");
		Thread.sleep(2000);
		
		
	   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mdburhanjabir@gmail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name='repassword']")).sendKeys("Mdburhan@321");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jabir");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Mdburhan@321");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		//p[text()='Email: mdburhanjabir@gmail.com']
		//MDburhan@321- Password;
		
	List<WebElement> text = driver.findElements(By.xpath("//h2[text()='Thank you for Registering.']/.."));
	for(WebElement ele : text) {
		System.out.println(ele.getText());
	}
		
		
		driver.navigate().back();
		
		
		
          
		
	}

}
