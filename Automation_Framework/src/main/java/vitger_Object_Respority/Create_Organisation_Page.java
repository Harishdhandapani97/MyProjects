package vitger_Object_Respority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Organisation_Page {

	/**
	 * @return the organizationlookupimage
	 */
	public WebElement getOrganizationlookupimage() {
		return organizationlookupimage;
	}

	public Create_Organisation_Page(WebDriver  driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement organizationlookupimage;
	
	
}
