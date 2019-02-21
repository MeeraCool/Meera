package meeraCrediwatch;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPageObject;
import pageObjects.SignUp;
import resources.base;

public class SignUpPage extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest

	public void initialize() throws IOException
	{
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
	
		
	}
	@Test(dataProvider="getData")
	public void homePageNavigation(String FirstName,String LastName,String Email,String Password) throws IOException, InterruptedException
	{
		driver.get(prop.getProperty("url"));
		log.info("Url is loaded");
			
		 LandingPageObject hm=new LandingPageObject(driver);
		 
	     hm.getSignUp().click();
         driver.manage().window().maximize();
	     driver.switchTo().frame("myframe");
	     log.info("Switched to iframe -- signup Home page");
	     

	     Thread.sleep(20000);
	     driver.findElement(By.xpath("//*[@id='ACCT_SIGNUP_BTN']")).click();
	     SignUp sup=new SignUp(driver);
	     log.info("Ready to enter the values in sign up using email");
	     sup.getFirstName().sendKeys(FirstName);
	     sup.getLastName().sendKeys(LastName);
	     sup.getEmail().sendKeys(Email);
	     sup.getPassword().sendKeys(Password);
	     sup.getSignUpButton().click();
	     int size = driver.findElements(By.tagName("iframe")).size();
	     for(int i=0; i<=size; i++){
	    		driver.switchTo().frame(i);
	    		int total=driver.findElements(By.xpath("html/body/a/img")).size();
	    		System.out.println(total);
	    		    driver.switchTo().frame(0);}
	}
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[1][4];
		
		data[0][0]="Tingu";
		data[0][1]="Meerea";
		data[0][2]="meera1236@gmail.com";
		data[0][3]="Meeratingu@1983";
/**
		data[0][0]="Tinguww";
		data[0][1]="Meeraww";
		data[0][2]="meera22196@gmail.com";
		data[0][3]="Meeratinwegu@1983";
		**/
		return data;
		
	
}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
		
	}

