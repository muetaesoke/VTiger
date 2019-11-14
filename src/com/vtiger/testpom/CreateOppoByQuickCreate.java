package com.vtiger.testpom;

import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseTest;
import com.vtiger.generics.Excel;
import com.vtiger.pom.LoginPage;

public class CreateOppoByQuickCreate extends BaseTest
{
	@Test
	public static void CreateOppo() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
		String un = Excel.getData(XL_PATH,SHEET_NAME,1,0);
		String pwd = Excel.getData(XL_PATH,SHEET_NAME,1,1);
		String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
		LoginPage lp = new LoginPage(driver);
		lp.inputUN(un);
		lp.inputPWD(pwd);
		lp.loginClick();

		lp.quickcreateclick();
		lp.newoppclick();
		Thread.sleep(2000);
		String name = Excel.getData(XL_PATH, SHEET_NAME, 3, 2);
		String parent0 = driver.getWindowHandle();
		Set<String> subtab0 = driver.getWindowHandles();
		for(String name1:subtab0)
		{
			driver.switchTo().window(name1);
		}
		lp.quickoppname(name);
		lp.quicksmallclick();
		String parent = driver.getWindowHandle();
		Set<String> subtab = driver.getWindowHandles();
		for(String name1:subtab)
		{
			driver.switchTo().window(name1);
		}
		lp.jspclick();
		driver.switchTo().window(parent);
		lp.quicksave();


	}
}