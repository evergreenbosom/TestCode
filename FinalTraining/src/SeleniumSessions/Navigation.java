package SeleniumSessions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		//Take Screenshot
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File ("C:\\Users\\Mohammod I Hossain\\eclipse-workspace\\FinalTraining\\src\\SeleniumSessions/google.png"));
		
		
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		
		
	}

}
