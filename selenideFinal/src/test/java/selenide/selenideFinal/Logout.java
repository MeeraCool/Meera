package selenide.selenideFinal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import generic.BaseTest;

public class Logout extends BaseTest {
	
	
	
	
	@Test()
	@Tag("Logout")
	@Tag("Postive_Functional")
	@DisplayName("Logout Functionality")

	public void validLogout() throws InterruptedException
	 {
		CommonFunctions.validLogoutFunctionality();


	 }
}
