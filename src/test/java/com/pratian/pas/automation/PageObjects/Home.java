package com.pratian.pas.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage{
	
	public Home(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"basic-navbar-nav\"]/ul/li[2]/span/a")
	public WebElement loginOrRegister;
	
	public LoginOrRegister clickLoginOrRegister(WebDriver driver)
	{
		loginOrRegister.click();
		
		return new LoginOrRegister(driver);
	}

}
