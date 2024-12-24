package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_handle_Confirmation_popups {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

		driver.get("https://licindia.in/");
		driver.findElement(By.partialLinkText("Login")).click();

		//to handle confirmation popup
		Alert confrimationpopup = driver.switchTo().alert();
		System.out.println(confrimationpopup.getText());//it will get text
		confrimationpopup.accept();// it will click on ok button
//		confrimatio	npopup.dismiss();//it will click on cancel button
	}

}
