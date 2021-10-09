package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {

	
	WebDriver driver=null;
	
	@FindBy(tagName="h3")
	private List<WebElement> courses;
	
	
	public Dashboardpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public boolean verifyCourse() {
		ArrayList<String>actCourse = new ArrayList<String>();
		List<WebElement> list = driver.findElements(By.tagName("h3"));// 4element
		for(WebElement course : courses) {
			String text = course.getText();
			actCourse.add(text);
		}
		ArrayList<String> expCourse = new ArrayList<String>();
	    expCourse.add("Selenium");
	    expCourse.add("Java / J2EE");
	    expCourse.add("Python");
	    expCourse.add("Php");
	    
	    if(actCourse.equals(expCourse))
	    	return true;
	    return false;
	}
}
