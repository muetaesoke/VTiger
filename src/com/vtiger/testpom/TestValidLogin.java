package com.vtiger.testpom;

import org.apache.poi.EncryptedDocumentException;    
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseTest;
import com.vtiger.generics.Excel;
import com.vtiger.pom.EnterHome;
import com.vtiger.pom.LoginPage;




public class TestValidLogin extends BaseTest       //refer encapsulation notes. this is class B
{
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException
	{
	String un = Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd = Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	LoginPage lp = new LoginPage(driver);
	lp.inputUN(un);
	lp.inputPWD(pwd);
	lp.loginClick();
	EnterHome eh = new EnterHome(driver);
	eh.verifyHomePageIsDisplayed(driver, 5, title);
	}

}