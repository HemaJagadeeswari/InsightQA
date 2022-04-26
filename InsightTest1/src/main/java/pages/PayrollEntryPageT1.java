package pages;

import java.awt.AWTException;
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

public class PayrollEntryPageT1 extends TestBase{

	
	
	@FindBy(xpath="//*[contains(text(),'Manual Payroll Entry')]")
	WebElement ManualPayrollEntry;
	
	@FindBy(xpath="//*[contains(text(),'Import Payroll Entry')]")
	WebElement ImportPayrollEntry;
	
	@FindBy(xpath="//*[contains(text(),'Export Payroll Data')]")
	WebElement ExportPayrollEntry;
	
	@FindBy(xpath="//*[contains(text(),'Work Class Mappings')]")
	WebElement WorkClassMapping;
	
	@FindBy(xpath="//*[contains(text(),'WH-347 Generation')]")
	WebElement WH347Generation;
	
	@FindBy(id="mui-component-select-selectedDateRange")
	WebElement SelectPayrollPeriod;
	
	@FindBy(xpath="//*[contains(text(),'Cancel')]")
	WebElement Cancel;
	
	@FindBy(xpath="(//*[contains(text(),'Create')])[2]")
	WebElement Create;
	
	@FindBy(xpath="//*[contains(text(),'Delete')]")
	WebElement Delete;
	
	@FindBy(xpath="//*[contains(text(),'Are')]//following::button[1]")
	WebElement No;
	
	@FindBy(xpath="//*[contains(text(),'Are')]//following::button[2]")
	WebElement Yes;
	
	
	@FindBy(id="fica")
	WebElement Fica;
	
	@FindBy(id="withholding")
	WebElement Withholding;
	
	@FindBy(id="state")
	WebElement State;
	
	@FindBy(id="local")
	WebElement Local;
	
	@FindBy(id="other")
	WebElement Other;
	
	@FindBy(id="exemptions")
	WebElement Exemptions;
	
	@FindBy(xpath="//*[contains(text(),'Non Project Hours')]//following::div[2]")
	WebElement NonProjectHours;
	
	@FindBy(id="wages")
	WebElement Wages;
	
	@FindBy(xpath="(//*[contains(text(),'Next')])[1]")
	WebElement Next;
	
	@FindBy(xpath="(//*[contains(text(),'Save')])[2]")
	WebElement Save;
	
	@FindBy(xpath="(//*[contains(text(),'Edit')])[2]")
	WebElement Edit;
	
	@FindBy(xpath="//*[contains(text(),'Enter Hours')]")
	WebElement EnterHours;
	
	@FindBy(xpath="//*[contains(text(),'Change to')]")
	WebElement ChangeToNoWork;
	
	@FindBy(xpath="(//*[contains(text(),'Sign')])[2]")
	WebElement Sign;
	
	@FindBy(xpath="//*[contains(text(),'Refresh')]")
	WebElement RefreshPayroll;
	
	@FindBy(xpath="//*[contains(text(),'Mark')]")
	WebElement MarkAsFinal;
	
	@FindBy(xpath="//*[contains(text(),'Clear')]")
	WebElement ClearFinalFlag;
	
	@FindBy(id="mui-component-select-selectedPayrollId")
	WebElement PayrollReportPeriod;
	
	@FindBy(xpath="//*[contains(text(),'Save Edit')]")
	WebElement SaveEdit;
	
	@FindBy(xpath="//*[contains(text(),'Cancel Edit')]")
	WebElement CancelEdit;
	
	@FindBy(xpath="//*[contains(text(),'Switch on')]//preceding::input[1]")
	WebElement OJT;
	
	@FindBy(xpath="//*[contains(text(),'Employee Management')]")
	WebElement EmployeeManagement;
	
		
	@FindBy(xpath="//*[contains(text(),'Work Classes')]//following::div[1]")
	WebElement PayrollEntry;
	
	public PayrollEntryPageT1()
	{
		PageFactory.initElements(Driver,this);
	}

	public String ValidateManualPayrollEntryTab()
	{
		return ManualPayrollEntry.getText();
	}
	
	public String ValidateImportPayrollEntryTab()
	{
		return ImportPayrollEntry.getText();
	}
	
	public String ValidateWorkClassMappingTab()
	{
		return WorkClassMapping.getText();
	}
	
	public String ValidateWH347GenerationTab()
	{
		return WH347Generation.getText();
	}
	
	public String ValidateEditbutton()
	{
		return Edit.getText();
	}
	
	public String ValidateEnterHoursButton()
	{
		return EnterHours.getText();
	}
	
	public String ValidateChangeToNoWorkButton()
	{
		return ChangeToNoWork.getText();
	}
	
	public String ValidateSignbutton()
	{
		return Sign.getText();
	}
	
	public String ValidateRefreshPayrollbutton()
	{
		return RefreshPayroll.getText();
	}
	
	public String ValidateMarkAsFinalbutton()
	{
		return MarkAsFinal.getText();
	}
	
	public String ValidateClearFinalFlagbutton()
	{
		return ClearFinalFlag.getText();
	}
	
	public String ValidateDeletebutton()
	{
		return Delete.getText();
	}
	

	
	
	public void PayrollEntryPageImageVerification() throws IOException, AWTException, InterruptedException
	{

		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\PayrollEntryPageT1.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\PayrollEntryPageT1.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
	ImageDiffer imgdiffer = new ImageDiffer();
		   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Payroll Entry T1 Page: Payroll Entry Page Images are not same");
		}
		else
		{
		System.out.println("Payroll Entry T1 Page: Payroll Entry Page Images are same");
			}
	}
	
	public void ManualPayrollEntryImageVerification() throws IOException, AWTException
	{
	ManualPayrollEntry.click();
		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\ManualPayrollEntryPageT1.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ManualPayrollEntryPageT1.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
	ImageDiffer imgdiffer = new ImageDiffer();
		   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Payroll Entry T1 Page: Manual Payroll Images are not same");
		}
		else
		{
		System.out.println("Payroll Entry T1 Page: Manual Payroll Images are same");
			}
	}
	
	public void ValidateManualPayrollCreation(String STP,String Day1,String H1,String OT1,String DT1,String OE,String Day2,String H2,String OT2,
			String DT2,String Day3,String H3,String OT3,String F1,String W1,String S1, String L1,String O1,String E1,String NP1, String WA1,String Day4,
			String H4,String OT4,String DT4,String F3,String W3,String S3)
	{
		WebDriverWait W=new WebDriverWait(Driver,40);
		W.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Manual')]")));
	    ManualPayrollEntry.click();
		SelectPayrollPeriod.click();
		 List<WebElement> SP=Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedDateRange']//following::ul[2]//li"));
		 System.out.println(SP.size());
			
			for(int k=0;k<SP.size();k++)
			{
		 if(SP.get(k).getText().equals(STP))
		 {
			 System.out.println(SP.get(k).getText());
			 SP.get(k).click();
			 break;
		 }
			}
			Actions action = new Actions(Driver);
		    action.sendKeys(Keys.ESCAPE).build().perform();
			Cancel.click();
			ManualPayrollEntry.click();
			SelectPayrollPeriod.click();
			 List<WebElement> SP1=Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedDateRange']//following::ul[2]//li"));
			 System.out.println(SP1.size());
				for(int k=0;k<SP1.size();k++)
				{
			 if(SP1.get(k).getText().equals(STP))
			 {
				 System.out.println(SP1.get(k).getText());
				 SP1.get(k).click();
				 break;
			 }
				}
				Actions action1 = new Actions(Driver);
			    action1.sendKeys(Keys.ESCAPE).build().perform();
				Create.click();
				Cancel.click();
				Delete.click();
				String D=Driver.findElement(By.xpath("//*[contains(text(),'You are')]")).getText();
				String Exp="You are about to permanently delete this payroll. Do you want to proceed?";
			    if(SP.contains(Exp))
			    {
			    	System.out.println("Assigned to Project validation message is matching");
			    }
			    else
			    {
			    	System.out.println("Assigned to Project validation message is matching");
			    }
				No.click();
				Delete.click();
				Yes.click();
				ManualPayrollEntry.click();
				SelectPayrollPeriod.click();
				 List<WebElement> SP2=Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedDateRange']//following::ul[2]//li"));
				 System.out.println(SP2.size());
					for(int k=0;k<SP2.size();k++)
					{
				 if(SP2.get(k).getText().equals(STP))
				 {
					 System.out.println(SP2.get(k).getText());
					 SP2.get(k).click();
					 break;
				 }
					}
					Actions action2 = new Actions(Driver);
				    action2.sendKeys(Keys.ESCAPE).build().perform();
					Create.click();
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[1]")).sendKeys(H1);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[2]")).sendKeys(OT1);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[3]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[3]")).sendKeys(DT1);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[7]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[7]")).sendKeys(OE);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(H2);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[2]")).sendKeys(OT2);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[3]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[3]")).sendKeys(DT2);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[1]")).sendKeys(H3);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[2]")).sendKeys(OT3);
					Fica.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Fica.sendKeys(F1);
					Withholding.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Withholding.sendKeys(W1);
					State.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					State.sendKeys(S1);
					Local.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Local.sendKeys(L1);
					Other.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Other.sendKeys(O1);
					Exemptions.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Exemptions.sendKeys(E1);
					NonProjectHours.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					NonProjectHours.sendKeys(NP1);
					Wages.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Wages.sendKeys(WA1);
					Next.click();
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(H3);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[2]")).sendKeys(OT3);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[1]")).sendKeys(H4);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[2]")).sendKeys(OT4);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[3]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[3]")).sendKeys(DT4);
					Fica.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Fica.sendKeys(F3);
					Withholding.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Withholding.sendKeys(W3);
					State.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					State.sendKeys(S3);
					Save.click();						
	}
	
	public void EditPayroll(String PP,String FN,String Day1,String H1,String OT1,String DT1,String OE
			,String F1,String W1,String S1,String L1,String O1,String E1,String NP1, String WA1,
			String Day2,String H2,String OT2,String Name)
	{
		PayrollReportPeriod.click();
		List<WebElement> PRP=Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedPayrollId']//following::ul[2]//li"));
		 System.out.println(PRP.size());
			
			for(int k=0;k<PRP.size();k++)
			{
		 if(PRP.get(k).getText().equals(PP))
		 {
			 System.out.println(PRP.get(k).getText());
			 PRP.get(k).click();
			 break;
		 }
			}
			Actions action2 = new Actions(Driver);
		    action2.sendKeys(Keys.ESCAPE).build().perform();	
		    Edit.click();
		    CancelEdit.click();
		    Edit.click();
		    Actions A=new Actions(Driver);
		    WebElement N=Driver.findElement(By.xpath("//*[contains(text(),'"+FN+"')]//preceding::div[1]"));
		    A.moveToElement(N).build();
		    A.click(N).perform();
		    OJT.click();
		    Actions action3 = new Actions(Driver);
		    action3.sendKeys(Keys.ESCAPE).build().perform();
		    WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[1]"));
		    ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
		    Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[1]")).click();
		  Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[1]")).sendKeys(H1);
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[2]")).sendKeys(OT1);
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[3]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[3]")).sendKeys(DT1);
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[7]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[7]")).sendKeys(OE);
			Fica.sendKeys(F1);
			Withholding.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Withholding.sendKeys(W1);
			State.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			State.sendKeys(S1);
			Local.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Local.sendKeys(L1);
			Other.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Other.sendKeys(O1);
			Exemptions.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Exemptions.sendKeys(E1);
			NonProjectHours.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			NonProjectHours.sendKeys(NP1);
			Wages.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Wages.sendKeys(WA1);
			SaveEdit.click();
			String OJTV="Y";
			if(Driver.findElement(By.xpath("//*[contains(text(),'"+FN+"')]//following::div[3]//p")).getText().contains(OJTV))
			{
				System.out.println("OJT value is matching");
			}
			else
			{
				System.out.println("OJT value is matching");
			}
			Edit.click();
			EnterHours.click();
			 Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(H2);
				Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[2]")).sendKeys(OT2);
				Save.click();
				EmployeeManagement.click();
				Driver.findElement(By.xpath("//*[text()[contains(.,'"+Name+"')]]//following::input[1]")).click();
				String SP=Driver.findElement(By.xpath("//*[contains(text(),'This employee')]")).getText();
				String Exp="This employee has hours on 1 or more unsigned payrolls. Removing their assignment will remove them from those payrolls.";
			    if(SP.contains(Exp))
			    {
			    	System.out.println("Assigned to Project validation message is matching");
			    }
			    else
			    {
			    	System.out.println("Assigned to Project validation message is matching");
			    }
			    No.click();
			    Driver.findElement(By.xpath("//*[text()[contains(.,'"+Name+"')]]//following::input[1]")).click();
			    Yes.click();
			    Actions A1=new Actions(Driver);
			    A.moveToElement(PayrollEntry).build();
			   A.click(PayrollEntry).perform();
			    PayrollReportPeriod.click();
				List<WebElement> PRP1=Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedPayrollId']//following::ul[2]//li"));
				 System.out.println(PRP1.size());
					
					for(int k=0;k<PRP1.size();k++)
					{
				 if(PRP1.get(k).getText().equals(PP))
				 {
					 System.out.println(PRP1.get(k).getText());
					 PRP1.get(k).click();
					 break;
				 }
					}
					Actions action4 = new Actions(Driver);
				    action4.sendKeys(Keys.ESCAPE).build().perform();
				    Edit.click();
				    RefreshPayroll.click();
				    if(Driver.findElement(By.xpath("(//*[text()[contains(.,'"+FN+"')]]")).isDisplayed())
				    {
				    	System.out.println("Turned off Employee is seen");
				    }
				    else
				    {
				    	System.out.println("Turned off Employee is not seen as expected");
				    }
	}
	
		
}
