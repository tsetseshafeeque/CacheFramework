package com.hpe.webui.pages;

import  com.hpe.webui.pages.*;
import  com.hpe.webui.tests.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GmailLoginTest {
	static WebDriver driver;
	
	@BeforeClass()
	public void openbrowser()
	{	driver = new FirefoxDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	
	@BeforeMethod()
	public void openHP()
	{driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	}
	
	@Test
	public void myLogin()
	{	
		HomePage HP = new HomePage(driver);
		HP.clickSignIn();
		LoginPage objLogin = new LoginPage(driver);
		boolean Result;
		objLogin.setUserName("manjushavnair@gmail.com");
		objLogin.setPwd("abc");
		Result = objLogin.isErrorDisplayed("manjushavnair@gmail.com","abc");
		
		if(Result)
			System.out.println("Error message is displayed");		
		}
	
	@AfterClass
	public void closeBrowser()
	{driver.quit();}
	
}
