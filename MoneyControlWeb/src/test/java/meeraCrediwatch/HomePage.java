package meeraCrediwatch;

import org.testng.annotations.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

import resources.base;

public class HomePage extends base {
	 public static Logger log =LogManager.getLogger(HomePage.class.getName());
	
	 @BeforeTest
	public void initialize() throws IOException
	{
		
		driver =initializeDriver();
		 log.info("Driver is initialized");
			

			driver.get(prop.getProperty("url"));
			log.info("Url is loaded");
		
	}
	@Test()
	public void homePageNavigation() throws IOException, InterruptedException
	{

		 log.info("Home page is loaded");
		 

	  
	
}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
}
