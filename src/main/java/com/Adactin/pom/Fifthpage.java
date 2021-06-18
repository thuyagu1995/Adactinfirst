package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fifthpage {
	public static WebDriver driver;
	

	@FindBy(name = "(//input[@class='reg_button'])[3]")
	private WebElement Logoutbutton;
	
	
	public Fifthpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getLogoutbutton() {
		return Logoutbutton;
	}

}
