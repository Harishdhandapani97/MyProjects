package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TO_Explore_Creating_Accounts {
  
	@Test
	public void CreateAccount() {
		Reporter.log("Account created Succesfully");
	}
	
	@Test
	public void EditAccount() {
		Reporter.log("Acoount got Edited");
	}
	
	@Test(dependsOnMethods = {"editAccount","CreateAccount" })
	public void DeleteAccount() {
		
	}
	
}
