package com.vtiger.testpom;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseTest;
import com.vtiger.generics.Excel;
import com.vtiger.pom.EnterHome;
import com.vtiger.pom.LoginPage;

public class TestOpportunityPage extends BaseTest
{
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un = Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd = Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	LoginPage lp = new LoginPage(driver);
	lp.inputUN(un);
	lp.inputPWD(pwd);
	lp.loginClick();
	Thread.sleep(2000);

		
		// lp.OppoClick(); Thread.sleep(2000);
		 

	
          
	driver.findElement(By.xpath("//td[@class=\"tabUnSelected\"][5]")).click();
		String title1 = driver.getTitle(); 
		System.out.println(title1);
		        
	    EnterHome e =new EnterHome(driver);
	    e.OppoPageIsDisplayed(driver, 5, title);
	
	
	

	


	}

}
