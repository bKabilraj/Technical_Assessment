package com.avonet.exam_pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddingAndRemovingItemsPageObjects {

	@FindBy(how=How.ID,using = "add-to-cart-sauce-labs-backpack")
	public static WebElement addToCart1;
	
	@FindBy(how=How.ID,using = "add-to-cart-sauce-labs-bike-light")
	public static WebElement addToCart2;
	
	@FindBy(how=How.ID,using = "add-to-cart-sauce-labs-bolt-t-shirt")
	public static WebElement addToCart3;
	
	@FindBy(how=How.ID,using = "add-to-cart-sauce-labs-fleece-jacket")
	public static WebElement addToCart4;
	
	@FindBy(how=How.ID,using = "add-to-cart-sauce-labs-onesie")
	public static WebElement addToCart5;
	
	@FindBy(how=How.ID,using = "remove-sauce-labs-bike-light")
	public static WebElement remove;
	
	@FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
	public static WebElement cartPage;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn_secondary btn_small cart_button'][@data-test='remove-sauce-labs-bolt-t-shirt'][@id='remove-sauce-labs-bolt-t-shirt']")
	public static WebElement remove2;
	
	@FindBy(how = How.ID, using = "continue-shopping")
	public static WebElement Continue_Shopping;
	
	@FindBy(how = How.ID,using = "add-to-cart-test.allthethings()-t-shirt-(red)")
	public static WebElement addToCart6;
	
	@FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
	public static WebElement cartPage2;
	
	@FindBy(how = How.ID,using = "checkout")
	public static WebElement checkout;
	
	@FindBy(how = How.ID, using = "first-name")
	public static WebElement firstName;
	
	@FindBy(how = How.ID, using = "last-name")
	public static WebElement lastName;
	
	@FindBy(how = How.ID, using = "postal-code")
	public static WebElement postalCode;
	
	@FindBy(how = How.ID, using = "continue")
	public static WebElement coninueButton;
	
	@FindBy(how = How.ID, using = "finish")
	public static WebElement finishButton;
}
