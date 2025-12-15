package com.nopcom.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;

	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(linkText = "Register")
	@CacheLookup
	WebElement Registerlink;

	@FindBy(linkText = "Log in")
	@CacheLookup
	WebElement Loginlink;

	@FindBy(linkText = "Wishlist")
	@CacheLookup
	WebElement Wishlistlink;

	@FindBy(linkText = "Shopping cart")
	@CacheLookup
	WebElement Shoppingcartlink;

	public void clickRegisterlink() {
		Registerlink.click();
	}

	public void clickLoginlink() {
		Loginlink.click();
	}

	public void clickWishlistlink() {
		Wishlistlink.click();
	}

	public void clickShoppingcartlink() {
		Shoppingcartlink.click();
	}

}
