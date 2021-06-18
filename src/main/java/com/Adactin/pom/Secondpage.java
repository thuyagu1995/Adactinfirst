package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Secondpage {
public static WebDriver driver;

@FindBy(name ="radiobutton_0" )
private WebElement clickonradiobutton;
@FindBy(xpath = "//input[@value='Continue']")
private WebElement continuebutton;




public Secondpage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	// TODO Auto-generated constructor stub
}
public WebElement getClickonradiobutton() {
	return clickonradiobutton;
}
public WebElement getContinuebutton() {
	return continuebutton;
}









}
