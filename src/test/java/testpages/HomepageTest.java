package testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.util.Testbase;

import pages.AdminLoginPage;
import pages.Homepage;

public class HomepageTest extends Testbase{
	
	AdminLoginPage loginpage;
	Homepage homepage;
	
	@BeforeMethod
	public void setUp()
	{
		 Testbase.intialization();
		 loginpage=new AdminLoginPage();
			}
	
	@Test
	public void clickonlinecatalogtest()
	{
		loginpage.enterlogindetails();
		
        
	}
	
	
		
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
