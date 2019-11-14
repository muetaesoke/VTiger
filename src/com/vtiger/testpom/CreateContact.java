package com.vtiger.testpom;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseTest;
import com.vtiger.generics.Excel;
import com.vtiger.pom.LoginPage;

public class CreateContact extends BaseTest
{
	@Test
	public static void CreateOrg() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
		String un = Excel.getData(XL_PATH,SHEET_NAME,1,0);
		String pwd = Excel.getData(XL_PATH,SHEET_NAME,1,1);
		String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
		LoginPage lp = new LoginPage(driver);
		lp.inputUN(un);
		lp.inputPWD(pwd);
		lp.loginClick();

		lp.createcontclick();
		lp.createplusclick();

		String name = Excel.getData(XL_PATH,SHEET_NAME,1,0);
		lp.createnewcont(name);
		Thread.sleep(2000);

		lp.contactsaveclick();





	}
}
