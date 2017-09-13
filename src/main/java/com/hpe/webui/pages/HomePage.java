
package com.hpe.webui.pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;

	@FindBy(linkText="Sign in")
	private WebElement LoginLink;
	@FindBy(linkText="Create a Rediffmail account")
	private WebElement CreateAccountLink;
		
	public HomePage(WebDriver driver)
	{this.driver = driver;
	//This initElements method will create all WebElements
	 PageFactory.initElements(driver, this);}
	
	public void clickSignIn()
	{LoginLink.click();}
	
	public void clickCreatAccount()
	{CreateAccountLink.click();}
	
	 

}
