package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class base {
	public static WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
 prop= new Properties();
FileInputStream fis=new FileInputStream("/home/i-exceed.com/meera.venkatasamy/Desktop/Selinium/MoneyControlWeb/src/main/java/resources/data.properties");
prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "//home//i-exceed.com//meera.venkatasamy//Desktop//Selinium//chromedriver");
	driver= new ChromeDriver();
		//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
	//firefox code
}
else if (browserName.equals("IE"))
{
//	IE code
}

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
return driver;


}
public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("/home/i-exceed.com/meera.venkatasamy/Desktop/Screenshot"+result+"screenshot.png"));
	
}

}
