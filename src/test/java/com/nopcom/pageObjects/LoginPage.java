package com.nopcom.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "Email")
	@CacheLookup
	WebElement enteremail;
	
	@FindBy(id = "Password")
	@CacheLookup
	WebElement enterpswd;
	
	@FindBy(xpath = "//button[text()='Log in']")
	@CacheLookup
	WebElement clicklogin;
	
	public void Entermailid(String email) {
		enteremail.sendKeys(email);
	}
	
	public void Enterpassword(String pswd) {
		enterpswd.sendKeys(pswd);
	}
	
	public void clickingloginbtn() {
		clicklogin.click();
	}

}
