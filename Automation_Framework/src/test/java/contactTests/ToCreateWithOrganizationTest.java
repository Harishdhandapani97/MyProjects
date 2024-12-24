package contactTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import generic_Utility.BaseClass;
import generic_Utility.Excel_File_Utility;
import generic_Utility.Java_Utility;
import vitger_Object_Respority.Contact_Information_Page;
import vitger_Object_Respority.Contacts_Page;
import vitger_Object_Respority.Create_Contact_Page;
import vitger_Object_Respority.Create_New_Organization_Page;
import vitger_Object_Respority.Create_Organisation_Page;
import vitger_Object_Respority.Homepage;
import vitger_Object_Respority.Organization_Information_Page;

public class ToCreateWithOrganizationTest extends BaseClass{

	@Test(groups ="smoke")
	public void ToCreateOrganization_002() throws EncryptedDocumentException, IOException{
		Homepage sp = new Homepage(driver);
		sp.getOragnizationlink().click();
		Create_Organisation_Page ps = new Create_Organisation_Page(driver);
		ps.getOrganizationlookupimage().click();
		Create_New_Organization_Page mp = new Create_New_Organization_Page(driver);

		//Reading The data from excel File Utility
		Excel_File_Utility fs = new Excel_File_Utility();
		String Organizationname = fs.ToReadTheDataFromExcelFile("Organization", 1, 2);
		mp.getOrganizationname().sendKeys(Organizationname);
		mp.getSavebutton().click();
		Organization_Information_Page hj = new Organization_Information_Page(driver);
		hj.getOrganiztioninfoHeader().getText();




	}
}
