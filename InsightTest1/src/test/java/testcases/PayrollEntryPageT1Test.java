package testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DashboardPageT1;
import pages.DetailsPageT1;
import pages.EmployeeManagementPageT1;
import pages.HomePageT1;
import pages.LoginPageT1;
import pages.PayrollEntryPageT1;
import pages.SetupPageT1;
import pages.WorkClassesPageT1;
import util.TestUtil;

public class PayrollEntryPageT1Test extends TestBase{
	HomePageT1 homepageT1;
	DashboardPageT1 DashboardpageT1;
	LoginPageT1 LoginpageT1;
	SetupPageT1 SetuppageT1;
	DetailsPageT1 DetailspageT1;
	EmployeeManagementPageT1 EmployeemanagementpageT1;
	WorkClassesPageT1 WorkclassespageT1;
	PayrollEntryPageT1 PayrollEntrypageT1;
	
	public PayrollEntryPageT1Test()
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
		PayrollEntrypageT1=WorkclassespageT1.PayrollEntrylaunch();
		
		}
/*	@Test(priority=0, description="PayrollEntry T1 Page: Manual Payroll Entry Tab Name Test")
	public void ManualPayrollEntryTabName()
	{
		String M=PayrollEntrypageT1.ValidateManualPayrollEntryTab();
		Assert.assertEquals(M,"MANUAL PAYROLL ENTRY","Manual Payroll Entry Tab Name not matching");
	}
	
	
	@Test(priority=1, description="PayrollEntry T1 Page: Import Payroll Entry Tab Name Test")
	public void ImportPayrollEntryTabName()
	{
		String I=PayrollEntrypageT1.ValidateImportPayrollEntryTab();
		Assert.assertEquals(I,"IMPORT PAYROLL ENTRY","Import Payroll Entry Tab Name not matching");
	}
	
	@Test(priority=2, description="PayrollEntry T1 Page: Export Payroll Entry Tab Name Test")
	public void ExportPayrollDataTabName()
	{
		String E=PayrollEntrypageT1.ValidateExportPayrollDataTab();
		Assert.assertEquals(E,"EXPORT PAYROLL DATA","Export Payroll Data Tab Name not matching");
	}
	
	@Test(priority=3, description="PayrollEntry T1 Page: Work Class Mappings Tab Name Test")
	public void WorkClassMappingTabName()
	{
		String I=PayrollEntrypageT1.ValidateWorkClassMappingTab();
		Assert.assertEquals(I,"WORK CLASS MAPPINGS","Work Class Mappings Tab Name not matching");
	}
	
	@Test(priority=1, description="PayrollEntry T1 Page: WH 347 Generation Tab Name Test")
	public void WH347GenerationTabName()
	{
		String I=PayrollEntrypageT1.ValidateWH347GenerationTab();
		Assert.assertEquals(I,"WH-347 GENERATION","WH 347 Generation Tab Name not matching");
	}*/
	
	//@Test(priority=4, description="PayrollEntry T1 Page: Payroll Entry Image Verification")
	public void PayrollyEntryImageVerification() throws IOException, AWTException, InterruptedException
	{
		PayrollEntrypageT1.PayrollEntryPageImageVerification();
		
	}
	

	//@Test(priority=5, description="PayrollEntry T1 Page: Manual Payroll Entry Verification")
	public void ManualPayrollImageVerification() throws IOException, AWTException
	{
		PayrollEntrypageT1.ManualPayrollEntryImageVerification();
		
	}
	
	/*@Test(priority=6, description="PayrollEntry T1 Page: Edit button Name Test")
	public void Editbutton()
	{
		String E=PayrollEntrypageT1.ValidateEditbutton();
		Assert.assertEquals(E,"EDIT","Edit button Name not matching");
	}
	
	@Test(priority=7, description="PayrollEntry T1 Page: Enter Hours Button Name Test")
	public void EnterHoursName()
	{
		String EH=PayrollEntrypageT1.ValidateEnterHoursButton();
		Assert.assertEquals(EH,"ENTER HOURS","Enter Hours button Name not matching");
	}
	
	@Test(priority=8, description="PayrollEntry T1 Page: Change To No Work Button Name Test")
	public void ChangeToNoWorkbuttonName()
	{
		String C=PayrollEntrypageT1.ValidateChangeToNoWorkButton();
		Assert.assertEquals(C,"CHANGE TO NO WORK","Change To No Work Button Name not matching");
	}*/
	
	//@Test(priority=9, description="PayrollEntry T1 Page: Sign button Name Test")
	public void SignbuttonName()
	{
		String I=PayrollEntrypageT1.ValidateSignbutton();
		Assert.assertEquals(I,"SIGN","Sign button Name not matching");
	}
	
	/*@Test(priority=10, description="PayrollEntry T1 Page: Refresh button Name Test")
	public void RefreshPayrollButtonName()
	{
		String I=PayrollEntrypageT1.ValidateRefreshPayrollbutton();
		Assert.assertEquals(I,"REFRESH PAYROLL","Refresh button Name not matching");
	}
	
	@Test(priority=11, description="PayrollEntry T1 Page: Mark As Final Button Name Test")
	public void MarkAsFinalbuttonName()
	{
		String I=PayrollEntrypageT1.ValidateMarkAsFinalbutton();
		Assert.assertEquals(I,"MARK AS FINAL","Mark A Final button Name not matching");
	}
	
	@Test(priority=12, description="PayrollEntry T1 Page: Clear Final Flag Button Name Test")
	public void ClearFinalFlagbuttonName()
	{
		String I=PayrollEntrypageT1.ValidateClearFinalFlagbutton();
		Assert.assertEquals(I,"CLEAR FINAL FLAG","WH 347 Generation Tab Name not matching");
	}
	*/
	//@Test(priority=13, description="PayrollEntry T1 Page: Delete Button Name Test")
	public void DeleteButtonName()
	{
		String I=PayrollEntrypageT1.ValidateDeletebutton();
		Assert.assertEquals(I,"DELETE","Delete Button Name not matching");
	}
	
/*	@DataProvider(name="getManualPayroll")
	   public Object[][] getTestDataPayroll(Method m)
		{
			Object data[][]=TestUtil.getTestData(sheetName, m.getName());
			System.out.println(m.getName());
			return data;
			
		}
	@Test(priority=14,dataProvider="getManualPayroll",description="PayrollEntry T1 Page:Manual Payroll creation Test")
	public void ValidateManualPayrollCreation(String STP,String Day1,String H1,String OT1,String DT1,String OE,String Day2,String H2,String OT2,
			String DT2,String Day3,String H3,String OT3,String F1,String W1,String S1, String L1,
			String O1,String E1,String NP1, String WA1,String Day4,String H4,String OT4,String DT4,String F3,String W3,String S3)
	 throws IOException, AWTException
	{
		PayrollEntrypageT1.ValidateManualPayrollCreation(STP,Day1,H1,OT1,DT1,OE,Day2,H2,OT2,
				DT2,Day3,H3,OT3,F1,W1,S1,L1,O1,E1,NP1,WA1,Day4,H4,OT4,DT4,F3,W3,S3);
	}*/
		
		@DataProvider(name="getEditManualPayroll")
	   public Object[][] getTestDataPayroll(Method m)
		{
			Object data[][]=TestUtil.getTestData(sheetName, m.getName());
			System.out.println(m.getName());
			return data;
			
		}
	@Test(priority=14,dataProvider="getEditManualPayroll",description="PayrollEntry T1 Page:Edit Manual Payroll Test")
	public void EditManualPayroll(String PP,String FN,String Day1,String H1,String OT1,String DT1,String OE
			,String F1,String W1,String S1,String L1,String O1,String E1,String NP1, String WA1,
			String Day2,String H2,String OT2,String Name)
	 throws IOException, AWTException
	{
		PayrollEntrypageT1.EditPayroll(PP,FN,Day1,H1,OT1,DT1,OE
				,F1,W1,S1,L1,O1,E1,NP1,WA1,Day2,H2,OT2,Name);
	}
	
	@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}
}
