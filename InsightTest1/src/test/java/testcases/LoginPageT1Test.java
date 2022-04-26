package testcases;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePageT1;
import pages.LoginPage;
import pages.LoginPageT1;
import util.TestUtil;

public class LoginPageT1Test extends TestBase{
	LoginPageT1 LoginpageT1;
	HomePageT1 HomePageT1;
	
	public LoginPageT1Test()
	{
		super();
	}
@BeforeMethod
public void setup()
{
	initialization();
	LoginpageT1=new LoginPageT1();
	}
@Test(priority=0,description="Login Page T1: Login to Application")
public void LoginTestT1()
{
	
	HomePageT1=LoginpageT1.LoginT1(prop.getProperty("UserNameT1"),prop.getProperty("PasswordT1"));
}
//@AfterMethod
public void tearDown()
{
	Driver.quit();
}
}
