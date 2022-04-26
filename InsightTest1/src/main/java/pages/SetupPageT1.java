package pages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;
import pages.SubcontractorPage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;
import pages.DashboardPageT1;
public class SetupPageT1 extends TestBase
{
	
	@FindBy(xpath="//*[contains(text(),'Get Started')]")
	WebElement GetStarted;
	
	@FindBy(xpath="(//*[contains(text(),'Details')])[2]")
	WebElement Tab1;
	
	@FindBy(xpath="(//*[contains(text(),'Payroll')])[3]")
	WebElement Tab2;
	
	@FindBy(xpath="(//*[contains(text(),'Job Titles')])[1]")
	WebElement Tab3;
	
	@FindBy(xpath="(//*[contains(text(),'Employees')])[1]")
	WebElement Tab4;
	
	@FindBy(xpath="(//*[contains(text(),'Subcontractors')])[2]")
	WebElement Tab5;
	
	@FindBy(xpath="//*[contains(text(),'Dashboard')]")
	WebElement Project;
	
	@FindBy(id="name")
	WebElement ProjectName;
	
	@FindBy(id="number")
	WebElement Number;
	
	@FindBy(id="mui-component-select-ownerEthnicityId")
	WebElement Ethnicity;
	
	@FindBy(id="mui-component-select-ownerGenderId")
	WebElement Gender;
	
	@FindBy(xpath="//*[contains(text(),'Address Validation')]")
	WebElement AddressValidation;
	
	@FindBy(xpath="//*[contains(text(),'Address Validation')]//preceding::button[4]")
	WebElement CorporateAddressEdit;
	
	
	@FindBy(xpath="//*[contains(text(),'Existing Addresses')]//following::div[1]")
	WebElement ExistingAddress;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']//following::li[5]//p")
	WebElement SiteAddress;
	
	@FindBy(xpath="//*[contains(text(),'Address Validation')]//preceding::button[2]")
	WebElement SiteAddressEdit;
	
	@FindBy(xpath="//*[contains(text(),'Existing Addresses')]//following::div[1]")
	WebElement ExistingCorAddress;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']//following::li[5]//p")
	WebElement CorporateAddress;
	
	@FindBy(xpath="//input[@id='street1']")
	WebElement Street1;
	
	@FindBy(xpath="//input[@id='street2']")
	WebElement Street2;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement City;
	
	@FindBy(xpath="//div[@id='mui-component-select-country']")
	WebElement Country;
	
	@FindBy(xpath="//div[@id='mui-component-select-state']")
	WebElement State;
	
	@FindBy(xpath="//input[@id='zip']")
	WebElement Zip;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[5]")
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
	
	@FindBy(id="ein")
	WebElement EIN;
	
	@FindBy(xpath="(//input[@id='name'])[2]")
	WebElement Name;
	
	@FindBy(id="contractAmount")
	WebElement ContractAmount;
	
	@FindBy(id="contractHours")
	WebElement ContractHours;
	
	@FindBy(xpath="//*[contains(text(),'Authorize')]//preceding::input[1]")
	WebElement AuthorizeToggle;
	
	@FindBy(xpath="//*[contains(text(),'Add Document')]")
	WebElement AddDocumentbutton;
	
	@FindBy(xpath="//*[contains(text(),'You can')]")
	WebElement YoucanSkiplink;
	
	@FindBy(xpath="//*[contains(text(),'Save & Next')]")
	WebElement SaveNext;
	
	@FindBy(xpath="//div[@id='mui-component-select-payrollSchedule']//p")
	WebElement DefaultPayrollSchedule;
	
	@FindBy(xpath="//div[@id='mui-component-select-payrollEndDay']/p")
	WebElement DefaultPayrollEndDay;
	
	@FindBy(id="mui-component-select-payrollSchedule")
	WebElement PayrollSchedule;
	
	@FindBy(id="mui-component-select-payrollEndDay")
	WebElement PayrollEndDay;
	
	@FindBy(xpath="//*[contains(text(),'Show only')]//preceding::input[1]")
	WebElement ShowToggle;
	
	@FindBy(id="mui-component-select-parentId")
	WebElement ContractorPrime;
	
	@FindBy(xpath="//input[@placeholder='Contract Number']")
	WebElement ContractNumber;
	
	
	@FindBy(id="mui-component-select-contractorType")
	WebElement ContractorType;
	
	@FindBy(id="mui-component-select-contractorType")
	WebElement ContractType;
	
	@FindBy(xpath="//div[@id='mui-component-select-contractorType']//child::p")
	WebElement DefaultContractType;
	
	@FindBy(xpath="(//div[@id='mui-component-select-ownerEthnicityId'])[2]")
	WebElement EthnicityId;
	
	@FindBy(xpath="(//div[@id='mui-component-select-ownerGenderId'])[2]")
	WebElement GenderId;
	
	@FindBy(xpath="(//*[contains(text(),'Address History')])[1]")
	WebElement AddressHistory;
	
	@FindBy(xpath="//*[contains(text(),'Add New')]")
	WebElement AddNewbutton;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']")
	WebElement ExistingAddressddn;
	
	@FindBy(id="street1")
	WebElement Street1A;
	
	@FindBy(id="street2")
	WebElement Street2A;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="mui-component-select-country")
	WebElement country;
	
	@FindBy(id="mui-component-select-state")
	WebElement state;
	
	@FindBy(id="mui-component-select-province")
	WebElement Province;
	
	
	@FindBy(id="zip")
	WebElement zip;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement EffectiveDateD;
	
	@FindBy(xpath="//input[@id='type']//preceding::div[1]")
	WebElement AddressTypeD;
	
	@FindBy(xpath="//*[contains(text(),'Address Type')]//following::button[1]")
	WebElement Add;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[1]")
	WebElement AddressCancelb;
	
	@FindBy(xpath="//*[contains(text(),'Active')]//preceding::input[1]")
	WebElement Status;
	
	@FindBy(xpath="(//*[contains(text(),'Award Details')])[1]")
	WebElement AwardDetails;
	
	@FindBy(id="awardAmount")
	WebElement AwardAmount;
	
	@FindBy(id="awardHours")
	WebElement AwardHours;
	
	@FindBy(xpath="(//*[contains(text(),'Work Info')])[1]")
	WebElement WorkInfo;
	
	@FindBy(id="mui-component-select-compCodeIds")
	WebElement WorkCode;
	
	@FindBy(xpath="(//input[@id='searchTxt'])[1]")
	WebElement NAICSearch;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")
	WebElement NSearch;
	
	@FindBy(xpath="//*[contains(text(),'Code Version: 2017')]//following::span[1]")
	WebElement NAICToggle;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root'])[2]")
	WebElement SSearch;
	
	@FindBy(xpath="//*[contains(text(),'Code Version: 2018')]//following::span[1]")
	WebElement SOCToggle;
	
	@FindBy(xpath="(//input[@id='searchTxt'])[3]")
	WebElement NIGPSearch;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")
	WebElement NISearch;
	
	@FindBy(xpath="//*[contains(text(),'Code Version: 5digit')]//following::span[1]")
	WebElement NIGPToggle;
	
	@FindBy(xpath="//*[contains(text(),'Is Union Shop?')]")
	WebElement UnionToggle;
	
	@FindBy(id="mui-component-select-workScopeIds")
	WebElement WorkScope;
	
	@FindBy(id="mui-component-select-10012")
	WebElement SubTypeDropdown;
	
	@FindBy(xpath="(//input[@id='ownerGenderId']//following::input[1])[2]")
	WebElement ScheduledStartDate;
	
	@FindBy(xpath="(//input[@id='ownerGenderId']//following::input[2])[2]")
	WebElement ScheduledEndDate;
	
	@FindBy(xpath="//*[contains(text(),'Work Codes')]")
	WebElement WorkCodes;
	
	@FindBy(xpath="//*[contains(text(),'Custom Values')]")
	WebElement CustomValues;
	
	@FindBy(xpath="//input[@placeholder='Test Scalar 1']")
	WebElement Scalar;
	
	@FindBy(xpath="//*[contains(text(),'Save')]")
	WebElement SaveButton;
	
	@FindBy(xpath="//*[contains(text(),'Finish')]")
	WebElement Finish;
	
	@FindBy(xpath="//*[contains(text(),'Save & Close')]")
	WebElement SaveClose;
	
	@FindBy(xpath="//*[contains(text(),'Contacts')]")
	WebElement Contacts;
	
	@FindBy(xpath="//*[contains(text(),'Add New Contact')]")
	WebElement AddNewContacts;
	
	@FindBy(id="userName")
	WebElement UserName;
	
	@FindBy(id="firstName")
	WebElement FirstName;
	
	@FindBy(id="lastName")
	WebElement LastName;
	
	@FindBy(id="title")
	WebElement ConTitle;
	
	@FindBy(id="phone")
	WebElement Phone;
	
	@FindBy(xpath="//*[contains(text(),'Add/Update')]")
	WebElement Addbutton;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[1]")
	WebElement ContactsCancel;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorInherit']")
	WebElement SubContactsTab;
	
	@FindBy(xpath="//*[contains(text(),'Assigned')]//preceding::button[2]")
	WebElement LockIcon;
	
	@FindBy(id="newUserName")
	WebElement ConfirmUserName;
	
	@FindBy(id="newPwd")
	WebElement Password;
	
	@FindBy(id="confirmPwd")
	WebElement ConfirmPassword;
	
	@FindBy(id="//*[contains(text(),'Cancel')]")
	WebElement Cancel;
	
	@FindBy(xpath="//input[@id='confirmPwd']//following::button[3]")
	WebElement Reset;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[2]")
	WebElement SubCancel;
	
	@FindBy(xpath="//*[contains(text(),'Select Contract')]//following::button[1]")
	WebElement AccountIcon;
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	WebElement Logout;
	
	@FindBy(xpath="//*[contains(text(),'Reset User')]//following::p[1]")
	WebElement ResetInstruction;

	@FindBy(xpath="(//*[contains(text(),'User')])[4]//following::Span[5]")
	WebElement VerifyUser;
	
	@FindBy(xpath="(//*[contains(text(),'User')])[4]//following::Span[6]")
	WebElement VerifyEmail;
	
	@FindBy(xpath="(//*[contains(text(),'Features')])[3]//following::p[1]")
	WebElement Feature;
	
	@FindBy(xpath="//*[contains(text(),'Read Only')]//following::td[4]")
	WebElement ReadOnly;
	
	@FindBy(xpath="//*[contains(text(),'Read Only')]//following::td[5]")
	WebElement Reports;
	
	@FindBy(xpath="//input[@placeholder='Enter email']")
	WebElement Search;

	
	@FindBy(xpath="(//input[@id='searchTxt'])[2]")
	WebElement SOCSearch;
	
	
	public SetupPageT1()
	{
		PageFactory.initElements(Driver,this);
	}
	
	
	public void SetupDetailsPageImageVerification() throws IOException, AWTException
	{
		WebDriverWait wait4 = new WebDriverWait(Driver, 80);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
	BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automatiorn\\Workspace\\InsightTest\\Baseline\\SetupDetailsPage1.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SetupDetailsPage1.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
	ImageDiffer imgdiffer = new ImageDiffer();

		   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Setup Page T1: SetupDetailsPage1 Images are not same");
		}
		else
		{
			System.out.println("Setup Page T1: SetupDetailsPage1 Images are same");
		}
		BufferedImage expectedImage1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SetupDetailsPage.png"));
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Address History')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
	Screenshot ImageScreenshot1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot1.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SetupDetailsPage2.png"));
	BufferedImage actualImage1 = ImageScreenshot1.getImage();
		ImageDiffer imgdiffer1 = new ImageDiffer();

		   ImageDiff imgdiff1 = imgdiffer.makeDiff(expectedImage1, actualImage1);
		if(imgdiff1.hasDiff()==true)
		{
			System.out.println("Setup Page T1: SetupDetailsPage2 Images are not same");
		}
		else
		{
			System.out.println("Setup Page T1: SetupDetailsPage2 Images are same");
		}
		WebElement l=Driver.findElement(By.xpath("//*[contains(text(),'Save & Next')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", l);
	      //Thread.sleep(800);
	   BufferedImage expectedImage2 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SetupDetailsPage3.png"));
		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Screenshot ImageScreenshot2= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot2.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SetupDetailsPage3.png"));

		BufferedImage actualImage2 = ImageScreenshot.getImage();
		ImageDiffer imgdiffer2 = new ImageDiffer();

		   ImageDiff imgdiff2 = imgdiffer.makeDiff(expectedImage2, actualImage2);
		if(imgdiff2.hasDiff()==true)
		{
			System.out.println("Setup Page T1: SetupDetailsPage3 Images are not same");
		}
		else
		{
			System.out.println("Setup Page T1: SetupDetailsPage3 Images are same");
		}
	}
	
	public String ValidateFirstTab()
	{
		return Tab1.getText();
	}
	
	public String ValidateSecondTab()
	{
		return Tab2.getText();
	}
	
	public String ValidateThirdTab()
	{
		return Tab3.getText();
	}
	
	public String ValidateFourthTab()
	{
		return Tab4.getText();
	}
	
	public String ValidateFifthTab()
	{
		return Tab5.getText();
	}
	
	public void ValidateAuthorizeToggle()
	{
		WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		
		if(AuthorizeToggle.isSelected())
		{
			System.out.println("Authorize my GC to edit my data is Preselected");
			System.out.println("Success");
		}
		else
		{
			System.out.println("Authorize my GC to edit my data is not Preselected");
		}
	}
	
	public String ValidateProjectNameField()
	{
		WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		
		return ProjectName.getAttribute("value");
	}
	
	public String ValidateNumberField()
	{
		WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		
		return Number.getAttribute("value");
	}
	
	public String ValidateEthnicityField()
	{
		WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		
		return Ethnicity.getText();
	}
	
	public String ValidateGenderField()
	{
		WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		return Gender.getText();
	}
	
	
	public String ValidateSiteAddressStreet1() throws InterruptedException
	{
		/*WebDriverWait wait4 = new WebDriverWait(Driver, 70);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));*/
		WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		    JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return Street1.getAttribute("value");
	}
	
	public String ValidateSiteAddressStreet2() throws InterruptedException
	{
		WebDriverWait w = new WebDriverWait(Driver, 80);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		/*WebDriverWait wait = new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));*/
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return Street2.getAttribute("value");
	}
	
	public String ValidateSiteAddresscity() throws InterruptedException
	{
		/*WebDriverWait wait = new WebDriverWait(Driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));*/
		
		WebDriverWait w = new WebDriverWait(Driver, 70);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return City.getAttribute("value");
	}
	
	public String ValidateSiteAddressCountry() throws InterruptedException
	{
		/*WebDriverWait wa = new WebDriverWait(Driver, 60);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));*/
		
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));
	    
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		Country.click();
			return Country.getText();
	}
	
	public String ValidateSiteAddressState() throws InterruptedException
	{
		/*WebDriverWait wa = new WebDriverWait(Driver, 60);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));*/
		
		WebDriverWait wait = new WebDriverWait(Driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		State.click();
		return State.getText();
	}
	
	public String ValidateSiteAddressZip() throws InterruptedException
	{
		/*WebDriverWait wa = new WebDriverWait(Driver, 60);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));*/
		WebDriverWait wait = new WebDriverWait(Driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));
	    
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return Zip.getAttribute("value");
	}
	
	public String ValidateSiteAddressEffectiveDate() 
	{
		WebDriverWait wa = new WebDriverWait(Driver, 90);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		SiteAddressEdit.click();
		return EffectiveDate.getAttribute("value");
	}
	
	public String ValidateSiteAddressType() throws InterruptedException
	{
		WebDriverWait wa = new WebDriverWait(Driver, 90);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		SiteAddressEdit.click();
		//SiteAddressEdit.click();
		AddressType.click();
		return AddressType.getText();
	}
	

	
	public String ValidateCorporateAddressStreet1() throws InterruptedException
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		CorporateAddressEdit.click();
		//CorporateAddressEdit.click();
		return Street1.getAttribute("value");
	}
	
	public String ValidateCorporateAddressStreet2() throws InterruptedException
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		/*WebDriverWait wait = new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));*/
	    
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//CorporateAddressEdit.click();
		/*WebDriverWait w = new WebDriverWait(Driver, 40);
		WebElement ele = Driver.findElement(By.xpath("//*[contains(text(),'Address Validation')]//preceding::button[4]"));
		w.until(ExpectedConditions.elementToBeClickable(ele));*/
		return Street2.getAttribute("value");
	}
	
	public String ValidateCorporateAddresscity() throws InterruptedException
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		/*WebDriverWait wait = new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));
	    */
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		/*WebDriverWait w = new WebDriverWait(Driver, 40);
		WebElement ele = Driver.findElement(By.xpath("//*[contains(text(),'Address Validation')]//preceding::button[4]"));
		w.until(ExpectedConditions.elementToBeClickable(ele));*/
		//CorporateAddressEdit.click();
		return City.getAttribute("value");
	}
	
	public String ValidateCorporateAddressCountry() throws InterruptedException
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		/*WebDriverWait wait = new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));*/
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		/*WebDriverWait w = new WebDriverWait(Driver, 40);
		WebElement ele = Driver.findElement(By.xpath("//*[contains(text(),'Address Validation')]//preceding::button[4]"));
		w.until(ExpectedConditions.elementToBeClickable(ele));*/
		//CorporateAddressEdit.click();
		Country.click();
		//SiteAddressEdit.click();
			return Country.getText();
	}
	
	public String ValidatecCorporateAddressState() throws InterruptedException
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		/*WebDriverWait wait = new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));*/
	    
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//CorporateAddressEdit.click();
		//SiteAddressEdit.click();
		/*WebDriverWait w = new WebDriverWait(Driver, 40);
		WebElement ele = Driver.findElement(By.xpath("//*[contains(text(),'Address Validation')]//preceding::button[4]"));
		w.until(ExpectedConditions.elementToBeClickable(ele));*/
		State.click();
		return State.getAttribute("value");
	}
	
	public String ValidateCorporateAddressZip() throws InterruptedException
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		/*WebDriverWait wait = new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));*/
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		/*WebDriverWait w = new WebDriverWait(Driver, 40);
		WebElement ele = Driver.findElement(By.xpath("//*[contains(text(),'Address Validation')]//preceding::button[4]"));
		w.until(ExpectedConditions.elementToBeClickable(ele));*/
		//CorporateAddressEdit.click();
		//SiteAddressEdit.click();
		return Zip.getAttribute("value");
	}
	
	public String ValidateCorporateAddressEffectiveDate() throws InterruptedException
	{
		WebDriverWait wa = new WebDriverWait(Driver, 90);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		CorporateAddressEdit.click();
		return EffectiveDate.getAttribute("value");
	}
	
	public String ValidateCorporateAddressType() throws InterruptedException
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		/*WebDriverWait wait = new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Address Validation')]")));*/
	    
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//CorporateAddressEdit.click();
		//SiteAddressEdit.click();
		/*WebDriverWait w = new WebDriverWait(Driver, 40);
		WebElement ele = Driver.findElement(By.xpath("//*[contains(text(),'Address Validation')]//preceding::button[4]"));
		w.until(ExpectedConditions.elementToBeClickable(ele));*/
		AddressType.click();
		return AddressType.getText();
	}
	
	public String ValidateAddNew()
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		return AddNew.getText();
	}
	
	public String ValidateUpdateButton()
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		CorporateAddressEdit.click();
		return Updatebutton.getText();
		
	}
	
	public String ValidateCancelButton()
	{
		WebDriverWait wa = new WebDriverWait(Driver, 80);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		CorporateAddressEdit.click();
		/*WebDriverWait w = new WebDriverWait(Driver, 40);
		WebElement ele = Driver.findElement(By.xpath("//*[contains(text(),'Address Validation')]//preceding::button[4]"));
		w.until(ExpectedConditions.elementToBeClickable(ele));*/
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
		return ActualStart.getAttribute("value");	
	}
	
	public String ValidateActualEndDate()
	{
		return ActualEnd.getAttribute("value");
	}
	
	public String ValidateTotalContractAmount() throws InterruptedException
	{
		Thread.sleep(2000);
		return ContractAmount.getAttribute("value");
	}
	
	public String ValidateTotalContractHours()
	{
		return ContractHours.getAttribute("value");
	}
	
	public String ValidateAddDocumentRow()
	{
		return AddDocumentbutton.getText();
	}
	
	public String ValidateYoucanskiplink()
	{
		return YoucanSkiplink.getText();
	}
	
	public String ValidateSaveandNextbutton()
	{
		return SaveNext.getText();
	}
	
	public String ValidatePayrollSchedule() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		Tab2.click();
		return DefaultPayrollSchedule.getText();
	}
	
	public String ValidatePayrollEndDay() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		//Thread.sleep(2000);
		Tab2.click();
		return DefaultPayrollEndDay.getText();
	}
	
	public void AddSetup(String PS,String PE,String J)
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		//Thread.sleep(2000);
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Tab2);
		 /*JavascriptExecutor executor3 = (JavascriptExecutor)Driver;
			executor3.executeScript("arguments[0].click();", PayrollSchedule);*/
			PayrollSchedule.click();
			List<WebElement> P=Driver.findElements(By.xpath("//div[@id='mui-component-select-payrollSchedule']//following::ul[2]/li"));
			 System.out.println(P.size());
				for(int l=0;l<=P.size()-1;l++)
				{
					System.out.println(P.get(l).getText());
		}
				for(int i=0;i<P.size();i++)
				{
			 if(P.get(i).getText().equals(PS))
			 {
				 P.get(i).click();
				 }
				}
		//Driver.findElement(By.xpath("//*[contains(text(),'"+PS+"')]")).click();
			
			//Driver.findElement(By.xpath("//*[contains(text(),'"+PS+"')]")).click();
			/*Actions ac = new Actions(Driver);
			ac.sendKeys(Keys.ESCAPE).build().perform();*/
			PayrollEndDay.click();
			List<WebElement> P1=Driver.findElements(By.xpath("//div[@id='mui-component-select-payrollEndDay']//following::ul[2]/li"));
			 System.out.println(P1.size());
				for(int l=0;l<=P1.size()-1;l++)
				{
					System.out.println(P1.get(l).getText());
		}
				for(int i=0;i<P1.size();i++)
				{
			 if(P1.get(i).getText().equals(PE))
			 {
				 P1.get(i).click();
				 }
				}
			
			//Driver.findElement(By.xpath("//*[contains(text(),'"+PE+"')]")).click();
			/*Actions action4 = new Actions(Driver);
			action4.sendKeys(Keys.ESCAPE).build().perform();*/
		    /*JavascriptExecutor ex = (JavascriptExecutor)Driver;
			ex.executeScript("arguments[0].click();", Tab3);*/
			Tab3.click();
			if(ShowToggle.isSelected())
			{
				System.out.println("Toggle is Pre Selected");
			}
			else
			{
				System.out.println("Toggle is not Pre Selected");
			}
			Driver.findElement(By.xpath("//*[contains(text(),'"+J+"')]")).click();
			Driver.findElement(By.xpath("//input[@id='searchTxt']")).sendKeys("b");
			Driver.findElement(By.xpath("//*[contains(text(),'Bicycle Mechanic')]//preceding::input[1]")).click();
			Driver.findElement(By.xpath("//*[contains(text(),'Bottle Washer')]//preceding::input[1]")).click();
			Driver.findElement(By.xpath("//button[@title='Clear Search']")).click();
			ShowToggle.click();
	}
	
	public void SetupPageDDNVerification(String DET,String G,String PS,String PED,String CP1,String CT,String ET,String GEN,
			String WOC,
			String WSC,String SD) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		
	
		//Details
		WebDriverWait w = new WebDriverWait(Driver, 50);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Authorize')]")));
		
		Ethnicity.click();
		//Driver.navigate().refresh();
		//Ethnicity.click();  
	/*WebDriverWait wa = new WebDriverWait(Driver, 30);
	wa.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'White - ')]")));*/
	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	List<WebElement> E= Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']//following::ul[3]//li"));
	
	System.out.println(E.size());
	String[] arr = DET.split("!"); 
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
			  System.out.println("Tier1 Ethnicity value:"+E.get(i).getText());
			  strFlag=true;
			  count=count+1;
			  if(count==10) 
				{
					 System.out.println("Tier1 Ethnicity value: Matches");
				}
			 break; 
			 
		  }
		   
		   }
    	if(!strFlag) {
    		System.out.println("Tier1 Ethnicity value:"+ E.get(i).getText());
    		System.out.println("Tier1 Ethnicity value: Not Matches");
    	}
		   
	
	}
    //Gender
    Actions action = new Actions(Driver);
    action.sendKeys(Keys.ESCAPE).build().perform();
    Gender.click();
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
		  System.out.println("Tier1 Gender value:"+GE.get(i).getText());
		  strFlag1=true;
		  count1=count1+1;
		  if(count1==4) 
			{
				 System.out.println("Tier1 Gender value: Matches");
			}
		 break;
	  }
	 
	   }
	
	if(!strFlag1) 
	{
		System.out.println("Tier1 Gender value:"+ GE.get(i).getText());
		System.out.println("Tier1 Gender value:Not Matches");
	}
	}
	Actions action4 = new Actions(Driver);
	action4.sendKeys(Keys.ESCAPE).build().perform();
    JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
	executor2.executeScript("arguments[0].click();", Tab2);
	 JavascriptExecutor executor3 = (JavascriptExecutor)Driver;
		executor3.executeScript("arguments[0].click();", PayrollSchedule);
		PayrollSchedule.click();
		List<WebElement> PI= Driver.findElements(By.xpath("//div[@id='mui-component-select-payrollSchedule']//following::ul[2]/li"));
		System.out.println(PI.size());
		String[] arr2 = PS.split("!"); 
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
			System.out.println("Tier1 Payroll Schedule value:"+PI.get(i).getText());
			  strFlag2=true;
			  count2=count2+1;
			  if(count2==4) 
				{
					 System.out.println("Tier1 Payroll Schedule value: Matches");
				}
			 break;
		}

		 }

		if(!strFlag2) {
			System.out.println("Tier1 Payroll Schedule value:"+ PI.get(i).getText());
			System.out.println("Tier1 Payroll Schedule value:Not Matches");
		}
		}
		Actions ac = new Actions(Driver);
		ac.sendKeys(Keys.ESCAPE).build().perform();
		WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-payrollEndDay']"));
		wait1.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		//ProjectReportDate.click();
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		List<WebElement> PD= Driver.findElements(By.xpath("//div[@id='mui-component-select-payrollEndDay']//following::ul[2]/li"));
		System.out.println(PD.size());
		String[] arr3 = PED.split("!"); 
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
			System.out.println("Payroll End Day value:"+PD.get(i).getText());
			  strFlag3=true;
			  count3=count3+1;
			  if(count3==7) 
				{
					 System.out.println("Payroll End Day value: Matches");
				}
			 break;
		}
			   }
			if(!strFlag3) {
				System.out.println("Payroll End Day value:"+ PI.get(i).getText());
				System.out.println("Payroll End Day value:Not Matches");
			}
			}
		Actions ac1 = new Actions(Driver);
		ac1.sendKeys(Keys.ESCAPE).build().perform();
	Tab5.click();
	
 ContractorPrime.click();
	List<WebElement> CP=Driver.findElements(By.xpath("//div[@id='mui-component-select-parentId']//following::ul[2]//li"));
     System.out.println(CP.size());
     if(CP.size()==1)
     {
    	 System.out.println("Subcontractor Count Matches");
     }
     else
     {
    	 System.out.println("Subcontractor Count not Matches");
     }
     
  
         // Return the formed String[]
       
        	  
        /*		   String[] P = CP1.split("!"); 
        			 int p=0;
        			   boolean st;
        			   st = false;
        	         	for (String C : P) 
        	     		   {
        	         		
        	         	//System.out.println(Pro); 
        				//System.out.println("Project Name value:"+C);
        		  if(Driver.findElement(By.xpath("//*[contains(text(),'"+C+"')]")).isDisplayed())
        		  {
        			  System.out.println("Contractor Type value:"+C);
        			  st=true;
        			  p=p+1;
        			  if(p==7) 
        				{
        					 System.out.println("Subcontractor value: Matches");
        				}
        			 // break;

        		  }
        	     		   
        	     		   }    
        	         	if(!st) {
        	        		//System.out.println("Subcontractor value:"+ C);
        	        		System.out.println("Subcontractor value:Not Matches");
        	        	}*/
        	 		
        	         Actions c = new Actions(Driver);
	 	                c.sendKeys(Keys.ESCAPE).build().perform();     
	EIN.sendKeys("345-46-2356");
	ContractType.click();
	List<WebElement> S=Driver.findElements(By.xpath("//div[@id='mui-component-select-contractorType']//following::ul[2]//li"));
     System.out.println(S.size());
		 
     
  
         // Return the formed String[]
       
        	  
        		   String[] a = CT.split("!"); 
        			 int count=0;
        			   boolean s;
        	         for(int i=0;i<S.size();i++)
        	 		{
        	        	 s = false;
        	         	for (String C : a) 
        	     		   {
        	         	//System.out.println(Pro); 
        				//System.out.println("Project Name value:"+Pr.get(i).getText());
        		  if(S.get(i).getText().equals(C))
        		  {
        			  System.out.println("Contractor Type value:"+S.get(i).getText());
        			  s=true;
        			  count=count+1;
        			  if(count==2) 
        				{
        					 System.out.println("Contractor Type value: Matches");
        				}
        			  break;

        		  }
        	     		   }   
        	         	if(!s) {
        	        		System.out.println("Contractor Type value:"+ S.get(i).getText());
        	        		System.out.println("Contractor Type value:Not Matches");
        	        	}
        	 		}
        	         
        	         
        	         Actions action1 = new Actions(Driver);
 	                action1.sendKeys(Keys.ESCAPE).build().perform();
 	               // WebDriverWait wait = new WebDriverWait(Driver, 10);
 	          
 	        		WebDriverWait wai1 = new WebDriverWait(Driver, 20);
 	   			WebElement ele1 = Driver.findElement(By.xpath("(//div[@id='mui-component-select-ownerEthnicityId'])[2]"));
 	   			wait1.until(ExpectedConditions.elementToBeClickable(ele1));
 	   			Thread.sleep(2000);
 	   			ele1.click();
 	                //Ethnicity.click();
 	        		
 	        		List<WebElement> e=Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']//following::ul[6]//li"));
	    			 System.out.println(e.size());
	    			 String[] a1 = ET.split("!"); 
	    			 int c1=0;
      			   boolean s1;
      	         for(int i1=0;i1<e.size();i1++)
      	 		{
      	        	 strFlag1 = false;
      	         	for (String ETH : a1) 
      	     		   {
      	         	//System.out.println(Pro); 
      				//System.out.println("Project Name value:"+Pr.get(i).getText());
      		  if(e.get(i1).getText().equals(ETH))
      		  {
      			  System.out.println("Ethnicity value:"+e.get(i1).getText());
      			  strFlag1=true;
      			  c1=c1+1;
      			  if(c1==11) 
      				{
      					 System.out.println("Ethnicity value: Matches");
      				}
      			  break;

      		  }
      	     		   }   
      	         	if(!strFlag1) {
      	        		System.out.println("Ethnicity value:"+ e.get(i1).getText());
      	        		System.out.println("Ethnicity Type value:Not Matches");
      	        	}
      	 		}
 	        		
        	         Actions act = new Actions(Driver);
 	                act.sendKeys(Keys.ESCAPE).build().perform();
 	             GenderId.click();  
 	            Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	        		List<WebElement> G1=Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerGenderId']//following::ul[6]//li"));
	    			 System.out.println(G1.size());
	    			 String[] a2 = GEN.split("!"); 
	    			 int c2=0;
      			   boolean s2;
      	         for(int i2=0;i2<G1.size();i2++)
      	 		{
      	        	 s2 = false;
      	         	for (String GE1 : a2) 
      	     		   {
      	         	//System.out.println(Pro); 
      				//System.out.println("Project Name value:"+Pr.get(i).getText());
      		  if(G1.get(i2).getText().equals(GE1))
      		  {
      			  System.out.println("Gender:"+G1.get(i2).getText());
      			  s2=true;
      			  c2=c2+1;
      			  if(c2==4) 
      				{
      					 System.out.println("Gender value: Matches");
      				}
      			  break;

      		  }
      	     		   }   
      	         	if(!s2) {
      	        		System.out.println("Gender value:"+ G1.get(i2).getText());
      	        		System.out.println("Gender Type value:Not Matches");
      	        	}
      	 		}
      	         
      	       Actions act1 = new Actions(Driver);
                act1.sendKeys(Keys.ESCAPE).build().perform();      
 	//Work Info
 	WorkInfo.click();
 	WorkCode.click();
     List<WebElement> WC= Driver.findElements(By.xpath("//div[@id='mui-component-select-compCodeIds']//following::ul[2]//li"));
	     System.out.println(WC.size());
	     String[] a7 = WOC.split("!"); 
	     boolean s7; 
	     int c7=0;
	     for(int i7=0;i7<WC.size();i7++)
	     {
	     s7 = false;
	     for (String e5 : a7) 
	        {
	     if(WC.get(i7).getText().equals(e5))
	     {
	     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	       System.out.println("Work Code value:"+WC.get(i7).getText());
	       s7=true;
	       c7=c7+1;
	       if(c7==1) 
	     	{
	     		 System.out.println("Work Code: Matches");
	     	}
	      break;
	     }

	     }

	     if(!s7) 
	     {
	     System.out.println("Work Code value:"+ WC.get(i7).getText());
	     System.out.println("Work Code value:Not Matches");
	     }	 
} 
	     Actions action7 = new Actions(Driver);
	     action7.sendKeys(Keys.ESCAPE).build().perform();
	     WorkScope.click();
	     List<WebElement> WS= Driver.findElements(By.xpath("//div[@id='mui-component-select-workScopeIds']//following::ul[2]//li"));
		     System.out.println(WS.size());
		     String[] a8 = WSC.split("!"); 
		     boolean s8; 
		     int c8=0;
		     for(int i8=0;i8<WS.size();i8++)
		     {
		     s8 = false;
		     for (String e6 : a8) 
		        {
		     if(WS.get(i8).getText().equals(e6))
		     {
		     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		       System.out.println("Work Scope value:"+WS.get(i8).getText());
		       s8=true;
		       c8=c8+1;
		       if(c8==89) 
		     	{
		     		 System.out.println("Work Scope value: Matches");
		     	}
		      break;
		     }

		     }

		     if(!s8) 
		     {
		     System.out.println("Work Scope value:"+ WS.get(i8).getText());
		     System.out.println("Work Scope value:Not Matches");
		     }	 
	}
		     Actions action8 = new Actions(Driver);
		     action8.sendKeys(Keys.ESCAPE).build().perform();
		     
		    
		     //Work Codes
		    /* Actions action9 = new Actions(Driver);
		     action9.sendKeys(Keys.ESCAPE).build().perform();
		     WorkCodes.click();
		     List<WebElement> NA=Driver.findElements(By.xpath("(//input[@id='searchTxt'])[1]//following::div[5]//li//p"));

		     System.out.println(NA.size());
		     String[] a8 = NAC.split("!"); 
		     boolean s8; 
		     int c8=0;
		     for(int i=0;i<NA.size();i++)
		     {
		     s8 = false;
		     for (String e8 : a8) 
		        {
		     if(NA.get(i).getText().equals(e8))
		     {
		     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		       System.out.println("NAICs Codes value:"+NA.get(i).getText());
		       s8=true;
		       c8=c8+1;
		       if(c8==7) 
		     	{
		     		 System.out.println("NAICs Codes value: Matches");
		     	}
		      break;
		     }

		     }

		     if(!s8) 
		     {
		     System.out.println("NAICs Codes value:"+ Goal.get(i).getText());
		     System.out.println("NAICs Codes value:Not Matches");
		     }	 
}
		     Actions action10 = new Actions(Driver);
		     action10.sendKeys(Keys.ESCAPE).build().perform();
		     List<WebElement> SO=Driver.findElements(By.xpath("(//input[@id='searchTxt'])[2]//following::div[5]//p"));
		     System.out.println(SO.size());
		     String[] a9 = SOC.split("!"); 
		     boolean s9; 
		     int c9=0;
		     for(int i=0;i<SO.size();i++)
		     {
		     s9 = false;
		     for (String e9 : a9) 
		        {
		     if(SO.get(i).getText().equals(e9))
		     {
		     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		       System.out.println("SOC Codes value:"+SO.get(i).getText());
		       s9=true;
		       c9=c9+1;
		       if(c9==7) 
		     	{
		     		 System.out.println("SOC Codes value: Matches");
		     	}
		      break;
		     }

		     }

		     if(!s9) 
		     {
		     System.out.println("SOC Codes value:"+ SO.get(i).getText());
		     System.out.println("SOC Codes value:Not Matches");
		     }	 
}
		     List<WebElement> N=Driver.findElements(By.xpath("(//input[@id='searchTxt'])[3]//following::div[5]//p"));
		     System.out.println(N.size());			     
		     String[] a10 = NIGP.split("!"); 
		     boolean s10; 
		     int c10=0;
		     for(int i=0;i<N.size();i++)
		     {
		     s10 = false;
		     for (String e10 : a10) 
		        {
		     if(N.get(i).getText().equals(e10))
		     {
		     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		       System.out.println("NIGP Codes value:"+N.get(i).getText());
		       s10=true;
		       c10=c10+1;
		       if(c10==7) 
		     	{
		     		 System.out.println("NIGP Codes value: Matches");
		     	}
		      break;
		     }

		     }

		     if(!s10) 
		     {
		     System.out.println("NIGP Codes value:"+ N.get(i).getText());
		     System.out.println("NIGP Codes value:Not Matches");
		     }	 
}*/
		     Actions action11 = new Actions(Driver);
		     action11.sendKeys(Keys.ESCAPE).build().perform();
		     
		 //Custom Scalar
		     CustomValues.click();
		     SubTypeDropdown.click();
		     List<WebElement> STD=Driver.findElements(By.xpath("//div[@id='mui-component-select-10012']//following::ul[2]//li"));
		     System.out.println(STD.size());			     
		     String[] a11 = SD.split("!"); 
		     boolean s11; 
		     int c11=0;
		     for(int i11=0;i11<STD.size();i11++)
		     {
		     s11 = false;
		     for (String e11 : a11) 
		        {
		     if(STD.get(i11).getText().equals(e11))
		     {
		     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		       System.out.println("Subcontractor Type value:"+STD.get(i11).getText());
		       s11=true;
		       c11=c11+1;
		       if(c11==4) 
		     	{
		     		 System.out.println("Subcontractor Type value: Matches");
		     	}
		      break;
		     }

		     }

		     if(!s11) 
		     {
		     System.out.println("Subcontractor Type value:"+ STD.get(i11).getText());
		     System.out.println("Subcontractor Type value:Not Matches");
		     }	
}
	}
		     
	public void SetupJobTitlePageImageVerification() throws IOException, AWTException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		Tab3.click();
		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SetupJobTitlePage1.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SetupJobTitlePage1.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
		ImageDiffer imgdiffer = new ImageDiffer();

		   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Images are not same");
		}
		else
		{
			System.out.println("Images are same");
		}
		BufferedImage expectedImage1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SetupJobTitlePage2.png"));
				WebElement S1=Driver.findElement(By.xpath("//*[contains(text(),'Bicycle Mechanics')]"));
			      // Javascript executor
			      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S1);
			Screenshot ImageScreenshot1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				ImageIO.write(ImageScreenshot1.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SetupJobTitlePage2.png"));
			BufferedImage actualImage1 = ImageScreenshot1.getImage();
		ImageDiffer imgdiffer1 = new ImageDiffer();

				   ImageDiff imgdiff1 = imgdiffer.makeDiff(expectedImage1, actualImage1);
				if(imgdiff1.hasDiff()==true)
				{
					System.out.println("Images are not same");
				}
				else
				{
					System.out.println("Images are same");
				}
		BufferedImage expectedImage2 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SetupJobTitlePage3.png"));
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'QA Analyst')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
	Screenshot ImageScreenshot2= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot2.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SetupJobTitlePage3.png"));
	BufferedImage actualImage2 = ImageScreenshot1.getImage();
		ImageDiffer imgdiffer2 = new ImageDiffer();

		   ImageDiff imgdiff2 = imgdiffer.makeDiff(expectedImage2, actualImage2);
		if(imgdiff2.hasDiff()==true)
		{
			System.out.println("Images are not same");
		}
		else
		{
			System.out.println("Images are same");
		}
		WebElement l=Driver.findElement(By.xpath("//*[contains(text(),'WC 2')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", l);
	      //Thread.sleep(800);
	     BufferedImage expectedImage3 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SetupJobTitlePage4.png"));
		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Screenshot ImageScreenshot3= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot3.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SetupJobTitlePage4.png"));

		BufferedImage actualImage3 = ImageScreenshot.getImage();
		ImageDiffer imgdiffer3 = new ImageDiffer();

		   ImageDiff imgdiff3 = imgdiffer.makeDiff(expectedImage3, actualImage3);
		if(imgdiff2.hasDiff()==true)
		{
			System.out.println("Images are not same");
		}
		else
		{
			System.out.println("Images are same");
		}
		
	}
	public void SetupEmployeePageImageVerification() throws IOException, AWTException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		Tab4.click();
		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SetupEmployeePage.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SetupEmployeePage.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
	ImageDiffer imgdiffer = new ImageDiffer();

		   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Images are not same");
		}
		else
		{
			System.out.println("Images are same");
		}
}
	public String ValidateContractorsPrime() 
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 80);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		Tab5.click();
		
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", ContractorPrime);
		/*WebDriverWait wait = new WebDriverWait(Driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mui-component-select-parentId']")));*/
		return ContractorPrime.getText();
	}
	public String ValidateSetupDefaultContractorType()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 80);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		Tab5.click();
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", ContractorType);
		return DefaultContractType.getText();
	}
	
	public String ValidateSetupDefaultEthnicity()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 80);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
	
		Tab5.click();
		//EthnicityId.click();
		return EthnicityId.getText();
	}
	
	public String ValidateSetupDefaultGender()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 80);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		//Driver.navigate().refresh();
		Tab5.click();
	
		return GenderId.getText();
	}
	
	
	public void AddNewSubcontractor1(String PS,String PE,String J,String Ein, String name, String CN,String CT,String ET,String GE,String SD,
			String SED,String AA, String AH, 
			String WC, String WSC, String NAI,String SOI,String NIGP,String SubType,String Sca
			) throws InterruptedException {
		// TODO Auto-generated method stub
		//
		try
		{
		WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Setup')]")));
		//Thread.sleep(2000);
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Tab2);
		 /*JavascriptExecutor executor3 = (JavascriptExecutor)Driver;
			executor3.executeScript("arguments[0].click();", PayrollSchedule);*/
			PayrollSchedule.click();
			List<WebElement> P=Driver.findElements(By.xpath("//div[@id='mui-component-select-payrollSchedule']//following::ul[2]/li"));
			 System.out.println(P.size());
				for(int l=0;l<=P.size()-1;l++)
				{
					System.out.println(P.get(l).getText());
		}
				for(int i=0;i<P.size();i++)
				{
			 if(P.get(i).getText().equals(PS))
			 {
				 P.get(i).click();
				 }
				}
		//Driver.findElement(By.xpath("//*[contains(text(),'"+PS+"')]")).click();
			
			//Driver.findElement(By.xpath("//*[contains(text(),'"+PS+"')]")).click();
			/*Actions ac = new Actions(Driver);
			ac.sendKeys(Keys.ESCAPE).build().perform();*/
			PayrollEndDay.click();
			List<WebElement> P1=Driver.findElements(By.xpath("//div[@id='mui-component-select-payrollEndDay']//following::ul[2]/li"));
			 System.out.println(P1.size());
				for(int l=0;l<=P1.size()-1;l++)
				{
					System.out.println(P1.get(l).getText());
		}
				for(int i=0;i<P1.size();i++)
				{
			 if(P1.get(i).getText().equals(PE))
			 {
				 P1.get(i).click();
				 }
				}
			
			//Driver.findElement(By.xpath("//*[contains(text(),'"+PE+"')]")).click();
			/*Actions action4 = new Actions(Driver);
			action4.sendKeys(Keys.ESCAPE).build().perform();*/
		    /*JavascriptExecutor ex = (JavascriptExecutor)Driver;
			ex.executeScript("arguments[0].click();", Tab3);*/
			Tab3.click();
			if(ShowToggle.isSelected())
			{
				System.out.println("Toggle is Pre Selected");
			}
			else
			{
				System.out.println("Toggle is not Pre Selected");
			}
			Driver.findElement(By.xpath("//*[contains(text(),'"+J+"')]")).click();
			Driver.findElement(By.xpath("//input[@id='searchTxt']")).sendKeys("b");
			Driver.findElement(By.xpath("//*[contains(text(),'Bicycle Mechanic')]//preceding::input[1]")).click();
			Driver.findElement(By.xpath("//*[contains(text(),'Bottle Washer')]//preceding::input[1]")).click();
			Driver.findElement(By.xpath("//button[@title='Clear Search']")).click();
			ShowToggle.click();
		//Driver.navigate().refresh();
		//Tab1.click();
		Tab5.click();
		//Driver.manage().deleteAllCookies();
		// Add Subcontractor
		//Contract
		//Driver.navigate().refresh();
		//Tab1.click();
		JavascriptExecutor x = (JavascriptExecutor)Driver;
		x.executeScript("arguments[0].click();", EIN);
		EIN.sendKeys(Ein);
		EIN.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.TAB));
		WebDriverWait w = new WebDriverWait(Driver, 80);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Company')]")));
		Name.click();
		Name.sendKeys(name);
		//Thread.sleep(4000);
		JavascriptExecutor executor3 = (JavascriptExecutor)Driver;
		executor3.executeScript("arguments[0].click();", ContractNumber);
		ContractNumber.click();
		//Driver.findElement(By.xpath("//input[@placeholder='Contract Number']")).click();
		//contractNumber.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    ContractNumber.sendKeys(CN);
	    ContractType.click();
	    String DC="Contractor";
		//Thread.sleep(4000);
		WebDriverWait w1 = new WebDriverWait(Driver,40);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mui-component-select-contractorType']//following::ul[2]//li")));
	     List<WebElement> S=Driver.findElements(By.xpath("//div[@id='mui-component-select-contractorType']//following::ul[2]//li"));
	     System.out.println(S.size());
	    
		for(int i=0;i<S.size();i++)
		{
			System.out.println(S.get(i).getText());
			
	 if(S.get(i).getText().equals(CT))
	 {
		 S.get(i).click();
		 }
		}
		
			WebDriverWait wait1 = new WebDriverWait(Driver, 20);
			WebElement ele = Driver.findElement(By.xpath("(//div[@id='mui-component-select-ownerEthnicityId'])[2]"));
			wait1.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			//WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		 List<WebElement> E=Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']//following::ul[3]//li"));
		 System.out.println(E.size());
			for(int i=0;i<E.size();i++)
			{
				System.out.println(E.get(i).getText());
		 if(E.get(i).getText().equals(ET))
		 {
			 E.get(i).click();
			break;
			 }
			}
			
			
			WebDriverWait t= new WebDriverWait(Driver, 40);
			WebElement ele1 = Driver.findElement(By.xpath("(//div[@id='mui-component-select-ownerGenderId'])[2]"));
			t.until(ExpectedConditions.elementToBeClickable(ele1));
			ele1.click();
			WebDriverWait wait12 = new WebDriverWait(Driver, 40);
			 List<WebElement> G=Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerGenderId']//following::ul[3]//li"));
			 System.out.println(G.size());
				for(int i=0;i<G.size();i++)
				{
					System.out.println(G.get(i).getText());
			 if(G.get(i).getText().equals(GE))
			 {
				 G.get(i).click();
				 break;
				 }
				}
			JavascriptExecutor executor5 = (JavascriptExecutor)Driver;
			executor5.executeScript("arguments[0].click();", ScheduledStartDate);
			 ScheduledStartDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			 ScheduledStartDate.sendKeys(SD);
			 //ScheduledStartDate.sendKeys(Keys.TAB);
			 JavascriptExecutor executor6 = (JavascriptExecutor)Driver;
				executor6.executeScript("arguments[0].click();", ScheduledEndDate);
				 ScheduledEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				 ScheduledEndDate.sendKeys(SED);
		if(Status.isEnabled())
		{
			System.out.println("Active");
		}
		else
		{
			System.out.println("Inactive");
		}
		
	
		//Award Details
		AwardDetails.click();
		AwardAmount.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		AwardAmount.sendKeys(AA);
		AwardHours.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		AwardHours.sendKeys(AH);
		
		//Work Info
		WorkInfo.click();
		Actions A1=new Actions(Driver);
		A1.moveToElement(WorkCode).build();
		A1.click(WorkCode).perform();
		List<WebElement> W=Driver.findElements(By.xpath("//*[contains(text(),'Select Work Code')]//following::ul[2]//li"));
		System.out.println(W.size());
		for(int j=0;j<W.size();j++)
		{
			System.out.println(W.get(j).getText());
		}
		for(int j=0;j<W.size();j++)
		{
			
	 if(W.get(j).getText().equals(WC))
	 {
		 W.get(j).click();
		 break;
		 }		
	}
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.findElement(By.xpath("//*[contains(text(),'Is Union')]//following::div[2]"));
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		  js.executeScript("arguments[0].scrollIntoView();", UnionToggle);
		  Actions A4=new Actions(Driver);
		  WebElement WS=Driver.findElement(By.xpath("//*[contains(text(),'Enter Work Scope')]"));
		  JavascriptExecutor js1 = (JavascriptExecutor) Driver;
		  js1.executeScript("arguments[0].scrollIntoView();", WS);
	      /*A4.moveToElement(WS).build();
		  A4.click(WS).perform();*/
		//Driver.findElement(By.xpath("//*[contains(text(),'Enter Work Scope')]")).click();
		/*WebDriverWait w2 = new WebDriverWait(Driver, 40);
		WebElement ele4 = Driver.findElement(By.xpath("//div[@id='mui-component-select-workScopeIds']"));
		w2.until(ExpectedConditions.elementToBeClickable(ele4));
		ele4.click();*/
		  Actions action = new Actions(Driver);
		    action.sendKeys(Keys.ESCAPE).build().perform();
		  
		  WorkScope.click();
		 List<WebElement> WS1=Driver.findElements(By.xpath("//div[@id='mui-component-select-workScopeIds']//following::ul[2]//li"));
		 System.out.println(WS1.size());
			for(int k=0;k<=WS1.size()-1;k++)
			{
				System.out.println(WS1.get(k).getText());
				
		
	}
		        //regular expression is a whitespace here 
		        String[] arr = WSC.split(","); 
		  
		        for (String s : arr) 
		        {
		            System.out.println(s); 
			 if(Driver.findElement(By.xpath("//*[contains(text(),'"+s+"')]")).isDisplayed())
			 {
				 Driver.findElement(By.xpath("//*[contains(text(),'"+s+"')]")).click(); 
				 System.out.println("Success");
				 }
		        }
			Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			//UnionToggle.click();
			//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			WebElement U=Driver.findElement(By.xpath("//*[contains(text(),'Is Union')]//following::div[2]"));
			Actions A5=new Actions(Driver);
		      A5.moveToElement(U).build();
			  A5.click(U).perform();
		
			Actions A6=new Actions(Driver);
		      A6.moveToElement(UnionToggle).build();
			  A6.click(UnionToggle).perform();
			


//Work Codes
WorkCodes.click();
Thread.sleep(4000);
List<WebElement> NA=Driver.findElements(By.xpath("(//input[@id='searchTxt'])[1]//following::div[5]//li"));

System.out.println(NA.size());

Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
for(int p=0;p<=NA.size()-1;p++)
{
	
System.out.println(NA.get(p).getText());
}
JavascriptExecutor js2 = (JavascriptExecutor) Driver;
js2.executeScript("window.scrollBy(0,500)", "");
if(Driver.findElement(By.xpath("//*[contains(text(),'"+NAI+"')]")).isDisplayed())
{
WebElement NA1=Driver.findElement(By.xpath("//*[contains(text(),'"+NAI+"')]//preceding::input[1]"));
JavascriptExecutor executor = (JavascriptExecutor)Driver;
executor.executeScript("arguments[0].click();", NA1);
 System.out.println("Success");
	}
Thread.sleep(2000);
NAICSearch.sendKeys("1123");
Driver.findElement(By.xpath("//*[contains(text(),'112310 - Chicken Egg Production')]//preceding::input[1]")).click();
NSearch.click();
NAICToggle.click();
//SOS Codes
List<WebElement> SO=Driver.findElements(By.xpath("(//input[@id='searchTxt'])[2]//following::div[5]//p"));
System.out.println(SO.size());

Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
for(int r=0;r<=SO.size()-1;r++)
{
	
System.out.println(SO.get(r).getText());
}
JavascriptExecutor js3 = (JavascriptExecutor) Driver;
js3.executeScript("window.scrollBy(0,350)", "");
if(Driver.findElement(By.xpath("//*[contains(text(),'"+SOI+"')]")).isDisplayed())
{
WebElement SC1=Driver.findElement(By.xpath("//*[contains(text(),'"+SOI+"')]//preceding::input[1]"));
JavascriptExecutor executor = (JavascriptExecutor)Driver;
executor.executeScript("arguments[0].click();", SC1);
 System.out.println("Success");
	}
Thread.sleep(2000);
SOCSearch.sendKeys("agr");
Driver.findElement(By.xpath("//*[contains(text(),'11-9013 - Farmers, Ranchers, and Other Agricultural Managers')]//preceding::input[1]")).click();
SSearch.click();
SOCToggle.click();	

//NIGP Code
List<WebElement> NIG=Driver.findElements(By.xpath("(//input[@id='searchTxt'])[3]//following::div[5]//p"));
System.out.println(SO.size());

Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
for(int s=0;s<=NIG.size()-1;s++)
{
	
System.out.println(NIG.get(s).getText());
}
JavascriptExecutor js4 = (JavascriptExecutor) Driver;
js4.executeScript("window.scrollBy(0,350)", "");
if(Driver.findElement(By.xpath("//*[contains(text(),'"+NIGP+"')]")).isDisplayed())
{
WebElement NC=Driver.findElement(By.xpath("//*[contains(text(),'"+NIGP+"')]//preceding::input[1]"));
JavascriptExecutor executor = (JavascriptExecutor)Driver;
executor.executeScript("arguments[0].click();", NC);
 System.out.println("Success");
	}
Thread.sleep(2000);
NIGPSearch.sendKeys("es,");
Driver.findElement(By.xpath("//*[contains(text(),'019-60 - Potatoes, Irish')]//preceding::input[1]")).click();
NISearch.click();
NIGPToggle.click();
//Custom Value
CustomValues.click();
SubTypeDropdown.click();
List<WebElement> SCT=Driver.findElements(By.xpath("//div[@id='mui-component-select-10012']//following::ul[2]//li"));
System.out.println(SCT.size());
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
for(int n=0;n<=SCT.size()-1;n++)
{
	
System.out.println(SCT.get(n).getText());
}


if(Driver.findElement(By.xpath("//*[contains(text(),'"+SubType+"')]")).isDisplayed())
{
Driver.findElement(By.xpath("//*[contains(text(),'"+SubType+"')]")).click(); 
Scalar.sendKeys(Sca);
}
SaveButton.click();
Finish.click();


		}
		catch(Exception E)
		{
			System.out.println(E+"");
		}
	}
    public DashboardPageT1 PageView1() throws InterruptedException 
    {
    	//Thread.sleep(2000);
    /*	WebDriverWait wait = new WebDriverWait(Driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Prev. Wage Project -')]//following::button[1]")));*/
    	//Thread.sleep(3000);
    	JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Project);
    //Project.click();
   //Dashboard.click();
    Thread.sleep(3000); 
		return new DashboardPageT1();
		    }
}

