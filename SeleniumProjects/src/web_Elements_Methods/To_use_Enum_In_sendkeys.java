package web_Elements_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_use_Enum_In_sendkeys {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

driver.get("https://www.amazon.in/");

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Realme phones under 20000",Keys.ENTER);
	}

}
