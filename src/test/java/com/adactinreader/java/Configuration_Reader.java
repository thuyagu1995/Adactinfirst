package com.adactinreader.java;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		// TODO Auto-generated constructor stub
	
	File f = new File("C:\\Users\\Gokul Rajamani\\eclipse-workspace\\Maven1\\src\\test\\java\\com\\acictin\\reader\\seacretvalues.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
	}
	public String get_cvv() {
		// TODO Auto-generated method stub
String cvv = p.getProperty("cvv");
return cvv;
	} 
	public String get_cardno() {
		// TODO Auto-generated method stub
String cardno = p.getProperty("cardno");
return cardno;
	}
}