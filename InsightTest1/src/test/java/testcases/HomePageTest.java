package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.TestBase;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;
import util.TestUtil;

public class HomePageTest extends TestBase{
	HomePage homepage;
	DashboardPage Dashboardpage;
	LoginPage Loginpage;
	
public HomePageTest()
{
	super();
}
@BeforeMethod
public void setup()
{
	initialization();
	Loginpage=new LoginPage();
	homepage=Loginpage.Login(prop.getProperty("UserName"),prop.getProperty("Password"));
	}
	
	@Test(priority=0,description="Home Page:Page Image Test")
   public void HomePageImage() throws IOException, AWTException
   {
	homepage.HomePageImageVerification();
   }
	
@Test(priority=1, description="Home Page:Project Portfolio Section Name Test")
	public void HomePageSection1() throws InterruptedException
	{
        String S1=homepage.ValidateFirstSection();
		Assert.assertEquals(S1,"Project Portfolio","First Section name not matched");
		}
	@Test(priority=2,description="Home Page:Select a Project Section Name Test")
	public void HomePageSection2()
	{
        String S2=homepage.ValidateSecondSection();
		Assert.assertEquals(S2,"Select a Project","Second Section name not matched");
		Assert.assertTrue(true);
		}
	
	
	@Test(priority=3,description="Home Page:Employees Tab Name Test")
	public void HomePageTab1()
	{
		String T1=homepage.ValidateFirstTab();
		Assert.assertEquals(T1, "EMPLOYEES","Tab name not matching");
	}
	
	@Test(priority=4,description="Home Page:Contractors Tab Name Test")
	public void HomePageTab2()
	{
		String T2=homepage.ValidateSecondTab();
		Assert.assertEquals(T2, "CONTRACTORS","Tab name not matching");
	}
	
	//@Test(priority=6,description="Home Page:Employees Image Test")
	public void HomePageTab1ImageVerification() throws IOException, AWTException
	{
		homepage.Employeesview();
	}
	
	//@Test(priority=7,description="Home Page:Contractors Image Test")
	public void HomePageTab2ImageVerification() throws IOException, AWTException
	{
		homepage.Contractorsview();
	}
	
	
	@DataProvider(name="getHomePageData")
	//@Factory
	public Object[][] getTestDataBaseline(Method m)
	{
		Object data[][]=TestUtil.getTestDataBaseline(SheetName1,m.getName());
		System.out.println(m.getName());
		return data;        	
	}
	
	@Test(priority=5,dataProvider="getHomePageData",description="Home Page: Dropdown Verification")
	//@Test(priority=1)
	public void HomePageDropdownVerification(String PN)
	{
		homepage.HomePageDDNVerification(PN);
	}
	
	@Test(priority=6,description="Home Page:Search by Contractor image Test")
	public void ProjectNameinTableView() throws IOException, AWTException
	{
		homepage.SearchByContractorviewImageVerification();
	}
	
	@Test(priority=7,description="Home Page:Search by Contractor Search Test")
	public void SearchByContractorSearchTest() throws IOException, AWTException
	{
		homepage.SearchByContractorviewSearch();
	}
	
	
	@Test(priority=8,description="Home Page:Single Contractors image Test")
		public void SingleContractorView() throws IOException, AWTException
		{
			homepage.SingleContractorsImageVerification();
		}

		
	@Test(priority=9,description= "Home Page:Project Name Selection Test" )
	public void projectselection()
	{
		Dashboardpage=homepage.Projectselection();
	}
	
	@AfterMethod
	public void tearDown()
	{
		Driver.quit();
	}	
	
	
}
