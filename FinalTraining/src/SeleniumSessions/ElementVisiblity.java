package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisiblity {
	public static void main (String [] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		boolean b1 = driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).isDisplayed();
		System.out.println(b1);
		boolean b2 = driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).isEnabled();
		System.out.println(b2);
		driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).click();
		boolean b3 = driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).isSelected();
		System.out.println(b3);
		
		

}
}