package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnotation {
	WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
		
	}
	
	@BeforeTest
	public void launchBrowser() {
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/*@BeforeClass
		public void login () {
			System.out.println("Login to App");
		}*/
	@BeforeMethod 
	public void enterURL() {
		driver.get("https://google.com/");
	}
	@Test (priority=3,groups="Testing", invocationCount = 10)
	public void googleTitleTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	@Test (priority=2, dependsOnMethods = "googlelogoTesting", groups="Testing")
	public void googlesearchTesting() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "Title is not matched");
	}
	@Test(priority=1,groups="Test")
	public void googlelogoTesting() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		System.out.println(b);
		
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("Logout from App");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	@AfterTest
	public void deleteAllCockies() {
		System.out.println("Delete All Cockies");
		driver.quit();
	}
	
	}
	
	


