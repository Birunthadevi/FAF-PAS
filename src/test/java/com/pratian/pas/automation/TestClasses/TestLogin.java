package com.pratian.pas.automation.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pratian.pas.automation.FileHandling.PropertyManager;
import com.pratian.pas.automation.PageObjects.Home;
import com.pratian.pas.automation.PageObjects.LoginOrRegister;

public class TestLogin extends BaseTest {
	
	@Test
	public void checkLoginLink() throws IOException
	{
		/*Check whether or not user is navigated to Login Page after click on "Login or Register"
		Link
		 */
		driver.get(PropertyManager.getProperty("url.app"));
		Home home = new Home(driver);
		LoginOrRegister login = home.clickLoginOrRegister(driver);
		System.out.println(login.getLoginFormTitle());
		Assert.assertEquals(login.isLoginFormDisplayed(),true);		
	}
	


}
