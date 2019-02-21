package meeraCrediwatch;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.AssertJUnit;
import java.io.IOException;

import pageObjects.BSEandNSEObject;
import pageObjects.LandingPageObject;
import pageObjects.SearchResult;
import resources.base;

public class validateBSEandNSEpresent extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());@BeforeTest

	public void initialize() throws IOException
	{
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url"));
		log.info("Url is loaded");
	}

	@Test
	
	public void validateAppNavBar() throws IOException, InterruptedException
	{
		 
	
		LandingPageObject hm=new LandingPageObject(driver);
		hm.getSearch().sendKeys("Infosys");
		 hm.getSearch().sendKeys(Keys.ENTER);
		 log.info("Search results are loading");
		 Thread.sleep(5000);
		 SearchResult sr=new SearchResult(driver);
		 sr.getSearchResult().click();
		 

		 driver.getPageSource().contains("NSE");
		 log.info("NSE Value is present");
	
		 driver.getPageSource().contains("BSE");
		
		 log.info("BSE Value is present");
	}
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}

