package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Learning_About_Get_Text_Web_Elements {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
		String jack = driver.findElement(By.id("glow-ingress-line1")).getText();
		System.out.println(jack);
		
		
	}

}
