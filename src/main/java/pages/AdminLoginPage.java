package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.Testbase;

public class AdminLoginPage extends Testbase{
	
	@FindBy(name="username")
	WebElement name;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//span[@class='ui-button-text']")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[@class='headerLink']")
	WebElement logoffbutton;
	
	@FindBy(xpath="//img[@title='GCR Shop']")
	WebElement image;
	
	@FindBy(xpath="/html/body/table[1]/tbody/tr[2]/td[1]/a[2]")
	WebElement onlinecatalog;
	
	public AdminLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Homepage enterlogindetails()
	{
		name.sendKeys(prop.getProperty("Username"));
		pass.sendKeys(prop.getProperty("Password"));
		loginbutton.click();
		return new Homepage();
	}
	
	public boolean verifylogoffbutton()
	{
	return logoffbutton.isDisplayed();
	}
	
	public boolean verifyimage()
	{
		return image.isEnabled();
	}
	
	public String verifytitle()
	{
		return driver.getTitle();
	}
	
	public GCRshop clickoncatalog()
	{
		
		onlinecatalog.click();
		return new GCRshop();
	}
	
	public String currentGcrtile()
	{
		return driver.getCurrentUrl();
	}
	
	public void enterusername(String username)
	{
		name.sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		pass.sendKeys(password);
	}
	public void clickloginbutton()
	{
		loginbutton.click();
	}
}
