package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPageObject {
	public WebDriver driver;
	By News=By.linkText("News");
	By MoreNews=By.xpath("//div[@class='startup-videos-grid']//a[@title='View More Latest News'][contains(text(),'View More Latest News')]");




	public NewsPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}
	
	
	public WebElement getNews() {
		// TODO Auto-generated method stub
		return driver.findElement(News);
	}
	public WebElement getMoreNews() {
		// TODO Auto-generated method stub
		return driver.findElement(MoreNews);
	}
}
