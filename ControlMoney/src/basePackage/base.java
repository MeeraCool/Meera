package basePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","//home//i-exceed.com//meera.venkatasamy//Desktop//Selinium//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return;
		public void enterKeys(String targetElemtToEnter, String valueToBeEntered) {
			driver.findElement(By.xpath(targetElemtToEnter)).sendKeys(valueToBeEntered);
		}



		public void performClick(String targetElemToClick) {
			driver.findElement(By.xpath(targetElemToClick)).click();
		}

	}
	

		}

	
