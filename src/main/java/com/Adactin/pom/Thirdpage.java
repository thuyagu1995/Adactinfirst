package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thirdpage {
	public static WebDriver driver;
	@FindBy(name = "first_name")
	private WebElement Enterfirstname;
	@FindBy(name = "last_name")
	private WebElement Enterlastname;
	@FindBy(name = "address")
	private WebElement Enterouraddress;
	@FindBy(name = "cc_num")
	private WebElement Creditcardno;
	@FindBy(name = "cc_type")
	private WebElement Selectcreditcardtype;
	@FindBy(name = "cc_exp_month")
	private WebElement selectcardexpireymonth;
	@FindBy(name = "cc_exp_year")
	private WebElement Selectcardexpiryyear;
	@FindBy(name = "cc_cvv")
	private WebElement Entercvvno;
	@FindBy(name = "book_now")
	private WebElement Booknowbutton;
	
	
	public Thirdpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		// TODO Auto-generated constructor stub
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getEnterfirstname() {
		return Enterfirstname;
	}
	public WebElement getEnterlastname() {
		return Enterlastname;
	}
	public WebElement getEnterouraddress() {
		return Enterouraddress;
	}
	public WebElement getCreditcardno() {
		return Creditcardno;
	}
	public WebElement getSelectcreditcardtype() {
		return Selectcreditcardtype;
	}
	public WebElement getSelectcardexpireymonth() {
		return selectcardexpireymonth;
	}
	public WebElement getSelectcardexpiryyear() {
		return Selectcardexpiryyear;
	}
	public WebElement getEntercvvno() {
		return Entercvvno;
	}
	public WebElement getBooknowbutton() {
		return Booknowbutton;
	}

}
