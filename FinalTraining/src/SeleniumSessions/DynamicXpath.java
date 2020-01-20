package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicXpath {
	public static void main(String []args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new HtmlUnitDriver();//HtmlUnitDriver to test without opening a browser.
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://google.com/");
		System.out.println(driver.getCurrentUrl());
		
		
		//driver.findElement(By.xpath("//a[@class-'gb_g']")).click();
		//driver.findElement(By.xpath("//a[@class- 'gb_g']")).click();
		//driver.findElement(By.xpath("//span[contains@class, 'text-level')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Gmail')]")).click();
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for (int i = 0; i < linklist.size(); i++) {
			String linkText = linklist.get(i).getText();
			System.out.println(linkText);
			
		driver.navigate().to("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("testing ");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("Total Number of Suggetions" + list.size());	
		
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j).getText());
		
		if (list.get(j).getText().contains("testing")) {
			list.get(j).click();
			break;
			
		}
			
		}
			
			
		}
				
	}

}
