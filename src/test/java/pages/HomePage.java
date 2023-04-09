package pages;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="small-searchterms")
	WebElement searchBox;
	
	@FindBy(className = "ui-menu-item-wrapper")
	WebElement searchMenuItems;
	
	@FindBy(className = "add-to-cart-button")
	WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
	WebElement checkoutLink;
	
	}
