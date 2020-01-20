package SeleniumSessions;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	public static void main(String []args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputTyPe.FILE);
		//FileUtils.copyfile(src, new File());
		
		
	}

}
