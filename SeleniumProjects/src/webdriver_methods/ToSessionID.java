package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSessionID {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//to capture the session ID return type is string only gives parent window ID ,every time it will be changed
		driver.get("https://www.instagram.com/");
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);//73B6745854E46F58724D1C492C4CE0A3
                                      //7F65FCA3EE0D54AEC911172B4BC44625
	}

}
