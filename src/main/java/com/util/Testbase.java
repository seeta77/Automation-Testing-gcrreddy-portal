package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	
	 public static WebDriver driver;
	 public static Properties prop;
	 
	 public Testbase()
	 {
		 prop=new Properties();
		 try {
			FileInputStream fis=new FileInputStream("C:\\Users\\14388\\eclipse-workspace\\GCReddyPortal\\src\\main\\java\\configuration\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	 }
	
	
	public static WebDriver intialization()
	{
		driver=null;
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
			  driver=new ChromeDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeOuts.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeOuts.implicit_wait,TimeUnit.SECONDS);
		return driver;
	}
	
	

}
