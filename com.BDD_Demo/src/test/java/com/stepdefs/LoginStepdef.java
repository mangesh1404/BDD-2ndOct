package com.stepdefs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.Loginpage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepdef {
	
	WebDriver driver;
	Loginpage lp=null;
	@Before("@login")// tagged hooks
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		lp= new Loginpage(driver);
	}
	
	@After("@login")
	public void tearDown() {
		driver.close();
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String pass) throws Throwable {
		
		lp.loginTest(uname, pass);
		
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button")).click();
	}

	@Then("^user will be on home page$")
	public void user_will_be_on_home_page() throws Throwable {
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}
	
	@Then("^user should see a logo$")
	public void user_should_see_a_logo() throws Throwable {
		WebElement logo =driver.findElement(By.tagName("img"));
		Assert.assertTrue(logo.isDisplayed());
	}
	
	
}
