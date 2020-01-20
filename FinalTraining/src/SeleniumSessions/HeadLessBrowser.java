package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser {
	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.geico.com/");
		System.out.println(driver.getCurrentUrl());

		
		
	}

}
