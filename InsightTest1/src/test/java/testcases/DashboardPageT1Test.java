package testcases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DashboardPage;
import pages.DashboardPageT1;
import pages.DetailsPage;
import pages.DetailsPageT1;
import pages.HomePage;
import pages.HomePageT1;	
import pages.LoginPage;
import pages.LoginPageT1;
import pages.SetupPageT1;
import util.TestUtil;

public class DashboardPageT1Test extends TestBase{
	HomePageT1 homepageT1;
	DashboardPageT1 DashboardpageT1;
	LoginPageT1 LoginpageT1;
	DetailsPageT1 DetailspageT1;
	SetupPageT1 SetuppageT1;
	
	public DashboardPageT1Test()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException 
	{
		initialization();
		LoginpageT1=new LoginPageT1();
		homepageT1=LoginpageT1.LoginT1(prop.getProperty("UserNameT1"),prop.getProperty("PasswordT1"));
		SetuppageT1=homepageT1.PageView();
		Thread.sleep(2000);
		DashboardpageT1=SetuppageT1.PageView1();
		}
	
	@Test(priority=0,description="Dashboard Page T1:Project Name Value Test")
	public void DashboardPageProjectName()
	{
		String S1=DashboardpageT1.ValidateProjectName();
		Assert.assertEquals(S1,"Prev. Wage Project - All Features-new","Project Name is not matching");
		}
  @Test(priority=1,description="Dashboard Page T1: Project Number Value Test")
	public void DashboardPageProjectNumber()
	{
		String S1=DashboardpageT1.ValidateProjectNumber();
		Assert.assertEquals(S1,"5467899","Project Number is not matching");
		}
	
	@Test(priority=2,description="Dashboard Page T1: Image Verification Test")
	public void DashboardPageImageVefication() throws IOException 
	{
		DashboardpageT1.DashboardPageImageVerification();
		}
	
	@Test(priority=3, description="Dashboard Page T1: Total Award Amount Section Name Test")
	public void DashboardPageSection1() throws InterruptedException
	{
		String S1=DashboardpageT1.ValidateFirstSection();
		Assert.assertEquals(S1,"TOTAL AWARD AMOUNT","First Section Name is not matching");
		}
	
	@Test(priority=4, description="Dashboard Page T1: Total Paid To Date Section Name Test")
	public void DashboardPageSection2()
	{
        String S2=DashboardpageT1.ValidateSecondSection();
		Assert.assertEquals(S2,"TOTAL PAID TO DATE","Second Section name not matched");
		}
	
	@Test(priority=5, description="Dashboard Page T1: Total % Spent To Date Section Name Test")
	public void DashboardPageSection3()
	{
        String S3=DashboardpageT1.ValidateThirdSection();
		Assert.assertEquals(S3,"TOTAL % SPENT TO DATE","Third Section name not matched");
		}
	
	@DataProvider(name="getDashboardPageData1")
	//@Factory
	public Object[][] getTestDataBaseline2(Method m)
	{
		Object data[][]=TestUtil.getTestDataBaseline(SheetName1,m.getName());
		System.out.println(m.getName());
		return data;        	
	}
	@Test(priority=6,dataProvider="getDashboardPageData1",description="Dashboard Page T1:Dropdown value Test")
	public void DashboardPageT1DropdownVerification(String EN)
	{
	 DashboardpageT1.DashboardPageDDNVerification(EN);	 
}

		
	@Test(priority=7,description="Dashboard Page T1: Total Amount Awarded Section Name Test")
	public void DashboardPageSection4()
	{
		String S4=DashboardpageT1.ValidateFourthSection();
		Assert.assertEquals(S4,"TOTAL AMOUNT AWARDED","Fourth Section Name is not matching");
		}
	
	@Test(priority=8,description="Dashboard Page T1: Total % of Project Section Name Test" )
	public void DashboardPageSection5()
	{
        String S5=DashboardpageT1.ValidateFifthSection();
		Assert.assertEquals(S5,"TOTAL % OF PROJECT","Fifth Section name not matched");

		}
	@Test(priority=9, description="Dashboard Page T1: Total Paid To Date Section Name Test")
	public void DashboardPageSection6()
	{
        String S6=DashboardpageT1.ValidateSixthSection();
		Assert.assertEquals(S6,"TOTAL PAID TO DATE","Sixth Section name not matched");
		}
	
	@Test(priority=10,description="Dashboard Page T1: Total % Spent To Date Section Name Test")
	public void DashboardPageSection7()
	{
        String S7=DashboardpageT1.ValidateSeventhSection();
		Assert.assertEquals(S7,"TOTAL % SPENT TO DATE","Seventh Section name not matched");
		}
	
	@Test(priority=11,description="Dashboard Page T1: Total Workers Section Name Test")
	public void DashboardPageSection8()
	{
        String S8=DashboardpageT1.ValidateEighthSection();
		Assert.assertEquals(S8,"TOTAL WORKERS*","Eighth Section name not matched");
		}
	
	@Test(priority=12,description="Dashboard Page T1: Total Hours Worked On Project Section Name Test")
	public void DashboardPageSection9()
	{
        String S9=DashboardpageT1.ValidateNinthSection();
		Assert.assertEquals(S9,"TOTAL HOURS WORKED ON PROJECT*","Ninth Section name not matched");
		}
	
	@Test(priority=13,description="Dashboard Page T1: Notifications Section Name Test")
	public void DashboardPageSection10()
	{
        String S10=DashboardpageT1.ValidateTenthSection();
		Assert.assertEquals(S10,"Notifications","Tenth Section name not matched");
		}
	
	//Screenshot compare for Total Worker and Hours
	//@Test(priority=12)
	public void DashboardPageDefaultMessage()
	{
		 String S11=DashboardpageT1.ValidateDefaultMessage();
	     Assert.assertEquals(S11,"* Data is retrieved on a nightly basis. Data you are viewing was last retrieved at 2:00 a.m. on: 05/18/2021","Default Message not matched");
	}
	
	//@Test(priority=14, description="Dashboard Page T1: Details Page Selection Test")
	public void DetailsPageSelection()
	{
	DetailspageT1=DashboardpageT1.DetailsPageLaunch();
}

	@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}

}
