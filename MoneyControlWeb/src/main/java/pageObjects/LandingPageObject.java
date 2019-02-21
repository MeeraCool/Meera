package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObject {
	public WebDriver driver;
	By SignUp=By.xpath("//strong[contains(text(),'Sign Up')]");
    By Search=By.xpath("//*[@id='search_str']");
    By NavigationBar=By.xpath("//div[@class='stickymiddle']");

    By Title=By.xpath("//div[@class='header-main-wrapper PR clearfix PA15']//img[@title='Moneycontrol']");

	public LandingPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}







	public WebElement getSignUp() {
		// TODO Auto-generated method stub
		return driver.findElement(SignUp);
	}
	public WebElement getSearch() {
		// TODO Auto-generated method stub
		return driver.findElement(Search);
	}







	public WebElement getNavigationBar() {
		// TODO Auto-generated method stub
		return driver.findElement(NavigationBar);
	}






	public WebElement getTitle() {
		// TODO Auto-generated method stub
		return driver.findElement(Title);
	}


	

}
