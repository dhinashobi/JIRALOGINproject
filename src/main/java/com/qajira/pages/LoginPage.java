package com.qajira.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jira.testbase.TestBase;

public class LoginPage extends TestBase{

	@FindBy(name="os_username")
	WebElement username;
	
	@FindBy(name="os_password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginbtn;
	
	
	 public LoginPage() {
		  PageFactory.initElements(driver, this); 
		  }
	
	public DashboardPage validateLogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new DashboardPage();
	}

	 
	 
	 
	 
}
