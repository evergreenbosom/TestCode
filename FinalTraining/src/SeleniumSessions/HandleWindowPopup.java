package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopup {

	public static void main(String []args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mohammod I Hossain\\Desktop\\\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.className("black")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String ParentWindowID = it.next();
		System.out.println("Parent Window Id: "+  ParentWindowID);
		
		
		String ChildWindowID = it.next();
		System.out.println("ChildWindowID : " + ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		System.out.println("Child Window Pop UP Title" + driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentWindowID);
		
		
		
		
	}
}
