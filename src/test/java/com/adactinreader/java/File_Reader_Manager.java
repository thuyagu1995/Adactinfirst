package com.adactinreader.java;

public class File_Reader_Manager {
	private File_Reader_Manager() {
		
	}
  public static File_Reader_Manager getInstance() {
	  File_Reader_Manager helper = new File_Reader_Manager();
	  return helper;
	  
	
} 
  public Configuration_Reader getistanceCR() throws Throwable {
	
Configuration_Reader reader = new Configuration_Reader();
return reader;
}

}
