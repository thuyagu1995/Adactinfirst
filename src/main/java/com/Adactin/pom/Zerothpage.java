package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerothpage {
	public static  WebDriver driver;
	
	
	@FindBy(name = "username")
	private WebElement Username;
	@FindBy(name = "password")
	private WebElement Password;
	@FindBy(name = "login")
	private WebElement Loginbutton;
	
	
	
	public Zerothpage(WebDriver driver2) {
		this.driver = driver2;
				PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginbutton() {
		return Loginbutton;
	}

}
