package generic;

public interface IAutoConstants 
{
 //General

		String EXCEL_PATH="./Input_Data/Inputs.xlsx";
		String CONFIG_PATH="./Property_Files/config.properties";
	
		
//common alerts & contents locators
		
		  String Okalert=Excel_Data.getValue(EXCEL_PATH,"CommonFunctions",1,1);
		
  //Login
		//locators
	
		  String unloc=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,1);
		  String pwloc=Excel_Data.getValue(EXCEL_PATH,"Valid Login",2,1);
		  String loginbuttonloc=Excel_Data.getValue(EXCEL_PATH,"Valid Login",3,1);
		  
		//valid values
		  
		  
		  String un=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,3);
		  String pw=Excel_Data.getValue(EXCEL_PATH,"Valid Login",2,3);
			
		//invalid values  
			
		  
		 String Actualmsgloc=Excel_Data.getValue(EXCEL_PATH,"Valid Login",4,1);
		  
			
	//Home
		  
		  
		 //locators
		  
		  String SettingsIcon=Excel_Data.getValue(EXCEL_PATH,"Home",1,1);
		  String LogoutIcon=Excel_Data.getValue(EXCEL_PATH,"Home",2,1);
			
		  
		  
	//MoneyTransfer_WithinUK_Home
		  
		  //locators
			String MovemoneyMenuloc=Excel_Data.getValue(EXCEL_PATH,"Home",3,1);
			String WithinUKloc=Excel_Data.getValue(EXCEL_PATH,"Home",5,1);
			String FromAccloc=Excel_Data.getValue(EXCEL_PATH,"Within_UK",1,1);
			String Toaccloc=Excel_Data.getValue(EXCEL_PATH,"Within_UK",2,1);
			String Amountloc=Excel_Data.getValue(EXCEL_PATH,"Within_UK",3,1);
			String AddNoteloc=Excel_Data.getValue(EXCEL_PATH,"Within_UK",4,1);
			String ContinueButton=Excel_Data.getValue(EXCEL_PATH,"Within_UK",5,1);
			String withinUK_expectedtextContent="No Payee Found";
			String withinUK_actualalertContents=Excel_Data.getValue(EXCEL_PATH,"Within_UK",2,1);
			
		//values
			
			String AmountInput=Excel_Data.getValue(EXCEL_PATH,"Within_UK",3,3);
			String AddNoteInput=Excel_Data.getValue(EXCEL_PATH,"Within_UK",4,3);
			
		//invalid values
			String Actualmsgloc_amount=Excel_Data.getValue(EXCEL_PATH,"Within_UK",8,1);
			

			
		//Confirmation
			
			 String ConfirmButtonloc=Excel_Data.getValue(EXCEL_PATH, "Within_UK",7,1);
		
        //OTP
			 
			 String Emailoptionloc=Excel_Data.getValue(EXCEL_PATH, "OTP", 5, 1);
			 String SMSoptionloc=Excel_Data.getValue(EXCEL_PATH, "OTP", 6, 1);
			 //valid
			 String OTPInputloc=Excel_Data.getValue(EXCEL_PATH, "OTP",7,1);
			 String SubmitButton=Excel_Data.getValue(EXCEL_PATH, "OTP", 10, 1);
			 
		//invalid otp 
			 String in_result=Excel_Data.getValue(EXCEL_PATH, "OTP",7,1);
			 
		//OTP Mail configuration
			 
			 String host = Excel_Data.getValue(EXCEL_PATH, "OTP", 1, 1);
			 String mailStoreType = Excel_Data.getValue(EXCEL_PATH,"OTP",2,1);
			 String username = Excel_Data.getValue(EXCEL_PATH,"OTP",3,1);
			 String password = Excel_Data.getValue(EXCEL_PATH,"OTP",4,1);
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 