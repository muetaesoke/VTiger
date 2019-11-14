package com.vtiger.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant 
{
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String browser_name = "";    // it should blank we have to pass here 
	static int r=1,c=0;
	static 
	{
		try
		{
			fis = new FileInputStream(CONFIGPATH);
			con = new Properties();
			con.load(fis);
			browser_name = con.getProperty("browser");
			if (browser_name.contains("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
			} 
			else
			{
				System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			}

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@BeforeMethod()                            // for launching the browser
	public static void beforeM()
	{
		if (browser_name.contains("chrome"))
		{
			driver = new ChromeDriver();
		} 
		else
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@AfterMethod
	public static void afterM(ITestResult result) throws Throwable 
	{
		int status = result.getStatus();
		String testCase = result.getName();
		Excel.createExcel(WRITE_PATH, SHEET_NAME);
		if (status == 1)
		{
			Reporter.log(testCase + "is pass", true);
			Excel.setData(testCase,"pass",r,c,SHEET_NAME,WRITE_PATH);
			r++;
			c=0;
		} 
		else 
		{
			Reporter.log(testCase + "is fail", true);
			Screenshot.getScreenShot(driver, testCase);
			Excel.setData(testCase,"pass",r,c,SHEET_NAME,WRITE_PATH);
			r++;
			c=0;
		}
		     //driver.quit();
	}
}