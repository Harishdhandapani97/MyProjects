package testScript_writing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_Test_Script {

	public static void main(String[] args) {

		String excepectedloginpagetiltle="Facebook- login in or singup";
		String excepetedusername="mdburhanjabir456@gmail.com";
		String exceptedpassword="mdburhan321";

		//Step 1 :- Open the browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Succesful browser got launched");
		driver.manage().window().maximize();
		System.out.println("Browser got Maximize");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));


		//Step 2:- Enter the Test Url
		driver.get("https://www.facebook.com/");
		String actualloginpageTitle = driver.getTitle();
		if(actualloginpageTitle.equals(actualloginpageTitle)) {
			System.out.println("Sucessfully login to the Facebook page");
		}else {
			System.out.println("Failed to login in to the facebook page");
		}

		//Step 3:- Enter the Username in the Textfield
		WebElement Usernametextfield = driver.findElement(By.id("email"));
		Usernametextfield.clear();
		Usernametextfield.sendKeys(excepetedusername);
		String actualUsername = Usernametextfield.getAttribute("value");
		if(actualUsername.equals(excepetedusername)) {
			System.out.println("Username textfield has accepted the data");
		}else {
			System.out.println("username textfiled accepte to fail");
		}


		//Step 4:- Enter the password in Textfield
		WebElement Passwordtextfield = driver.findElement(By.name("pass"));
		Passwordtextfield.clear();
		Passwordtextfield.sendKeys(exceptedpassword);
		String actualpassword = Passwordtextfield.getAttribute("value");
		if(actualpassword.equals(exceptedpassword)) {
			System.out.println("password textfield has aceepted the data");
		}else {
			System.out.println("password textfiled accept to fail");
		}

		//Step 5:- Click on the login page
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		System.out.println("Sucessfully login in to Facebook Homepage");

		//Step 6:- Close the Browser
		System.out.println("Browser got Sucessfully closed");
		driver.quit();
	}

}
