package dropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();//cross browser testing by upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//implicit wait
		
		driver.get("https://demoapp.skillrary.com/");
		
		//identify listbox
		WebElement listBox = driver.findElement(By.id("cars"));
		
		//to handle using select class
		Select multiSelect = new Select(listBox);
		
		//to select - has three ways(by index,by value, by visiblbe text)but visibletext takes more time
		//dropdowns which are developed using select tag can be automated using select class
		multiSelect.selectByIndex(0);
		multiSelect.selectByValue("99");
		Thread.sleep(3000);
		
		//to deselect - is only for multi select dropdown
		// has four ways - deselectByIndex(),deselectByValue(),deselectByVisibleText(),deselectAll()
		multiSelect.deselectByIndex(0);
		multiSelect.deselectByValue("99");
		multiSelect.deselectAll();
	}

}
