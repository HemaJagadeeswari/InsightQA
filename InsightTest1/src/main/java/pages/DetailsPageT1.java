package pages;

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
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;

public class DetailsPageT1 extends TestBase
{
	@FindBy(id="name")
	WebElement ProjectName;
	
	@FindBy(id="number")
	WebElement Number;
	
	@FindBy(xpath="//*[contains(text(),'ethnicity')]//following::div[1]")
	WebElement Ethnicity;
	
	@FindBy(id="mui-component-select-ownerGenderId")
	WebElement Gender;
	
	@FindBy(xpath="//*[contains(text(),'Address History')]//following::button[3]")
	WebElement SiteAddressEdit;
	
	@FindBy(xpath="//*[contains(text(),'Existing Addresses')]//following::div[1]")
	WebElement ExistingAddress;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']//following::li[5]//p")
	WebElement SiteAddress;
	
	@FindBy(xpath="//*[contains(text(),'Address History')]//following::button[1]")
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
	
	@FindBy(xpath="//input[@id='province']")
	WebElement Province;
	
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
	
	@FindBy(xpath="//*[contains(text(),'Authorize')]//preceding::input[1]")
	WebElement AuthorizeToggle; 
	
	@FindBy(xpath="//*[contains(text(),'Go to project setup wizard')]")
	WebElement Link;
	
	@FindBy(xpath="//*[contains(text(),'Go to project setup wizard')]//following::button[1]")
	WebElement Cancelbutton;
	
	@FindBy(xpath="//*[contains(text(),'Go to project setup wizard')]//following::button[2]")
	WebElement Savebutton;
	
	//Configuration
	@FindBy(xpath="//*[contains(text(),'Configuration')]")
	WebElement Configuration;
	
	@FindBy(id="mui-component-select-payrollSchedule")
	WebElement PayrollSchedule;
	
	@FindBy(id="mui-component-select-payrollEndDay")
	WebElement PayrollEndDay;
	
	@FindBy(xpath="	//*[contains(text(),'2017')]//following::input[1]")
	WebElement NAICToggle;
	
	@FindBy(xpath="//*[contains(text(),'Code Version: 2018')]//following::span[1]")
	WebElement SOCToggle;
	
	@FindBy(xpath="//*[contains(text(),'Code Version: 5digit')]//following::span[1]")
	WebElement NIGPToggle;
	
	@FindBy(xpath="//*[contains(text(),'Certification')]")
	WebElement Certification;
	
	@FindBy(xpath="//*[contains(text(),'Labor Standard')]")
	WebElement LaborStandard;
	
	@FindBy(xpath="(//*[contains(text(),'Employee Management')])[1]")
	WebElement EmployeeManagement;


	
		public DetailsPageT1()
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
	
	/*public void EthnicityandGenderSelection(String E,String G)
	{
		    Ethnicity.click();
		    List<WebElement> l= Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']//following::ul//li"));
			System.out.println(l.size());
			for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
			
		}
	    Driver.findElement(By.xpath("//*[contains(text(),'"+E+"')]")).click();
	    Gender.click();
	    List<WebElement> l1= Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerGenderId']//following::ul//li"));
		System.out.println(l1.size());
		for(int i=0;i<l1.size();i++)
	{
		System.out.println(l.get(i).getText());
		
	}
    Driver.findElement(By.xpath("//*[contains(text(),'"+G+"')]")).click();
	    Savebutton.click();
	}*/
	
	
	
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
		JavascriptExecutor executor1 = (JavascriptExecutor)Driver;
		executor1.executeScript("arguments[0].click();", CorporateAddressEdit);
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Province);
		//Province.click();
		/*List<WebElement> state=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
		 System.out.println(state.size());
			for(int l=0;l<=state.size()-1;l++)
			{
				System.out.println(state.get(l).getText());
	}*/
		
		return Province.getAttribute("value");
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
	
	public void ValidateAuthorizeToggle()
	{
		
		if(AuthorizeToggle.isSelected())
		{
			System.out.println("Authorize my GC to edit my data is Preselected");
		}
		else
		{
			System.out.println("Authorize my GC to edit my data is not Preselected");
		}
	}
	
	public String ValidateSetupLink()
	{
		return Link.getText();
	}
	
	public String ValidateCancelbutton()
	{
		ActualStart.click();
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
	
	public String Validate()
	{
		ActualStart.click();
		ActualStart.sendKeys("01/02/2019");
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Savebutton);	
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Go to project setup wizard')]//following::button[2]//child::span"));
		return S.getText();
	}
	
	//Configuration
	public String ValidateConfigurationTab()
	{
		Configuration.click();
		return Configuration.getText();
	
	}
	
	
	public String ValidatePayrollSchedulefield()
	{
		Configuration.click();
		return PayrollSchedule.getText();
	}
	
	public String ValidatePayrollEndDay()
	{
		Configuration.click();
		return PayrollEndDay.getText();
	}
	
	public void ValidatePreselectedWorkCodes()
	{
		Configuration.click();
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
	
	
	//Certificate
	
	public String ValidateCertificateTab()
	{
		Certification.click();
		return Certification.getText();
	
	}
	
	public void DetailsCertifcationImageVerification() throws IOException {
		Certification.click();
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Your Certifications')]")));
		
	BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\CertificationT1.png."));

		
		Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshotC.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\CertificationT1.png"));
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
		
	
	}
	//Labor Standard
	
	public String ValidateLaborStandardTab()
	{
		LaborStandard.click();
		return LaborStandard.getText();
	
	}
	
	public void DetailsLaborStandardImageVerification() throws IOException {
		LaborStandard.click();
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Project Documents')]")));
		BufferedImage expectedImageL = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\LaborStandardT1.png."));

		
		Screenshot ImageScreenshotL= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshotL.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\LaborStandardT1.png"));
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
	public void DetailsPageDDNVerification(String ET,String G,String C1,String C2,String ADT,
			String PS,String PED) 
	{
		//,
		try {
			 
		Ethnicity.click();
		 
		WebDriverWait wait = new WebDriverWait(Driver, 30);
		/*wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'White - ')]")));
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);*/
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
				  if(count==11) 
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
		A.moveToElement(Configuration).build();
		A.click(Configuration).perform();
		Configuration.click();
	PayrollSchedule.click();
	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	List<WebElement> PI= Driver.findElements(By.xpath("//div[@id='mui-component-select-payrollSchedule']//following::ul[2]//li"));
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
		System.out.println("Payroll Schedule value:"+PI.get(i).getText());
		  strFlag2=true;
		  count2=count2+1;
		  if(count2==4) 
			{
				 System.out.println("Payroll Schedule value: Matches");
			}
		 break;
	}

	 }

	if(!strFlag2) {
		System.out.println("Payroll Schedule value:"+ PI.get(i).getText());
		System.out.println("Payroll Schedule value:Not Matches");
	}
	}
	Actions action4 = new Actions(Driver);
	action4.sendKeys(Keys.ESCAPE).build().perform();
	WebDriverWait wait1 = new WebDriverWait(Driver, 20);
	WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-payrollEndDay']"));
	wait1.until(ExpectedConditions.elementToBeClickable(ele));
	ele.click();
	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	List<WebElement> PD= Driver.findElements(By.xpath("//div[@id='mui-component-select-payrollEndDay']//following::ul[2]//li"));
	System.out.println(PD.size());
	String[] arr3 = PED.split("!"); 
	boolean strFlag3;  
	int count3=0;
	for(int i=0;i<PD.size();i++)
	{
		strFlag3=false;
		for (String P : arr3) 
		   {
		
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
	Actions action5 = new Actions(Driver);
	action5.sendKeys(Keys.ESCAPE).build().perform();
	
		}
		catch(Exception E)
		{
			System.out.println(E+"");
		}

	}
	


	public EmployeeManagementPageT1 EMlaunch() {
		// TODO Auto-generated method stub
		EmployeeManagement.click();
		return new EmployeeManagementPageT1();
	}
}
