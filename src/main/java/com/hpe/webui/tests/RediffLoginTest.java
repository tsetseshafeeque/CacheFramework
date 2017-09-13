package com.hpe.webui.pages;

import  com.hpe.webui.pages.*;
import  com.hpe.webui.tests.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class RediffLoginTest {
	static WebDriver driver;
	
	@BeforeClass()
	public void openbrowser()
	{	driver = new FirefoxDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	
	@BeforeMethod()
	public void openHP()
	{driver.get("http://in.rediff.com/");
	}
	
	@Test
	public void myLogin()
	{	
		HomePage HP = new HomePage(driver);
		HP.clickSignIn();
		LoginPage objLogin = new LoginPage(driver);
		boolean Result;
		Result = objLogin.isErrorDisplayed("abc", "xyz");
		if(Result)
			System.out.println("Error message is displayed");		
		}
	
	@AfterClass
	public void closeBrowser()
	{driver.quit();}
	
}
