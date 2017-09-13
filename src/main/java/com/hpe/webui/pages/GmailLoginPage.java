package com.hpe.webui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginPage 

{
	private WebDriver driver;
	@FindBy(id="Email")
	private WebElement UserName;
	@FindBy (id="next")
	private WebElement NextButton;
	@FindBy (name="errormsg_0_Email")
	private WebElement Errmsg;
			
	public  GmailLoginPage (WebDriver driver)
	{this.driver = driver;
	//This initElements method will create all WebElements
	 PageFactory.initElements(driver, this);
	 }
	
	public void setUserName(String strUserName)
	{	UserName.clear();
		UserName.sendKeys(strUserName);
	}
	
	public void clickNext()
	{NextButton.click();}
	
		
	public boolean isErrTextPresent()
	{
		WebDriverWait mywait=new WebDriverWait(driver,4);
		boolean conditionresult;
		try{
			conditionresult = mywait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("errormsg_0_Email"), "Sorry, Google doesn't recongnize that email."));
			
		} catch (Exception e)
		
		{
			conditionresult = false;
		}
		return conditionresult;
		
		}
}
