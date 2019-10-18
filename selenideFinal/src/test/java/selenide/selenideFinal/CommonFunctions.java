package selenide.selenideFinal;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;

import generic.BaseTest;
import junit.framework.Assert;

public class CommonFunctions extends BaseTest{

	
	@BeforeAll
	public static void init(){
		
	    close();
	    open("https://ukibuat.axisukonline.co.uk/AxisBaseApp/");
	}

	  public static void login_Functionality() throws InterruptedException {
			
		   
			
			 $(By.id(unloc)).sendKeys(un);
		          $(By.id(pwloc)).sendKeys(pw);
		          $(By.id(loginbuttonloc)).click();
		          
		          Thread.sleep(5000);

			  }
	  
	  
			

			

		public static void invalidLogin_Function(String in_un, String in_pw, String ERRORMSG) throws InterruptedException {
			// TODO Auto-generated method stub

			$(By.id(unloc)).val(in_un);
			$(By.id(pwloc)).val(in_pw);
			$(By.id(loginbuttonloc)).click();
			String Actualmsg = $(By.className(Actualmsgloc)).getText();

			Thread.sleep(3000);

			Assert.assertTrue(ERRORMSG.contains((Actualmsg)));

			Thread.sleep(1000);

			$(By.xpath(Okalert)).click();

			Thread.sleep(1000);
			$(By.id(unloc)).clear();
			$(By.id(pwloc)).clear();

		}
		
		public static void validLogoutFunctionality() throws InterruptedException
		 {
			CommonFunctions.login_Functionality();

		    Thread.sleep(5000);
		$(By.id(SettingsIcon)).click();
			$(By.id(LogoutIcon)).click();
			$(By.xpath(Okalert)).click();
			
		 }
		
		
		public static  void enterOTP_Functionality() throws InterruptedException
	    {
			Thread.sleep(5000);
		    String	result=OTP.check(host, mailStoreType, username, password);
	        Thread.sleep(30000);
		    $(By.id(OTPInputloc)).sendKeys(result);
		    Thread.sleep(5000);
		    $(By.id(SubmitButton)).click();
		    Thread.sleep(10000);
		}

		}


