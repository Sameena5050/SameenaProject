package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {

	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver)
	{
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(.,'Dashboard')]")
	WebElement dashboard;
	
	@FindBy(xpath="//div[@class='card-title'][normalize-space()='NopCommerce News']")
	WebElement news;
	
	@FindBy(xpath="//div[@class='card-title'][normalize-space()='Common statistics']")
	WebElement CommonStat;
	
	@FindBy(xpath="//h3[contains(.,'Order totals')]")
	WebElement orderTotal;
	
	@FindBy(xpath="//h3[contains(.,'Bestsellers by quantity')]")
	WebElement bestseller;
	
	
	@FindBy(xpath="//p[normalize-space()='Configuration']")
	WebElement configuration;
	
	

	@FindBy(xpath="//p[normalize-space()='Settings']")
	WebElement settings;
	
	

	@FindBy(xpath="//p[normalize-space()='Blog settings']")
	WebElement blog;
	
	
	@FindBy(xpath="//p[normalize-space()='Catalog']//i[contains(@class,'right fas fa-angle-left')]")
	WebElement catalog;
	
	
	
	@FindBy(xpath="//p[normalize-space()='Products']")
	WebElement product;
	
	
	public boolean  dashboardisDisp()
	{
		return dashboard.isDisplayed();
	}
	
	public String  dashboardText()
	{
		return dashboard.getText();
	}
	
	
	
	
	public boolean  newsisDisp()
	{
		return news.isDisplayed();
	}
	
	public 	String  newsText()
	{
		return news.getText();
	}
	
	
	
	public boolean commonStatisDisp()
	{
		return CommonStat.isDisplayed();
	}
	
	public String  commonstatText()
	{
		return CommonStat.getText();
	}
	
	
	
	
	public boolean ordeTotalisDisp()
	{
		return orderTotal.isDisplayed();
	}
	public String  orderTotalText()
	{
		return orderTotal.getText();
	}
	
	
	
	
	
	
	public boolean lateststatisDisp()
	{
		return bestseller.isDisplayed();
	}
	String  lateststatText()
	{
		return bestseller.getText();
	}
	
	
	public void clickConfiguration()
	{
		Actions action = new Actions(driver);
		action.click(configuration).build().perform();
		//configuration.click();
	}
	
	public void clickSetting()
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Settings']")));
		Actions action = new Actions(driver);
		action.click(settings).build().perform();
		//settings.click();
	}
	
	public void clickBlog()
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Blog settings']")));
		Actions action = new Actions(driver);
		action.click(blog).build().perform();
		//blog.click();
	}
	
	

	public void clickCatolog()
	{
		Actions action = new Actions(driver);
		action.click(catalog).build().perform();
		//catalog.click();
	}
	
	public void clickProduct()
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Products']")));
		Actions action = new Actions(driver);
		action.click(product).build().perform();
		//blog.click();
	}
	
	
}
