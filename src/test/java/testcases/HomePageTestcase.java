package testcases;



import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.DashBoardPage;
import pages.LoginPage;
import utilities.BaseClass;

public class HomePageTestcase extends BaseClass {
	
	@Test
	void verifyDashBoradUI()
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
	      dpage.dashboardText();
	}    
	
	
	@Test
	void verifycommonstatDashBoradUI()
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
		  dpage.commonStatisDisp();
	      dpage.commonstatText();
	}    
	     
	      
	
	@Test
	void verifyordertotalDashBoradUI()
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
		  dpage.orderTotalText();
	      dpage.ordeTotalisDisp();
	}    
	     
	
	
	      
	@Test
	void verifynewsDashBoradUI()
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
		  dpage.newsisDisp();
	      dpage.newsText();
	}    
	      
	     
	      
	      
	

}
