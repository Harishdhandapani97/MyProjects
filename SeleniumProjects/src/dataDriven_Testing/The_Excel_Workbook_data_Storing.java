package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class The_Excel_Workbook_data_Storing {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

          //Step 1:- Craete an object on FileinputStream
		  FileInputStream sc = new FileInputStream("./TestData/TestDataJabir.xlsx/");
		  
		  
		  //Step no 2:- Craete an Object of Resource Path File
		  Workbook ws = WorkbookFactory.create(sc);
		  
		  //Step no 3:- Call all the Methods
		  String Urloffacbook = ws.getSheet("Sheet1").getRow(0).getCell(0).toString();
		  String usernameoffacebook = ws.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		  String password = ws.getSheet("Sheet1").getRow(2).getCell(0).toString();
		  
		  
		  // Script starts
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		  
		  driver.get(Urloffacbook);
		  driver.findElement(By.id("email")).sendKeys(usernameoffacebook);
		  driver.findElement(By.id("pass")).sendKeys(password);
		 
	}

}
