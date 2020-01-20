package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class LoginPage extends TestBase {
	
	
		public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
		@FindBy(name = "email")
		WebElement username;
		
		@FindBy(name = "password")
		WebElement password;
		
		@FindBy(xpath = "//div[contains(@class,'ui fluid large blue submit button')]")
		
		WebElement loginBtn;
//Initializing the Page Objects:
		public void LoginPage() {
			PageFactory.initElements(driver, this);
			
		}
		
		public String validateLoginPageTitle() {
			return driver.getTitle();
		
		}
		public HomePage login(String un, String pwd) throws IOException {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			
			return new HomePage();
			

		
	
		}
	

}
