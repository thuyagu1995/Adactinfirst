package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fourthpage {
public static WebDriver driver;

@FindBy(xpath = "(//input[@type='button'])[2]")
private WebElement Myitinerarybutton;




public Fourthpage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	// TODO Auto-generated constructor stub
}

public static WebDriver getDriver() {
	return driver;
}

public WebElement getMyitinerarybutton() {
	return Myitinerarybutton;
}






}
