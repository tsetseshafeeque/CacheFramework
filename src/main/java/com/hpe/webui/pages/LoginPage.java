package com.hpe.webui.pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 

{
	private WebDriver driver;
	@FindBy(id="login1")
	private WebElement UserName;
	@FindBy (id="password")
	private WebElement Password;
	@FindBy (name="proceed")
	private WebElement LoginButton;
	@FindBy(name="loginform")
	private WebElement ReLoginForm;
		
	public LoginPage(WebDriver driver)
	{this.driver = driver;
	//This initElements method will create all WebElements
	 PageFactory.initElements(driver, this);
	 }
	
	public void setUserName(String strUserName)
	{	UserName.clear();
		UserName.sendKeys(strUserName);
	}
	
	public void setPwd(String strPwd)
	{Password.sendKeys(strPwd);}
	
	public void clickSignIn()
	{LoginButton.click();}
	
	public boolean isLoginFormPresent()
	{	boolean isElementDisplayed;
		try{
			isElementDisplayed = ReLoginForm.isDisplayed();}
		catch(Exception e)
			{isElementDisplayed=false;}
		return isElementDisplayed;	
	}
	
	public boolean isErrorDisplayed(String usr, String pwd)
	{
		boolean isErrorPresent;
		this.setUserName(usr);
		this.setPwd(pwd);
		this.clickSignIn();
		isErrorPresent = this.isLoginFormPresent();
		return isErrorPresent;
	}
}
