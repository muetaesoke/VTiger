package com.vtiger.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoLogin 
{
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("manager" ,Keys.ENTER);
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//td[@class=\"tabUnSelected\"][5]")).click();
		/*
		 * driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).
		 * click(); //+
		 * 
		 * driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys(
		 * "girish"); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).
		 * click(); //save
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	@AfterMethod
	public void After()
	{
		//driver.close();
	}
	
	
	

}











     




























