package com.adactin.definition;

import org.openqa.selenium.WebDriver;

import com.Adactin.pom.Fifthpage;
import com.Adactin.pom.Firstpage;
import com.Adactin.pom.Fourthpage;
import com.Adactin.pom.Secondpage;
import com.Adactin.pom.Thirdpage;
import com.Adactin.pom.Zerothpage;
import com.adactin.runner.Test_Runner;
import com.adactinreader.java.File_Reader_Manager;
import com.baseclass.java.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Baseclass {
	
	public static WebDriver driver = Test_Runner.driver;
	
	public static Zerothpage one = new Zerothpage(driver);
	public static Firstpage two = new Firstpage(driver);
	public static Secondpage three = new Secondpage(driver);
	public static Thirdpage four = new Thirdpage(driver);
	public static Fourthpage five = new Fourthpage(driver);
	public static Fifthpage six = new Fifthpage(driver);
	
	@Given("^launch The Browser$")
	public void launch_The_Browser() throws Throwable {
		geturl("https://adactinhotelapp.com/");
	}
	@When("^enter Your UserName$")
	public void enter_Your_UserName() throws Throwable {
	 sendvalues(one.getUsername(), "thiyaguraja1995");
	}

	@When("^enter Your Password$")
	public void enter_Your_Password() throws Throwable {
	sendvalues(one.getPassword(), "thiyagu");
	}

	@Then("^click On the Login Button$")
	public void click_On_the_Login_Button() throws Throwable {
	   clickonaelement(one.getLoginbutton());
	}

	@When("^select The Location of the hotel$")
	public void select_The_Location_of_the_hotel() throws Throwable {
	  singledropdownbyindex(two.getLocation(), 2);
	}

	@When("^select The Hotel$")
	public void select_The_Hotel() throws Throwable {
	 singledropdownbyindex(two.getSelectHotels(), 2);
	}

	@When("^select The Type Of Room$")
	public void select_The_Type_Of_Room() throws Throwable {
     singledropdownbyindex(two.getSelectroomType(), 2);
	}

	@When("^select The Number Of Rooms$")
	public void select_The_Number_Of_Rooms() throws Throwable {
     singledropdownbyindex(two.getSelectnoofRooms(), 2);
	}

	@When("^enter The Check In Date$")
	public void enter_The_Check_In_Date() throws Throwable {
	sendvalues(two.getCheckindate(), "12/02/1548");
	}

	@When("^enter The Check Out Date$")
	public void enter_The_Check_Out_Date() throws Throwable {
	 sendvalues(two.getCheckoutdate(), "13/06/1896");
	}

	@When("^enter The Adults Per Room$")
	public void enter_The_Adults_Per_Room() throws Throwable {
	singledropdownbyindex(two.getAdultsperroom(), 2);
	}

	@When("^enter The Children per Room$")
	public void enter_The_Children_per_Room() throws Throwable {
	 singledropdownbyindex(two.getChildrenperroom(),2);
	}

	@Then("^click On The Search Button$")
	public void click_On_The_Search_Button() throws Throwable {
	 clickonaelement(two.getSubmitbutton1());
	}

	@When("^click On The Selected Hotel$")
	public void click_On_The_Selected_Hotel() throws Throwable {
	 clickonaelement(three.getClickonradiobutton());
	}

	@Then("^click On The Continue Button$")
	public void click_On_The_Continue_Button() throws Throwable {
	clickonaelement(three.getContinuebutton());
	}

	@When("^enter Your First Name$")
	public void enter_Your_First_Name() throws Throwable {
	sendvalues(four.getEnterfirstname(), "thiyagu");
	}

	@When("^enter Your Second Name$")
	public void enter_Your_Second_Name() throws Throwable {
	sendvalues(four.getEnterlastname(), "rajamani");
	}

	@When("^enter Your Address$")
	public void enter_Your_Address() throws Throwable {
     sendvalues(four.getEnterouraddress(), "tamilnadhu,no 17,chennai");
	}

	@When("^enter Your Sixteen Diget Credit Card Number$")
	public void enter_Your_Sixteen_Diget_Credit_Card_Number() throws Throwable {
	 String cardno = File_Reader_Manager.getInstance().getistanceCR().get_cardno();
		sendvalues(four.getCreditcardno(),cardno ); 
	}

	@When("^select Your credit Card Expiry Month$")
	public void select_Your_credit_Card_Expiry_Month() throws Throwable {
	 singledropdownbyindex(four.getSelectcardexpireymonth(), 5);
	}

	@When("^select Your credit Card Expiry Year$")
	public void select_Your_credit_Card_Expiry_Year() throws Throwable {
     singledropdownbyindex(four.getSelectcardexpiryyear(), 6);
	}

	@When("^enter Your Cvv Number$")
	public void enter_Your_Cvv_Number() throws Throwable {
	String cvv = File_Reader_Manager.getInstance().getistanceCR().get_cvv();
	sendvalues(four.getEntercvvno(), cvv);
	}

	@Then("^click On The Book Now Button$")
	public void click_On_The_Book_Now_Button() throws Throwable {
	clickonaelement(four.getBooknowbutton());
	}

	@Then("^click On The My Itinerary Button$")
	public void click_On_The_My_Itinerary_Button() throws Throwable {
	 clickonaelement(five.getMyitinerarybutton());   
	}

	@Then("^click On The Logout Button$")
	public void click_On_The_Logout_Button() throws Throwable {
	  clickonaelement(six.getLogoutbutton());
	}
   
	
	
	
	

	

	
	

}
