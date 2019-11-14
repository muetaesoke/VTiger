package com.vtiger.pom;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.vtiger.generics.IAutoConstant;



public class EnterHome implements IAutoConstant{
	public EnterHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public  void verifyHomePageIsDisplayed(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException 
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);    //if the condition is true nextline will execute otherwise it'll throw excepion 
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("HomePage is Displayed",true);

		}
		catch(Exception e)
		{
			Reporter.log("Home Page is not displayed",true);

			Assert.fail();
		}
	}
		
		
		
		public  void OppoPageIsDisplayed(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException 
		{	
			try 
			{
				WebDriverWait ww = new WebDriverWait(driver, ETO);    //if the condition is true nextline will execute otherwise it'll throw excepion 
				ww.until(ExpectedConditions.titleContains(title));
				Reporter.log("Opportunity is Displayed",true);

			}
			catch(Exception e)
			{
				Reporter.log("Oppo is not displayed",true);

				Assert.fail();
			}
	}
}