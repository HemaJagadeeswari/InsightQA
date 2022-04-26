package testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import base.TestBase;
import pages.DashboardPageT1;
import pages.DetailsPageT1;
import pages.EmployeeManagementPageT1;
import pages.HomePageT1;
import pages.LoginPageT1;
import pages.SetupPageT1;
import pages.WorkClassesPageT1;
import util.TestUtil;

public class WorkClassesPageT1Test extends TestBase{
	HomePageT1 homepageT1;
	DashboardPageT1 DashboardpageT1;
	LoginPageT1 LoginpageT1;
	SetupPageT1 SetuppageT1;
	DetailsPageT1 DetailspageT1;
	EmployeeManagementPageT1 EmployeemanagementpageT1;
	WorkClassesPageT1 WorkclassespageT1;
	
	public WorkClassesPageT1Test()
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
		DetailspageT1=DashboardpageT1.DetailsPageLaunch();
		EmployeemanagementpageT1=DetailspageT1.EMlaunch();
		WorkclassespageT1=EmployeemanagementpageT1.WClaunch();
		
		}
/*	@Test(priority=0, description="Work Classes T1 Page: Select Work Classes Tab Name Test")
	public void SelectWorkClassesTabName()
	{
		String W=WorkclassespageT1.ValidateSelectWorkClassesTab();
		Assert.assertEquals(W,"SELECT WORK CLASSES","Select Work Classes Tab Name not matching");
	}
	
	
	@Test(priority=1, description="Work Classes T1 Page: Payroll Mapping Tab Name Test")
	public void PayrollMappingTabName()
	{
		String P=WorkclassespageT1.ValidatePayrollMappingTab();
		Assert.assertEquals(P,"PAYROLL MAPPING","Payroll Mapping Tab Name not matching");
	}
	
	@Test(priority=2, description="Work Classes T1 Page: Select Work Classes Image Verification")
	public void SelectWorkClassesImageVerification() throws IOException, AWTException, InterruptedException
	{
		WorkclassespageT1.WorkClassesPageImageVerification();
		
	}

	
	@Test(priority=3, description="Work Classes T1 Page: Payroll Mapping Image Verification")
	public void PayrollMappingImageVerification() throws IOException, AWTException
	{
		WorkclassespageT1.PayrollMappingPageImageVerification();
		
	}
	
	@DataProvider(name="getWorkClass")
	   public Object[][] getTestDataWorkClass(Method m)
		{
			Object data[][]=TestUtil.getTestData(sheetName, m.getName());
			System.out.println(m.getName());
			return data;
			
		}
	
	@Test(priority=4, dataProvider="getWorkClass",description="Work Classes T1 Page: Work Class Selection Test")
	public void WorkClassSelection(String S,String W,String WCN1,String WCN2,String W1,String W2,String W3)
	{
		WorkclassespageT1.ValidateWorkClassSelection(S,W,WCN1,WCN2, W1, W2, W3);
		
	}*/
	
	@Test(priority=5,description= "Home Page:Payroll Entry Page Launch Test" )
			public void PayrollEntryPageLaunch() throws InterruptedException
			{
				WorkclassespageT1.PayrollEntrylaunch();
			}
	
}
