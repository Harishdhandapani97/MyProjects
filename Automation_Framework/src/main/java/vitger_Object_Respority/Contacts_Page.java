package vitger_Object_Respority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts_Page {

	/**
	 * @return the organisationlookupimage
	 */
	public WebElement getOrganisationlookupimage() {
		return organisationlookupimage;
	}

	public Contacts_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement organisationlookupimage;
	

}
