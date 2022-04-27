package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.TestBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import util.TestUtil;
import pages.HomePage;
public class LoginPageTest extends TestBase{
	LoginPage Loginpage;
	HomePage HomePage;
	
	public LoginPageTest()
	{
		super();
	}
@BeforeMethod
public void setup()
{
	initialization();
	Loginpage=new LoginPage();
	}
	
@Test(priority=0,description="Login Page: Page Title Test")
public void LoginPageTitleTest()
{
	String title=LoginPage.ValidateLoginPageTitle();
	Assert.assertEquals(title,"Welcome to SkillSmart","Home Page Title is not matched");
	}

@Test(priority=1,description="Login Page: Page Image Test" )
public void LoginPageImageVerification() throws IOException
{
Loginpage.LoginPageImageVerification();
}

@Test(priority=2,description="Login Page: Forgot Password Image Test" )
public void ForgotPasswordImageVerification() throws IOException
{
Loginpage.ForgotPasswordImageVerification();
}

//@Test(priority=3,description="Login Page: Forgot Password dialog Test" )
public void ForgotPasswordVerification() throws IOException
{
	Loginpage.ForgotPassword(prop.getProperty("ForgotPassword"));
}

@Test(priority=3,description="Login Page: Login to Application")
public void LoginTest()
{
	
	HomePage=Loginpage.Login(prop.getProperty("UserName"),prop.getProperty("Password"));
	
}

@AfterMethod
public void tearDown()
{
	Driver.quit();
}	
}
