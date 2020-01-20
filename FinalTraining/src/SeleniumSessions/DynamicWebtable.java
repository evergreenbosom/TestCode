package SeleniumSessions;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebtable {
	
	/* Testing
	 */
	
	public static void main(String[]args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/contacts");
		driver.findElement(By.name("email")).sendKeys("evergreen_bosom@yahoo.co.in");
		driver.findElement(By.name("password")).sendKeys("Testcrm123");
		driver.findElement(By.cssSelector(".fluid")).click();
		driver.findElement(By.linkText("Contacts")).click();
		
		
		
		
		
		//Access Dynamic HTML Talbe
		//Method - 1
		
		String before_xpath = "//*[@id=\"example-table\"]/tbody/tr[";
		String after_xpath = "]/a";
		
		for (int i = 0; i <=10; i++) {
			String name = driver.findElement(By.xpath(before_xpath +i +after_xpath)).getText();
			System.out.println(name);
			
			//To select Any row
			if (name.contains("tom jon")) {
				driver.findElement(By.xpath("//*[@id=\"example-table\"]/tbody/tr[ + i + ]/a ")).click();
				
				//Method -2
				
				//driver.findElement(By.xpath("//a[contains(text(), 'tom jon')]/parent:: td//preceding=sibling::td//input[@name="contact_id"]")).click();
				
				
			}
				
			}
		
		
			
		}
		
		
		
	}


