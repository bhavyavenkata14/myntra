package scripts;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import generic_libraries.Generic_class;
import generic_libraries.ddt_generic;
import pom.Acti_login;
import pom.Acti_verify;

public class Acti_test extends Generic_class{
	@Test
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		
		
		
		
		
		
		
		
		//1:Login and Logout:
		Acti_login actlog=new Acti_login(driver);
		ddt_generic dg=new ddt_generic();
		dg.write_data("./excel/Actilogin.xlsx", 0, "Sheet1");
		actlog.usn(dg.val);
		Thread.sleep(3000);
		dg.write_data("./excel/Actilogin.xlsx", 1, "Sheet1");
		actlog.pass(dg.val);
		Thread.sleep(3000);
		actlog.log();
		Thread.sleep(3000);
		//To logout:
		actlog.logot();
		Thread.sleep(3000);
		
	//2:Login twice bt error msg shd be displayed twice:
		actlog.log();
		Thread.sleep(6000);
		actlog.log();
		Thread.sleep(3000);
		
		
		//3: Login by fetching data from Excel and display the ActiTime-Version on console:
//		Acti_login actlog=new Acti_login(driver);
//		ddt_generic dg=new ddt_generic();
		
		dg.write_data("./excel/Actilogin.xlsx", 0, "Sheet1");
		actlog.usn(dg.val);
		Thread.sleep(3000);
		dg.write_data("./excel/Actilogin.xlsx", 1, "Sheet1");
		actlog.pass(dg.val);
		Thread.sleep(3000);
		actlog.log();
		Acti_verify actver=new Acti_verify(driver);
		actver.selectopt();
		Thread.sleep(3000);
		actver.aboutacti();
		Thread.sleep(3000);
		actver.version();
	
		

	}

}
