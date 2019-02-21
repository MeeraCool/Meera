package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	public WebDriver driver;
	By FirstName=By.cssSelector("[id='first_name']");
    By LastName=By.cssSelector("[id='last_name']");
	By Email=By.cssSelector("[id='email']");
	By Password=By.cssSelector("[id='pwd']");
	
	By SignUpButton=By.cssSelector("[id='ACT_SIGNUP_SUBMIT']");
	
	public SignUp(WebDriver driver) {
		// TODO Auto-generated constructor stu
		
		this.driver=driver;
		
	}




	public WebElement getFirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement getLastName()
	{
		return driver.findElement(LastName);
	}
	

	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}

	public WebElement getSignUpButton()
	{
		return driver.findElement(SignUpButton);
	}
	
}
