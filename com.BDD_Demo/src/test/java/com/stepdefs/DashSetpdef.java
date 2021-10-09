package com.stepdefs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.Dashboardpage;
import com.pages.Loginpage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class DashSetpdef {

	WebDriver driver;
	Loginpage lp=null;
	ArrayList<String> expCourse=null;
	ArrayList<String> actCourse=null;
	private Dashboardpage dp;
	
	@Before("@dash")// tagged hooks
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		lp= new Loginpage(driver);
		dp= new Dashboardpage(driver);
	}
	
	@After("@dash")
	public void tearDown() {
		driver.close();
	}
	
	
	@Given("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		lp.loginTest("kiran@gmail.com", "123456");
		
	}

	@Then("^user verify course list$")
	public void user_verify_course_list() throws Throwable {
	    
	    Assert.assertTrue(dp.verifyCourse());
	    
	}
}
