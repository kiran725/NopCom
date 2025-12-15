package com.nopcom.testCases;

import com.nopcom.pageObjects.HomePage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_HomeTest_001 extends BaseClass {

	@Test
	public void hometest() throws InterruptedException, IOException {

		//driver.get(baseURL); // we can directly give in base class
		logger.info("URL opened");

		HomePage hp = new HomePage(driver);
		hp.clickLoginlink();
		logger.info("Clicking on Login button in homepage link");

		Thread.sleep(2000);
		if (driver.getTitle().equals("nopCommerceeetttttttt demo store. Login")) {
			Assert.assertTrue(true);
			logger.info("Login page opned successfully");

		} else {
			captureScreen(driver, "hometest");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}

	}

}
