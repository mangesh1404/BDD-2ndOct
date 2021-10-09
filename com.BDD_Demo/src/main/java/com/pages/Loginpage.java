package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	private WebDriver driver;
	
	@FindBy(id="email")
	private WebElement uname;
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement button;
	
	
	public Loginpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginTest(String username, String password) {
		if(!driver.getTitle().contains("Log in")) 
			driver.findElement(By.linkText("LOGOUT")).click();
		uname.clear();
		pass.clear();
		uname.sendKeys(username);
		pass.sendKeys(password);
		button.click();
	}
}
