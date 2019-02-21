package meeraCrediwatch;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pageObjects.LandingPageObject;
import resources.base;

public class validateNavigationBar extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest

	public void initialize() throws IOException
	{
		
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url"));
		log.info("Url is loaded");
	}
	@Test
	
	public void validateAppNavBar() throws IOException
	{
		
		LandingPageObject l=new LandingPageObject(driver);
	    AssertJUnit.assertTrue(l.getNavigationBar().isDisplayed());
	    log.info("Navigation Bar is displayed");
		

		;
	
		
		}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
}
