package com.vtiger.testpom;

import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseTest;
import com.vtiger.generics.Excel;
import com.vtiger.pom.LoginPage;

public class CreateOpp  extends BaseTest
{
	@Test
	public static void CreateOpp() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
		String un = Excel.getData(XL_PATH,SHEET_NAME,1,0);
		String pwd = Excel.getData(XL_PATH,SHEET_NAME,1,1);
		String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
		LoginPage lp = new LoginPage(driver);
		lp.inputUN(un);
		lp.inputPWD(pwd);
		lp.loginClick();

		lp.OppoClick();
		lp.oppplusclick();
		String name1 = Excel.getData(XL_PATH, SHEET_NAME, 3, 0);
		lp.oppname(name1);
		lp.smallplusclick();
		
		String parent = driver.getWindowHandle();
		Set<String> subtab = driver.getWindowHandles();
		for(String name:subtab)
		{
			driver.switchTo().window(name);
		}
		lp.qspclick();
		driver.switchTo().window(parent);
		lp.savebuttonclick();







	}
}