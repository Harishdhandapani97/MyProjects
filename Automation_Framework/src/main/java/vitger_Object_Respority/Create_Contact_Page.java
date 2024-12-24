package vitger_Object_Respority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Contact_Page {

	/**
	 * @return the lastnameTextField
	 */
	public WebElement getLastnameTextField() {
		return LastnameTextField;
	}

	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return SaveButton;
	}

	public Create_Contact_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "lastname")
	private WebElement LastnameTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	
	
}
