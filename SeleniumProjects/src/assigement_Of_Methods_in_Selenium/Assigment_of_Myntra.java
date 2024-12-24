package assigement_Of_Methods_in_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_of_Myntra {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();


driver.get("https://www.myntra.com/");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Mobiles under 1000");
Thread.sleep(1000);

driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
Thread.sleep(2000);

List<WebElement> navbarm = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
for(WebElement ele:navbarm) {
	System.out.println(ele.getText());
	
}

driver.quit();

	}

}
