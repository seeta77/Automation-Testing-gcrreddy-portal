package testpages;




import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;


import com.util.Testbase;

import pages.AdminLoginPage;
import pages.Homepage;

public class AdminLoginPageTest extends Testbase{
	
	public AdminLoginPageTest()
	{
		super();
	}
	
	AdminLoginPage loginpage;
	Homepage homepage;
	@BeforeMethod
	public void setUp()
	{
		Testbase.intialization();
		loginpage=new AdminLoginPage();
			}
	@Test
	public void LoginoageTest()
	{
		loginpage.enterlogindetails();
	}
	
		
	@Test(priority=1)
	public void verifylogoffbuttontest()
	{
		boolean b=loginpage.verifylogoffbutton();
	        Assert.assertEquals(b, true);
	        System.out.println(b);
		
	}
	@Test(priority=2)
	public void verifyimagetest()
	{
		boolean b1=loginpage.verifyimage();
		Assert.assertTrue(b1, "gcrshop image is displayed");
	}
	@Test(priority=3)
	public void verifytitletest()
	{
		String title=loginpage.verifytitle();
		Assert.assertEquals(title,"osCommerce Online Merchant Administration Tool");
   }
	@Test(priority=4)
	public void clickonlinecatalogtest()
	{
		 loginpage.clickoncatalog();
		 String gcrtitle=loginpage.currentGcrtile();
		 Assert.assertEquals(gcrtitle,"http://gcreddy.com/project/");
        	}

	
	
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
