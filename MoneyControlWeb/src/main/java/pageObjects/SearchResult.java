package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult {
	public WebDriver driver;
	By SearchResult=By.xpath("//tbody//tr[1]//td[1]//p[1]");
	
	
	
	public SearchResult(WebDriver driver)  {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getSearchResult() {
		// TODO Auto-generated method stub
		return driver.findElement(SearchResult);
	}
}
