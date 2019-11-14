
package com.vtiger.pom;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.generics.Excel;
//refer encap notes.this is class A
public class LoginPage
{
	@FindBy(name="user_name")
	private WebElement un;                

	@FindBy(name="user_password")
	private WebElement pwd;

	@FindBy(id="submitButton")
	private WebElement loginBtn;

	@FindBy (xpath="//td[@class=\"tabUnSelected\"][5]")    // for oppo
	private WebElement opp;

	@FindBy (xpath="//td[@class=\"tabUnSelected\"][3]")    // for organization
	private WebElement org;

	@FindBy (xpath="//img[@title=\"Create Organization...\"]")    // for plus symbol
	private WebElement plus;

	@FindBy(xpath="//input[@name=\"accountname\"]")
	private WebElement orgname;

	@FindBy(xpath="//tbody/tr[1]/td/div/input[@class=\"crmbutton small save\"]")
	private WebElement save;

	@FindBy (xpath="//input[@name=\"potentialname\"]")
	private WebElement oppname;

	@FindBy (xpath="//img[@title=\"Create Opportunity...\"]")
	private WebElement oppplus;

	@FindBy (xpath="//tbody/tr[4]/td[2]/img[@title=\"Select\"]")
	private WebElement smallplus;



	@FindBy (xpath="//a[@id=\"1\"]")
	private WebElement qsp;


	@FindBy(xpath="//tr[1]/td/div/input[@class=\"crmbutton small save\"]")
	private WebElement savebutton;         // for oppo creation 

	@FindBy (xpath="//input[@name=\"selected_id\"]")
	private WebElement del;	

	@FindBy (xpath="//tbody/tr[1]/td/table[2]/tbody/tr/td/input[@value=\"Delete\"]")
	private WebElement delete;

	@FindBy(xpath="//td[9]/a[1]")
	private WebElement edit;

	@FindBy (xpath="//tbody/tr[2]/td[1]/table/tbody/tr[1]/td[1]/div/input[@title=\"Save [Alt+S]\"]")
	private WebElement editsave;   // for editing oppo save button 


	@FindBy (xpath="//input[@name=\"assigntype\"][2]")
	private WebElement group;

	@FindBy (xpath="//select[@name=\"sales_stage\"]")     //for dropdown in salesstage
	private WebElement dropdown;

	@FindBy (xpath="//option[@value=\"Value Proposition\"]")   // to change the salesstage
	private WebElement valueprop;

	@FindBy (xpath="//select[@id=\"qccombo\"]")
	private WebElement quickcreate;

	@FindBy (xpath="//select[@id=\"qccombo\"]/option[10]")
	private WebElement newopp;


	@FindBy (xpath="//input[@name=\"potentialname\"]")
	private WebElement oppnameforquickcreate;    // for opponame for quick create

	@FindBy (xpath="//img[@title=\"Select\"]")
	private WebElement quicksmallplus;

	@FindBy (xpath="//a[@id=\"1\"]")
	private WebElement jspclick;


	@FindBy (xpath="//tbody/tr[1]/td[1]/input[@name=\"button\"]")
	private WebElement quicksave;    //for quick save

	@FindBy (xpath="//td[@class=\"tabUnSelected\"][4]")
	private WebElement createcont;

	@FindBy (xpath="//img[@title=\"Create Contact...\"]")
	private WebElement createplus;

	@FindBy (xpath="//input[@name=\"lastname\"]")
	private WebElement lastname;                          //for creating new contact


	@FindBy (xpath="//tbody/tr[1]/td[1]/div/input[@title=\"Save [Alt+S]\"]")
	private WebElement contactsave;    

	@FindBy (xpath="//select[@id=\"related_to_type\"]/option[@value=\"Contacts\"]")
	private WebElement relatedcont;   //to change related to contacts


	@FindBy (xpath="//input[@id=\"related_to_display\"]/following-sibling::img")
	private WebElement contactsmallplus;      //while creating contact small plus


	@FindBy (xpath="//a[@id=\"1\"]")
	private WebElement contactname;   //for contact name

	@FindBy (xpath="//div[@id=\"basicTab\"]//tr[2]/td/table/tbody/tr[1]/td/div/input[1]")
	private WebElement oppocontactsave;

   @FindBy (xpath="//img[@title=\"Export Opportunities\"]")
   private WebElement exportopp;

   @FindBy (xpath="//input[@type=\"button\"][1]")

   private WebElement exportoppbutton;




	
	
	
	

	public   LoginPage(WebDriver driver)                       //constructor
	{
		PageFactory.initElements(driver, this);         // for fresh adress we use this keyword.
	}
	
	public void inputUN(String text)
	{
		un.sendKeys(text);	
	}
	public void inputPWD(String text)
	{
		pwd.sendKeys(text);	
	}
	public void loginClick()
	{
		loginBtn.click();
	}
	public void OppoClick()
	{
		opp.click();
	}
	public void Orgclick()
	{
		org.click();
	}
	public void plusclick()
	{
		plus.click();
	}
	public void oppplusclick()
	{
		oppplus.click();
	}
	public void orgnameclick(String text)
	{
		orgname.sendKeys(text);
	}
	public void saveclick()
	{
		save.click();
	}
	public void oppname(String text)
	{
		oppname.sendKeys(text);
	}
	public void smallplusclick()
	{
		smallplus.click();
	}
	public void qspclick()
	{
		qsp.click();
	}
	public void savebuttonclick()
	{
		savebutton.click();
	}
	public void checkboxclick()
	{
		del.click();
	}

	public void deleteclick()
	{
		delete.click();
	}

	public void editclick()
	{
		edit.click();
	}

	public void editsaveclick()
	{
		editsave.click();
	}

	public void groupclick()
	{
		group.click();
	}
	public void dropdownclick()
	{
		dropdown.click();
	}

	public void valuepropclick()
	{
		valueprop.click();
	}

	public void quickcreateclick()
	{
		quickcreate.click();
	}
	public void newoppclick()
	{
		newopp.click();
	}

	public void  quickoppname(String text)
	{
		oppnameforquickcreate.sendKeys(text);
	}
	public void quicksmallclick()
	{
		quicksmallplus.click();
	}
	public void jspclick()
	{
		jspclick.click();
	}
	public void quicksave()
	{
		quicksave.click();
	}
	public void createcontclick()
	{
		createcont.click();
	}
	public void createplusclick()
	{
		createplus.click();
	}
	public void createnewcont(String text)
	{
		lastname.sendKeys(text);;
	}
	public void contactsaveclick()
	{
		contactsave.click();
	}

	public void relatedclick()
	{
		relatedcont.click();
	}
	public void contactsmallplusclick()
	{
		contactsmallplus.click();

	}
	public void contactnameclick()
	{
		contactname.click();
	}
	public void oppocontactclick()
	{
		oppocontactsave.click();
	}

	public void exportoppclick()
	{
		exportopp.click();
	}
	
	public void exptoppbtnclick()
	{
		exportoppbutton.click();
	}
	
	
	
	
	
	
	
	
	
	

}