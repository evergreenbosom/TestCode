package FreeCRMutomation.FreeCRTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	
	

	

	public LoginPageTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setUP() throws IOException {
		initialization();
		loginPage = new LoginPage();
		
		}
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	
	@Test (priority = 2)
	public void loginTest() throws IOException {
homePage = loginPage.login(prop.getProperty("username"),("password"));
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

