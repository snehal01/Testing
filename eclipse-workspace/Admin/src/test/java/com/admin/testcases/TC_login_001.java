package com.admin.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.admin.pageobject.login;

import junit.framework.Assert;

public class TC_login_001 extends BaseClass{
	
	@Test
public void logintest() throws IOException
{
	
	Logger.info("URL is openend ");
	
	login lp=new login(driver);
	lp.setUsername(username);
	Logger.info("Entered username");
	lp.setPassword(password);
	Logger.info("Entered Password");
	lp.clickSubmit();
	
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals("Guru99 Bank Manager "))
	{
		Assert.assertTrue(true);
		Logger.info("Login test pass");
	}
	else {
		captureScreen(driver, "logintest");
		Assert.assertTrue(false);
		Logger.info("Login test Failed ");
	}
		
}
	
}
