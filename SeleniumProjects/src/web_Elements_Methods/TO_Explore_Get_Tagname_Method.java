package web_Elements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Explore_Get_Tagname_Method {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
	    String elemant = driver.findElement(By.xpath("//span[text()='Wishlist']")).getTagName();
	    System.out.println(elemant);
		
		driver.close();
		
	}

}
