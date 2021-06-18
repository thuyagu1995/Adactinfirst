package com.adactin.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclass.java.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature",
glue="com.adactin.definition")



public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		
		driver = Baseclass.brouserlaunch("chrome");
		
	}
	@AfterClass
	public static void teardown() {
		
		driver.close();
	}
	
	

}
