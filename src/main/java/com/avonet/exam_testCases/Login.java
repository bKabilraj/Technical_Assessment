package com.avonet.exam_testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.avonet.exam_pageObjects.LoginPageObjects;

public class Login {

	//two dimensional array
String [][] data={
		{"standard_user","secret_sauce"}
	};
	
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
return		 data;
	}
	
	@Test(dataProvider = "loginData")
	public void login(String uname, String pword) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys(uname);
		LoginPageObjects.password.sendKeys(pword);
		LoginPageObjects.loginButton.click();
		
	}
}
