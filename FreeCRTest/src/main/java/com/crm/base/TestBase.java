package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	 	
	
	public TestBase() throws IOException{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Mohammod I Hossain\\eclipse-workspace\\FreeCRTest\\src\\main\\java\\com\\crm\\qa\\config");
					
					prop.load(ip);
					
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
				
			
		}		
		
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("fireFox")) {
			System.setProperty("webdriver.gecko.fireFox", "C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			}else if (browserName.equals("IE")) {
				System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer.exe");
				driver  = new InternetExplorerDriver();
	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		

	}
}
