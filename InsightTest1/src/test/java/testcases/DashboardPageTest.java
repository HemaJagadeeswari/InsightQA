package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DashboardPage;
import pages.DetailsPage;
import pages.HomePage;
import pages.LoginPage;
import util.TestUtil;

public class DashboardPageTest extends TestBase {

	HomePage homepage;
	DashboardPage Dashboardpage;
	LoginPage Loginpage;
	DetailsPage Detailspage;
	
	public DashboardPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		Loginpage=new LoginPage();
		homepage=Loginpage.Login(prop.getProperty("UserName"),prop.getProperty("Password"));
		Dashboardpage=homepage.Projectselection();
		}
	
@Test(priority=0,description="Dashboard Page:Project Name Value Test")
	public void DashboardPageProjectName()
	{
		String S1=Dashboardpage.ValidateProjectName();
		Assert.assertEquals(S1,"Prev. Wage Project - All Features-new","Project Name is not matching");
		}
   @Test(priority=1,description="Dashboard Page: Project Number Value Test")
	public void DashboardPageProjectNumber()
	{
		String S1=Dashboardpage.ValidateProjectNumber();
		Assert.assertEquals(S1,"123456789908","Project Number is not matching");
		}
	
	@Test(priority=2,description="Dashboard Page: Image Verification Test")
	public void DashboardPageImageVefication() throws IOException
	{
		Dashboardpage.DashboardPageImageVerification();
		}
	
@Test(priority=3,description="Dashboard Page: Total Project Value Section Name Test")
	public void DashboardPageSection1()
	{
		String S1=Dashboardpage.ValidateFirstSection();
		Assert.assertEquals(S1,"TOTAL PROJECT VALUE","First Section Name is not matching");
		}
	
	@Test(priority=4,description="Dashboard Page: Total Amount Awarded Section Name Test")
	public void DashboardPageSection2()
	{
        String S2=Dashboardpage.ValidateSecondSection();
		Assert.assertEquals(S2,"TOTAL AMOUNT AWARDED","Second Section name not matched");

		}
	@Test(priority=5,description="Dashboard Page: Total Paid To Date Section Name Test")
	public void DashboardPageSection3()
	{
        String S3=Dashboardpage.ValidateThirdSection();
		Assert.assertEquals(S3,"TOTAL PAID TO DATE","Third Section name not matched");
		}
	
	@Test(priority=6,description="Dashboard Page: Total % Spent To Date Section Name Test")
	public void DashboardPageSection4()
	{
        String S4=Dashboardpage.ValidateFourthSection();
		Assert.assertEquals(S4,"TOTAL % SPENT TO DATE","Fourth Section name not matched");
		}
	@DataProvider(name="getDashboardPageData")
	//@Factory
	public Object[][] getTestDataBaseline2(Method m)
	{
		Object data[][]=TestUtil.getTestDataBaseline(SheetName1,m.getName());
		System.out.println(m.getName());
		return data;        	
	}
	@Test(priority=7,dataProvider="getDashboardPageData",description="Dashboard Page:Dropdown value Test")
	public void DashboardPageT1DropdownVerification(String Entity)
	{
	 Dashboardpage.DashboardPageDDNVerification(Entity);	 
}
	
	@Test(priority=8,description="Dashboard Page: Total Amount Awarded Section Name Test")
	public void DashboardPageSection5()
	{
		String S5=Dashboardpage.ValidateFifthSection();
		Assert.assertEquals(S5,"TOTAL AMOUNT AWARDED","Fifth Section Name is not matching");
		}
	
	@Test(priority=9,description="Dashboard Page: Total % of Project Section Name Test")
	public void DashboardPageSection6()
	{
        String S2=Dashboardpage.ValidateSixthSection();
		Assert.assertEquals(S2,"TOTAL % OF PROJECT","Sixth Section name not matched");

		}
	@Test(priority=10,description="Dashboard Page: Total Paid To Date Section Name Test")
	public void DashboardPageSection7()
	{
        String S7=Dashboardpage.ValidateSeventhSection();
		Assert.assertEquals(S7,"TOTAL PAID TO DATE","Seventh Section name not matched");
		}
	
	@Test(priority=11,description="Dashboard Page: Total % Spent To Date Section Name Test")
	public void DashboardPageSection8()
	{
        String S8=Dashboardpage.ValidateEighthSection();
		Assert.assertEquals(S8,"TOTAL % SPENT TO DATE","Eighth Section name not matched");
		}
	
 @Test(priority=12,description="Dashboard Page: Total Workers Section Name Test")
	public void DashboardPageSection9()
	{
        String S9=Dashboardpage.ValidateNinthSection();
		Assert.assertEquals(S9,"TOTAL WORKERS*","Ninth Section name not matched");
		}
	
	@Test(priority=13,description="Dashboard Page: Total Hours Worked On Project Section Name Test")
	public void DashboardPageSection10()
	{
        String S10=Dashboardpage.ValidateTenthSection();
		Assert.assertEquals(S10,"TOTAL HOURS WORKED ON PROJECT*","Tenth Section name not matched");
		}
	
	@Test(priority=14,description="Dashboard Page: Notifications Section Name Test")
	public void DashboardPageSection11()
	{
        String S11=Dashboardpage.ValidateEleventhSection();
		Assert.assertEquals(S11,"Notifications","Eleventh Section name not matched");
		}
	
	@Test(priority=15, description="Dashboard Page: Details Page Selection Test")
	public void DetailsPageSelection()
	{
	Detailspage=Dashboardpage.DetailsPageLaunch();
}

	@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}
}