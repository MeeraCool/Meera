package meeraCrediwatch;

import org.testng.annotations.Test;
import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.NewsPageObject;
import resources.base;

public class News extends base{
	public static Logger log =LogManager.getLogger(News.class.getName());
	@BeforeTest

	public void initialize() throws IOException
	{
		driver =initializeDriver();
		 log.info("Driver is initialized");
			

			driver.get(prop.getProperty("url"));
			log.info("Url is loaded");
		
	}
	@Test()
	public void homePageNavigation()throws IOException, InterruptedException
	{
      NewsPageObject nw=new NewsPageObject(driver);
		nw.getNews().click();
		nw.getMoreNews().click();
		 log.info("News test pass");
		    

}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
}
