package vitger_Object_Respority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	/**
	 * @return the contactslink
	 */
	public WebElement getContactslink() {
		return Contactslink;
	}

	/**
	 * @return the oragnizationlink
	 */
	public WebElement getOragnizationlink() {
		return oragnizationlink;
	}

	/**
	 * @return the administrativeimage
	 */
	public WebElement getAdministrativeimage() {
		return administrativeimage;
	}

	/**
	 * @return the singoutLink
	 */
	public WebElement getSingoutLink() {
		return singoutLink;
	}

	//Creating constructer
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Contacts")
	private WebElement Contactslink;
	
	@FindBy(linkText="Organizations")
	private WebElement oragnizationlink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrativeimage;
	
	@FindBy(linkText = "Sign Out")
	private WebElement singoutLink;	
	
	
	
}
