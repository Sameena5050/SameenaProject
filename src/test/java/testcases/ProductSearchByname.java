package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.DashBoardPage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.BaseClass;

public class ProductSearchByname extends BaseClass {

	@Test
	void verifyBlog() throws InterruptedException
	{
	  driver.get(url);
      LoginPage lpage = new LoginPage(driver);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      lpage.setUsername(global_username);
      log.info("entered username for homepage test"+global_username);
      
      lpage.setPassword(global_password);
      log.info("entered pass"+global_password);
      
      lpage.clickLoginButton();
      log.info("clicked button");


  DashBoardPage dpage = new DashBoardPage(driver);
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  dpage.dashboardisDisp();
  dpage.clickCatolog(); 
  driver.navigate().to("https://admin-demo.nopcommerce.com/Admin/Product/List");
  Thread.sleep(5000);
  dpage.clickProduct();
  ProductPage pp = new ProductPage(driver);
  pp.productafterSearchidDisp();
  pp.setProductname("Build your own computer");
  pp.clickSearchButton();
  pp.productafterSearchText();
  
	}
}
