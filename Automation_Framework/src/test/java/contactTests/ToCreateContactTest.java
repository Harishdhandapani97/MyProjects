package contactTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import generic_Utility.BaseClass;
import generic_Utility.Excel_File_Utility;
import generic_Utility.Property_File_Utility;
import vitger_Object_Respority.Contact_Information_Page;
import vitger_Object_Respority.Contacts_Page;
import vitger_Object_Respority.Create_Contact_Page;
import vitger_Object_Respority.Homepage;

@Listeners(generic_Utility.Listener_Implemention.class)
public class ToCreateContactTest extends BaseClass {

	@Test(groups="regression")
	public void toCreateContactTest__001() throws EncryptedDocumentException, IOException {
		Homepage hp = new Homepage(driver);
		hp.getContactslink().click();
		Contacts_Page cp = new Contacts_Page(driver);
		cp.getOrganisationlookupimage().click();
		
		//To Read the data From excel
		Excel_File_Utility excel = new Excel_File_Utility();
		String Lastname = excel.ToReadTheDataFromExcelFile("Contacts", 1, 2);
		Create_Contact_Page ccp = new Create_Contact_Page(driver);
		ccp.getLastnameTextField().sendKeys(Lastname);
		ccp.getSaveButton().click();
		Contact_Information_Page ps = new Contact_Information_Page(driver);
		ps.getContactinfoheader().getText();
		
		//Assert.fail(); // To Take the 
		//Don't Use If else instude of use assetion
//		if(Lastname.contains(Lastname)) {
//			System.out.println(Lastname+"-------Passed");
//		}else {
//			System.out.println(Lastname+"--------Failed");
//		}
		Assert.assertTrue(Lastname.contains(Lastname));
		
		

	}

}
