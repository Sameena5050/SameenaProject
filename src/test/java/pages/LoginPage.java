package pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.template.utility.Constants;

public class LoginPage {

	WebDriver driver;
	public String userEmail;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="ico-login")
	WebElement loginLink;
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(className="login-button")
	WebElement LoginButton;
	
	
	public void setUsername(String user)
	{
		Email.clear();
		Email.sendKeys(user);	
	}

	public void setPassword(String pass)
	{
		Password.clear();
		Password.sendKeys(pass);	
	}

	public void clickLoginButton()
	{
		LoginButton.click();	
	}


}
