package com.avonet.exam_pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

	@FindBy(how=How.ID,using = "user-name") //(id="")
	public static WebElement userName;
	
	@FindBy(how=How.ID,using = "password") //(id="")
	public static WebElement password;
	
	@FindBy(how=How.ID,using = "login-button") //(id="")
	public static WebElement loginButton;

}
