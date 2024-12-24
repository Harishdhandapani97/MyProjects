package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//implict wait
		
		driver.get("https://www.facebook.com/r.php");
		
		//identify dropdowns
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		//to handle dropdowns- we use select class to handle dropdowns
		// by creating object of select class- Select ref = new Select(weElement address);
		Select daySelect = new Select(dayDropdown);//handle day
		Select monthSelect = new Select(monthDropdown);//handle month
		Select yearSelect = new Select(yearDropdown);//handle year
		
		//call methods has three ways
		//selectByIndex();
		//selectByValue();
		//selectByVisibleText();
		daySelect.selectByIndex(17);//select day
		monthSelect.selectByValue("3");//select month
		yearSelect.selectByVisibleText("2004");//select year
		
		//To check whether dropdown ia single or multiSelect and the return type boolean
		System.out.println(yearSelect.isMultiple());
		
		//To get every options in dropdown
		List<WebElement> allMonths = monthSelect.getOptions();//since it has more options so it return list of web element
		for(WebElement month :allMonths) {
			System.out.println(month.getText());//prinlting using for-each loop
			monthSelect.selectByVisibleText(month.getText());//in month dropdown it changes the month name for every 2 seconds
			Thread.sleep(2000);
		}
	}

}
