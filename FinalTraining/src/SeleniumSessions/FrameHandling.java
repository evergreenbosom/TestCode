package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).build().perform();
		
		driver.findElement(By.linkText("Hot Meals")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		/*action.moveToElement(driver.findElement(By.id("Login"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("SME Travellers")).click();*/
		
		//driver.findElement(By.xpath("//span[@class='text-label']")).click();
		//driver.findElement(By.xpath("//div[contains(@style, 'display: inline-block;')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	 

}
