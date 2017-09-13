package com.hpe.webui.pages;

import  com.hpe.webui.pages.*;
import  com.hpe.webui.tests.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("http://in.rediff.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage HP = new HomePage(driver);
		HP.clickSignIn();
		LoginPage objLogin = new LoginPage(driver);
		boolean Result;
		Result = objLogin.isErrorDisplayed("abc", "xyz");
		if(Result)
		System.out.println("Error message is displayed");		
		driver.quit();
	}

}
