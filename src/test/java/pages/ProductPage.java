package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;
	public String userEmail;
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='float-left']")
	WebElement productlabel;
	
	@FindBy(id="SearchProductName")
	WebElement productname;
	
	@FindBy(id="search-products")
	WebElement searchproduct;
	
	@FindBy(xpath="//td[contains(.,'Build your own computer')]")
	WebElement diplayedProductaftersearch;
	
	public boolean  productlabelisDisp()
	{
		return productlabel.isDisplayed();
	}
	
	public String  productlabelText()
	{
		return productlabel.getText();
	}

	
	
	public void setProductname(String p_name)
	{
		productname.clear();
		productname.sendKeys(p_name);	
	}
	
	
	public void clickSearchButton()
	{
		searchproduct.click();	
	}

	public boolean  productafterSearchidDisp()
	{
		return diplayedProductaftersearch.isDisplayed();
	}
	
	public String  productafterSearchText()
	{
		return diplayedProductaftersearch.getText();
	}
	
}
