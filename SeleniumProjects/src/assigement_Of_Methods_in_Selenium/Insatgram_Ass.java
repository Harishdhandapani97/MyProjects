package assigement_Of_Methods_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insatgram_Ass {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.instagram.com/");

driver.findElement(By.xpath("//input[@name='username']")).sendKeys("887755344");

driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mdburahn@321");


	}

}
