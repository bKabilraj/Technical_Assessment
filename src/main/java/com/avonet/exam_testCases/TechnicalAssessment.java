package com.avonet.exam_testCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.avonet.exam_pageObjects.AddingAndRemovingItemsPageObjects;
import com.avonet.exam_pageObjects.LoginPageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TechnicalAssessment {

	String [][] data={
			{"standard_user","secret_sauce"}
		};
	WebDriver driver; //driver local variable (class level declaration)
		
		
		@DataProvider(name="loginData")
		public String[][] loginDataProvider() {
			return	data;
		}
		  
		@BeforeTest
		public void beforeTest(){
			driver= WebDriverManager.chromedriver().create(); //.create this create actually is giving you the..  
													//..web driver instance so we can just store inside
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		}
		
		@AfterTest
		public void afterTest() {
			//driver.quit();
		}
		
		@Test(dataProvider = "loginData")
		public void login(String uname, String pword) throws InterruptedException {
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			PageFactory.initElements(driver, LoginPageObjects.class);
			
			LoginPageObjects.userName.sendKeys(uname);
			LoginPageObjects.password.sendKeys(pword);
			LoginPageObjects.loginButton.click();

			PageFactory.initElements(driver, AddingAndRemovingItemsPageObjects.class);
	
			AddingAndRemovingItemsPageObjects.addToCart1.click();
			AddingAndRemovingItemsPageObjects.addToCart2.click();
			AddingAndRemovingItemsPageObjects.addToCart3.click();	
			AddingAndRemovingItemsPageObjects.addToCart4.click();
			AddingAndRemovingItemsPageObjects.addToCart5.click();
			AddingAndRemovingItemsPageObjects.remove.click();	
			AddingAndRemovingItemsPageObjects.cartPage.click();
			AddingAndRemovingItemsPageObjects.remove2.click(); 
			AddingAndRemovingItemsPageObjects.Continue_Shopping.click();
			AddingAndRemovingItemsPageObjects.addToCart6.click();
			AddingAndRemovingItemsPageObjects.cartPage2.click();
			AddingAndRemovingItemsPageObjects.checkout.click();
			AddingAndRemovingItemsPageObjects.firstName.sendKeys("KABILRAJ");
			AddingAndRemovingItemsPageObjects.lastName.sendKeys("BASKARAN");
			AddingAndRemovingItemsPageObjects.postalCode.sendKeys("TRINCO_31000");
			AddingAndRemovingItemsPageObjects.coninueButton.click();
			AddingAndRemovingItemsPageObjects.finishButton.click();
	
}}
