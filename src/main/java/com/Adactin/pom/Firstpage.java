package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firstpage {
	public static WebDriver driver;
	@FindBy(name = "location")
	private WebElement Location;
	@FindBy(name = "hotels")
	private WebElement SelectHotels;
	@FindBy (name = "room_type")
	private WebElement SelectroomType;
	@FindBy(name ="room_nos" )
	private WebElement SelectnoofRooms;
	@FindBy(name ="datepick_in" )
	private WebElement Checkindate;
	@FindBy(name ="datepick_out" )
	private WebElement Checkoutdate;
	@FindBy(name ="adult_room" )
	private WebElement Adultsperroom;
	@FindBy(name ="child_room" )
	private WebElement Childrenperroom;
	@FindBy(name ="Submit" )
	private WebElement submitbutton1;
	
	
	
	public Firstpage(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return Location;
	}
	public WebElement getSelectHotels() {
		return SelectHotels;
	}
	public WebElement getSelectroomType() {
		return SelectroomType;
	}
	public WebElement getSelectnoofRooms() {
		return SelectnoofRooms;
	}
	public WebElement getCheckindate() {
		return Checkindate;
	}
	public WebElement getCheckoutdate() {
		return Checkoutdate;
	}
	public WebElement getAdultsperroom() {
		return Adultsperroom;
	}
	public WebElement getChildrenperroom() {
		return Childrenperroom;
	}
	public WebElement getSubmitbutton1() {
		return submitbutton1;
	}
	

}
