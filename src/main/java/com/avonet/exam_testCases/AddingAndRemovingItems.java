package com.avonet.exam_testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.avonet.exam_pageObjects.AddingAndRemovingItemsPageObjects;
import com.avonet.exam_pageObjects.LoginPageObjects;

public class AddingAndRemovingItems {

	String [][] data={
			{"standard_user","secret_sauce"}
		};
		
		
		@DataProvider(name="loginData")
		public String[][] loginDataProvider() {
	return		 data;
		}
		
		@Test(dataProvider = "loginData")
		public void login(String uname, String pword) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			PageFactory.initElements(driver, LoginPageObjects.class);
			
			LoginPageObjects.userName.sendKeys(uname);
			LoginPageObjects.password.sendKeys(pword);
			LoginPageObjects.loginButton.click();
			Thread.sleep(2000);

	PageFactory.initElements(driver, AddingAndRemovingItemsPageObjects.class);
	
	AddingAndRemovingItemsPageObjects.addToCart1.click();
	Thread.sleep(2000);

	AddingAndRemovingItemsPageObjects.addToCart2.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.addToCart3.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.addToCart4.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.addToCart5.click();
	Thread.sleep(2000);

	AddingAndRemovingItemsPageObjects.remove.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.cartPage.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.remove2.click(); 
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.Continue_Shopping.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.addToCart6.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.cartPage2.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.checkout.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.firstName.sendKeys("KABILRAJ");
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.lastName.sendKeys("BASKARAN");
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.postalCode.sendKeys("TRINCO_31000");
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.coninueButton.click();
	Thread.sleep(2000);
	
	AddingAndRemovingItemsPageObjects.finishButton.click();
	Thread.sleep(2000);
	
}}
