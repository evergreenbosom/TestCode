package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderSelect {
public static void main(String []args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://book.spicejet.com/search.aspx");
	
	WebElement date = driver.findElement(By.id("custom_date_picker_id_1"));
	String dateVal = "20/12/2019";
	
	
	selectDateByJS(driver,date, dateVal);
	
	
	
	
}

public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("arguments[0].setAttribute('vale'),+'"+dateVal+"');", element);
	
}


}

