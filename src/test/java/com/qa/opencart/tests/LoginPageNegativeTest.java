package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest {
	
	@DataProvider
	public Object [] [] loginWrongTestData() {
		return new Object[] [] {
			{"test11@gmail.com", "test@123"},
			{"abhi11@gmail.com", "test@123"},
			{" ", "test@123"},
			{"@#$@#4", "test@123"},
			{"", ""},
		};
	}
	
	@Test(dataProvider = "loginWrongTestData")
	public void loginNegativeTest(String username, String password) {
		
		Assert.assertFalse(loginPage.doLoginWithWrongCredentials(username, password));
		
	}

}
