package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.Testbase;

public class Homepage extends Testbase{
	
	@FindBy(xpath="//table//tbody//tr/td/a[2]")
	WebElement onlinecataloglink;
	
	
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public GCRshop clickonlinecatalog()
	{
		onlinecataloglink.click();
		return new GCRshop();
	}
	
	public String capturecurrenturl()
	{
		return driver.getCurrentUrl();
		
	}
	
	
	

}
