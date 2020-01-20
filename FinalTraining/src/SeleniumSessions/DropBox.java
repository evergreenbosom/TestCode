package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Mohammod I Hossain\\Desktop\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.geico.com/");
		Select select = new Select(driver.findElement(By.id("homepage_manage_select")));//Select dropdown using Select Object
		select.selectByVisibleText("Life");
		driver.findElement(By.name("zip")).sendKeys("11377");
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
		driver.findElement(By.className("f_Address")).sendKeys("5305, 32nd Ave");
		driver.findElement(By.className("f_Apt")).sendKeys("1K");
		Select select1 = new Select(driver.findElement(By.id("NIP015PIPropertyCityList")));
		select.selectByVisibleText("FLASHING");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
		//driver.quit();
		
		
		/*//Handling Error/Alert by Alert Class Objec and Swithchto
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();*/
		
		
		
		
	
		
		
		
		
		
		
	}

}
