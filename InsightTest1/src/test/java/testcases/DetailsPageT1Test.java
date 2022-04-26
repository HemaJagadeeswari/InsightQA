package testcases;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
import pages.SubcontractorPage;
import util.TestUtil;

public class DetailsPageT1Test extends TestBase{
	HomePageT1 homepageT1;
	DashboardPageT1 DashboardpageT1;
	LoginPageT1 LoginpageT1;
	SetupPageT1 SetuppageT1;
	DetailsPageT1 DetailspageT1;
	//SubcontractorPage Subcontractorpage;
	
	public DetailsPageT1Test()
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
		}
	
/*	@Test(priority=0,description="Details Page T1: Project Name Value Test")
	public void ProjectName()
	{
		String ProjectName=DetailspageT1.ValidateProjectNameField();
		Assert.assertEquals(ProjectName,"Prev. Wage Project - All Features-new","Project Name is not matching");
		}
	
	@Test(priority=1,description="Details Page T1: Project Number Value Test")
	public void ProjectNumber()
	{
        String ProjectNumber=DetailspageT1.ValidateNumberField();
		Assert.assertEquals(ProjectNumber,"5467899","Project Number not matched");

		}
	@Test(priority=2,description="Details Page T1: Ethnicity Value Test")
	public void OwnerEthnicity()
	{
		String DefaultEthnicity=DetailspageT1.ValidateEthnicityField();
		Assert.assertEquals(DefaultEthnicity,"Black or African American","Default Ethnicity not Matching");
	}
	
	@Test(priority=3,description="Details Page T1: Gender Value Test")
	public void OwnerGender()
	{
		String DefaultGender=DetailspageT1.ValidateGenderField();
		Assert.assertEquals(DefaultGender,"Female","Default Gender not Matching");
	}
	
	@Test(priority=4,description="Details Page T1: Site Address Street1 Value Test")
	public void SiteAddressStreet1()
	{
		String Street1=DetailspageT1.ValidateSiteAddressStreet1();
		Assert.assertEquals(Street1,"2121  Hidden Valley Road","Street1 is not matching");
		}
	
	@Test(priority=5,description="Details Page T1: Site Address Street2 Value Test")
	public void SiteAddressStreet2()
	{
		String Street2=DetailspageT1.ValidateSiteAddressStreet2();
		Assert.assertEquals(Street2,"","Street2 is not matching");
		}
	@Test(priority=6,description="Details Page T1: Site Address City Value Test")
	public void SiteAddressCity()
	{
		String City=DetailspageT1.ValidateSiteAddresscity();
		Assert.assertEquals(City,"lebanan","City is not matching");
		}
	@Test(priority=7,description="Details Page T1: Site Address Country Value Test")
	public void SiteAddressCountry()
	{
		String Country=DetailspageT1.ValidateSiteAddressCountry();
		Assert.assertEquals(Country,"United States","Country is not matching");
		}
	@Test(priority=8,description="Details Page: Site Address State Value Test")
	public void SiteAddressState()
	{
		String State=DetailspageT1.ValidateSiteAddressState();
		Assert.assertEquals(State,"PA","Site Address State is not matching");
		}
	@Test(priority=9,description="Details Page: Site Address Zip Code  Value Test")
	public void SiteAddressZipCode()
	{
		String Zip=DetailspageT1.ValidateSiteAddressZip();
		Assert.assertEquals(Zip,"17042","Site Address Zip Code is not matching");
		}
	@Test(priority=10,description="Details Page: Site Address Effective Date Value Test")
	public void SiteAddressEffectiveDate()
	{
		String EffectiveDate=DetailspageT1.ValidateSiteAddressEffectiveDate();
		Assert.assertEquals(EffectiveDate,"01/01/2005","Site Address Effective Date is not matching");
		}
	@Test(priority=11,description="Details Page: Default Address Type Value Test")
	public void AddressType1()
	{
		String Type1=DetailspageT1.ValidateSiteAddressType();
		Assert.assertEquals(Type1,"Site Office","Default Address Type is not matching");
		}
	
	@Test(priority=12,description="Details Page T1: Corporate Address Street1 Value Test")
		public void CorporateAddressStreet1()
		{
			String Street1=DetailspageT1.ValidateCorporateAddressStreet1();
			Assert.assertEquals(Street1,"1544 Water Street","Street1 is not matching");
			}
		
		@Test(priority=13,description="Details Page T1: Corporate Address Street2 Value Test")
		public void CorporateAddressStreet2()
		{
			String Street2=DetailspageT1.ValidateCorporateAddressStreet2();
			Assert.assertEquals(Street2,"","Street2 is not matching");
			}
		@Test(priority=14,description="Details Page T1: Corporate Address City Value Test")
		public void CorporateAddressCity()
		{
			String City=DetailspageT1.ValidateCorporateAddresscity();
			Assert.assertEquals(City,"Kitchener","City is not matching");
			}*/
		@Test(priority=15,description="Details Page T1: Corporate Address Country Value Test")
		public void CorporateAddressCountry()
		{
			String Country=DetailspageT1.ValidateCorporateAddressCountry();
			Assert.assertEquals(Country,"Canada","Country is not matching");
			}
		@Test(priority=16,description="Details Page T1: Corporate Address State Value Test")
		public void CorporateAddressState()
		{
			String State=DetailspageT1.ValidatecCorporateAddressState();
			Assert.assertEquals(State,"ON","Corporate Address State is not matching");
			}
	 @Test(priority=17,description="Details Page T1: Corporate Address Zip Code  Value Test")
		public void CorporateAddressZipCode()
		{
			String Zip=DetailspageT1.ValidateCorporateAddressZip();
			Assert.assertEquals(Zip,"N2H 5A5","Corporate Address Zip Code is not matching");
			}
		@Test(priority=18,description="Details Page T1: Corporate Address Effective Date Value Test")
		public void CorporateAddressEffectiveDate()
		{
			String EffectiveDate=DetailspageT1.ValidateCorporateAddressEffectiveDate();
			Assert.assertEquals(EffectiveDate,"01/01/2015","Corporate Address Effective Date is not matching");
			}
		@Test(priority=19,description="Details Page T1: Default Address Type Value Test")
		public void AddressType2()
		{
			String Type1=DetailspageT1.ValidateCorporateAddressType();
			Assert.assertEquals(Type1,"Corporate Office","Default Address Type is not matching");
			}
		
		@Test(priority=20,description="Details Page T1:Address Update button Test")
		public void CorporateAddressUpdatebutton()
		{
			String Street1=DetailspageT1.ValidateUpdateButton();
			Assert.assertEquals(Street1,"UPDATE","Button name is not matching");
			}
		
		@Test(priority=21,description="Details Page T1: Address Cancel button Test")
		public void CorporateAddressCancelbutton()
		{
			String Street1=DetailspageT1.ValidateCancelButton();
			Assert.assertEquals(Street1,"CANCEL","Button name is not matching");
			}
	

	 @Test(priority=22,description="Details Page: Add New button Test")
			public void AddNewbutton()
			{
				String AN=DetailspageT1.ValidateAddNew();
				Assert.assertEquals(AN,"ADD NEW","Add New button Name is not matching");
				}

	
 
	@Test(priority=23, description="Details Page T1: Scheduled Start Date Value Test")
	public void ScheduledStartDate()
	{
        String ScheduledStartDate=DetailspageT1.ValidateScheduledStartDate();
		Assert.assertEquals(ScheduledStartDate,"01/01/2019","Scheduled Start Date not matched");
		}
	
	@Test(priority=24,description="Details Page T1: Scheduled End Date Value Test" )
	public void ScheduledEndDate()
	{
        String ScheduledEndDate=DetailspageT1.ValidateScheduledEndDate();
		Assert.assertEquals(ScheduledEndDate,"01/01/2023","Scheduled End Date not matched");
		}
	
    @Test(priority=25,description="Details Page T1: Actual Start Date Value Test")
	public void ActualStartDate()
	{
        String ActualStartDate=DetailspageT1.ValidateActualStartDate();
		Assert.assertEquals(ActualStartDate,"01/02/2019","Actual Start Date not matched");
		}
	
	@Test(priority=26,description="Details Page T1: Actual End Date Value Test")
	public void ActualEndDate()
	{
        String ActualEndDate=DetailspageT1.ValidateActualEndDate();
		Assert.assertEquals(ActualEndDate,"","Actual End Date not matched");
		}
	
	@Test(priority=27, description="Details Page T1: Total Contract Amount Value Test")
	public void TotalContractAmount()
	{
        String TotalContractAmount=DetailspageT1.ValidateTotalContractAmount();
		Assert.assertEquals(TotalContractAmount,"5,000,000.00","Total Contract Amount not matched");
		}
	
	@Test(priority=28,description="Details Page T1: Total Contract Amount Value Test" )
	public void TotalContractHours()
	{
		String TotalContractHours=DetailspageT1.ValidateTotalContractHours();
		Assert.assertEquals(TotalContractHours,"50","Total Contract Hours not matched");
		}
		
	@Test(priority=29, description="Details Page T1:  Authorize GC to Access Date Toogle Test")
		public void ValidateAuthorizeToggle()
		{
			DetailspageT1.ValidateAuthorizeToggle();
		}
	
	
	@Test(priority=30, description="Details Page T1: Go To Project Setup Wizard link Name Test")
	public void SetupLink()
	{
		String SetupLink=DetailspageT1.ValidateSetupLink();
		Assert.assertEquals(SetupLink,"GO TO PROJECT SETUP WIZARD","Link not matched");
}
	@Test(priority=31, description="Details Page T1: Cancel button Name Test")
	public void Cancelbutton()
	{
			String Cancel=DetailspageT1.ValidateCancelbutton();
			Assert.assertEquals(Cancel,"CANCEL","Button Text not matched");
		}		
	@Test(priority=32, description="Details Page T1: Save button Name Test")
	public void Savebutton()
	{
			String Save=DetailspageT1.ValidateSavebutton();
			Assert.assertEquals(Save,"SAVE","Button Text not matched");
		}	
	
	//Configuration
	@Test(priority=33, description="Details Page T1: Configuration Tab Name Test")
	public void ValidateConfigurationTab()
	{
		String CT=DetailspageT1.ValidateConfigurationTab();
		Assert.assertEquals(CT,"CONFIGURATION","Configuration Tab Name not matching");
	}
	
	@Test(priority=34, description="Details Page T1: Payroll End Day Value Test")
public void PayrollSchedulefield()
	{
		String SD=DetailspageT1.ValidatePayrollSchedulefield();
		Assert.assertEquals(SD,"Weekly","Default Selection not matched");
	}

@Test(priority=35, description="Details Page T1: Payroll End Day Value Test")
	public void PayrollEndDay()
	{
		String ED=DetailspageT1.ValidatePayrollEndDay();
		Assert.assertEquals(ED,"Sunday","Default Selection not matched");
	}


@Test(priority=36, description="Details Page T1: Payroll Schedule Field Value Test")

public void WorkCodePreselection()
{
DetailspageT1.ValidatePreselectedWorkCodes();
}

		
@Test(priority=37, description="Details Page T1: Certification Tab Name Test")
		public void ValidateCertificationTab()
		{
			String CT=DetailspageT1.ValidateCertificateTab();
			Assert.assertEquals(CT,"CERTIFICATION","Certification Tab Name not matching");
		}
		
@Test(priority=38,description="Details Page T1: Certification view Image Verification")
public void CertificationImageVerification() throws IOException {
	
	DetailspageT1.DetailsCertifcationImageVerification();
	}
	
	@Test(priority=38, description="Details Page T1: Labor Standard Tab Name Test")
		public void ValidateLaborStandardTab()
		{
			String LS=DetailspageT1.ValidateLaborStandardTab();
			Assert.assertEquals(LS,"LABOR STANDARD","Labor Standard Tab Name not matching");
		}

@Test(priority=39,description="Details Page T1: Labor Standard view Image Verification")
public void LaborStandardImageVerification() throws IOException {
	
	DetailspageT1.DetailsLaborStandardImageVerification();
	}

@DataProvider(name="getDetailsPageDataNew")
public Object[][] getTestDataBaseline2(Method m)
{
	Object data[][]=TestUtil.getTestDataBaseline(SheetName1,m.getName());
	System.out.println(m.getName());
	return data;        	
}
@Test(priority=40,dataProvider="getDetailsPageDataNew",description="Details Page T1: Dropdown Value Test")
public void DetailsPageT1DropdownVerification(String ET,String G,String C1,String C2,
		String AT,String PS,String PD) {
	
	DetailspageT1.DetailsPageDDNVerification(ET,G,C1,C2,AT,PS,PD);
	}

@Test(priority=41,description="Details Page T1: Employee Management Page Launch")
public void EmployeeManagementPage() {
	
	DetailspageT1.EMlaunch();
	}
	
	@AfterMethod
	public void tearDown()
	{
		Driver.quit();
	}
}
