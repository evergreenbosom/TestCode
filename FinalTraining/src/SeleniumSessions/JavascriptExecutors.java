package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecutors {
	
	public static void mani (String[]agrs) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammod I Hossain\\Desktop\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://freecrm.com/");
		
		//Take Screenshot 
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Mohammod I Hossain\\Documents\\Src\\google.png"));
		
		
		
		
		
		
	}

	
		
	}

	


