package pages;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.Dataproviderutil;
import com.util.Testbase;

public class Datatest extends Testbase {
	
	public Datatest()
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
	
	@Test(dataProvider="getlogindata")
	public void logindatatest(String username,String password)
	{
		loginpage.enterusername(username);
		loginpage.enterpassword(password);
		loginpage.clickloginbutton();
	}
	
	@DataProvider
	public Object[][] getlogindata()
	{
	
	Object [][] data=Dataproviderutil.getTestData("sheet1");
	return data;
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	}


