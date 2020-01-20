package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {
	public static void main(String[]args) {
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Mohammod I Hossain\\Desktop\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Mohammod I Hossain\\Desktop\\SHTML.html");
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}

}
