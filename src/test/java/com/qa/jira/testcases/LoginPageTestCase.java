package com.qa.jira.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.jira.testbase.TestBase;
import com.qajira.pages.DashboardPage;
import com.qajira.pages.LoginPage;

public class LoginPageTestCase extends TestBase {
public static LoginPage loginpage;
public static DashboardPage dashboardPage;


	public LoginPageTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		 loginpage = new LoginPage(); 
	}
	
	@Test(priority =1)
	public void loginTest() {
		dashboardPage = loginpage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
