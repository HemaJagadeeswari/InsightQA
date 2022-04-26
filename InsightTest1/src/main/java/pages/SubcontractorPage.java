package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;

public class SubcontractorPage extends TestBase{
	
	@FindBy(xpath="//*[contains(text(),'Change Project')]//following::h4")
	WebElement Title;
	
	@FindBy(xpath="//*[contains(text(),'+ Add Subcontractor / Supplier')]")
	WebElement Tab1;
	
	@FindBy(xpath="//*[contains(text(),'Validate Employees')]")
	WebElement Tab2;
	
	@FindBy(xpath="//*[contains(text(),'Import Existing Subs')]")
	WebElement Tab3;
	
	@FindBy(id="mui-component-select-parentId")
	WebElement ContractorsPrime;
	
	@FindBy(xpath="//*[contains(text(),'Required Subcontractor')]")
	WebElement AddSubcontractor;
	
	@FindBy(id="ein")
	WebElement EIN;
	
	@FindBy(id="name")
	WebElement Name;

	@FindBy(xpath="//input[@placeholder='Contract Number']")
	WebElement contractNumber;
	
	@FindBy(xpath="//input[@id='ownerGenderId']//following::input[1]")
	WebElement ScheduledStartDate;
	
	@FindBy(xpath="//input[@id='ownerGenderId']//following::input[2]")
	WebElement ScheduledEndDate;
	
	@FindBy(id="mui-component-select-contractorType")
	WebElement ContractType;
	
	@FindBy(xpath="//div[@id='mui-component-select-contractorType']//child::p")
	WebElement DefaultContractType;
	
	@FindBy(id="mui-component-select-ownerEthnicityId")
	WebElement EthnicityId;
	
	@FindBy(xpath="//div[@id='mui-component-select-ownerGenderId']")
	WebElement GenderId;
	
	@FindBy(xpath="(//*[contains(text(),'Address History')])[1]")
	WebElement AddressHistory;
	
	@FindBy(xpath="//*[contains(text(),'Add New')]")
	WebElement AddNew;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']")
	WebElement ExistingAddress;
	
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
	
	@FindBy(id="mui-component-select-province")
	WebElement Province;
	
	
	@FindBy(id="zip")
	WebElement Zip;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement EffectiveDate;
	
	@FindBy(xpath="//input[@id='type']//preceding::div[1]")
	WebElement AddressType;
	
	@FindBy(xpath="//*[contains(text(),'Address Type')]//following::button[1]")
	WebElement Add;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[1]")
	WebElement AddressCancel;
	
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
	
	@FindBy(xpath="//*[contains(text(),'Is Union Shop?')]")
	WebElement UnionToggle;
	
	@FindBy(id="mui-component-select-workScopeIds")
	WebElement WorkScope;
	
	
	@FindBy(xpath="//*[contains(text(),'Business Entities')]")
	WebElement BusinessEntities;
	
	@FindBy(xpath="//*[contains(text(),'Add New Certificate')]")
	WebElement AddNewCertificate;
	
	@FindBy(id="entityType")
	WebElement EntityType;
	
	@FindBy(id="state")
	WebElement Entitystate;
	
	@FindBy(id="number")
	WebElement Number;
	
	@FindBy(xpath="//*[contains(text(),'Click to select, or drop here')]")
	WebElement Document;
	
	@FindBy(xpath="//div[@id='number']//following::input[2]")
	WebElement EntityEffectiveDate;
	
	@FindBy(xpath="//div[@id='number']//following::input[3]")
	WebElement ExpiredDate;
	
	@FindBy(xpath="(//*[contains(text(),'Save')])[1]")
	WebElement EntitySave;
	
	@FindBy(id="mui-component-select-priorityOrder-5f18b0ea13e6750d8ce6652e")
	WebElement Prioritize;
	
	@FindBy(xpath="//button[@aria-label='Edit']")
	WebElement EntityEdit;
	
	@FindBy(xpath="//*[contains(text(),'Goal Tracking')]")
	WebElement GoalTracking;
	
	@FindBy(xpath="//button[@title='Add new goal']")
	WebElement AddNewGoal;
	
	@FindBy(xpath="//*[contains(text(),'Select One')]")
	WebElement Select;
	
	@FindBy(xpath="//input[@id='targetValue']")
	WebElement Target;
	
	@FindBy(xpath="//input[@id='targetValue']//following::button[1]")
	WebElement DeleteIcon;
	
	@FindBy(xpath="//*[contains(text(),'Work Codes')]")
	WebElement WorkCodesTab;
	
	@FindBy(xpath="//*[contains(text(),'Work Code')]")
	WebElement WorkCodes;
	
	@FindBy(xpath="(//input[@id='searchTxt'])[1]")
	WebElement NAICSearch;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")
	WebElement NSearch;
	
	@FindBy(xpath="//*[contains(text(),'Code Version: 2017')]//following::span[1]")
	WebElement NAICToggle;
	
	@FindBy(xpath="(//input[@id='searchTxt'])[2]")
	WebElement SOCSearch;
	
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
	
	
	@FindBy(xpath="//*[contains(text(),'Custom Values')]")
	WebElement CustomValues;
	
	@FindBy(id="mui-component-select-10012")
	WebElement SubTypeDropdown;
	
	@FindBy(xpath="//input[@placeholder='Test Scalar 1']")
	WebElement Scalar;
	
	@FindBy(xpath="//*[contains(text(),'Save')]")
	WebElement SaveButton;
	
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
	
	
	public SubcontractorPage()
	{
		PageFactory.initElements(Driver,this);	
	}
	
	public String ValidatePageTitle()
	{
		return Title.getText();
	}
	
	public String ValidateFirstTab()
	{
		return Tab1.getText();
	}
	
	public String ValidateSecondTab()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		return Tab2.getText();
	}
	
	public String ValidateThirdTab()
	{
		return Tab3.getText();
	}
	
	public void SubcontractorImageVerification() throws IOException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		WebDriverWait wait1 = new WebDriverWait(Driver, 40);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")));
		
	BufferedImage expectedImageS = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SubcontractorPage.png."));

		
		Screenshot ImageScreenshotS= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Driver.navigate().refresh();
		ImageIO.write(ImageScreenshotS.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SubcontractorPage.png"));
		BufferedImage actualImageS = ImageScreenshotS.getImage();


	ImageDiffer imgdifferS = new ImageDiffer();

	   ImageDiff imgdiffS = imgdifferS.makeDiff(expectedImageS, actualImageS);
	if(imgdiffS.hasDiff()==true)
	{
		System.out.println("Images are not same");
	}
	else
	{
		System.out.println("Images are same");
	}
	}
	
	public String ValidateContractorsPrime() throws InterruptedException
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		WebDriverWait wait5 = new WebDriverWait(Driver, 50);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Clark')]")));
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", ContractorsPrime);
		/*WebDriverWait wait = new WebDriverWait(Driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mui-component-select-parentId']")));*/
		return ContractorsPrime.getText();
	}
	
	public String ValidateDefaultContractorType()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		ContractType.click();
		return DefaultContractType.getText();
	}
	
	public String ValidateDefaultEthnicity()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		EthnicityId.click();
		return EthnicityId.getText();
	}
	
	public String ValidateDefaultGender()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-ownerGenderId']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele1));
		ele1.click();
		return GenderId.getText();
	}
	
	public String ValidateExisitngAddress()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		EIN.sendKeys("145-78-7896");
		Name.click();
		AddressHistory.click();
		AddNew.click();
		return ExistingAddress.getText();
	}
	
	
	public String ValidateDefaultCountry()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		EIN.sendKeys("145-78-7896");
		Name.click();
		AddressHistory.click();
		AddNew.click();
		return Country.getText();
	}
	

	public String ValidateDefaultState()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		EIN.sendKeys("145-78-7896");
		Name.click();
		AddressHistory.click();
		AddNew.click();
		return State.getText();
	}
	
	public String ValidateDefaultAddressType()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		EIN.sendKeys("145-78-7896");
		Name.click();
		AddressHistory.click();
		AddNew.click();
		return AddressType.getText();
	}
	
	public String ValidateAddressButton1()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		EIN.sendKeys("145-78-7896");
		Name.click();
		AddressHistory.click();
		AddNew.click();
		WebElement A=Driver.findElement(By.xpath("//div[@id='mui-component-select-type']//following::button[1]"));
		return A.getText();
	}
	
	public String ValidateAddressButton2()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		EIN.sendKeys("145-78-7896");
		Name.click();
		AddressHistory.click();
		AddNew.click();
		WebElement C=Driver.findElement(By.xpath("//div[@id='mui-component-select-type']//following::button[2]"));
		return C.getText();
	}
	
	public String ValidateDefaultSubcontractorType()
	{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		EIN.sendKeys("145-78-7896");
		Name.click();
		AddressHistory.click();
		AddNew.click();
		return SubTypeDropdown.getText();
	}
	
	public void AddNewSubcontractor1(String Ein, String name, String CN,String CT,String ET,String GE,String SD,
			String SED, String SS1,String SS2, String SC,String SCO, String SS, String SZ, String SE, String SA,
			String CS1,String CS2, String CC,String CCO, String CP, String CPC, String CE, String CA,String AA, String AH, 
			String WC, String WSC, String Goal1,String TV1, String Goal2, String TV2, String NAI,String SOI,String NIGP,
			String SubType,String Sca, String EET, String ST,String N, String EED, 
			String EX,String un,String fn,String ln,String ct,String ph,String CUN,String PW,String CPW) throws InterruptedException {
		// TODO Auto-generated method stub
		//
		try
		{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		//Driver.navigate().refresh();
		Tab1.click();
		//Driver.manage().deleteAllCookies();
		// Add Subcontractor
		//Contract
		//Driver.navigate().refresh();
		//Tab1.click();
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", EIN);
		EIN.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EIN.sendKeys(Ein);
		EIN.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.TAB));
		WebDriverWait w = new WebDriverWait(Driver, 80);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Company')]")));
		Name.click();
		Name.sendKeys(name);
		
		Thread.sleep(4000);
		JavascriptExecutor executor3 = (JavascriptExecutor)Driver;
		executor3.executeScript("arguments[0].click();", contractNumber);
		//Driver.findElement(By.xpath("//input[@placeholder='Contract Number']")).click();
		//contractNumber.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    contractNumber.sendKeys(CN);
	    ContractType.click();
	    String DC="Contractor";
		//Thread.sleep(4000);
		WebDriverWait t= new WebDriverWait(Driver,40);
		t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mui-component-select-contractorType']//following::ul[2]//li")));
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
			WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']"));
			wait1.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			//WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		 List<WebElement> E=Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']//following::ul[2]//li"));
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
			
			
			WebDriverWait wait = new WebDriverWait(Driver, 40);
			WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-ownerGenderId']"));
			wait.until(ExpectedConditions.elementToBeClickable(ele1));
			ele1.click();
			WebDriverWait wait12 = new WebDriverWait(Driver, 40);
			 List<WebElement> G=Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerGenderId']//following::ul[2]//li"));
			 System.out.println(G.size());
				for(int i=0;i<G.size();i++)
				{
					System.out.println(G.get(i).getText());
			 if(G.get(i).getText().equals(GE))
			 {
				 G.get(i).click();
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
		
		//Address History
		//Site Office
		AddressHistory.click();
		AddNew.click();
		Street1.sendKeys(SS1);
		Street2.sendKeys(SS2);
		City.sendKeys(SC);
		Country.click();
		 List<WebElement> country=Driver.findElements(By.xpath("//div[@id='menu-country']//following::ul//li"));
		 System.out.println(country.size());
			for(int l=0;l<=country.size()-1;l++)
			{
				System.out.println(country.get(l).getText());
	}
			for(int i=0;i<country.size();i++)
			{
		 if(country.get(i).getText().equals(SCO))
		 {
			 country.get(i).click();
			 }
			}
			State.click();
			 List<WebElement> state=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
			 System.out.println(state.size());
				for(int l=0;l<=state.size()-1;l++)
				{
					System.out.println(state.get(l).getText());
				}
				for(int k=0;k<state.size();k++)
				{
			 if(state.get(k).getText().equals(SS))
			 {
				 state.get(k).click();
				 break;
			 }
				}
				Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			/*JavascriptExecutor executor9 = (JavascriptExecutor)Driver;
			executor9.executeScript("arguments[0].click();", Zip);	*/
			WebDriverWait wait10 = new WebDriverWait(Driver, 40);
			WebElement ele10 = Driver.findElement(By.xpath("//input[@id='zip']"));
			wait.until(ExpectedConditions.elementToBeClickable(Zip));
			//Zip.click();
		Zip.sendKeys(SZ);
		JavascriptExecutor executor7 = (JavascriptExecutor)Driver;
		executor7.executeScript("arguments[0].click();", EffectiveDate);
		 EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EffectiveDate.sendKeys(SE);
		AddressType.click();
		JavascriptExecutor executor13 = (JavascriptExecutor)Driver;
		executor13.executeScript("arguments[0].click();", AddressType);
		List<WebElement> type=Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
		 System.out.println(type.size());
			for(int k1=0;k1<=type.size()-1;k1++)
			{
				System.out.println(type.get(k1).getText());
	}
			for(int m=0;m<type.size();m++)
			{
		 if(type.get(m).getText().equals(SA))
		 {
			 type.get(m).click();
			 WebDriverWait w1 = new WebDriverWait(Driver, 40);
				WebElement ele2 = Driver.findElement(By.xpath("//*[contains(text(),'Address Type')]//following::button[1]"));
				w1.until(ExpectedConditions.elementToBeClickable(ele2));
				ele2.click();	
		}
	}
		
		//Corporate Office
			JavascriptExecutor executor14 = (JavascriptExecutor)Driver;
			executor14.executeScript("arguments[0].click();", AddNew);
			Thread.sleep(2000);
			
		Street1.sendKeys(CS1);
		Street2.sendKeys(CS2);
		City.sendKeys(CC);
		Country.click();
		List<WebElement> country1=Driver.findElements(By.xpath("//div[@id='menu-country']//following::ul//li"));
		 System.out.println(country1.size());
		for(int m=0;m<country1.size();m++)
		{
	 if(country1.get(m).getText().equals(CCO))
	 {
		 country1.get(m).click();
		 }
			}
		
		Province.click();
		 List<WebElement> province=Driver.findElements(By.xpath("//div[@id='mui-component-select-province']//following::ul[2]//li"));
		 System.out.println(province.size());
			for(int m=0;m<=province.size();m++)
			{
		 if(province.get(m).getText().equals(CP))
		 {
			 province.get(m).click();
			 break;
			 }
			}
		JavascriptExecutor executor11 = (JavascriptExecutor)Driver;
		executor11.executeScript("arguments[0].click();", Zip);	
	Zip.sendKeys(CPC);
	JavascriptExecutor executor12 = (JavascriptExecutor)Driver;
	executor12.executeScript("arguments[0].click();", EffectiveDate);
	 EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	EffectiveDate.sendKeys(CE);
	AddressType.click();
	List<WebElement> type1=Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
	 System.out.println(type1.size());
		for(int m=0;m<type1.size();m++)
		{
	 if(type1.get(m).getText().equals(CA))
	 {
		 type1.get(m).click();
		 break;
		 }
		}

	
		WebDriverWait w1 = new WebDriverWait(Driver, 40);
		WebElement ele2 = Driver.findElement(By.xpath("//*[contains(text(),'Address Type')]//following::button[1]"));
		w1.until(ExpectedConditions.elementToBeClickable(ele2));
		ele2.click();
		/*JavascriptExecutor executor10 = (JavascriptExecutor)Driver;
		executor10.executeScript("arguments[0].click();", Add);*/
		
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
	      A4.moveToElement(WS).build();
		  A4.click(WS).perform();
		//Driver.findElement(By.xpath("//*[contains(text(),'Enter Work Scope')]")).click();
		WebDriverWait w2 = new WebDriverWait(Driver, 40);
		WebElement ele4 = Driver.findElement(By.xpath("//div[@id='mui-component-select-workScopeIds']"));
		w1.until(ExpectedConditions.elementToBeClickable(ele4));
		ele4.click();
		  //WorkScope.click();
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
			
//Goal Tracking
GoalTracking.click();
AddNewGoal.click();
Select.click();
List<WebElement> Goal=Driver.findElements(By.xpath("//div[@id='menu-goalId']//following::ul[1]//li"));
System.out.println(Goal.size());
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
for(int n=0;n<=Goal.size()-1;n++)
{
	
System.out.println(Goal.get(n).getText());
}


if(Driver.findElement(By.xpath("//li/p[contains(text(),'"+Goal1+"')]")).isDisplayed())
{
Driver.findElement(By.xpath("//li/p[contains(text(),'"+Goal1+"')]")).click(); 
System.out.println("Success");
}
Target.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
Target.sendKeys(TV1);
DeleteIcon.click();
Driver.findElement(By.xpath("//*[contains(text(),'no goals configured')]//following::button[1]")).click();
Select.click();
if(Driver.findElement(By.xpath("//li/p[contains(text(),'"+Goal2+"')]")).isDisplayed())
{
Driver.findElement(By.xpath("//li/p[contains(text(),'"+Goal2+"')]")).click(); 
System.out.println("Success");
}
Target.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
Target.sendKeys(TV2);

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
NIGPSearch.sendKeys("es,");
Driver.findElement(By.xpath("//*[contains(text(),'005-21 - Abrasives, Sandblasting, Metal')]//preceding::input[1]")).click();
NISearch.click();
NIGPToggle.click();
//Custom Value
/*CustomValues.click();
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
Scalar.sendKeys(Sca);*/
SaveButton.click();
//Business Entity
BusinessEntities.click();
AddNewCertificate.click();
EntityType.click();
List<WebElement> Et=Driver.findElements(By.xpath("//div[@id='entityType']//following::ul[2]//li"));
System.out.println(Et.size());
for(int j=0;j<Et.size();j++)
{
	System.out.println(Et.get(j).getText());
}

if(Driver.findElement(By.xpath("//*[contains(text(),'"+EET+"')]")).isDisplayed())
{
	 Driver.findElement(By.xpath("//*[contains(text(),'"+EET+"')]")).click();	
}

Entitystate.click();
List<WebElement> St=Driver.findElements(By.xpath("//div[@id='state']//following::ul[2]//li"));
System.out.println(St.size());
for(int j=0;j<St.size();j++)
{
	System.out.println(St.get(j).getText());
}

if(Driver.findElement(By.xpath("//*[contains(text(),'"+ST+"')]")).isDisplayed())
{
	 Driver.findElement(By.xpath("//*[contains(text(),'"+ST+"')]")).click();	
}
Number.click();
Number.sendKeys(N);
//Upload a File
String strSel = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\347.pdf";
Document.click();
try {
Robot robot = new Robot();
StringSelection Selection = new StringSelection(strSel);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
	robot.setAutoDelay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
} catch (AWTException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
EntityEffectiveDate.click();
EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
EffectiveDate.sendKeys(EED);
EffectiveDate.sendKeys(Keys.TAB);
ExpiredDate.click();
ExpiredDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
ExpiredDate.sendKeys(EX);
EntitySave.click();
//Prioritize.click();


//Contacts
Contacts.click();
AddNewContacts.click();
UserName.sendKeys(un);
FirstName.sendKeys(fn);
LastName.sendKeys(ln);
ConTitle.sendKeys(ct);
Phone.sendKeys(ph);
List<WebElement> W1=Driver.findElements(By.xpath("//*[contains(text(),'User Privileges')]//following::div[1]//div[1]"));
System.out.println(W1.size());
for(int j1=0;j1<W1.size();j1++)
{
	System.out.println(W1.get(j1).getText());
if(W1.get(j1).isSelected())
{
 System.out.println("Checked:"+W1);
 }		
}	
ContactsCancel.click();
AddNewContacts.click();
UserName.sendKeys(un);
FirstName.sendKeys(fn);
LastName.sendKeys(ln);
ConTitle.sendKeys(ct);
Phone.sendKeys(ph);
Addbutton.click();
/*Search.sendKeys("123");
Search.clear();*/
//SubContactsTab.click();
LockIcon.click();
ConfirmUserName.sendKeys(CUN);
Password.sendKeys(PW);
ConfirmPassword.sendKeys(CPW);
WebDriverWait wait5 = new WebDriverWait(Driver, 20);
wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='confirmPwd']//following::button[3]")));
JavascriptExecutor executor4 = (JavascriptExecutor)Driver;
executor4.executeScript("arguments[0].click();", Reset);
JavascriptExecutor ex = (JavascriptExecutor)Driver;
ex.executeScript("arguments[0].click();", SaveClose);
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
AccountIcon.click();
 Actions L=new Actions(Driver);
 L.moveToElement(Logout).build();
 L.click(Logout).perform();
		}
		catch(Exception E)
		{
			System.out.println(E+"");
		}
	}
	
	public void ValidatePreselectedWorkCodes()
	{
		 //Driver.navigate().refresh();
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		Driver.navigate().refresh();
		WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")));
		Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")).click();Contacts.click();
		WorkCodes.click();
		NAICToggle.click();
		WebElement W1=Driver.findElement(By.xpath("//*[contains(text(),'11111 - Soybean Farming')]//preceding::input[1]"));
		WebElement W2=Driver.findElement(By.xpath("//*[contains(text(),'112310 - Chicken Egg Production')]//preceding::input[1]"));
		
		if(W1.isSelected() && W2.isSelected())
		{
			System.out.println("NAICS codes preselected value matches");
		}
		else
			
		{
			System.out.println("NAICS codes preselected value not matches");
		}
		SOCToggle.click();
		WebElement W3=Driver.findElement(By.xpath("//*[contains(text(),'11-2022 - Sales Managers')]//preceding::input[1]"));
		WebElement W4=Driver.findElement(By.xpath("//*[contains(text(),'11-9013 - Farmers, Ranchers, and Other Agricultural Managers')]//preceding::input[1]"));
		
		if(W3.isSelected() && W4.isSelected())
		{
			System.out.println("SOC codes preselected value matches");
		}
		else
			
		{
			System.out.println("SOC codes preselected value not matches");
		}
		NIGPToggle.click();
		WebElement W5=Driver.findElement(By.xpath("//*[contains(text(),'005-56 - Abrasives, Tumbling (Wheel)')]//preceding::input[1]"));
		WebElement W6=Driver.findElement(By.xpath("//*[contains(text(),'031-49 - Filter Frames, Metal')]//preceding::input[1]"));
		
		if(W5.isSelected() && W6.isSelected())
		{
			System.out.println("NIGP codes preselected value matches");
		}
		else
			
		{
			System.out.println("NIGP codes preselected value not matches");
		}
	}

	public void AddSubcontractorDDNVerification(String CP1,String CT,String ET,String GEN,String C1,String C2,
			String ADT,String PRO,String WOC,
			String WSC,String Gl,String SD,String ENT,String EST,String CO) throws InterruptedException
	{
	//String NAC,String SOC, String NIGP
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait4 = new WebDriverWait(Driver, 30);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		Driver.navigate().refresh();
		Tab1.click();
		WebDriverWait wait5 = new WebDriverWait(Driver, 50);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Clark')]")));
	
	 ContractorsPrime.click();
		List<WebElement> CP=Driver.findElements(By.xpath("//div[@id='mui-component-select-parentId']//following::ul[2]//li"));
	     System.out.println(CP.size());
	     if(CP.size()==595)
	     {
	    	 System.out.println("Subcontractor Count Matches");
	     }
	     else
	     {
	    	 System.out.println("Subcontractor Count not Matches");
	     }
	     
	  
	         // Return the formed String[]
	       
	        	  
	        		   String[] P = CP1.split("!"); 
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
	        			  if(p==28) 
	        				{
	        					 System.out.println("Subcontractor value: Matches");
	        				}
	        			 // break;

	        		  }
	        	     		   
	        	     		   }    
	        	         	if(!st) {
	        	        		//System.out.println("Subcontractor value:"+ C);
	        	        		System.out.println("Subcontractor value:Not Matches");
	        	        	}
	        	 		
	        	         Actions action = new Actions(Driver);
		 	                action.sendKeys(Keys.ESCAPE).build().perform();     
		EIN.sendKeys("345-46-2356");
	/*WebDriverWait wait5 = new WebDriverWait(Driver, 40);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Subcontractor 10062021')]")));
		Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation')]")).click();*/
		ContractType.click();
		List<WebElement> S=Driver.findElements(By.xpath("//div[@id='mui-component-select-contractorType']//following::ul[2]//li"));
	     System.out.println(S.size());
			 
	     
	  
	         // Return the formed String[]
	       
	        	  
	        		   String[] arr = CT.split("!"); 
	        			 int count=0;
	        			   boolean strFlag;
	        	         for(int i=0;i<S.size();i++)
	        	 		{
	        	        	 strFlag = false;
	        	         	for (String C : arr) 
	        	     		   {
	        	         	//System.out.println(Pro); 
	        				//System.out.println("Project Name value:"+Pr.get(i).getText());
	        		  if(S.get(i).getText().equals(C))
	        		  {
	        			  System.out.println("Contractor Type value:"+S.get(i).getText());
	        			  strFlag=true;
	        			  count=count+1;
	        			  if(count==2) 
	        				{
	        					 System.out.println("Contractor Type value: Matches");
	        				}
	        			  break;

	        		  }
	        	     		   }   
	        	         	if(!strFlag) {
	        	        		System.out.println("Contractor Type value:"+ S.get(i).getText());
	        	        		System.out.println("Contractor Type value:Not Matches");
	        	        	}
	        	 		}
	        	         
	        	         
	        	         Actions action1 = new Actions(Driver);
	 	                action1.sendKeys(Keys.ESCAPE).build().perform();
	 	               // WebDriverWait wait = new WebDriverWait(Driver, 10);
	 	                WebDriverWait wait1 = new WebDriverWait(Driver, 10);
	 	        		WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']"));
	 	        		wait1.until(ExpectedConditions.elementToBeClickable(ele1));
	 	        		ele1.click();
	 	        		List<WebElement> E=Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']//following::ul[2]//li"));
		    			 System.out.println(E.size());
		    			 String[] arr1 = ET.split("!"); 
		    			 int count1=0;
	      			   boolean strFlag1;
	      	         for(int i=0;i<E.size();i++)
	      	 		{
	      	        	 strFlag1 = false;
	      	         	for (String ETH : arr1) 
	      	     		   {
	      	         	//System.out.println(Pro); 
	      				//System.out.println("Project Name value:"+Pr.get(i).getText());
	      		  if(E.get(i).getText().equals(ETH))
	      		  {
	      			  System.out.println("Ethnicity value:"+E.get(i).getText());
	      			  strFlag1=true;
	      			  count1=count1+1;
	      			  if(count1==11) 
	      				{
	      					 System.out.println("Ethnicity value: Matches");
	      				}
	      			  break;

	      		  }
	      	     		   }   
	      	         	if(!strFlag1) {
	      	        		System.out.println("Ethnicity value:"+ E.get(i).getText());
	      	        		System.out.println("Ethnicity Type value:Not Matches");
	      	        	}
	      	 		}
	 	        		
	        	         Actions act = new Actions(Driver);
	 	                act.sendKeys(Keys.ESCAPE).build().perform();
	 	             GenderId.click();  
	 	            Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		        		List<WebElement> G=Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerGenderId']//following::ul[2]//li"));
		    			 System.out.println(G.size());
		    			 String[] arr2 = GEN.split("!"); 
		    			 int count2=0;
	      			   boolean strFlag2;
	      	         for(int i=0;i<G.size();i++)
	      	 		{
	      	        	 strFlag2 = false;
	      	         	for (String GE : arr2) 
	      	     		   {
	      	         	//System.out.println(Pro); 
	      				//System.out.println("Project Name value:"+Pr.get(i).getText());
	      		  if(G.get(i).getText().equals(GE))
	      		  {
	      			  System.out.println("Gender:"+G.get(i).getText());
	      			  strFlag2=true;
	      			  count2=count2+1;
	      			  if(count2==4) 
	      				{
	      					 System.out.println("Gender value: Matches");
	      				}
	      			  break;

	      		  }
	      	     		   }   
	      	         	if(!strFlag2) {
	      	        		System.out.println("Gender value:"+ G.get(i).getText());
	      	        		System.out.println("Gender Type value:Not Matches");
	      	        	}
	      	 		}
	      	         
	      	         //Address History
	      	       Actions ac = new Actions(Driver);
	                ac.sendKeys(Keys.ESCAPE).build().perform();
	      	         AddressHistory.click();
	      	         AddNew.click();
	      	         Country.click();
	      	 		List<WebElement> C=Driver.findElements(By.xpath("//div[@id='mui-component-select-country']//following::ul[2]//li"));
	    			 System.out.println(C.size());
	    			 String[] arr3 = C1.split("!"); 
	    			 int count3=0;
     			   boolean strFlag3;
     	         for(int i=0;i<C.size();i++)
     	 		{
     	        	 strFlag3 = false;
     	         	for (String COU : arr3) 
     	     		   {
     	         	//System.out.println(Pro); 
     				//System.out.println("Project Name value:"+Pr.get(i).getText());
     		  if(C.get(i).getText().equals(COU))
     		  {
     			  System.out.println("Country value:"+C.get(i).getText());
     			  strFlag3=true;
     			  count3=count3+1;
     			  if(count3==3) 
     				{
     					 System.out.println("Country value: Matches");
     				}
     			  break;

     		  }
     	     		   }   
     	         	if(!strFlag3) {
     	        		System.out.println("Country value:"+ C.get(i).getText());
     	        		System.out.println("Country Type value:Not Matches");
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
	Actions action4 = new Actions(Driver);
     action4.sendKeys(Keys.ESCAPE).build().perform();
     AddNew.click();
     Country.click();
     WebElement Ca=Driver.findElement(By.xpath("//*[contains(text(),'Canada')]"));
     if(Ca.isDisplayed())
     {
    	Ca.click(); 
     }
     Province.click();
     List<WebElement> PR= Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
	     System.out.println(PR.size());
	     String[] a4 = PRO.split("!"); 
	     boolean s4; 
	     int c4=0;
	     for(int i=0;i<PR.size();i++)
	     {
	     s4 = false;
	     for (String e3 : a4) 
	        {
	     //System.out.println(Pro); 
	     //System.out.println("Gender value:"+GE.get(i).getText());
	     if(PR.get(i).getText().equals(e3))
	     {
	     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	       System.out.println("Province value:"+PR.get(i).getText());
	       s4=true;
	       c4=c4+1;
	       if(c4==14) 
	     	{
	     		 System.out.println("Province value: Matches");
	     	}
	      break;
	     }

	     }

	     if(!s4) 
	     {
	     System.out.println("Province value:"+ PR.get(i).getText());
	     System.out.println("Province value:Not Matches");
	     }	 
} 
	     Actions can=new Actions(Driver);
	 	can.moveToElement(AddressCancel).build();
	 	can.click(AddressCancel).perform();
	 	AddressCancel.click();
	 	
	 	//Work Info
	 	WorkInfo.click();
	 	WorkCode.click();
	     List<WebElement> WC= Driver.findElements(By.xpath("//div[@id='mui-component-select-compCodeIds']//following::ul[2]//li"));
		     System.out.println(WC.size());
		     String[] a5 = WOC.split("!"); 
		     boolean s5; 
		     int c5=0;
		     for(int i=0;i<WC.size();i++)
		     {
		     s5 = false;
		     for (String e5 : a5) 
		        {
		     if(WC.get(i).getText().equals(e5))
		     {
		     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		       System.out.println("Work Code value:"+WC.get(i).getText());
		       s5=true;
		       c5=c5+1;
		       if(c5==1) 
		     	{
		     		 System.out.println("Work Code: Matches");
		     	}
		      break;
		     }

		     }

		     if(!s5) 
		     {
		     System.out.println("Work Code value:"+ WC.get(i).getText());
		     System.out.println("Work Code value:Not Matches");
		     }	 
	} 
		     Actions action7 = new Actions(Driver);
		     action7.sendKeys(Keys.ESCAPE).build().perform();
		     WorkScope.click();
		     List<WebElement> WS= Driver.findElements(By.xpath("//div[@id='mui-component-select-workScopeIds']//following::ul[2]//li"));
			     System.out.println(WS.size());
			     String[] a6 = WSC.split("!"); 
			     boolean s6; 
			     int c6=0;
			     for(int i=0;i<WS.size();i++)
			     {
			     s6 = false;
			     for (String e6 : a6) 
			        {
			     if(WS.get(i).getText().equals(e6))
			     {
			     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			       System.out.println("Work Scope value:"+WS.get(i).getText());
			       s6=true;
			       c6=c6+1;
			       if(c6==89) 
			     	{
			     		 System.out.println("Work Scope value: Matches");
			     	}
			      break;
			     }

			     }

			     if(!s6) 
			     {
			     System.out.println("Work Scope value:"+ WS.get(i).getText());
			     System.out.println("Work Scope value:Not Matches");
			     }	 
		}
			     Actions action8 = new Actions(Driver);
			     action8.sendKeys(Keys.ESCAPE).build().perform();
			     
			     //Goal Tracking
			     GoalTracking.click();
			     AddNewGoal.click();
			     Select.click();
			     List<WebElement> Goal=Driver.findElements(By.xpath("//div[@id='menu-goalId']//following::ul[1]//li"));
			     System.out.println(Goal.size());
			     String[] a7 = Gl.split("!"); 
			     boolean s7; 
			     int c7=0;
			     for(int i=0;i<Goal.size();i++)
			     {
			     s7 = false;
			     for (String e7 : a7) 
			        {
			     if(Goal.get(i).getText().equals(e7))
			     {
			     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			       System.out.println("Goal value:"+Goal.get(i).getText());
			       s7=true;
			       c7=c7+1;
			       if(c7==4) 
			     	{
			     		 System.out.println("Goal value: Matches");
			     	}
			      break;
			     }

			     }

			     if(!s7) 
			     {
			     System.out.println("Goal value:"+ Goal.get(i).getText());
			     System.out.println("Goal value:Not Matches");
			     }	 
}
			     
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
			     for(int i=0;i<STD.size();i++)
			     {
			     s11 = false;
			     for (String e11 : a11) 
			        {
			     if(STD.get(i).getText().equals(e11))
			     {
			     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			       System.out.println("Subcontractor Type value:"+STD.get(i).getText());
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
			     System.out.println("Subcontractor Type value:"+ STD.get(i).getText());
			     System.out.println("Subcontractor Type value:Not Matches");
			     }	 
}
			     Actions action13 = new Actions(Driver);
			     action13.sendKeys(Keys.ESCAPE).build().perform();
			     Driver.findElement(By.xpath("//*[contains(text(),'Cancel')]")).click();
			     Driver.findElement(By.xpath("//*[contains(text(),'You have')]//following::span[3]")).click();
			     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
					WebDriverWait wait = new WebDriverWait(Driver, 40);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
					Driver.navigate().refresh();
					WebDriverWait wait3 = new WebDriverWait(Driver, 20);
					wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")));
					Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")).click();
					BusinessEntities.click();
					AddNewCertificate.click();
					EntityType.click();
					List<WebElement> EN=Driver.findElements(By.xpath("//div[@id='entityType']//following::ul[2]//li"));
				     System.out.println(EN.size());			     
				     String[] a12 = ENT.split("!"); 
				     boolean s12; 
				     int c12=0;
				     for(int i=0;i<EN.size();i++)
				     {
				     s12 = false;
				     for (String e12 : a12) 
				        {
				     if(EN.get(i).getText().equals(e12))
				     {
				     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				       System.out.println("Certificate value:"+EN.get(i).getText());
				       s12=true;
				       c12=c12+1;
				       if(c12==16) 
				     	{
				     		 System.out.println("Certificate value: Matches");
				     	}
				      break;
				     }

				     }

				     if(!s12) 
				     {
				     System.out.println("Certificate value:"+ EN.get(i).getText());
				     System.out.println("Certificate value:Not Matches");
				     }	 
	}
				     Actions action12 = new Actions(Driver);
				     action12.sendKeys(Keys.ESCAPE).build().perform();
				     Entitystate.click();
				     List<WebElement> ES=Driver.findElements(By.xpath("//div[@id='state']//following::ul[2]//li"));
				     System.out.println(ES.size());			     
				     String[] a13 = EST.split("!"); 
				     boolean s13; 
				     int c13=0;
				     for(int i=0;i<ES.size();i++)
				     {
				     s13 = false;
				     for (String e13 : a13) 
				        {
				     if(ES.get(i).getText().equals(e13))
				     {
				     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				       System.out.println("Entity State value:"+ES.get(i).getText());
				       s13=true;
				       c13=c13+1;
				       if(c13==56) 
				     	{
				     		 System.out.println("Entity State value: Matches");
				     	}
				      break;
				     }

				     }

				     if(!s13) 
				     {
				     System.out.println("Entity State value:"+ ES.get(i).getText());
				     System.out.println("Entity State value:Not Matches");
				     }	
				     }
				     Actions action14 = new Actions(Driver);
				     action14.sendKeys(Keys.ESCAPE).build().perform();
				     Contacts.click();
				     AddNewContacts.click();
				    WebElement W1=Driver.findElement(By.xpath("//*[contains(text(),'User Privileges')]//following::div[1]//div[1]"));
				    /* System.out.println(W1.size());
				     String[] a14 = CO.split("!"); 
				     boolean s14; 
				     int c14=0;
				     for(int i=0;i<W1.size();i++)
				     {
				     s14 = false;
				     for (String e14 : a14) 
				        {*/
				   String[] a14 = CO.split("!"); 
				    boolean s14;
				    s14 = false;
				     if(W1.getText().equals(CO))
				     {
				     Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				       System.out.println("User Privileges value:"+W1.getText());
				       System.out.println("User Privileges value: Matches");
				     }
				       else
				       {
				     System.out.println("User Privileges value:"+W1.getText());
				     System.out.println("User Privileges value:Not Matches");
				     }	
				     }
	
					

					
			   
			   
	
	
	/*	public void AddNewContacts(String un,String fn,String ln,String ct,String ph,String CUN,String PW,String CPW)
	{
	    Driver.navigate().refresh();
		WebDriverWait wait4 = new WebDriverWait(Driver,40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Subcontractor 10062021')]")));
		Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation Subcontractor 10062021')]")).click();
		Contacts.click();
		AddNewContacts.click();
		UserName.sendKeys(un);
		FirstName.sendKeys(fn);
		LastName.sendKeys(ln);
		ConTitle.sendKeys(ct);
		Phone.sendKeys(ph);
		List<WebElement> W1=Driver.findElements(By.xpath("//*[contains(text(),'User Privileges')]//following::div[1]//div[1]"));
		System.out.println(W1.size());
		for(int j1=0;j1<W1.size();j1++)
		{
			System.out.println(W1.get(j1).getText());
	 if(W1.get(j1).isSelected())
	 {
		 System.out.println("Checked:"+W1);
		 }		
	}	
		ContactsCancel.click();
		AddNewContacts.click();
		UserName.sendKeys(un);
		FirstName.sendKeys(fn);
		LastName.sendKeys(ln);
		ConTitle.sendKeys(ct);
		Phone.sendKeys(ph);
		Addbutton.click();
		Search.sendKeys("123");
		Search.clear();
		//SubContactsTab.click();
		LockIcon.click();
		ConfirmUserName.sendKeys(CUN);
		Password.sendKeys(PW);
		ConfirmPassword.sendKeys(CPW);
		/*Actions A3=new Actions(Driver);
		A3.moveToElement(Cancel).build();
		A3.click(Cancel).perform();
		LockIcon.click();
		ConfirmUserName.sendKeys(CUN);
		Password.sendKeys(PW);
		ConfirmPassword.sendKeys(CPW);
		WebDriverWait wait5 = new WebDriverWait(Driver, 20);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='confirmPwd']//following::button[3]")));
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Reset);
		AccountIcon.click();
		 Actions L=new Actions(Driver);
		 L.moveToElement(Logout).build();
		 L.click(Logout).perform();
		}*/
	public String ValidateResetInstruction()
	{
		 //Driver.navigate().refresh();
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		Driver.navigate().refresh();
		WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")));
		Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")).click();
		Contacts.click();
		LockIcon.click();
		return ResetInstruction.getText();	
	}
	
	public String ValidateUsers()
	{
		 //Driver.navigate().refresh();
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		Driver.navigate().refresh();
		WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")));
		Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")).click();Contacts.click();
		Contacts.click();
		return  VerifyUser.getText();
	}
	
	public String ValidateEmail()
	{
		 //Driver.navigate().refresh();
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		Driver.navigate().refresh();
		WebDriverWait wait1 = new WebDriverWait(Driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")));
		Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")).click();Contacts.click();
		Contacts.click();
		return  VerifyEmail.getText();
	}
	
   public String ValidateFeatures()
   {
	    //Driver.navigate().refresh();
	   Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		Driver.navigate().refresh();
		WebDriverWait wait1 = new WebDriverWait(Driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")));
		Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")).click();Contacts.click();
		Contacts.click();
	   return Feature.getText();
   }
   
   public String ValidateReadOnly()
   {
	   //Driver.navigate().refresh();
	   Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		Driver.navigate().refresh();
		WebDriverWait wait1 = new WebDriverWait(Driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")));
		Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")).click();
		Contacts.click();
	   return ReadOnly.getText();
   }
   
   public String ValidateReports()
   {
	  // Driver.navigate().refresh();
	   Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Subcontractor / Supplier')]")));
		Driver.navigate().refresh();
		WebDriverWait wait1 = new WebDriverWait(Driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")));
		Driver.findElement(By.xpath("//*[contains(text(),'New Q3 Automation Test Subcontractor')]")).click();
		Contacts.click();
	   return Reports.getText();
   }
  
}