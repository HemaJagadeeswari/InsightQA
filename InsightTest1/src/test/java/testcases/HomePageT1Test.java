package testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DashboardPage;
import pages.HomePage;
import pages.HomePageT1;
import pages.LoginPage;
import pages.LoginPageT1;
import util.TestUtil;

public class HomePageT1Test extends TestBase{
	HomePageT1 homepageT1;
	LoginPageT1 LoginpageT1;
	
public HomePageT1Test()
{
	super();
}
@BeforeMethod
public void setup()
{
	initialization();
	LoginpageT1=new LoginPageT1();
	homepageT1=LoginpageT1.LoginT1(prop.getProperty("UserNameT1"),prop.getProperty("PasswordT1"));
	}

@Test(priority=0,description="Home Page T1 :Page Image Test")
public void HomePageImage() throws IOException, AWTException
{
	homepageT1.HomePageImageVerification();
}
	
/*@DataProvider(name="getData")
public Object[][] getTestData(Method m)
{
	Object data[][]=TestUtil.getTestData(sheetName,m.getName());
	System.out.println(m.getName());
	
	return data;
        	
}
@Test(priority=1,dataProvider="getData")
public void Tier1Login(String UserName,String Password)
{
	LoginpageT1.LoginT1(UserName, Password);
}*/

@Test(priority=1,description="Home Page T1:Section Name Test")
public void HomePageSection()
{
    String S=homepageT1.ValidateSection();	
    Assert.assertEquals(S,"Select a Project","Section name not matched");
	Assert.assertTrue(true);
	}

@Test(priority=2, description="Home Page T1 :Project Selection Test" )
public void ProjectSelection() throws InterruptedException
{
	homepageT1.PageView();
}

//@AfterMethod
public void tearDown()
{
	Driver.quit();
}	
}
