package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertyFile {
	static WebDriver driver;
	public static void main (String [] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:/Users/Mohammod I Hossain/eclipse-workspace/FinalTraining/src/SeleniumSessions/config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		
		prop.getProperty("url");
		String url = prop.getProperty("url");
		System.out.println(url);
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		
		if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver  = new ChromeDriver();
			
		}else if (browserName.equals("IExplorer")) {
			System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer.exe");
			driver  = new InternetExplorerDriver();
		
		} 
		driver.get(url);
		
		
		driver.findElement(By.xpath(prop.getProperty("Emailxpath"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath(prop.getProperty("Passwordxpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("Loginxpath"))).click();
		
		
		
		
		
		
	driver.close();	
	}
	
	

}
