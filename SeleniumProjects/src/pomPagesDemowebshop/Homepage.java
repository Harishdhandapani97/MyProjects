package pomPagesDemowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register")
	private WebElement registerlink;
	
	@FindBy(linkText="Log in")
	private WebElement loginlink;
	
	@FindBy(linkText ="Shopping cart")
	  private WebElement shoopingcartlink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlistlink;

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getShoopingcartlink() {
		return shoopingcartlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}
	
	
}
