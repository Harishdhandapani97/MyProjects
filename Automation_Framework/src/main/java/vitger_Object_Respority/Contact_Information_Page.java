package vitger_Object_Respority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_Information_Page {

	/**
	 * @return the contactinfoheader
	 */
	public WebElement getContactinfoheader() {
		return Contactinfoheader;
	}

	public Contact_Information_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement Contactinfoheader;
	
	
	
}
