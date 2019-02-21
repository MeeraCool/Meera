package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BSEandNSEObject {
	public WebDriver driver;
	By BSE=By.xpath("//div[@class='FR PR3']//strong[contains(text(),'BSE')]");
	By NSE=By.xpath("//span[@class='bl_15']//strong[contains(text(),'NSE')]");
	
	
	public BSEandNSEObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}
	public WebElement getBSE() {
		// TODO Auto-generated method stub
		return driver.findElement(BSE);
	}
	public WebElement getNSE() {
		// TODO Auto-generated method stub
		return driver.findElement(NSE);
	}
}
