package com.nopcom.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcom.pageObjects.HomePage;
import com.nopcom.pageObjects.LoginPage;

public class TC_LoginTest_002 extends BaseClass {

	@Test
	public void logintest() throws InterruptedException {
		driver.get(baseURL);

		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);

		hp.clickLoginlink();
		Thread.sleep(2000);

		lp.Entermailid(email);
		lp.Enterpassword(password);

		Thread.sleep(2000);
		lp.clickingloginbtn();
		String Expectedtitle = "nopCommerce demo store";

		if (driver.getTitle().equals(Expectedtitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
