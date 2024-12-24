package vitger_Object_Respority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_New_Organization_Page {

	/**
	 * @return the organizationname
	 */
	public WebElement getOrganizationname() {
		return Organizationname;
	}

	/**
	 * @return the assignedTo
	 */
	public WebElement getAssignedTo() {
		return AssignedTo;
	}

	/**
	 * @return the savebutton
	 */
	public WebElement getSavebutton() {
		return Savebutton;
	}

	public Create_New_Organization_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "accountname")
	private WebElement Organizationname;
	
	@FindBy(xpath = "//input[@name='assigntype'] [1]")
	private WebElement AssignedTo;
	
	@FindBy(xpath = "//input[@type='button'] [1]")
	private WebElement Savebutton;
	
	
	
}
