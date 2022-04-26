package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;

public class DetailsPage extends TestBase{
	@FindBy(id="name")
	WebElement ProjectName;
	
	@FindBy(id="number")
	WebElement Number;
	
	@FindBy(id="mui-component-select-ownerEthnicityId")
	WebElement Ethnicity;
	
	@FindBy(id="mui-component-select-ownerGenderId")
	WebElement Gender;
	
	@FindBy(xpath="//*[contains(text(),'Address History')]//following::button[1]")
	WebElement SiteAddressEdit;
	
	@FindBy(xpath="//*[contains(text(),'Existing Addresses')]//following::div[1]")
	WebElement ExistingAddress;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']//following::li[5]//p")
	WebElement SiteAddress;
	
	@FindBy(xpath="//*[contains(text(),'Address History')]//following::button[3]")
	WebElement CorporateAddressEdit;
	
	@FindBy(xpath="//*[contains(text(),'Existing Addresses')]//following::div[1]")
	WebElement ExistingCorAddress;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']//following::li[5]//p")
	WebElement CorporateAddress;
	
	@FindBy(id="street1")
	WebElement Street1;
	
	@FindBy(id="street2")
	WebElement Street2;
	
	@FindBy(id="city")
	WebElement City;
	
	@FindBy(id="mui-component-select-country")
	WebElement Country;
	
	@FindBy(id="mui-component-select-state")
	WebElement State;
	
	@FindBy(id="zip")
	WebElement Zip;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement EffectiveDate;
	
	@FindBy(xpath="//input[@id='type']//preceding::div[1]")
	WebElement AddressType;
	
	
	@FindBy(xpath="//div[@id='mui-component-select-type']//following::button[1]//span[1]")
	WebElement Updatebutton;
	
	@FindBy(xpath="//div[@id='mui-component-select-type']//following::button[2]//span[1]")
	WebElement AddressCancelbutton;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[1]")
	WebElement AddressCancel;
	
	@FindBy(xpath="//*[contains(text(),'Add New')]")
	WebElement AddNew;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']")
	WebElement ExistingAddresses;
	
	
	@FindBy(xpath="//*[contains(text(),'Scheduled Start')]//following::input[1]")
	WebElement ScheduledStart;
	
	@FindBy(xpath="//*[contains(text(),'Scheduled End')]//following::input[1]")
	WebElement ScheduledEnd;
	
	@FindBy(xpath="//*[contains(text(),'Actual Start')]//following::input[1]")
	WebElement ActualStart;
	
	@FindBy(xpath="//*[contains(text(),'Actual End')]//following::input[1]")
	WebElement ActualEnd;
	
	@FindBy(id="contractAmount")
	WebElement ContractAmount;
	
	@FindBy(id="contractHours")
	WebElement ContractHours;
	
	@FindBy(xpath="//*[contains(text(),'Go to project setup wizard')]")
	WebElement Link;
	
	@FindBy(xpath="//*[contains(text(),'Go to project setup wizard')]//following::button[1]")
	WebElement Cancelbutton;
	
	@FindBy(xpath="//*[contains(text(),'Go to project setup wizard')]//following::button[2]")
	WebElement Savebutton;
	
	@FindBy(xpath="//*[contains(text(),'Configuration')]")
	WebElement ConfigTab;

	@FindBy(xpath="//input[@id='config.projectReportingInterval']//preceding::p[1]")
	WebElement ProjectReportInterval;
	
	@FindBy(xpath="//input[@name='config.projectReportingDay']//preceding::p[1]")
	WebElement ProjectReportDate;
	
	@FindBy(xpath="//div[@id='mui-component-select-config.fiscalYrEndMonth']//child::p")
	WebElement FiscalYearEndMonth;
	
	@FindBy(id="config.fiscalYrEndDay")
	WebElement FiscalYearEndDay;
	
	@FindBy(xpath="//div[@id='mui-component-select-config.manhourReportingInterval']//child::p")
	WebElement ManhourReportingInterval;
	
	@FindBy(xpath="//div[@id='mui-component-select-config.manhourReportingDay']//child::p")
	WebElement ManhourReportingDay;
	
	@FindBy(id="config.manhourReportingPreDueWindow")
	WebElement ManhourReportingPreDueWindow;
	
	
	@FindBy(id="config.manhourReportingPostDueWindow")
	WebElement ManhourReportingPostDueWindow; 
	
	@FindBy(id="mui-component-select-10010")
	WebElement TestProjectLookup;
	
	@FindBy(xpath="//input[@placeholder='Test Scalar 2']")
	WebElement Scalar; 
	
	@FindBy(xpath="//*[contains(text(),'Supported Entity Types')]//following::div[1]")
	WebElement EntityType;
	
	@FindBy(xpath="//*[contains(text(),'Certification')]")
	WebElement Certification;
	
	@FindBy(xpath="//*[contains(text(),'Labor Standard')]")
	WebElement LaborStandard;
	
	@FindBy(xpath="//*[contains(text(),'Track Commitments')]")
	WebElement TrackCommitments;
	
	@FindBy(xpath="(//*[contains(text(),'Subcontractors')])[1]")
	WebElement SubcontractorPageLaunch;
	
	public DetailsPage()
	{
		PageFactory.initElements(Driver,this);
		
	}
	
	public String ValidateProjectNameField()
	{
		return ProjectName.getAttribute("value");
	}
	
	public String ValidateNumberField()
	{
		return Number.getAttribute("value");
	}
	
	public String ValidateEthnicityField()
	{
		return Ethnicity.getText();
	}
	
	public String ValidateGenderField()
	{
		return Gender.getText();
	}
	
	
	public String ValidateSiteAddressStreet1()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return Street1.getAttribute("value");
	}
	
	public String ValidateSiteAddressStreet2()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return Street2.getAttribute("value");
	}
	
	public String ValidateSiteAddresscity()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return City.getAttribute("value");
	}
	
	public String ValidateSiteAddressCountry()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		Country.click();
		//SiteAddressEdit.click();
		/* List<WebElement> country=Driver.findElements(By.xpath("//div[@id='menu-country']//following::ul//li"));
		 System.out.println(country.size());
			for(int l=0;l<=country.size()-1;l++)
			{
				System.out.println(country.get(l).getText());
	}*/
			return Country.getText();
	}
	
	public String ValidateSiteAddressState()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		State.click();
		/*List<WebElement> state=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
		 System.out.println(state.size());
			for(int l=0;l<=state.size()-1;l++)
			{
				System.out.println(state.get(l).getText());
	}*/
		
		return State.getText();
	}
	
	public String ValidateSiteAddressZip()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return Zip.getAttribute("value");
	}
	
	public String ValidateSiteAddressEffectiveDate()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return EffectiveDate.getAttribute("value");
	}
	
	public String ValidateSiteAddressType()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		AddressType.click();
		
		/*List<WebElement> type=Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
		 System.out.println(type.size());
			for(int l=0;l<=type.size()-1;l++)
			{
				System.out.println(type.get(l).getText());
	}*/
		return AddressType.getText();
	}
	

	
	public String ValidateCorporateAddressStreet1()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return Street1.getAttribute("value");
	}
	
	public String ValidateCorporateAddressStreet2()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return Street2.getAttribute("value");
	}
	
	public String ValidateCorporateAddresscity()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return City.getAttribute("value");
	}
	
	public String ValidateCorporateAddressCountry()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		Country.click();
		//SiteAddressEdit.click();
		 /*List<WebElement> country=Driver.findElements(By.xpath("//div[@id='menu-country']//following::ul//li"));
		 System.out.println(country.size());
			for(int l=0;l<=country.size()-1;l++)
			{
				System.out.println(country.get(l).getText());
	}*/
			return Country.getText();
	}
	
	public String ValidatecCorporateAddressState()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		State.click();
		/*List<WebElement> state=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
		 System.out.println(state.size());
			for(int l=0;l<=state.size()-1;l++)
			{
				System.out.println(state.get(l).getText());
	}*/
		
		return State.getAttribute("value");
	}
	
	public String ValidateCorporateAddressZip()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return Zip.getAttribute("value");
	}
	
	public String ValidateCorporateAddressEffectiveDate()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return EffectiveDate.getAttribute("value");
	}
	
	public String ValidateCorporateAddressType()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		AddressType.click();
		
		/*List<WebElement> type=Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
		 System.out.println(type.size());
			for(int l=0;l<=type.size()-1;l++)
			{
				System.out.println(type.get(l).getText());
	}*/
		return AddressType.getText();
	}
	
	public String ValidateAddNew()
	{
		return AddNew.getText();
	}
	
	public String ValidateUpdateButton()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		return Updatebutton.getText();
		
	}
	
	public String ValidateCancelButton()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		return AddressCancelbutton.getText();
		
	}
	
	public String ValidateScheduledStartDate()
	{
		return ScheduledStart.getAttribute("value");
	}
	
	public String ValidateScheduledEndDate()
	{
		return ScheduledEnd.getAttribute("value");
	}
	
	public String ValidateActualStartDate()
	{
		ActualStart.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		ActualStart.sendKeys("01/02/2019");
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Savebutton);
		return ActualStart.getAttribute("value");	
	}
	
	public String ValidateActualEndDate()
	{
		return ActualEnd.getAttribute("value");
	}
	
	
	public String ValidateTotalContractAmount()
	{
		return ContractAmount.getAttribute("value");
	}
	
	public String ValidateTotalContractHours()
	{
		return ContractHours.getAttribute("value");
	}
	
	public String ValidateSetupLink()
	{
		return Link.getText();
	}
	
	public String ValidateCancelbutton()
	{
		ActualStart.click();
		ActualStart.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		ActualStart.sendKeys("01/02/2019");
		JavascriptExecutor executor1 = (JavascriptExecutor)Driver;
		executor1.executeScript("arguments[0].click();", Cancelbutton);	
		WebElement D=Driver.findElement(By.xpath("//*[contains(text(),'Go to project setup wizard')]//following::button[1]//child::span"));
		return D.getText();
		
	}
	
	public String ValidateSavebutton()
	{
		ActualStart.click();
		ActualStart.sendKeys("01/02/2019");
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Savebutton);	
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Go to project setup wizard')]//following::button[2]//child::span"));
		return S.getText();
	}
	
	
	//Configuration Page
	public String ValidateConfigurationTab()
	{
		ConfigTab.click();
		return ConfigTab.getText();
	
	
	}
	public String ValidateProjectReportInterval()
	{
		ConfigTab.click();
		return ProjectReportInterval.getText();
	
	}
	
	public String ValidateProjectReportDate()
	{
		ConfigTab.click();
		return ProjectReportDate.getText();
	
	}
	
	public String ValidateFiscalYearEndMonth()
	{
		ConfigTab.click();
		return FiscalYearEndMonth.getText();
	
	}
	
	public String ValidateFiscalYearEndDay()
	{
		ConfigTab.click();
		return FiscalYearEndDay.getAttribute("value");
	
	}
	public String ValidateManHoursReportingInterval()
	{
		
		ConfigTab.click();
		return ManhourReportingInterval.getText();
	
	}
	public String ValidateManHoursReportingDay()
	{
		ConfigTab.click();
		return ManhourReportingDay.getText();
	
	}
	public String ValidateManHoursReportingPreDueWindow()
	{
		ConfigTab.click();
		return ManhourReportingPreDueWindow.getAttribute("value");
	
	}
	public String ValidateManHoursReportingPostDueWindow()
	{
		ConfigTab.click();
		return ManhourReportingPostDueWindow.getAttribute("value");
	
	}
	
	public String ValidateTestProjectLookup() throws InterruptedException
	{
		ConfigTab.click();
		Thread.sleep(4000);
		return TestProjectLookup.getText();
	}
	
	public String ValidateProjectScalar()
	{
		ConfigTab.click();
		return Scalar.getAttribute("value");
	
	}
	
public void ValidateSupportedEntityTypes() {
	ConfigTab.click();
	EntityType.click();
		/*List<WebElement> list= Driver.findElements(By.xpath("//*[contains(text(),'Supported Entity Types')]//following::div[1]//ul//li/p"));
		System.out.println(list.size());
		try
		{
		for(int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
				
		}
		}
		catch(Exception E)
		{
			System.out.println(E);
		}*/
}

public void DetailsPageDDNVerification(String ET,String G,String EA1,String C1,String C2,String ADT,
		String PRI,String PRD,String FEM,String MRI,String MRD, String ENTI,String TPL) 
{
	//,
	try {
		 
	Ethnicity.click();
	   Driver.navigate().refresh();
		Ethnicity.click();  
	WebDriverWait wait = new WebDriverWait(Driver, 30);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'White - ')]")));
	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	List<WebElement> E= Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']//following::ul[3]//li"));
	
	System.out.println(E.size());
	String[] arr = ET.split("!"); 
	   boolean strFlag;
    for(int i=0;i<E.size();i++)
	{
    	//int count=0;
    	strFlag = false;
    	int count=0;
    	for (String L : arr) 
		   {
    	//System.out.println(Pro); 
	
		
		  if(E.get(i).getText().equals(L))
		  {
			  System.out.println("Ethnicity value:"+E.get(i).getText());
			  strFlag=true;
			  count=count+1;
			  if(count==12) 
				{
					 System.out.println("Ethnicity value: Matches");
				}
			 break; 
			 
		  }
		   
		   }
    	if(!strFlag) {
    		System.out.println("Ethnicity value:"+ E.get(i).getText());
    		System.out.println("Ethnicity value: Not Matches");
    	}
		   
	
	}
    //Gender
    Actions action = new Actions(Driver);
    action.sendKeys(Keys.ESCAPE).build().perform();
    Gender.click();
    /*WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-ownerGenderId']"));
		wait1.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();*/
	  
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	List<WebElement> GE= Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerGenderId']//following::ul[3]//li"));
	System.out.println(GE.size());
	String[] arr1 = G.split("!"); 
	 boolean strFlag1; 
	 int count1=0;
    for(int i=0;i<GE.size();i++)
	{
    	strFlag1 = false;
    	for (String OG : arr1) 
		   {
    	//System.out.println(Pro); 
		//System.out.println("Gender value:"+GE.get(i).getText());
  if(GE.get(i).getText().equals(OG))
  {
	  Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		  System.out.println("Gender value:"+GE.get(i).getText());
		  strFlag1=true;
		  count1=count1+1;
		  if(count1==4) 
			{
				 System.out.println("Gender value: Matches");
			}
		 break;
	  }
	 
	   }
	
	if(!strFlag1) 
	{
		System.out.println("Gender value:"+ GE.get(i).getText());
		System.out.println("Gender value:Not Matches");
	}
	}
	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Actions AI=new Actions(Driver);
	AI.moveToElement(AddNew).build();
	AI.click(AddNew).perform();
	AddNew.click();
	ExistingAddresses.click();
List<WebElement> EA= Driver.findElements(By.xpath("//div[@id='mui-component-select-addr']//following::ul[2]//li"));
System.out.println(EA.size());
String[] a = EA1.split("!"); 
 boolean s; 
 int c=0;
for(int i=0;i<EA.size();i++)
{
	s = false;
	for (String e : a) 
	   {
	//System.out.println(Pro); 
	//System.out.println("Gender value:"+GE.get(i).getText());
if(EA.get(i).getText().equals(e))
{
  Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	  System.out.println("Existing Address value:"+EA.get(i).getText());
	  s=true;
	  c=c+1;
	  if(c==2) 
		{
			 System.out.println("Existing Address value: Matches");
		}
	 break;
  }
 
   }

if(!s) 
{
	System.out.println("Existing Address value:"+ EA.get(i).getText());
	System.out.println("Existing Address value:Not Matches");
}
}
Actions action1 = new Actions(Driver);
action1.sendKeys(Keys.ESCAPE).build().perform();
Country.click();
List<WebElement> CO= Driver.findElements(By.xpath("//div[@id='mui-component-select-country']//following::ul[2]//li"));
System.out.println(CO.size());
String[] a1 = C1.split("!"); 
boolean s1; 
int c1=0;
for(int i=0;i<CO.size();i++)
{
s1 = false;
for (String e1 : a1) 
   {
//System.out.println(Pro); 
//System.out.println("Gender value:"+GE.get(i).getText());
if(CO.get(i).getText().equals(e1))
{
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
  System.out.println("Country value:"+CO.get(i).getText());
  s1=true;
  c1=c1+1;
  if(c1==3) 
	{
		 System.out.println("Country value: Matches");
	}
 break;
}

}

if(!s1) 
{
System.out.println("Country value:"+ CO.get(i).getText());
System.out.println("Country value:Not Matches");
}
}
Actions action2 = new Actions(Driver);
action2.sendKeys(Keys.ESCAPE).build().perform();
State.click();
List<WebElement> ST= Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
System.out.println(ST.size());
String[] a2 = C2.split("!"); 
boolean s2; 
int c2=0;
for(int i=0;i<ST.size();i++)
{
s2 = false;
for (String e2 : a2) 
   {
//System.out.println(Pro); 
//System.out.println("Gender value:"+GE.get(i).getText());
if(ST.get(i).getText().equals(e2))
{
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
  System.out.println("State value:"+ST.get(i).getText());
  s2=true;
  c2=c2+1;
  if(c2==56) 
	{
		 System.out.println("State value: Matches");
	}
 break;
}

}

if(!s2) 
{
System.out.println("State value:"+ ST.get(i).getText());
System.out.println("State value:Not Matches");
}
}

Actions action3 = new Actions(Driver);
action3.sendKeys(Keys.ESCAPE).build().perform();
AddressType.click();
List<WebElement> AT= Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
System.out.println(AT.size());
String[] a3 = ADT.split("!"); 
boolean s3; 
int c3=0;
for(int i=0;i<AT.size();i++)
{
s3 = false;
for (String e3 : a3) 
   {
//System.out.println(Pro); 
//System.out.println("Gender value:"+GE.get(i).getText());
if(AT.get(i).getText().equals(e3))
{
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
  System.out.println("Address Type value:"+AT.get(i).getText());
  s3=true;
  c3=c3+1;
  if(c3==4) 
	{
		 System.out.println("Address Type value: Matches");
	}
 break;
}

}

if(!s3) 
{
System.out.println("Address Type value:"+ AT.get(i).getText());
System.out.println("Address Type value:Not Matches");
}
}
Actions CA=new Actions(Driver);
CA.moveToElement(AddressCancel).build();
CA.click(AddressCancel).perform();
AddressCancel.click();
   // WebDriverWait wait1 = new WebDriverWait(Driver, 20);
    Actions A=new Actions(Driver);
	A.moveToElement(ConfigTab).build();
	A.click(ConfigTab).perform();
	ConfigTab.click();
ProjectReportInterval.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> PI= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingInterval']//following::ul[2]//li"));
System.out.println(PI.size());
String[] arr2 = PRI.split("!"); 
boolean strFlag2;  
int count2=0;
for(int i=0;i<PI.size();i++)
{
	strFlag2=false;
	for (String P : arr2) 
	   {
	//System.out.println(Pro); 
	//System.out.println("Project Reporting Interval value:"+PI.get(i).getText());
if(PI.get(i).getText().equals(P))
{
	System.out.println("Project Reporting Interval value:"+PI.get(i).getText());
	  strFlag2=true;
	  count2=count2+1;
	  if(count2==6) 
		{
			 System.out.println("Project Reporting Interval value: Matches");
		}
	 break;
}

 }

if(!strFlag2) {
	System.out.println("Project Reporting Interval value:"+ PI.get(i).getText());
	System.out.println("Project Reporting Interval value:Not Matches");
}
}
Actions action4 = new Actions(Driver);
action4.sendKeys(Keys.ESCAPE).build().perform();
WebDriverWait wait1 = new WebDriverWait(Driver, 20);
WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-config.projectReportingDate']"));
wait1.until(ExpectedConditions.elementToBeClickable(ele));
ele.click();
//ProjectReportDate.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> PD= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingDate']//following::ul[2]//li"));
System.out.println(PD.size());
String[] arr3 = PRD.split("!"); 
boolean strFlag3;  
int count3=0;
for(int i=0;i<PD.size();i++)
{
	strFlag3=false;
	for (String P : arr3) 
	   {
	//System.out.println(Pro); 
	//System.out.println("Project Reporting Interval value:"+PI.get(i).getText());
if(PD.get(i).getText().equals(P))
{
	System.out.println("Project Reporting Date value:"+PD.get(i).getText());
	  strFlag3=true;
	  count3=count3+1;
	  if(count3==28) 
		{
			 System.out.println("Project Reporting Date value: Matches");
		}
	 break;
}
	   }
	if(!strFlag3) {
		System.out.println("Project Reporting Date value:"+ PI.get(i).getText());
		System.out.println("Project Reporting Date value:Not Matches");
	}
	}
Actions action5 = new Actions(Driver);
action5.sendKeys(Keys.ESCAPE).build().perform();
FiscalYearEndMonth.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> FM= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.fiscalYrEndMonth']//following::ul[2]//li"));
System.out.println(FM.size());
String[] arr4 = FEM.split("!"); 
boolean strFlag4;  
int count4=0;
for(int i=0;i<FM.size();i++)
{
	strFlag4=false;
	for (String P : arr4) 
	   {
	//System.out.println(Pro); 
	//System.out.println("Project Reporting Interval value:"+PI.get(i).getText());
if(FM.get(i).getText().equals(P))
{
	System.out.println("Fiscal Year End Month value:"+FM.get(i).getText());
	  strFlag4=true;
	  count4=count4+1;
	  if(count4==13) 
		{
			 System.out.println("Fiscal Year End Month value: Matches");
		}
	 break;
}
 }

if(!strFlag4) {
	System.out.println("Fiscal Year End Month value:"+ PI.get(i).getText());
	System.out.println("Fiscal Year End Month value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}

Actions action6 = new Actions(Driver);
action6.sendKeys(Keys.ESCAPE).build().perform();
ManhourReportingInterval.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> MP= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.manhourReportingInterval']//following::ul[2]//li"));
System.out.println(MP.size());
String[] arr6 = MRI.split("!"); 
boolean strFlag6;  
int count6=0;
for(int i=0;i<MP.size();i++)
{
	strFlag6=false;
	for (String P : arr6) 
	   {
	//System.out.println(Pro); 
	//System.out.println("Project Reporting Interval value:"+PI.get(i).getText());
if(MP.get(i).getText().equals(P))
{
	System.out.println("Manhour Reporting Interval value:"+MP.get(i).getText());
	  strFlag6=true;
	  count6=count6+1;
	  if(count6==8) 
		{
			 System.out.println("Manhour Reporting Interval value: Matches");
		}
	 break;
}
 }

if(!strFlag6) {
	System.out.println("Manhour Reporting Interval value:"+ MP.get(i).getText());
	System.out.println("Manhour Reporting Interval value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
Actions action7 = new Actions(Driver);
action7.sendKeys(Keys.ESCAPE).build().perform();
ManhourReportingDay.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> MD= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.manhourReportingDay']//following::ul[2]//li"));
System.out.println(MD.size());
String[] arr7 = MRD.split("!"); 
boolean strFlag7;  
int count7=0;
for(int i=0;i<MD.size();i++)
{
	strFlag7=false;
	for (String P : arr7) 
	   {
	//System.out.println(Pro); 
	//System.out.println("Project Reporting Interval value:"+PI.get(i).getText());
if(MD.get(i).getText().equals(P))
{
	System.out.println("Manhour Reporting Day value:"+MD.get(i).getText());
	  strFlag7=true;
	  count7=count7+1;
	  if(count7==10) 
		{
			 System.out.println("Manhour Reporting Day value: Matches");
		}
	 break;
}
 }

if(!strFlag7) {
	System.out.println("Manhour Reporting Day value:"+ MD.get(i).getText());
	System.out.println("Manhour Reporting Day value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
Actions action8 = new Actions(Driver);
action8.sendKeys(Keys.ESCAPE).build().perform();
EntityType.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> ENT= Driver.findElements(By.xpath("//*[contains(text(),'Supported Entity Types')]//following::div[1]//ul//li/p"));
System.out.println(ENT.size());
String[] arr8 = ENTI.split("!"); 
boolean strFlag8;  
int count8=0;
for(int i=0;i<ENT.size();i++)
{
	strFlag8=false;
	for (String P : arr8) 
	   {
	//System.out.println(Pro); 
	//System.out.println("Project Reporting Interval value:"+PI.get(i).getText());
if(ENT.get(i).getText().equals(P))
{
	System.out.println("Supported Entity Type value:"+ENT.get(i).getText());
	  strFlag8=true;
	  count8=count8+1;
	  if(count8==15) 
		{
			 System.out.println("Supported Entity Type value: Matches");
		}
	 break;
}
 }

if(!strFlag8) {
	System.out.println("Supported Entity Type value:"+ ENT.get(i).getText());
	System.out.println("Supported Entity Type value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
Actions action9 = new Actions(Driver);
action9.sendKeys(Keys.ESCAPE).build().perform();
TestProjectLookup.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> TP= Driver.findElements(By.xpath("//div[@id='mui-component-select-10010']//following::ul[2]//li"));
System.out.println(TP.size());
String[] arr9 = TPL.split("!"); 
boolean strFlag9;  
int count9=0;
for(int i=0;i<TP.size();i++)
{
	strFlag9=false;
	for (String P : arr9) 
	   {
	//System.out.println(Pro); 
	//System.out.println("Project Reporting Interval value:"+PI.get(i).getText());
if(TP.get(i).getText().equals(P))
{
	System.out.println("Test Project Lookup value:"+TP.get(i).getText());
	  strFlag9=true;
	  count9=count9+1;
	  if(count9==4) 
		{
			 System.out.println("Test Project Lookup value: Matches");
		}
	 break;
}
 }

if(!strFlag9) {
	System.out.println("Test Project Lookup value:"+ TP.get(i).getText());
	System.out.println("Test Project Lookup value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
	}
	catch(Exception E)
	{
		System.out.println(E+"");
	}
} 

public void DetailsCertifcationImageVerification() throws IOException {
	Certification.click();
	WebDriverWait wait4 = new WebDriverWait(Driver, 40);
	wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Your Certifications')]")));
	
BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\Certification.png."));

	
	Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshotC.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\Certification.png"));
	BufferedImage actualImageC = ImageScreenshotC.getImage();


	ImageDiffer imgdifferD = new ImageDiffer();

   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
if(imgdiffD.hasDiff()==true)
{
	System.out.println("Images are not same");
}
else
{
	System.out.println("Images are same");
}
	
BufferedImage expectedImageP = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SubCertification.png."));
	WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'American Automatic Sprinkler Company, Inc')]"));
	
      // Javascript executor
      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
      Driver.findElement(By.xpath("//*[contains(text(),'American Automatic Sprinkler Company, Inc')]//preceding::div[1]")).click();
      Driver.findElement(By.xpath("(//*[contains(text(),'DC: CBE (Certified Business Enterprise)')])[2]//preceding::div[1]")).click();
    
      
Screenshot ImageScreenshot1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshot1.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SubCertification.png"));
	
	BufferedImage actualImageP = ImageScreenshot1.getImage();


	ImageDiffer imgdiffer = new ImageDiffer();

   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImageP, actualImageP);
if(imgdiff.hasDiff()==true)
{
	System.out.println("Images are not same");
}
else
{
	System.out.println("Images are same");
}
}

public void DetailsLaborStandardImageVerification() throws IOException {
	LaborStandard.click();
	WebDriverWait wait4 = new WebDriverWait(Driver, 40);
	wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Shared Documents')]")));
	BufferedImage expectedImageL = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\LaborStandard.png."));

	
	Screenshot ImageScreenshotL= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshotL.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\LaborStandard.png"));
	BufferedImage actualImageL = ImageScreenshotL.getImage();


	ImageDiffer imgdifferL = new ImageDiffer();

   ImageDiff imgdiffL = imgdifferL.makeDiff(expectedImageL, actualImageL);
if(imgdiffL.hasDiff()==true)
{
	System.out.println("Images are not same");
}
else
{
	System.out.println("Images are same");
}
}

public void DetailsTrackCommitmentsImageVerification() throws IOException {
	TrackCommitments.click();
	WebDriverWait wait4 = new WebDriverWait(Driver, 40);
	wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Commitment Tracking')]")));
	
BufferedImage expectedImageT = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\TrackCommitments.png."));

	
	Screenshot ImageScreenshotT= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshotT.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\TrackCommitments.png"));
	BufferedImage actualImageT = ImageScreenshotT.getImage();


	ImageDiffer imgdifferT = new ImageDiffer();

   ImageDiff imgdiffT = imgdifferT.makeDiff(expectedImageT, actualImageT);
if(imgdiffT.hasDiff()==true)
{
	System.out.println("Images are not same");
}
else
{
	System.out.println("Images are same");
}
}
public SubcontractorPage ValidateSubcontractorPageLaunch() {
	try
	{
	Actions A=new Actions(Driver);
	A.moveToElement(SubcontractorPageLaunch).build();
	A.click(SubcontractorPageLaunch).perform();
	}
	catch(Exception E)
	{
		System.out.println(E);
	}
	 return new SubcontractorPage();
}
}	
