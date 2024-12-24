package vitger_Object_Respority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization_Information_Page {

	/**
	 * @return the organiztioninfoHeader
	 */
	public WebElement getOrganiztioninfoHeader() {
		return OrganiztioninfoHeader;
	}
	public Organization_Information_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement OrganiztioninfoHeader;
	
}
