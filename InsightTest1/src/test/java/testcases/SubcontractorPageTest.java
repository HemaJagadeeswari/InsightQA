package testcases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DashboardPage;
import pages.DetailsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SubcontractorPage;
import util.TestUtil;

public class SubcontractorPageTest extends TestBase {
	HomePage homepage;
	DashboardPage Dashboardpage;
	LoginPage Loginpage;
	DetailsPage Detailspage;
	SubcontractorPage Subcontractorpage;
	//public String sheetName[]= {"AddSubcontractor","ContactList"};
	
	public SubcontractorPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		Loginpage=new LoginPage();
		homepage=Loginpage.Login(prop.getProperty("UserName"),prop.getProperty("Password"));
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Dashboardpage=homepage.Projectselection();
		Detailspage=Dashboardpage.DetailsPageLaunch();
		Subcontractorpage=Detailspage.ValidateSubcontractorPageLaunch();
		}
	
/*@Test(priority=0,description="Subcontractors Page: Page Title Test")
	public void PageTitle()
	{
		String Title=Subcontractorpage.ValidatePageTitle();
		Assert.assertEquals(Title,"Subcontractors","Page Title Name is not matching");
		}
	
 @Test(priority=1,description="Subcontractors Page: ADD SUBCONTRACTOR / SUPPLIER Tab Name Test")
	public void FirstTab()
	{
		String FirstTab=Subcontractorpage.ValidateFirstTab();
		Assert.assertEquals(FirstTab,"+ ADD SUBCONTRACTOR / SUPPLIER","Tab Name is not matching");
	}
	
 @Test(priority=2,description="Subcontractors Page: Validate Employees Tab Name Test")
	public void SecondTab()
	{
		String Secondtab=Subcontractorpage.ValidateSecondTab();
		Assert.assertEquals(Secondtab,"VALIDATE EMPLOYEES","Tab Name is not matching");
	}
	
   @Test(priority=3,description="Subcontractors Page: Import Existing Subs Tab Name Test")
	public void ThirdTab()
	{
		String Thirdtab=Subcontractorpage.ValidateThirdTab();
		Assert.assertEquals(Thirdtab,"IMPORT EXISTING SUBS","Tab Name is not matching");
	}	
	 @Test(priority=4,description="Subcontractors Page: Subcontractor view Image Verification")
		public void SubcontractorViewImageVerification() throws IOException
		{
			Subcontractorpage.SubcontractorImageVerification();
		}
	
@Test(priority=5,description="Subcontractors Page:Contractors Prime Value Test")
	public void ContractorsPrime() throws InterruptedException
	{
		String ContractorsPrime=Subcontractorpage.ValidateContractorsPrime();
		Assert.assertEquals(ContractorsPrime,"Clark: 123456789908","Contractor Prime value is not matching");
	}
	
	@Test(priority=6,description="Subcontractors Page:Default Contractor Type Value Test")
	public void DefaultContractorType() 
	{
		String C=Subcontractorpage.ValidateDefaultContractorType();
		Assert.assertEquals(C,"Contractor","Default Contractor Type value is not matching");
	}
	 
	 @Test(priority=7,description="Subcontractors Page:Default Ethnicity Value Test")
		public void DefaultEthnicity() 
		{
			String E=Subcontractorpage.ValidateDefaultEthnicity();
			Assert.assertEquals(E,"Select One","Default Ethnicity value is not matching");
		}
	 
	@Test(priority=8,description="Subcontractors Page:Default Gender Value Test")
		public void DefaultGender() 
		{
			String G=Subcontractorpage.ValidateDefaultGender();
			Assert.assertEquals(G,"Select One","Default Gender value is not matching");
		}
		
		@Test(priority=9,description="Subcontractors Page:Existing Address Value Test")
		public void ExistingAddress() 
		{
			String EA=Subcontractorpage.ValidateExisitngAddress();
			Assert.assertEquals(EA,"No addresses found","Country value is not matching");
		}
		
		@Test(priority=10,description="Subcontractors Page:Default Country Value Test")
		public void DefaultCountry() 
		{
			String Country=Subcontractorpage.ValidateDefaultCountry();
			Assert.assertEquals(Country,"United States","Country value is not matching");
		}
		
	  @Test(priority=11,description="Subcontractors Page:Default State Value Test")
		public void DefaultState() 
		{
		`	String C=Subcontractorpage.ValidateDefaultState();
			Assert.assertEquals(C,"","Default State value is not matching");
		}
		 
		@Test(priority=12,description="Subcontractors Page:Default Address Type Value Test")
			public void DefaultAddressType() 
			{
				String S=Subcontractorpage.ValidateDefaultAddressType();
				Assert.assertEquals(S,"Select one...","Default Address Type value is not matching");
			}
		 
	@Test(priority=13,description="Subcontractors Page:Address Add button name Test")
			public void DefaultAddressbutton1() 
			{
				String B1=Subcontractorpage.ValidateAddressButton1();
				Assert.assertEquals(B1,"ADD","Add button name is not matching");
			}
    
		 @Test(priority=14,description="Subcontractors Page:Address Cancel button name Test")
			public void DefaultAddressbutton2() 
			{
				String B2=Subcontractorpage.ValidateAddressButton2();
				Assert.assertEquals(B2,"CANCEL","Cancel button name is not matching");
			}*/
	
		 
	
@DataProvider(name="getData")
	//@Factory
	public Object[][] getTestData(Method m)
	{
		Object data[][]=TestUtil.getTestData(sheetName,m.getName());
		System.out.println(m.getName());
		
		return data;     	
	}
	
@Test(priority=15,dataProvider="getData",description="Subcontractors Page: Add Subcontractor")
	public void AddNewSubcontractor(String EIN,String CompanyName, String CompanyNumber,String ContractorType,String Ethnicity, String Gender,
			String ScheduledStartDate, String ScheduledEndDate, String SiteStreet1,String SiteStreet2, String SiteCity,String SiteCountry, String SiteState, String SiteZipCode, String SiteEffectiveDate, String AddressType,
			String CorporateStreet1,String CorporateStreet2, String CorporateCity,String CorporateCountry, String CorporateState, String CorporatePostalCode, String CorporateEffectiveDate, String CorporateAddressType,
			String AwardAmount, String AwardHours,  String WorkCode, String WorkScope,String Goal1,String Target1,String Goal2,String Target2,String NAICS, 
			String SOCcode, String NIGPCode,String SubType, String Scalar,
			String EntityType, String State, String Number, String EntityEffectiveDate, String EntityExpiredDate,String UserName,String FirstName, String LastName, String JobTitle,
			String Phone, String ConfirmUserName, String Password, String ConfirmPassword) throws InterruptedException
	{
		Subcontractorpage.AddNewSubcontractor1(EIN, CompanyName, CompanyNumber,ContractorType, Ethnicity, Gender, ScheduledStartDate, ScheduledEndDate,
				SiteStreet1,SiteStreet2, SiteCity,SiteCountry, SiteState, SiteZipCode,SiteEffectiveDate, AddressType, 
				CorporateStreet1,CorporateStreet2, CorporateCity,CorporateCountry, CorporateState, CorporatePostalCode, CorporateEffectiveDate, CorporateAddressType,
				AwardAmount, AwardHours,  WorkCode, WorkScope, Goal1, Target1, Goal2, Target2,NAICS, 
				SOCcode, NIGPCode,SubType, Scalar, EntityType,State,Number,EntityEffectiveDate, EntityExpiredDate,UserName, FirstName, LastName, JobTitle, Phone,ConfirmUserName,Password, ConfirmPassword);
		
}

	/*@Test(priority=6,dataProvider="getData",description="Contacts Page: Add Contacts")
	public void AddNewContacts(String UserName,String FirstName, String LastName, String JobTitle,
			String Phone, String ConfirmUserName, String Password, String ConfirmPassword)
	{
		Subcontractorpage.AddNewContacts(UserName, FirstName, LastName, JobTitle, Phone,ConfirmUserName,Password, ConfirmPassword);
	}*/
	
/*@DataProvider(name="getSubcontractorPageData")
//@Factory
public Object[][] getTestDataBase(Method m)
{
	Object data[][]=TestUtil.getTestDataBaseline(SheetName1,m.getName());
	System.out.println(m.getName());
	return data;        	
}
	
	@Test(priority=16,dataProvider="getSubcontractorPageData",description="Add Subcontractor Dropdown Verification")
public void AddSubcontracorDropdownVerification(String CP1,String CT, String ET,String GEN,String C1,String C2,String ADT,String PRO,
		String WOC,String WSC,String Gl,String SD,String ENT,String EST,String CO) throws InterruptedException
	{
		
		Subcontractorpage.AddSubcontractorDDNVerification(CP1,CT,ET, GEN,C1,C2,ADT,PRO,WOC,WSC,Gl,SD,ENT,EST,CO);
	}



@Test(priority=17,description="Contacts Page-Sub Contacts: Reset Instruction Test")
	public void ResetInstruction()
	{
		String Instruction=Subcontractorpage.ValidateResetInstruction();
		Assert.assertEquals(Instruction,"If you are not updating the user name you can leave that blank. If you are updating the password, all passwords must be at least 7 characters long and include at least one lowercase ('a-z') and one uppercase ('A-Z') letter.");
	}
	
	@Test(priority=18,description="Contacts Page-Sub Contacts: Users Name Value Test")
	public void VerifyCreatedUserName()
	{
		String UN=Subcontractorpage.ValidateUsers();
		Assert.assertEquals(UN,"Q3 Subcontractor, Tier1");
	}
	
	@Test(priority=19,description="Contacts Page-Sub Contacts: Users Email Value Test")
	public void VerifyCreatedEmail()
	{
		String Email=Subcontractorpage.ValidateEmail();
		Assert.assertEquals(Email,"q3sub1@orchid-software.com");
	}
	
	@Test(priority=20,description="Contacts Page-Sub Contacts: Features Value Test")
	public void VerifyFeatures()
	{
		String Features=Subcontractorpage.ValidateFeatures();
		Assert.assertEquals(Features,"Insight: Dashboard, ProjectDetails, SubcontractorMgmt, EmployeeMgmt, PayrollEntry, ManhourEntry, ArchiveWH347, ArchiveDailyReport, SpendTracker, Reporting, Settings, WH347Generation, WorkClasses, Signed Lien Waiver, VVF Archive, FESA, App Prog Submission, PaymentEntry, GoalAttainment, Test Custom 5, Test Custom 6");
	}
	
	@Test(priority=21,description="Contacts Page-Sub Contacts: Read Only Value Test")
	public void VerifyReadOnlyCase()
	{
		String RO=Subcontractorpage.ValidateReadOnly();
		Assert.assertEquals(RO,"");
	}
	
	@Test(priority=22,description="Contacts Page-Sub Contacts: Reports Value Test")
	public void VerifyReportsSettings()
	{
		String Reports=Subcontractorpage.ValidateReports();
		Assert.assertEquals(Reports,"Payroll Summary, CRIO Employee Summary - Daily Tracking, Employees with Hours, Rates & Wages - Period End Day, Employees with Hours, Rates & Wages - Per Day, Mortenson UW Monthly Subcontractors1, Mortenson UW Worker Utilization1, Copy of Mortonson UW Monthly Subcontractors, Goal Attainment Download1, Hampton Roads C-57 EEO Report1, Contact List, NTW Submission Check, Employees in Payroll with Demographics (B)1, Payroll-347 Status Report1, Branded Report Template, Project Employees with Rates and Wages Per Day (B)1, Project Employees with Rates and Wages Period End (B)1, Contractor List1, Business Tracking Payments Summary Standard,");
	}
	
	@Test(priority=23,description="Subcontractor Page: Work Codes selected Value Test")
	public void VerifyWorkCodePreselected()
	{
Subcontractorpage.ValidatePreselectedWorkCodes();
		
	}*/
	
	//@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}
}
