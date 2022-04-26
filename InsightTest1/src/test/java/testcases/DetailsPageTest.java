package testcases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.TestBase;
import pages.DashboardPage;
import pages.DetailsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SubcontractorPage;
import util.TestUtil;

import org.testng.annotations.AfterMethod;
public class DetailsPageTest extends TestBase
{
	HomePage homepage;
	DashboardPage Dashboardpage;
	LoginPage Loginpage;
	DetailsPage Detailspage;
	SubcontractorPage Subcontractorpage;
	
	public DetailsPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		Loginpage=new LoginPage();
		homepage=Loginpage.Login(prop.getProperty("UserName"),prop.getProperty("Password"));
		Dashboardpage=homepage.Projectselection();
		Detailspage=Dashboardpage.DetailsPageLaunch();
		
		}
	
	
/*@Test(priority=0,description="Details Page: Project Name Value Test")
	public void ProjectName()
	{
		String ProjectName=Detailspage.ValidateProjectNameField();
		Assert.assertEquals(ProjectName,"Prev. Wage Project - All Features-new","Project Name is not matching");
		}
	
	@Test(priority=1,description="Details Page: Project Number Value Test" )
	public void ProjectNumber()
	{
        String ProjectNumber=Detailspage.ValidateNumberField();
		Assert.assertEquals(ProjectNumber,"Snow-1","Project Number not matched");

		}
	@Test(priority=2,description="Details Page:Ethnicity Value Test")
	public void ProjectEthnicity()
	{
        String Ethnicity=Detailspage.ValidateEthnicityField();
		Assert.assertEquals(Ethnicity,"Hispanic or Latino","Ethnicity not matched");
		}
	
	@Test(priority=3,description="Details Page: Gender Value Test")
	public void ProjectGender()
	{
        String ProjectGender=Detailspage.ValidateGenderField();
		Assert.assertEquals(ProjectGender,"Male","Gender not matched");
		}
	
	@Test(priority=23 ,description="Details Page: Scheduled Start Date Value Test")
	public void ScheduledStartDate()
	{
        String ScheduledStartDate=Detailspage.ValidateScheduledStartDate();
		Assert.assertEquals(ScheduledStartDate,"01/01/2019","Scheduled Start Date not matched");
		}
	
	@Test(priority=24,description="Details Page: Scheduled End Date Value Test")
	public void ScheduledEndDate()
	{
        String ScheduledEndDate=Detailspage.ValidateScheduledEndDate();
		Assert.assertEquals(ScheduledEndDate,"01/30/2023","Scheduled End Date not matched");
		}
	
    @Test(priority=25,description="Details Page: Actual Start Date Value Test")
	public void ActualStartDate()
	{
        String ActualStartDate=Detailspage.ValidateActualStartDate();
		Assert.assertEquals(ActualStartDate,"01/02/2019","Actual Start Date not matched");
		}
	
@Test(priority=26,description="Details Page: Actual End Date Value Test")
	public void ActualEndDate()
	{
        String ActualEndDate=Detailspage.ValidateActualEndDate();
		Assert.assertEquals(ActualEndDate,"","Actual End Date not matched");
		}
	
	@Test(priority=27,description="Details Page: Total Contract Amount Value Test")
	public void TotalContractAmount()
	{
        String TotalContractAmount=Detailspage.ValidateTotalContractAmount();
		Assert.assertEquals(TotalContractAmount,"500,000.00","Total Contract Amount not matched");
		}
	
	@Test(priority=28,description="Details Page: Total Contract Hours Value Test")
	public void TotalContractHours()
	{
		String TotalContractHours=Detailspage.ValidateTotalContractHours();
		Assert.assertEquals(TotalContractHours,"50","Total Contract Hours not matched");
		}
	
	@Test(priority=29,description="Details Page: Go To Project Setup Wizard link Name Test")
	public void SetupLink()
	{
		String SetupLink=Detailspage.ValidateSetupLink();
		Assert.assertEquals(SetupLink,"GO TO PROJECT SETUP WIZARD","Link not matched");
}
	@Test(priority=30,description="Cancel button Name Test")
	public void Cancelbutton()
	{
			String Cancel=Detailspage.ValidateCancelbutton();
			Assert.assertEquals(Cancel,"CANCEL","Button Text not matched");
		}		
	@Test(priority=31,description="Details Page: Save button Name Test")
	public void Savebutton()
	{
			String Save=Detailspage.ValidateSavebutton();
			Assert.assertEquals(Save,"SAVE","Button Text not matched");
		}		
	//Configuration Page
	@Test(priority=32,description="Details Page: Configuration Tab Name Test")
	public void ConfigurationTab()
	{
		String ConfigurationTab=Detailspage.ValidateConfigurationTab();
		Assert.assertEquals(ConfigurationTab,"CONFIGURATION","Configuration Tab name is not matched");
	}*/
	
	@Test(priority=33,description="Configuration Page: Project Report Interval Value Test")
	public void ProjectReportInterval()
	{
		
		String ProjectReportInterval=Detailspage.ValidateProjectReportInterval();
		Assert.assertEquals(ProjectReportInterval,"Monthly","Value not matched");
	
	}
	
	@Test(priority=34,description="Configuration Page: Project Report Date Value Test")
	public void ProjectReportDate()
	{
		
		String ProjectReportDate=Detailspage.ValidateProjectReportDate();
		Assert.assertEquals(ProjectReportDate,"1","Value not matched");
	}
	
	/*@Test(priority=35,description="Configuration Page: Fiscal Year End Month Value Test")
	public void FiscalYearEndMonth()
	{
		
		String FiscalYearEndMonth=Detailspage.ValidateFiscalYearEndMonth();
		Assert.assertEquals(FiscalYearEndMonth,"December","Value not matched");
	}
	@Test(priority=36,description="Configuration Page: Fiscal Year End Day Value Test")
	public void FiscalYearEndDay()
	{
		
		String FiscalYearEndDay=Detailspage.ValidateFiscalYearEndDay();
		Assert.assertEquals(FiscalYearEndDay,"31","Value not matched");
	}
	
	@Test(priority=37,description="Configuration Page: Man Hours Reporting Interval Value Test")
	public void ManHoursReportingInterval()
	{
		
		String ManHoursReportingInterval=Detailspage.ValidateManHoursReportingInterval();
		Assert.assertEquals(ManHoursReportingInterval,"Weekly","Value not matched");
	}
	
	@Test(priority=38,description="Configuration Page: Man Hours Reporting Day Value Test")
	public void ManHoursReportingDay()
	{
		
		String ManHoursReportingDay=Detailspage.ValidateManHoursReportingDay();
		Assert.assertEquals(ManHoursReportingDay,"Friday","Value not matched");
	}
	@Test(priority=39,description="Configuration Page: Man Hours Reporting Pre Due Window Value Test")
	public void ManHoursReportingPreDueWindow()
	{
		
		String ValidateManHoursReportingPreDueWindow=Detailspage.ValidateManHoursReportingPreDueWindow();
		Assert.assertEquals(ValidateManHoursReportingPreDueWindow,"6","Value not matched");
	
	}
	
	@Test(priority=40,description="Configuration Page: Man Hours Reporting Post Due Window Value Test")
	public void ManHoursReportingPostDueWindow()
	{
		
		String ManHoursReportingPostDueWindow=Detailspage.ValidateManHoursReportingPostDueWindow();
		Assert.assertEquals(ManHoursReportingPostDueWindow,"14","Value not matched");
	
	}
	
	@Test(priority=41,description="Configuration Page: Project Scalar Value Test")
	public void ProjectScalar()
	{
		String ProjectScalar=Detailspage.ValidateProjectScalar();
		Assert.assertEquals(ProjectScalar,"45","Value not matched");
	
	}
	
	@Test(priority=42,description="Configuration Page: Supported Entity Types Value Test")
	public void SupportedEntityTypes() 
	{
		
			Detailspage.ValidateSupportedEntityTypes();	
			}
	
   @Test(priority=43,description="Configuration Page: Test Project Lookup Value Test")
	public void TestProjectLookup() throws InterruptedException
	{
		String ProjectLookup=Detailspage.ValidateTestProjectLookup();
		Assert.assertEquals(ProjectLookup,"Vertical Construction","Value not matched");
	}
	
	 @Test(priority=44,description="Configuration Page: Subcontractors Page Selection Test")
	public void SubcontractorPageLaunch() {
		
		Subcontractorpage=Detailspage.ValidateSubcontractorPageLaunch();
		}
	@DataProvider(name="getDetailsPageData")
	public Object[][] getTestDataBaseline2(Method m)
	{
		Object data[][]=TestUtil.getTestDataBaseline(SheetName1,m.getName());
		System.out.println(m.getName());
		return data;        	
	}
	@Test(priority=45,dataProvider="getDetailsPageData",description="Details Page: Dropdown Value Test")
	public void DetailsPageDropdownVerification(String ET,String G,String EA1,String C1,String C2,
			String AT,String PRI,String PRD,String FEM,String MRI,
			String MRD,String ENTI,String TPL) {
		
		Detailspage.DetailsPageDDNVerification(ET, G,EA1,C1,C2,AT,PRI,PRD,FEM,MRI,MRD,ENTI,TPL);
		}
@Test(priority=46,description="Details Page: Certification view Image Verification")
	public void CertificationImageVerification() throws IOException {
		
		Detailspage.DetailsCertifcationImageVerification();
		}
	
	@Test(priority=47,description="Details Page: Labor Standard view Image Verification")
	public void LaborStandardImageVerification() throws IOException {
		
		Detailspage.DetailsLaborStandardImageVerification();
		}
	
	@Test(priority=48,description="Details Page: Track Commitments view Image Verification")
	public void TrackCommitmentsImageVerification() throws IOException {
		
		Detailspage.DetailsTrackCommitmentsImageVerification();
		}
	*/
@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}
}
