package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;


import base.TestBase;
import pages.DashboardPageT1;
import pages.DetailsPageT1;
import pages.EmployeeManagementPageT1;
import pages.HomePageT1;
import pages.LoginPageT1;
import pages.SetupPageT1;
import util.TestUtil;

public class EmployeeManagementPageT1Test extends TestBase{
	HomePageT1 homepageT1;
	DashboardPageT1 DashboardpageT1;
	LoginPageT1 LoginpageT1;
	SetupPageT1 SetuppageT1;
	DetailsPageT1 DetailspageT1;
	EmployeeManagementPageT1 EmployeemanagementpageT1;
	//
	private static String fileDownloadpath = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Download";
	
	public EmployeeManagementPageT1Test()
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
		}
	/*@Test(priority=0, description="Employee Management T1: Employees Tab Name Test")
	public void ValidateEmployeeManagementTab()
	{
		String E=EmployeemanagementpageT1.ValidateEmployeesTab();
		Assert.assertEquals(E,"EMPLOYEES","Employees Tab Name not matching");
	}
	
	@Test(priority=1, description="Employee Management T1: + Add Employee Tab Name Test")
	public void ValidateAddEmployeeTab()
	{
		String AE=EmployeemanagementpageT1.ValidateAddEmployeeTab();
		Assert.assertEquals(AE,"+ ADD EMPLOYEE","+ Add Employee Tab Name not matching");
	}
	
	@Test(priority=2, description="Employee Management T1: Import Employees Tab Name Test")
	public void ValidateImportEmployeeTab()
	{
		String IE=EmployeemanagementpageT1.ValidateImportEmployeeTab();
		Assert.assertEquals(IE,"IMPORT EMPLOYEES","Import Employees Tab Name not matching");
	}
	/*@DataProvider(name="getDetailsPageDataNew1")
	public Object[][] getTestDataT1(Method m)
	{
		Object data[][]=TestUtil.getTestData(SheetName1,m.getName());
		System.out.println(m.getName());
		return data;        	
	}
	@Test(priority=3,dataProvider="getDetailsPageDataNew1",description="Employee Management T1: Add and Edit Employee Test")
	public void AddEmployeeTest1(String fn,String Mi, String Ln,String S,String Ed) throws InterruptedException
	{
		
	     EmployeemanagementpageT1.AddEmployee1(fn, Mi, Ln, S, Ed);
	     
		}*/
	/*@DataProvider(name="getDetailsPageDataNew1")
	public Object[][] getTestDataT1(Method m)
	{
		Object data[][]=TestUtil.getTestData(SheetName1,m.getName());
		System.out.println(m.getName());
		return data;        	
	}
	@Test(priority=3,dataProvider="getDetailsPageDataNew1",description="Employee Management T1: Add and Edit Employee Test")
	public void AddEmployeeTest(String fn,String Mi, String Ln,String S,String Ed, String GE,String ET,String Ph,
			String SS1,String SS2, String SC,String SCO, String SS, String SZ, String SE, String ESE1, String HD,String ES,String AN,
			String UA,String SD,String ED,String UA1,String SD1,String ED1,String ET1,String A,
			String JT,String PED,String PD,String BR,String OT,String DT,String FR,String JT1,String PED1,String PD1,
			String BR1,String OT1,String DT1,String FR1,String Exp,String Exp1,String ESS,
			String EEd,String EG,String EET,String EPh, String ESS1,String ESS2, String ESC,String SCO1,
			String ES1, String ESZ,String ESE, String EAN,String EA,String EJT,String EPED,String EPD,String EBR,String EOT,String EDT,String EFR) throws InterruptedException, IOException 
	{
		
	     EmployeemanagementpageT1.AddEmployee(fn, Mi, Ln, S, Ed, GE, ET, Ph, SS1, SS2, SC, SCO, SS, SZ, SE, ESE1, HD, ES, AN, UA, SD, ED, UA1, SD1, ED1, ET1, A, JT, PED, PD, BR, OT, DT, FR, JT1, PED1, PD1, BR1, OT1, DT1, FR1, Exp, Exp1, ESS, EEd, EG,
	    		 EET, EPh, ESS1, ESS2, ESC, SCO1, ES1, ESZ, ESE, EAN, EA, EJT, EPED, EPD, EBR, EOT, EDT, EFR);
	     
		}*/
/*@DataProvider(name="getEmployeePageData")
	public Object[][] getTestDataBaseline2(Method m)
	{
		Object data[][]=TestUtil.getTestDataBaseline(SheetName1,m.getName());
		System.out.println(m.getName());
		return data;        	
	}
		@Test(priority=4,dataProvider="getEmployeePageData",description="Employee Management T1 Page: Dropdown Verification")
		public void EmployeeManagementdropdownVerification(String DGE,String DE, String DC1,String ST1,String ST2,String W,
				String L,String SU,String T) throws InterruptedException
		{
		     EmployeemanagementpageT1.EmployeeManagementDDNVerification(DGE, DE, DC1, ST1, ST2, W, L, SU, T);
			}
		
		@Test(priority=5,description="Employee Management T1 Page:Import Employees Page Image Test")
		   public void ImportEmployeePageImage() throws IOException, AWTException
		   {
			EmployeemanagementpageT1.ImportEmployeesPageImageVerification();
		   }
	
@DataProvider(name="getImportPageData")
	public Object[][] getTestDataBaseline3(Method m)
	{
		Object data[][]=TestUtil.getTestData(SheetName1,m.getName());
		System.out.println(m.getName());
		return data;        	
	}
		@Test(priority=6,dataProvider="getImportPageData",description="Employee Management T1 Page: Import Employee Test")
		public void CreateEmployeeLayoutTest(String LN,String LT1,String VA,String VB,String VC,String VD,String VE,String VF,String VG,
				String VH,String VI,String VJ,String VK,String VL,String VM,String VN,String VO) throws InterruptedException, IOException, AWTException
		{
		     EmployeemanagementpageT1.CreateEmployeeLayout(LN,LT1,VA,VB,VC,VD,VE,VF,VG,
		    			VH,VI,VJ,VK,VL,VM,VN,VO);
			}

	@Test(priority=7,description="Employee Management T1 Page:Employee Layout Edit Test")
	   public void ImportEmployeeLayoutEdit() throws IOException, AWTException, InterruptedException
	   {
		
		EmployeemanagementpageT1.EditEmployeeLayout();	
	   }
	
	@Test(priority=8,description="Employee Management T1 Page:Download the Employee Layout Test")
	   public void DownloadEmployeeLayout() throws IOException, AWTException, InterruptedException
	   {
		if (TestUtil.isFileDownloaded(fileDownloadpath, "skillsmart-employee-template (1).xlsx")) {
			System.out.println("Import Employee:Dowloaded Excel Layout Matches");
		}else {
			System.out.println("Import Employee:Dowloaded Excel Layout not Matches");
		}
	   }*/
	   
	//@Test(priority=9,description="Employee Management T1 Page:Import Employee Test")
	   public void ImportEmployeeTest() throws IOException, AWTException, InterruptedException
	   {
		   EmployeemanagementpageT1.ImportEmployeeLayout();
	   }
	   
	/*@DataProvider(name="getImportDataValue")
	   public Object[][] getTestDataImport(Method m)
		{
			Object data[][]=TestUtil.ImportTest(SheetName2, m.getName());
			System.out.println(m.getName());
			return data;
			
		}
	   
		@Test(priority=10,dataProvider="getImportDataValue",description="Employee Management T1 Page:Imported Employee Test")
		   public void ImportedEmployeeTest(String FL,String S,String E,String S1,String S2,String CI,String ST,String ZI,String GE,String ETH,String P,String VT) throws IOException, AWTException, InterruptedException
		   {
		    EmployeemanagementpageT1.ValidateImportEmployee(FL, S, E, S1, S2, CI, ST, ZI, GE, 
		    		ETH, P, VT);
			}*/
	
		
	@DataProvider(name="getEditImportData")
		   public Object[][] getTestDataImportEdit(Method m)
			{
				Object data[][]=TestUtil.getTestData(sheetName, m.getName());
				System.out.println(m.getName());
				return data;
				
			}
		   
			@Test(priority=11,dataProvider="getEditImportData",description="Employee Management T1 Page:Import Employee Test")
			   public void EditImportEmployeeTest(String FL,String HD,String ES,String AN,
						String UA,String SD,String ED,String ET1, String A,
						String JT,String PED,String PD,String BR,String OT,String DT,String FR,
						String Exp,String FND) throws IOException, AWTException, InterruptedException
			   {
			    EmployeemanagementpageT1.EditImportEmployee(FL, HD, ES, AN, UA, SD, ED, ET1, A, JT, PED, 
			    		PD, BR, OT, DT, FR, Exp,FND);
			    		 
				}
		
	/*@Test(priority=1, description="Employee Management T1: Import Employees Tab Name Test")
	public void ValidatePDF() throws IOException
	{
		String S=EmployeemanagementpageT1.pdfcompare();
		Assert.assertTrue(S.contains("PAYROLL"));
	}*/
			//@Test(priority=12, description="Work Classes T1 Page: Launching Test")
			public void ValidateWorkClassesPageLaunch()
			{
				EmployeemanagementpageT1.WClaunch();
				
			}
			
	//@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}
}
