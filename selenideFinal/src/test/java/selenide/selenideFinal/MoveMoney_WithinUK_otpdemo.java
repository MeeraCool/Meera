package selenide.selenideFinal;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import junit.framework.Assert;

public class MoveMoney_WithinUK_otpdemo extends OTP {
	
	

	@Test()
	public static void validWithinUKTransfer() throws InterruptedException
	  {

		CommonFunctions.login_Functionality();

	
		$(By.id(MovemoneyMenuloc)).click();
		 
		$(By.id(WithinUKloc)).click();
		
        $(By.id(FromAccloc)).click();
    	
		if(withinUK_actualalertContents!=withinUK_expectedtextContent)
		{
			$(By.id(Toaccloc)).click();
			Thread.sleep(2000);
			 
		}
			    

		else
		{
			//write the code for add payee 
		}
			
			     Thread.sleep(10000);
		
			     $(By.id(Amountloc)).sendKeys(AmountInput);
				 $(By.id(AddNoteloc)).sendKeys(AddNoteInput);
				 $("#sndmny__transferfund__transamount").scrollTo();
				    Thread.sleep(2000);
			
					Thread.sleep(2000);
				 $(By.id(ContinueButton)).click();
			         
			        Thread.sleep(10000);
		         $(By.id(ConfirmButtonloc)).click();
	             
			
	
		       //manage limit code should be executed
	    String Limitmsg=$(By.className(Actualmsgloc)).getText();
	    Assert.assertEquals(Limitmsg, Actualmsgloc);
	    
	   
		$(By.id(Okalert)).click();
		
	    
		
   }
	  
		


	@Test()
	public static void withinUKOTP() throws InterruptedException
	{
		
		
		Thread.sleep(7000);
		$(By.id(Emailoptionloc)).click();
		Thread.sleep(5000);
		
	
		
	
    }
	
	
@Test()
public  void enterOTP() throws InterruptedException
    {
		CommonFunctions.enterOTP_Functionality();
	}


	}

