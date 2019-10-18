package selenide.selenideFinal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import generic.BaseTest;
import generic.Excel_Data;

public class Login_Invalid extends BaseTest {

	

	
	@Test()
	@DisplayName("Login with Invalid credentials")
	public void invalidLogin_Function1() throws InterruptedException {
		int rc = Excel_Data.getRowCount(EXCEL_PATH, "Invalid Login");
		for (int i = 1; i <= rc; i++) {
			
			String in_un = Excel_Data.getValue(EXCEL_PATH, "Invalid Login", i, 0);
			String in_pw = Excel_Data.getValue(EXCEL_PATH, "Invalid Login", i, 1);
			String ERRORMSG = Excel_Data.getValue(EXCEL_PATH, "Invalid Login", i, 2);
			CommonFunctions.invalidLogin_Function(in_un, in_pw, ERRORMSG);
		
	}
	}

}
