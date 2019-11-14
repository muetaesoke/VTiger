package com.vtiger.generics;

public interface IAutoConstant
{
	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE = "./softwares/chromedriver.exe";
	String FIREFOX_KEY = "webdriver.gecko.driver";
	String FIREFOX_VALUE = "./softwares/geckodriver.exe";

	long ITO = 10;

	String XL_PATH = ".\\excel\\vr.xlsx";
	String IMG_PATH = "./ScreenShots/";
	String URL = "http://localhost:8888/index.php?action=Login&module=Users";
	String SHEET_NAME = "Sheet1";
	String CONFIGPATH="./Config.properties";
	String WRITE_PATH=".\\excel\\vw.xlsx";
}