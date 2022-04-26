package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
import pages.SetupPageT1;
import util.TestUtil;
import pages.HomePageT1;
import pages.LoginPageT1;
import pages.SetupPageT1;

public class SetupPageT1Test extends TestBase{
	HomePageT1 homepageT1;
	//DashboardPageT1 DashboardpageT1;
	LoginPageT1 LoginpageT1;
	SetupPageT1 SetuppageT1;
	
	public SetupPageT1Test()
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
		}
	
	@Test(priority=0,description="Setup Page: Image Verification")
	public void SetupDetailsPageImageVerification() throws IOException, AWTException
	{
	  SetuppageT1.SetupDetailsPageImageVerification();
		}
	
@Test(priority=1,description="Setup Page: Details Tab Name Test")
	public void SetupPageTab1()
	{
		String T1=SetuppageT1.ValidateFirstTab();
		Assert.assertEquals(T1,"DETAILS","First Tab Name is not matching");
		}
	
	@Test(priority=2,description="Setup Page: Payroll Tab Name Test")
	public void SetupPageTab2()
	{
		String T2=SetuppageT1.ValidateSecondTab();
		Assert.assertEquals(T2,"PAYROLL","Second Tab Name is not matching");
		}
	
	@Test(priority=3,description="Setup Page: Job Titles Tab Name Test")
	public void SetupPageTab3()
	{
		String T3=SetuppageT1.ValidateThirdTab();
		Assert.assertEquals(T3,"JOB TITLES","Third Tab Name is not matching");
		}
	
	@Test(priority=4,description="Setup Page: Employees Tab Name Test")
	public void SetupPageTab4()
	{
		String T4=SetuppageT1.ValidateFourthTab();
		Assert.assertEquals(T4,"EMPLOYEES","Fourth Tab Name is not matching");
		}
	
	@Test(priority=5,description="Setup Page: Subcontractors Tab Name Test")
	public void SetupPageTab5()
	{
		String T5=SetuppageT1.ValidateFifthTab();
		Assert.assertEquals(T5,"SUBCONTRACTORS","Fifth Tab Name is not matching");
		}
	
@Test(priority=6,description="Setup Page: Authorize GC to Access Date Toogle Test")
	public void SetupPageAuthrizeToggle()
	{
	SetuppageT1.ValidateAuthorizeToggle();
		}
	
	@Test(priority=7,description="Setup Page: Project Name Value Test")
	public void ProjectName()
	{
		String ProjectName=SetuppageT1.ValidateProjectNameField();
		Assert.assertEquals(ProjectName,"Prev. Wage Project - All Features-new","Project Name is not matching");
		}
	
	@Test(priority=8,description="Setup Page: Project Number Value Test" )
	public void ProjectNumber()
	{
        String ProjectNumber=SetuppageT1.ValidateNumberField();
		Assert.assertEquals(ProjectNumber,"546787","Project Number not matched");

		}
	@Test(priority=9,description="Setup Page:Ethnicity Value Test")
	public void ProjectEthnicity()
	{
        String Ethnicity=SetuppageT1.ValidateEthnicityField();
		Assert.assertEquals(Ethnicity,"Black or African American","Ethnicity not matched");
		}
	
	@Test(priority=10,description="Setup Page: Gender Value Test")
	public void ProjectGender()
	{
        String ProjectGender=SetuppageT1.ValidateGenderField();
		Assert.assertEquals(ProjectGender,"Female","Gender not matched");
		}
	
	@Test(priority=11,description="Setup Page: Site Address Street1 Value Test")
	public void SiteAddressStreet1() throws InterruptedException
	{
		String Street1=SetuppageT1.ValidateSiteAddressStreet1();
		Assert.assertEquals(Street1,"2121  Hidden Valley Road","Street1 is not matching");
		}
	
	@Test(priority=12,description="Setup Page: Site Address Street2 Value Test")
	public void SiteAddressStreet2() throws InterruptedException
	{
		String Street2=SetuppageT1.ValidateSiteAddressStreet2();
		Assert.assertEquals(Street2,"","Street2 is not matching");
		}
	
	@Test(priority=13,description="Setup Page: Site Address City Value Test")
	public void SiteAddressCity() throws InterruptedException
	{
		String City=SetuppageT1.ValidateSiteAddresscity();
		Assert.assertEquals(City,"lebanan","City is not matching");
		}
	@Test(priority=14,description="Setup Page: Site Address Country Value Test")
	public void SiteAddressCountry() throws InterruptedException
	{
		String Country=SetuppageT1.ValidateSiteAddressCountry();
		Assert.assertEquals(Country,"United States","Country is not matching");
		}
	@Test(priority=15,description="Setup Page: Site Address State Value Test")
	public void SiteAddressState() throws InterruptedException
	{
		String State=SetuppageT1.ValidateSiteAddressState();
		Assert.assertEquals(State,"PA","Site Address State is not matching");
		}
	@Test(priority=16,description="Setup Page: Site Address Zip Code  Value Test")
	public void SiteAddressZipCode() throws InterruptedException
	{
		String Zip=SetuppageT1.ValidateSiteAddressZip();
		Assert.assertEquals(Zip,"17042","Site Address Zip Code is not matching");
		}
	@Test(priority=17,description="Setup Page: Site Address Effective Date Value Test")
	public void SiteAddressEffectiveDate() throws InterruptedException
	{
		String EffectiveDate=SetuppageT1.ValidateSiteAddressEffectiveDate();
		Assert.assertEquals(EffectiveDate,"01/01/2005","Site Address Effective Date is not matching");
		}
	@Test(priority=18,description="Setup Page: Default Address Type Value Test")
	public void AddressType1() throws InterruptedException
	{
		String Type1=SetuppageT1.ValidateSiteAddressType();
		Assert.assertEquals(Type1,"Site Office","Default Address Type is not matching");
		}
	
	@Test(priority=19,description="Setup Page: Corporate Address Street1 Value Test")
		public void CorporateAddressStreet1() throws InterruptedException
		{
			String Street1=SetuppageT1.ValidateCorporateAddressStreet1();
			Assert.assertEquals(Street1,"1544 Water Street","Street1 is not matching");
			}
		
		@Test(priority=20,description="Setup Page: Corporate Address Street2 Value Test")
		public void CorporateAddressStreet2() throws InterruptedException
		{
			String Street2=SetuppageT1.ValidateCorporateAddressStreet2();
			Assert.assertEquals(Street2,"","Street2 is not matching");
			}
		@Test(priority=21,description="Setup Page: Corporate Address City Value Test")
		public void CorporateAddressCity() throws InterruptedException
		{
			String City=SetuppageT1.ValidateCorporateAddresscity();
			Assert.assertEquals(City,"Kitchener","City is not matching");
			}
		@Test(priority=22,description="Setup Page: Corporate Address Country Value Test")
		public void CorporateAddressCountry() throws InterruptedException
		{
			String Country=SetuppageT1.ValidateCorporateAddressCountry();
			Assert.assertEquals(Country,"Canada","Country is not matching");
			}
		@Test(priority=23,description="Setup Page: Corporate Address State Value Test")
		public void CorporateAddressState() throws InterruptedException
		{
			String State=SetuppageT1.ValidateSiteAddressState();
			Assert.assertEquals(State,"ON","Site Address State is not matching");
		}
	  @Test(priority=24,description="Setup Page: Corporate Address Zip Code  Value Test")
		public void CorporateAddressZipCode() throws InterruptedException
		{
			String Zip=SetuppageT1.ValidateCorporateAddressZip();
			Assert.assertEquals(Zip,"N2H 5A5","Corporate Address Postal Code is not matching");
			}
		@Test(priority=25,description="Setup Page: Corporate Address Effective Date Value Test")
		public void CorporateAddressEffectiveDate() throws InterruptedException
		{
			String EffectiveDate=SetuppageT1.ValidateCorporateAddressEffectiveDate();
			Assert.assertEquals(EffectiveDate,"01/01/2015","Corporate Address Effective Date is not matching");
			}
		@Test(priority=26,description="Setup Page: Default Address Type Value Test")
		public void AddressType2() throws InterruptedException
		{
			String Type1=SetuppageT1.ValidateCorporateAddressType();
			Assert.assertEquals(Type1,"Corporate Office","Default Address Type is not matching");
			}
		
	@Test(priority=27,description="Setup Page:Address Update button Test")
		public void CorporateAddressUpdatebutton()
		{
			String Street1=SetuppageT1.ValidateUpdateButton();
			Assert.assertEquals(Street1,"UPDATE","Button name is not matching");
			}
		
		@Test(priority=28,description="Setup Page: Address Cancel button Test")
		public void CorporateAddressCancelbutton()
		{
			String Street1=SetuppageT1.ValidateCancelButton();
			Assert.assertEquals(Street1,"CANCEL","Button name is not matching");
			}
	

	 @Test(priority=29,description="Setup Page: Add New button Test")
			public void AddNewbutton()
			{
				String AN=SetuppageT1.ValidateAddNew();
				Assert.assertEquals(AN,"ADD NEW","Add New button Name is not matching");
				}
 
@Test(priority=30 ,description="Setup Page: Scheduled Start Date Value Test")
	public void ScheduledStartDate()
	{
        String ScheduledStartDate=SetuppageT1.ValidateScheduledStartDate();
		Assert.assertEquals(ScheduledStartDate,"01/01/2019","Scheduled Start Date not matched");
		}
	
	@Test(priority=31,description="Setup Page: Scheduled End Date Value Test")
	public void ScheduledEndDate()
	{
        String ScheduledEndDate=SetuppageT1.ValidateScheduledEndDate();
		Assert.assertEquals(ScheduledEndDate,"01/01/2023","Scheduled End Date not matched");
		}
	
    @Test(priority=32,description="Setup Page: Actual Start Date Value Test")
	public void ActualStartDate()
	{
        String ActualStartDate=SetuppageT1.ValidateActualStartDate();
		Assert.assertEquals(ActualStartDate,"","Actual Start Date not matched");
		}
	
	@Test(priority=33,description="Setup Page: Actual End Date Value Test")
	public void ActualEndDate()
	{
        String ActualEndDate=SetuppageT1.ValidateActualEndDate();
		Assert.assertEquals(ActualEndDate,"","Actual End Date not matched");
		}
	
	@Test(priority=34,description="Setup Page: Total Contract Amount Value Test")
	public void TotalContractAmount() throws InterruptedException
	{
        String TotalContractAmount=SetuppageT1.ValidateTotalContractAmount();
		Assert.assertEquals(TotalContractAmount,"5,000,000.00","Total Contract Amount not matched");
		}
	
	@Test(priority=35,description="Setup Page: Default Payroll Schedule Value Test")
	public void DefaultPayrollSchedule() throws InterruptedException
	{
		String PS=SetuppageT1.ValidatePayrollSchedule();
		Assert.assertEquals(PS,"Select One","Default Payroll Schedule not matched");
		}
	
	@Test(priority=36,description="Setup Page: Default Payroll End Day Value Test")
	public void DefaultPayrollEndDay() throws InterruptedException
	{
		String PED=SetuppageT1.ValidatePayrollEndDay();
		Assert.assertEquals(PED,"Sunday","Default Payroll End Day  not matched");
		}  
	
	
@DataProvider(name="getDataDDN")
	//@Factory
	public Object[][] getTestDataBase(Method m)
	{
		Object data[][]=TestUtil.getTestDataBaseline(SheetName1,m.getName());
		System.out.println(m.getName());
		return data;     	
	}
	@Test(priority=37,dataProvider="getDataDDN",description="Setup Page: Setup Dropdown Verification Test")
	public void SetupPageDropdownVerification(String DET,String G,String PS,String PED,String CP1,
			String CT,String ET,String GEN,String WOC,
			String WSC,String SD) throws InterruptedException
	{
		SetuppageT1.SetupPageDDNVerification(DET, G, PS, PED,CP1,CT,ET,GEN,WOC,WSC,SD);
		}
	
	@DataProvider(name="getDataSetup")
	//@Factory
	public Object[][] getTestData(Method m)
	{
		Object data[][]=TestUtil.getTestData(sheetName,m.getName());
		System.out.println(m.getName());
		return data;     	
	}
	@Test(priority=38,dataProvider="getDataSetup",description="Setup Page: Setup Dropdown Verification Test")
	public void SetupPagecreation(String PS,String PE,String J)
	{
		SetuppageT1.AddSetup(PS,PE,J);
		}
	
	@Test(priority=39,description="Setup Page: Job Title Page Image Verification")
		public void SetupJobTitlePageImageVerification() throws IOException, AWTException
		{
		  SetuppageT1.SetupJobTitlePageImageVerification();
			}
	
@Test(priority=40,description="Setup Page: Employee Page Image Verification")
	public void SetupEmployeePageImageVerification() throws IOException, AWTException
	{
	  SetuppageT1.SetupEmployeePageImageVerification();
		}
	
	//Subcontractor Page
	@Test(priority=41,description="Setup Page: Subcontractors:Contractors Prime Value Test")
	public void ContractorsPrime() 
	{
		String ContractorsPrime=SetuppageT1.ValidateContractorsPrime();
		Assert.assertEquals(ContractorsPrime,"New Automation Test Subcontractor11112021: 5467899","Contractor Prime value is not matching");
	}
	
	@Test(priority=42,description="Setup Page:Default Contractor Type Value Test")
	public void DefaultContractorType() 
	{
		String C=SetuppageT1.ValidateSetupDefaultContractorType();
		Assert.assertEquals(C,"Contractor","Default Contractor Type value is not matching");
	}
	 
	 @Test(priority=43,description="Setup Page:Default Ethnicity Value Test")
		public void DefaultEthnicity() 
		{
			String E=SetuppageT1.ValidateSetupDefaultEthnicity();
			Assert.assertEquals(E,"Select One","Default Ethnicity value is not matching");
		}
	 
	@Test(priority=44,description="Setup Page:Default Gender Value Test")
		public void DefaultGender() 
		{
			String G=SetuppageT1.ValidateSetupDefaultGender();
			Assert.assertEquals(G,"Select One","Default Gender value is not matching");
		}
		
 
/*@DataProvider(name="getTestData1")
	//@Factory
	public Object[][] getTestDataNew(Method m)
	{
		Object data[][]=TestUtil.getTestData(sheetName,m.getName());
		System.out.println(m.getName());
		
		return data;     	
	}
	
@Test(priority=45,dataProvider="getTestData1",description="Setup Page: Add Subcontractor")
	public void SetupAddNewSubcontractor(String PS,String PE,String J,String Ein, String name, String CN,String CT,String ET,String GE,String SD,
			String SED,String AA, String AH, 
			String WC, String WSC, 
			String NAI,String SOI,String NIGP,String SubType,String Sca) throws InterruptedException
	{
		SetuppageT1.AddNewSubcontractor1(PS, PE,J,Ein, name, CN,CT,ET,GE,SD,
				 SED,AA,  AH, 
				WC,WSC,NAI,SOI,NIGP,SubType,Sca);
	
}

		@Test(priority=46,description= "Home Page:Project Name Selection Test" )
		public void projectselection() throws InterruptedException
		{
			SetuppageT1.PageView1();
		}*/
		
	
	@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}
}
