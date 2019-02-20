package pageActions;

import com.iexceed.test.pages.elements.DashboardPageElements;
import com.iexceed.test.selenium.actions.PageActions;

public class HomePageActions {
	HomePageActions pac = new HomePageActions();

	public void isDashboardPage() {
		String balanceText = pac.retriveTextFromElement(DashboardPageElements.BALANCE_LABEL);
		if (balanceText.equals("BALANCE")) {
			System.out.println("Dashboard Page is loaded");
		} else {
			System.out.println("Dashboard Page is not loaded");
		}
	}

	public void navigateToMoneyTransfer() {
		pac.performClick(DashboardPageElements.BUTTON_MONEYTRANSFER);
	}
}
}
