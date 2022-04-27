package pages;
import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;
public class EmployeeManagementPageT1 extends TestBase{

	@FindBy(xpath="(//*[contains(text(),'Employee Management')])[1]")
	WebElement EmployeeManagement;

	@FindBy(xpath="//*[contains(text(),'Employees')]")
	WebElement EmployeesTab;
	
	@FindBy(xpath="//*[contains(text(),'Add Employee')]")
	WebElement AddEmployee;
	
	@FindBy(xpath="//*[contains(text(),'Import Employee')]")
	WebElement ImportEmployee;
	
	@FindBy(id="firstName")
	WebElement FirstName;
	
	@FindBy(name="middleInitial")
	WebElement MiddleInitial;
	
	@FindBy(id="lastName")
	WebElement LastName;
	
	@FindBy(id="ssn")
	WebElement SSN;
	
	@FindBy(id="employeeId")
	WebElement EmployeeId;
	
	@FindBy(id="mui-component-select-genderId")
	WebElement GenderId;
	
	@FindBy(id="mui-component-select-ethnicityId")
	WebElement EthnicityId;
	
	@FindBy(xpath="//*[contains(text(),'Veteran Status')]//preceding::input[1]")
	WebElement VeteranStatusToggle;
	
	@FindBy(id="phone")
	WebElement Phone;
	
	@FindBy(xpath="//*[contains(text(),'Address History')]")
	WebElement AddressHistory;
	
	@FindBy(xpath="//*[contains(text(),'Add New')]")
	WebElement AddNew;
	
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
	
	@FindBy(xpath="//*[contains(text(),'Effective')]//following::button[2]")
	WebElement Add;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[1]")
	WebElement AddressCancel;
	
	@FindBy(xpath="//*[contains(text(),'Work Info')]")
	WebElement WorkInfo;
	
	@FindBy(xpath="//input[@placeholder='mm/dd/yyyy']")
	WebElement HireDate;
	
	@FindBy(id="mui-component-select-employmentStatusId")
	WebElement EmployeeStatus;
	
	@FindBy(id="apprenticeNumber")
	WebElement ApprenticeNumber;
	
	@FindBy(xpath="//*[contains(text(),'Union')]")
	WebElement Union;
	
	@FindBy(xpath="//*[contains(text(),'Add Member')]")
	WebElement AddMembershipbutton;
	
	@FindBy(xpath="//*[contains(text(),'Select a Union')]//following::div[2]")
	WebElement SelectUnion;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement StartDate;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[2]")
	WebElement EndDate;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[2]//following::button[2]")
	WebElement DeleteIcon;
	
	
	@FindBy(xpath="//*[contains(text(),'Custom Fields')]")
	WebElement CustomField;
	
	@FindBy(id="mui-component-select-10011")
	WebElement EmployeeType;
	
	@FindBy(xpath="//*[contains(text(),'Pay Rate')]")
	WebElement PayRate;
	
	@FindBy(id="mui-component-select-10019")
	WebElement EmployeeAssignment;
	
	@FindBy(xpath="//*[contains(text(),'Save & Add New Entry Row')]")
	WebElement SaveEntry;
	
	@FindBy(xpath="//*[contains(text(),'Add New Entry Row')]")
	WebElement AddEntry;
	
	@FindBy(xpath="//div[@id='mui-component-select-workClassId']")
	WebElement SelectType;
	
	@FindBy(xpath="//div[@id='mui-component-select-workClassId']//following::input[2]")
	WebElement PayEffectiveDate;
	
	@FindBy(xpath="//div[@id='mui-component-select-workClassId']//following::input[3]")
	WebElement PayEndDate;
	
	@FindBy(xpath="//input[@id='hourlyRate']")
	WebElement BaseRate;
	
	@FindBy(xpath="//input[@id='otHourlyRate']")
	WebElement OTRate;
	
	@FindBy(xpath="//input[@id='dtHourlyRate']")
	WebElement DTRate;
	
	@FindBy(xpath="//input[@id='fringe']")
	WebElement FringeRate;
	
	@FindBy(xpath="//input[@id='fringe']//following::button[1]")
	WebElement Confirm;
	
	@FindBy(xpath="(//*[contains(text(),'Action')]//following::button[1])[2]")
	WebElement Edit;
	
	@FindBy(xpath="//input[@id='fringe']//following::button[2]")
	WebElement Delete;
	
	@FindBy(xpath="//*[contains(text(),'Validations')]")
	WebElement Validations;
	
	@FindBy(xpath="//*[contains(text(),'Add Validation Documents')]")
	WebElement AddValidationDocument;
	
	@FindBy(xpath="//*[contains(text(),'Add Document Row')]")
	WebElement AddDocumentRow;
	
	@FindBy(xpath="//*[contains(text(),'Click to select, or drop here')]")
	WebElement Drophere;
	
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])")
	WebElement Expires;
	
	@FindBy(xpath="//input[@placeholder='mm/dd/yyyy']//following::button[2]")
	WebElement ValidationConfirm;
	
	@FindBy(xpath="//*[contains(text(),'Actions')]//following::button[1]")
	WebElement ValidationEdit;
	
	
	@FindBy(xpath="//input[@placeholder='mm/dd/yyyy']//following::button[3]")
	WebElement ValidationDelete;
	
	
	@FindBy(xpath="(//*[contains(text(),'Save')])[1]")
	WebElement Save;
	
	@FindBy(xpath="(//*[contains(text(),'Save')])[2]")
	WebElement SaveandClose;
	
	
	@FindBy(xpath="(//*[contains(text(),'Name')])[1]//following::input[1]")
	WebElement NameField;
	
	@FindBy(xpath="(//*[contains(text(),'Address')])[2]//following::button[1]")
	WebElement EditAddress;
	
	@FindBy(xpath="(//*[contains(text(),'Address')])[2]//following::button[2]")
	WebElement DeleteAddress;

	@FindBy(xpath="//*[contains(text(),'Create a new')]")
	WebElement CreateExcelLayout;
	
	@FindBy(id="name")
	WebElement LayoutName;
	
	@FindBy(xpath="//*[contains(text(),'Undo')]")
	WebElement Undobutton;
	
	@FindBy(xpath="//*[contains(text(),'Go Back')]")
	WebElement GoBackbutton;
	
	@FindBy(id="mui-component-select-mapTo")
	WebElement To;
	
	@FindBy(id="hasHeaderRow")
	WebElement Header;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[1]")
	WebElement ASelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[2]")
	WebElement BSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[3]")
	WebElement CSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[4]")
	WebElement DSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[5]")
	WebElement ESelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[6]")
	WebElement FSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[7]")
	WebElement GSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[8]")
	WebElement HSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[9]")
	WebElement ISelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[10]")
	WebElement JSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[11]")
	WebElement KSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[12]")
	WebElement LSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[13]")
	WebElement MSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[14]")
	WebElement NSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[15]")
	WebElement OSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[16]")
	WebElement PSelectValue;
	
	@FindBy(xpath="//*[contains(text(),'Create')]")
	WebElement Createbutton;
	
	@FindBy(xpath="//div[@id='mui-component-select-selectedImportId']")
	WebElement SelectLayout;
	
	@FindBy(xpath="//*[contains(text(),'View/edit')]")
	WebElement ViewEdit;
	
	@FindBy(xpath="//a[@href='files/skillsmart-employee-template.xlsx']")
	WebElement DownloadFile;
	
	@FindBy(xpath="//*[contains(text(),'Cancel')]")
	WebElement Cancel;
	
	@FindBy(xpath="//*[contains(text(),'Cancel')]//following::button[1]")
	WebElement Importbutton;
	
	@FindBy(xpath="//*[contains(text(),'Delete Employee')]")
	WebElement DeleteEmployee;
	
	@FindBy(xpath="//*[contains(text(),'Select Contract')]//following::button[1]")
	WebElement AccountIcon;
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	WebElement Logout;
	
	@FindBy(xpath="//*[contains(text(),'Work Classes')]")
	WebElement WorkClasses;
	
	public EmployeeManagementPageT1()
	{
		PageFactory.initElements(Driver,this);
	}
	
	public String ValidateEmployeesTab()
	{
		return EmployeesTab.getText();
	}
	
	public String ValidateAddEmployeeTab()
	{
		return AddEmployee.getText();
	}
	
	public String ValidateImportEmployeeTab()
	{
		return ImportEmployee.getText();
	}
	
	public void AddEmployee1(String fn,String Mi,String Ln,String S,String Ed) throws InterruptedException {
		
		Thread.sleep(9000);
	      
		WebDriverWait wait = new WebDriverWait(Driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Employee')]")));
	AddEmployee.click();
	JavascriptExecutor x1 = (JavascriptExecutor)Driver;
	x1.executeScript("arguments[0].click();", FirstName);
	FirstName.sendKeys(fn);
	JavascriptExecutor x2 = (JavascriptExecutor)Driver;
	x2.executeScript("arguments[0].click();", MiddleInitial);
	MiddleInitial.sendKeys(Mi);
	JavascriptExecutor x3 = (JavascriptExecutor)Driver;
	x3.executeScript("arguments[0].click();", LastName);
	LastName.sendKeys(Ln);
	JavascriptExecutor x4 = (JavascriptExecutor)Driver;
	x4.executeScript("arguments[0].click();", SSN);
	SSN.sendKeys(S);
	JavascriptExecutor x5 = (JavascriptExecutor)Driver;
	x5.executeScript("arguments[0].click();", EmployeeId);
	EmployeeId.sendKeys(Ed);
	//Thread.sleep(2000);
	WebElement Transition1=Driver.findElement(By.xpath("//*[contains(text(),'We have located')]"));
	String UI=Transition1.getText();
	System.out.println(UI);
	String St1="We have located this employee in our Database and have pre-populated some fields for you.";
		if(St1.equals(UI))
		{
			System.out.println("Soft Alert Matches");
			//System.out.println(UI);
		}
		else
		{
			System.out.println("Soft Alert not Matches");
		}
	}
	public void AddEmployee(String fn,String Mi, String Ln,String S,String Ed, String GE,String ET,String Ph,
			String SS1,String SS2, String SC,String SCO, String SS, String SZ, String SE, String ESE1, String HD,String ES,String AN,
			String UA,String SD,String ED,String UA1,String SD1,String ED1,String ET1,String A,
			String JT,String PED,String PD,String BR,String OT,String DT,String FR,String JT1,String PED1,String PD1,
			String BR1,String OT1,String DT1,String FR1,String Exp,String Exp1,String ESS,
			String EEd,String EG,String EET,String EPh, String ESS1,String ESS2, String ESC,String ESCO1,
			String ES1, String ESZ,String ESE, String EAN,String EA,String EJT,String EPED,String EPD,String EBR,String EOT,String EDT,String EFR) throws InterruptedException, IOException {
      Thread.sleep(9000);
		WebDriverWait wait = new WebDriverWait(Driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Employee')]")));
		AddEmployee.click();
		JavascriptExecutor exe1 = (JavascriptExecutor)Driver;
		exe1.executeScript("arguments[0].click();", FirstName);
		FirstName.sendKeys(fn);
		JavascriptExecutor exe2 = (JavascriptExecutor)Driver;
		exe2.executeScript("arguments[0].click();", MiddleInitial);
		MiddleInitial.sendKeys(Mi);
		JavascriptExecutor exe4 = (JavascriptExecutor)Driver;
		exe4.executeScript("arguments[0].click();", LastName);
		LastName.sendKeys(Ln);
		JavascriptExecutor exe5 = (JavascriptExecutor)Driver;
		exe5.executeScript("arguments[0].click();", SSN);
		SSN.sendKeys(S);
		JavascriptExecutor exe6 = (JavascriptExecutor)Driver;
		exe6.executeScript("arguments[0].click();", EmployeeId);
		EmployeeId.sendKeys(Ed);
		Phone.click();
		if(Driver.getPageSource().contains("duplicate")){
			System.out.println("Employee is duplicate");
		
		//BufferedImage expectedImageS = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\DuplicateMessage.png."));

		
		Screenshot ImageScreenshotS= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	//	Driver.navigate().refresh();
		ImageIO.write(ImageScreenshotS.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\DuplicateMessage.png"));
		BufferedImage actualImageS = ImageScreenshotS.getImage();


	/*ImageDiffer imgdifferS = new ImageDiffer();

	   ImageDiff imgdiffS = imgdifferS.makeDiff(expectedImageS, actualImageS);
	if(imgdiffS.hasDiff()==true)
	{
		System.out.println("Images are not same");
	}
	else
	{
		System.out.println("Images are same");
	}*/
		Cancel.click();
		Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[2]")).click();
		AccountIcon.click();
		Logout.click();
		//AddEmployee.click();
		}
		else
		{
			System.out.println("Employee is not duplicate");
			
			//Thread.sleep(2000);
			if(Driver.getPageSource().contains("located")){
				System.out.println("Employee Already Exist");	
			WebElement Transition1=Driver.findElement(By.xpath("//*[contains(text(),'We have located')]"));
				String UI=Transition1.getText();
			System.out.println(UI);
			String St1="We have located this employee in our Database and have pre-populated some fields for you.";
				if(St1.equals(UI))
				{
					System.out.println("Soft Alert Matches");
					Thread.sleep(2000);
					WebDriverWait t=new WebDriverWait(Driver, 40);
					WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-genderId']"));
					t.until(ExpectedConditions.elementToBeClickable(ele1));
					ele1.click();
					WebDriverWait wait12 = new WebDriverWait(Driver, 40);
					 List<WebElement> G=Driver.findElements(By.xpath("//div[@id='mui-component-select-genderId']//following::ul[2]//li"));
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
						 Actions action = new Actions(Driver);
						    action.sendKeys(Keys.ESCAPE).build().perform();
						WebDriverWait wait1 = new WebDriverWait(Driver, 20);
						WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-ethnicityId']"));
						wait1.until(ExpectedConditions.elementToBeClickable(ele));
						ele.click();
						//WebDriverWait wait1 = new WebDriverWait(Driver, 20);
					List<WebElement> E=Driver.findElements(By.xpath("//div[@id='mui-component-select-ethnicityId']//following::ul[2]//li"));
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
						JavascriptExecutor ex = (JavascriptExecutor)Driver;
						ex.executeScript("arguments[0].click();", PayRate);
						EmployeeAssignment.click();
						 List<WebElement> EmpAssign=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
						 System.out.println(EmpAssign.size());
							for(int l=0;l<=EmpAssign.size()-1;l++)
							{
								System.out.println(EmpAssign.get(l).getText());
							}
							for(int k=0;k<EmpAssign.size();k++)
							{
						 if(EmpAssign.get(k).getText().equals(A))
						 {
							 EmpAssign.get(k).click();
							 break;
						 }
							}
							AddEntry.click();
							Thread.sleep(3000);
							JavascriptExecutor x = (JavascriptExecutor)Driver;
							x.executeScript("arguments[0].click();", SelectType);
							Thread.sleep(2000);
							SelectType.click();
							 List<WebElement> J=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
							 System.out.println(J.size());
								for(int l=0;l<=J.size()-1;l++)
								{
									System.out.println(J.get(l).getText());
								}
								for(int k=0;k<J.size();k++)
								{
							 if(J.get(k).getText().equals(JT))
							 {
								 J.get(k).click();
								 break;
							 }
								}
								PayEffectiveDate.click();
								PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								PayEffectiveDate.sendKeys(PED);
								PayEndDate.click();
								PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								PayEndDate.sendKeys(PD);
								BaseRate.click();
								BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								BaseRate.sendKeys(BR);
								OTRate.click();
								OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								OTRate.sendKeys(OT);
								DTRate.click();
								DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								DTRate.sendKeys(DT);
								FringeRate.click();
								FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								FringeRate.sendKeys(FR);
								Confirm.click();
								Thread.sleep(1000);
								JavascriptExecutor ex1 = (JavascriptExecutor)Driver;
								ex1.executeScript("arguments[0].click();", Edit);
								Thread.sleep(1000);
								JavascriptExecutor j = (JavascriptExecutor)Driver;
								j.executeScript("arguments[0].click();", Delete);
								Thread.sleep(2000);
								JavascriptExecutor t1 = (JavascriptExecutor)Driver;
								t1.executeScript("arguments[0].click();", AddEntry);
								SelectType.click();
								 List<WebElement> J1=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
								 System.out.println(J1.size());
									for(int l=0;l<=J1.size()-1;l++)
									{
										System.out.println(J1.get(l).getText());
									}
									for(int k=0;k<J1.size();k++)
									{
								 if(J1.get(k).getText().equals(JT1))
								 {
									 J1.get(k).click();
									 break;
								 }
									}
									PayEffectiveDate.click();
									PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									PayEffectiveDate.sendKeys(PED1);
									PayEndDate.click();
									PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									PayEndDate.sendKeys(PD1);
									BaseRate.click();
									BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									BaseRate.sendKeys(BR1);
									OTRate.click();
									OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									OTRate.sendKeys(OT1);
									DTRate.click();
									DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									DTRate.sendKeys(DT1);
									FringeRate.click();
									FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									FringeRate.sendKeys(FR1);
									Confirm.click();
									Validations.click();
									//AddValidationDocument.click();
									AddDocumentRow.click();
									Drophere.click();
									String strSel = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\347.pdf";
									try {
										Robot robot = new Robot();
										StringSelection Selection = new StringSelection(strSel);
										Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
											robot.setAutoDelay(2000);                                                                                
											robot.keyPress(KeyEvent.VK_CONTROL);
											robot.keyPress(KeyEvent.VK_V);
											robot.keyRelease(KeyEvent.VK_CONTROL);
											robot.keyRelease(KeyEvent.VK_V);
											robot.keyPress(KeyEvent.VK_ENTER);
											robot.keyRelease(KeyEvent.VK_ENTER);		
											
										} catch (AWTException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
									}
									Expires.click();
									Expires.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									Expires.sendKeys(Exp);
									ValidationConfirm.click();
									JavascriptExecutor te1 = (JavascriptExecutor)Driver;
									te1.executeScript("arguments[0].click();", Save);
									JavascriptExecutor exe3 = (JavascriptExecutor)Driver;
									exe3.executeScript("arguments[0].click();", SaveandClose);
					//System.out.println(UI);
				}
			}
				else
				{
					System.out.println("Employee is not an Existing");
		WebDriverWait t= new WebDriverWait(Driver, 40);
		WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-genderId']"));
		t.until(ExpectedConditions.elementToBeClickable(ele1));
		ele1.click();
		WebDriverWait wait12 = new WebDriverWait(Driver, 40);
		 List<WebElement> G=Driver.findElements(By.xpath("//div[@id='mui-component-select-genderId']//following::ul[2]//li"));
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
			 Actions action = new Actions(Driver);
			    action.sendKeys(Keys.ESCAPE).build().perform();
			WebDriverWait wait1 = new WebDriverWait(Driver, 20);
			WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-ethnicityId']"));
			wait1.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			//WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		List<WebElement> E=Driver.findElements(By.xpath("//div[@id='mui-component-select-ethnicityId']//following::ul[2]//li"));
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
		
		JavascriptExecutor executor5 = (JavascriptExecutor)Driver;
		executor5.executeScript("arguments[0].click();", Phone);
		Phone.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Phone.sendKeys(Ph);
		VeteranStatusToggle.click();
		//Address History
		AddressHistory.click();
		AddNew.click();
		Street1.click();
		Street1.sendKeys(SS1);
		Street2.click();
		Street2.sendKeys(SS2);
		City.click();
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
			JavascriptExecutor executor9 = (JavascriptExecutor)Driver;
			executor9.executeScript("arguments[0].click();", Zip);	
			WebDriverWait wai = new WebDriverWait(Driver, 40);
			WebElement ele10 = Driver.findElement(By.xpath("//input[@id='zip']"));
			wai.until(ExpectedConditions.elementToBeClickable(Zip));
			//Zip.click();
		Zip.sendKeys(SZ);
		JavascriptExecutor executor7 = (JavascriptExecutor)Driver;
		executor7.executeScript("arguments[0].click();", EffectiveDate);
		 EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EffectiveDate.sendKeys(SE);
	    Add.click();
	    EditAddress.click();
	    JavascriptExecutor e7 = (JavascriptExecutor)Driver;
		e7.executeScript("arguments[0].click();", EffectiveDate);
		 EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EffectiveDate.sendKeys(ESE1);
		Add.click();
	    //Work Info
	    WorkInfo.click();
	    HireDate.click();
	    HireDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		HireDate.sendKeys(HD);
		EmployeeStatus.click();
		 List<WebElement> EmpSta=Driver.findElements(By.xpath("//div[@id='mui-component-select-employmentStatusId']//following::ul[2]//li"));
		 System.out.println(EmpSta.size());
			for(int l=0;l<=EmpSta.size()-1;l++)
			{
				System.out.println(EmpSta.get(l).getText());
			}
			for(int k=0;k<EmpSta.size();k++)
			{
		 if(EmpSta.get(k).getText().equals(ES))
		 {
			 EmpSta.get(k).click();
			 break;
		 }
			}
		ApprenticeNumber.sendKeys(AN);
		//Union
		Union.click();
		AddMembershipbutton.click();
		SelectUnion.click();
		 List<WebElement> U=Driver.findElements(By.xpath("//*[contains(text(),'Select a Union')]//following::ul[2]//li"));
		 System.out.println(U.size());
			for(int l=0;l<=U.size()-1;l++)
			{
				System.out.println(U.get(l).getText());
			}
			for(int k=0;k<U.size();k++)
			{
		 if(U.get(k).getText().equals(UA))
		 {
			 U.get(k).click();
			 break;
		 }
			}
			StartDate.click();
			StartDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			StartDate.sendKeys(SD);
			EndDate.click();
			EndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			EndDate.sendKeys(ED);
			DeleteIcon.click();
			Thread.sleep(1000);
			AddMembershipbutton.click();
			SelectUnion.click();
			List<WebElement> U1=Driver.findElements(By.xpath("//*[contains(text(),'Select a Union')]//following::ul[2]//li"));
			System.out.println(U1.size());
			Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			for(int n=0;n<=U1.size()-1;n++)
			{
				
			System.out.println(U1.get(n).getText());
			}


			if(Driver.findElement(By.xpath("//li/p[contains(text(),'"+UA1+"')]")).isDisplayed())
			{
			Driver.findElement(By.xpath("//li/p[contains(text(),'"+UA1+"')]")).click(); 
			//System.out.println("Success");
			}
				StartDate.click();
				StartDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				StartDate.sendKeys(SD1);
				EndDate.click();
				EndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				EndDate.sendKeys(ED1);
				CustomField.click();
				EmployeeType.click();
				 List<WebElement> E1=Driver.findElements(By.xpath("//div[@id='mui-component-select-10011']//following::ul[2]//li"));
				 System.out.println(E1.size());
					for(int l=0;l<=E1.size()-1;l++)
					{
						System.out.println(E1.get(l).getText());
					}
					for(int k=0;k<E1.size();k++)
					{
				 if(E1.get(k).getText().equals(ET1))
				 {
					 E1.get(k).click();
					 break;
				 }
					}
		
		//PayRates
		//PayRate.click();
		JavascriptExecutor ex = (JavascriptExecutor)Driver;
		ex.executeScript("arguments[0].click();", PayRate);
		EmployeeAssignment.click();
		 List<WebElement> EmpAssign=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
		 System.out.println(EmpAssign.size());
			for(int l=0;l<=EmpAssign.size()-1;l++)
			{
				System.out.println(EmpAssign.get(l).getText());
			}
			for(int k=0;k<EmpAssign.size();k++)
			{
		 if(EmpAssign.get(k).getText().equals(A))
		 {
			 EmpAssign.get(k).click();
			 break;
		 }
			}
			SaveEntry.click();
			Thread.sleep(3000);
			JavascriptExecutor x = (JavascriptExecutor)Driver;
			x.executeScript("arguments[0].click();", SelectType);
			Thread.sleep(4000);
			SelectType.click();
			 List<WebElement> J=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
			 System.out.println(J.size());
				for(int l=0;l<=J.size()-1;l++)
				{
					System.out.println(J.get(l).getText());
				}
				for(int k=0;k<J.size();k++)
				{
			 if(J.get(k).getText().equals(JT))
			 {
				 J.get(k).click();
				 break;
			 }
				}
				PayEffectiveDate.click();
				PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				PayEffectiveDate.sendKeys(PED);
				PayEndDate.click();
				PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				PayEndDate.sendKeys(PD);
				BaseRate.click();
				BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				BaseRate.sendKeys(BR);
				OTRate.click();
				OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				OTRate.sendKeys(OT);
				DTRate.click();
				DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				DTRate.sendKeys(DT);
				FringeRate.click();
				FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				FringeRate.sendKeys(FR);
				Confirm.click();
				Thread.sleep(1000);
				JavascriptExecutor ex1 = (JavascriptExecutor)Driver;
				ex1.executeScript("arguments[0].click();", Edit);
				Thread.sleep(1000);
				JavascriptExecutor j = (JavascriptExecutor)Driver;
				j.executeScript("arguments[0].click();", Delete);
				Thread.sleep(2000);
				JavascriptExecutor t1 = (JavascriptExecutor)Driver;
				t1.executeScript("arguments[0].click();", AddEntry);
				SelectType.click();
				 List<WebElement> J1=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
				 System.out.println(J1.size());
					for(int l=0;l<=J1.size()-1;l++)
					{
						System.out.println(J1.get(l).getText());
					}
					for(int k=0;k<J1.size();k++)
					{
				 if(J1.get(k).getText().equals(JT1))
				 {
					 J1.get(k).click();
					 break;
				 }
					}
					PayEffectiveDate.click();
					PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					PayEffectiveDate.sendKeys(PED1);
					PayEndDate.click();
					PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					PayEndDate.sendKeys(PD1);
					BaseRate.click();
					BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					BaseRate.sendKeys(BR1);
					OTRate.click();
					OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					OTRate.sendKeys(OT1);
					DTRate.click();
					DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					DTRate.sendKeys(DT1);
					FringeRate.click();
					FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					FringeRate.sendKeys(FR1);
					Confirm.click();
					Validations.click();
					//AddValidationDocument.click();
					AddDocumentRow.click();
					Drophere.click();
					String strSel = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\347.pdf";
					try {
						Robot robot = new Robot();
						StringSelection Selection = new StringSelection(strSel);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
							robot.setAutoDelay(2000);                                                                                
							robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);
							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyRelease(KeyEvent.VK_V);
							robot.keyPress(KeyEvent.VK_ENTER);
							robot.keyRelease(KeyEvent.VK_ENTER);		
							
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}
					Expires.click();
					Expires.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Expires.sendKeys(Exp);
					ValidationConfirm.click();
					Thread.sleep(3000);
					Actions ac = new Actions(Driver);
					ac.moveToElement(ValidationEdit).build();
					ac.click(ValidationEdit).perform();
					ValidationDelete.click();
					Thread.sleep(2000);
					//AddValidationDocument.click();
					AddDocumentRow.click();
					Thread.sleep(2000);
					Drophere.click();
					try {
						Robot robot = new Robot();
						StringSelection Selection = new StringSelection(strSel);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
							robot.setAutoDelay(2000);                                                                                
							/*robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);
							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyRelease(KeyEvent.VK_V);
							robot.keyPress(KeyEvent.VK_ENTER);
							//robot.keyPress(KeyEvent.VK_ENTER);*/
							robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);
							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyRelease(KeyEvent.VK_V);
							robot.keyPress(KeyEvent.VK_ENTER);
							robot.keyRelease(KeyEvent.VK_ENTER);		
							
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}
					Expires.click();
					Expires.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Expires.sendKeys(Exp1);
					ValidationConfirm.click();
					WebDriverWait i = new WebDriverWait(Driver, 90);
					i.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Save')])[1]")));
			    	Thread.sleep(3000);
					JavascriptExecutor te1 = (JavascriptExecutor)Driver;
					te1.executeScript("arguments[0].click();", Save);
					JavascriptExecutor exe3 = (JavascriptExecutor)Driver;
					exe3.executeScript("arguments[0].click();", SaveandClose);
					AddEmployee.click();
					JavascriptExecutor o1 = (JavascriptExecutor)Driver;
					o1.executeScript("arguments[0].click();", FirstName);
					FirstName.sendKeys(fn);
					JavascriptExecutor o2 = (JavascriptExecutor)Driver;
					o2.executeScript("arguments[0].click();", MiddleInitial);
					MiddleInitial.sendKeys(Mi);
					JavascriptExecutor o3 = (JavascriptExecutor)Driver;
					o3.executeScript("arguments[0].click();", LastName);
					LastName.sendKeys(Ln);
					JavascriptExecutor o4 = (JavascriptExecutor)Driver;
					o4.executeScript("arguments[0].click();", SSN);
					SSN.sendKeys(S);
					JavascriptExecutor o5 = (JavascriptExecutor)Driver;
					o5.executeScript("arguments[0].click();", EmployeeId);
					EmployeeId.sendKeys(Ed);
					
					
					//BufferedImage expectedImageS = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\DuplicateMessage.png."));

					
					Screenshot ImageScreenshotS= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

					//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
					Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				//	Driver.navigate().refresh();
					ImageIO.write(ImageScreenshotS.getImage(), "png",
							new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\DuplicateMessageVerification.png"));
					BufferedImage actualImageS = ImageScreenshotS.getImage();


				/*ImageDiffer imgdifferS = new ImageDiffer();

				   ImageDiff imgdiffS = imgdifferS.makeDiff(expectedImageS, actualImageS);
				if(imgdiffS.hasDiff()==true)
				{
					System.out.println("Images are not same");
				}
				else
				{
					System.out.println("Images are same");
				}*/
					Cancel.click();
					Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[2]")).click();
					Thread.sleep(3000);
					//Add
					Actions Em1=new Actions(Driver);
						WebElement Emp1=Driver.findElement(By.xpath("//*[text()[contains(.,'"+fn+"')]]"));
						Em1.moveToElement(Emp1).build();
						Em1.click(Emp1).perform();
						DeleteEmployee.click();
					Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[2]")).click();
					//Edit Employee
	
			AddEmployee.click();
				JavascriptExecutor x1 = (JavascriptExecutor)Driver;
				x1.executeScript("arguments[0].click();", FirstName);
				FirstName.sendKeys(fn);
				JavascriptExecutor x2 = (JavascriptExecutor)Driver;
				x2.executeScript("arguments[0].click();", MiddleInitial);
				MiddleInitial.sendKeys(Mi);
				JavascriptExecutor x3 = (JavascriptExecutor)Driver;
				x3.executeScript("arguments[0].click();", LastName);
				LastName.sendKeys(Ln);
				JavascriptExecutor x4 = (JavascriptExecutor)Driver;
				x4.executeScript("arguments[0].click();", SSN);
				SSN.sendKeys(S);
				JavascriptExecutor x5 = (JavascriptExecutor)Driver;
				x5.executeScript("arguments[0].click();", EmployeeId);
				EmployeeId.sendKeys(Ed);
				//Thread.sleep(2000);
				WebElement Transition=Driver.findElement(By.xpath("//*[contains(text(),'We have located')]"));
				String UI1=Transition.getText();
				System.out.println(UI1);
				String SI1="We have located this employee in our Database and have pre-populated some fields for you.";
					if(SI1.equals(UI1))
					{
						System.out.println("Soft Alert Matches");
						//System.out.println(UI);
					}
					else
					{
						System.out.println("Soft Alert not Matches");
					}
					Thread.sleep(3000);
					//Actions Em2=new Actions(Driver);
					WebDriverWait e1 = new WebDriverWait(Driver, 40);
					WebElement el1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-genderId']"));
					e1.until(ExpectedConditions.elementToBeClickable(el1));
					el1.click();
					//WebDriverWait wait1 = new WebDriverWait(Driver, 40);
					 List<WebElement> GN=Driver.findElements(By.xpath("//div[@id='mui-component-select-genderId']//following::ul[2]//li"));
					 System.out.println(GN.size());
						for(int z=0;z<GN.size();z++)
						{
							System.out.println(GN.get(z).getText());
					 if(GN.get(z).getText().equals(EG))
					 {
						 GN.get(z).click();
						 break;
						 }
						}
						 Actions ai = new Actions(Driver);
						    ai.sendKeys(Keys.ESCAPE).build().perform();
						WebDriverWait wa = new WebDriverWait(Driver, 20);
						WebElement l = Driver.findElement(By.xpath("//div[@id='mui-component-select-ethnicityId']"));
						wait1.until(ExpectedConditions.elementToBeClickable(l));
						l.click();
						//WebDriverWait wait1 = new WebDriverWait(Driver, 20);
					List<WebElement> ETH=Driver.findElements(By.xpath("//div[@id='mui-component-select-ethnicityId']//following::ul[2]//li"));
					 System.out.println(ETH.size());
						for(int y=0;y<ETH.size();y++)
						{
							System.out.println(ETH.get(y).getText());
					 if(ETH.get(y).getText().equals(EET))
					 {
						 ETH.get(y).click();
						break;
						 }
						}
					Phone.sendKeys(EPh);
					AddressHistory.click();
					DeleteAddress.click();
					Driver.findElement(By.xpath("//*[contains(text(),'Are')]//following::button[1]")).click();
					DeleteAddress.click();
					Driver.findElement(By.xpath("//*[contains(text(),'Are')]//following::button[2]")).click();
					Thread.sleep(2000);
					AddNew.click();
					Street1.click();
					Street1.sendKeys(ESS1);
					Street2.click();
					Street2.sendKeys(ESS2);
					City.click();
					City.sendKeys(ESC);
					Country.click();
					 List<WebElement> Ecountry=Driver.findElements(By.xpath("//div[@id='menu-country']//following::ul//li"));
					 System.out.println(Ecountry.size());
						for(int l1=0;l1<=Ecountry.size()-1;l1++)
						{
							System.out.println(Ecountry.get(l1).getText());
				}
						for(int i1=0;i1<Ecountry.size();i1++)
						{
					 if(Ecountry.get(i1).getText().equals(ESCO1))
					 {
						 Ecountry.get(i1).click();
						 }
						}
						State.click();
						 List<WebElement> Estate=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
						 System.out.println(Estate.size());
							for(int l2=0;l2<=Estate.size()-1;l2++)
							{
								System.out.println(Estate.get(l2).getText());
							}
							for(int k=0;k<Estate.size();k++)
							{
						 if(Estate.get(k).getText().equals(ES1))
						 {
							 Estate.get(k).click();
							 break;
						 }
							}
							Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
						
						WebDriverWait w = new WebDriverWait(Driver, 40);
						//WebElement e1 = Driver.findElement(By.xpath("//input[@id='zip']"));
						w.until(ExpectedConditions.elementToBeClickable(Zip));
						//Zip.click();
					Zip.sendKeys(ESZ);
					JavascriptExecutor e2 = (JavascriptExecutor)Driver;
					e2.executeScript("arguments[0].click();", EffectiveDate);
					Actions C4=new Actions(Driver);
					C4.click(EffectiveDate)
					    .keyDown(Keys.CONTROL)
					    .sendKeys("a")
					    .keyUp(Keys.CONTROL)
					    .sendKeys(Keys.BACK_SPACE)
					    .build()
					    .perform();
					 //EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					EffectiveDate.sendKeys(ESE);
				    Add.click();
				    WorkInfo.click();
				    Actions C5=new Actions(Driver);
					C5.click(ApprenticeNumber)
					    .keyDown(Keys.CONTROL)
					    .sendKeys("a")
					    .keyUp(Keys.CONTROL)
					    .sendKeys(Keys.BACK_SPACE)
					    .build()
					    .perform();
				    ApprenticeNumber.sendKeys(EAN);
				    JavascriptExecutor e3 = (JavascriptExecutor)Driver;
				    //JavascriptExecutor ex = (JavascriptExecutor)Driver;
					e3.executeScript("arguments[0].click();", PayRate);
					EmployeeAssignment.click();
					 List<WebElement> EmpAssign1=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
					 System.out.println(EmpAssign1.size());
						for(int El=0;El<=EmpAssign1.size()-1;El++)
						{
							System.out.println(EmpAssign1.get(El).getText());
						}
						for(int k=0;k<EmpAssign.size();k++)
						{
					 if(EmpAssign1.get(k).getText().equals(EA))
					 {
						 EmpAssign1.get(k).click();
						 break;
					 }
						}
						AddEntry.click();
						Thread.sleep(3000);
						JavascriptExecutor xt = (JavascriptExecutor)Driver;
						xt.executeScript("arguments[0].click();", SelectType);
						Thread.sleep(2000);
						SelectType.click();
						 List<WebElement> J2=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
						 System.out.println(J2.size());
							for(int wl=0;wl<=J2.size()-1;wl++)
							{
								System.out.println(J2.get(wl).getText());
							}
							for(int k=0;k<J2.size();k++)
							{
						 if(J2.get(k).getText().equals(EJT))
						 {
							 J2.get(k).click();
							 break;
						 }
							}
							PayEffectiveDate.click();
							PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
							PayEffectiveDate.sendKeys(EPED);
							PayEndDate.click();
							PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
							PayEndDate.sendKeys(EPD);
							BaseRate.click();
							BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
							BaseRate.sendKeys(EBR);
							OTRate.click();
							OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
							OTRate.sendKeys(EOT);
							DTRate.click();
							DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
							DTRate.sendKeys(EDT);
							FringeRate.click();
							FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
							FringeRate.sendKeys(EFR);
							Confirm.click();
					e3.executeScript("arguments[0].click();", SaveandClose);
				}
			}
											
	}

public void EmployeeManagementDDNVerification(String DGE,String DE, String DC1,String ST1,String ST2,String W,
		String L,String SU,String T) throws InterruptedException
{
	Thread.sleep(9000);
	/*WebDriverWait wait = new WebDriverWait(Driver, 90);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Employee')]")));*/
	AddEmployee.click();
	WebDriverWait t= new WebDriverWait(Driver, 40);
	WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-genderId']"));
	t.until(ExpectedConditions.elementToBeClickable(ele1));
	ele1.click();
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	List<WebElement> GE= Driver.findElements(By.xpath("//div[@id='mui-component-select-genderId']//following::ul[2]//li"));
	System.out.println(GE.size());
	String[] arr1 = DGE.split("!"); 
	 boolean strFlag1; 
	 int count1=0;
    for(int i=0;i<GE.size();i++)
	{
    	strFlag1 = false;
    	for (String OG : arr1) 
		   {
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
  
		 Actions action = new Actions(Driver);
		    action.sendKeys(Keys.ESCAPE).build().perform();
		WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-ethnicityId']"));
		wait1.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
List<WebElement> E= Driver.findElements(By.xpath("//div[@id='mui-component-select-ethnicityId']//following::ul[2]//li"));		
		System.out.println(E.size());
		String[] arr = DE.split("!"); 
		   boolean strFlag;
	    for(int i=0;i<E.size();i++)
		{
	    	//int count=0;
	    	strFlag = false;
	    	int count=0;
	    	for (String L1 : arr) 
			   {
			  if(E.get(i).getText().equals(L1))
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
	    	 Actions act = new Actions(Driver);
			    act.sendKeys(Keys.ESCAPE).build().perform();
	    	AddressHistory.click();
		AddNew.click();
		Country.click();
		List<WebElement> CO= Driver.findElements(By.xpath("//div[@id='mui-component-select-country']//following::ul[2]//li"));
		System.out.println(CO.size());
		String[] a1 = DC1.split("!"); 
		boolean s1; 
		int c1=0;
		for(int i1=0;i1<CO.size();i1++)
		{
		s1 = false;
		for (String e1 : a1) 
		   {
		if(CO.get(i1).getText().equals(e1))
		{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		  System.out.println("Country value:"+CO.get(i1).getText());
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
		System.out.println("Country value:"+ CO.get(i1).getText());
		System.out.println("Country value:Not Matches");
		}
		}
		Actions action2 = new Actions(Driver);
		action2.sendKeys(Keys.ESCAPE).build().perform();
		 State.click();
			List<WebElement> ST= Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
			System.out.println(ST.size());
			String[] a2 = ST1.split("!"); 
			boolean s2; 
			int c2=0;
			for(int i1=0;i1<ST.size();i1++)
			{
			s2 = false;
			for (String e2 : a2) 
			   {
			//System.out.println(Pro); 
			//System.out.println("Gender value:"+GE.get(i).getText());
			if(ST.get(i1).getText().equals(e2))
			{
			Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			  System.out.println("State value:"+ST.get(i1).getText());
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
			System.out.println("State value:"+ ST.get(i1).getText());
			System.out.println("State value:Not Matches");
			}
			}
			Actions N = new Actions(Driver);
			N.sendKeys(Keys.ESCAPE).build().perform();
	    Thread.sleep(1000);
	   /* JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Country);*/
		
		Country.click();
		WebElement Ca=Driver.findElement(By.xpath("//*[contains(text(),'Canada')]"));
		if(Ca.isDisplayed())
	     {
	    	Ca.click(); 
	     }
			Province.click();
				List<WebElement> PST= Driver.findElements(By.xpath("//div[@id='mui-component-select-province']//following::ul[2]//li"));
				System.out.println(PST.size());
				String[] a3 = ST2.split("!"); 
				boolean s3; 
				int c3=0;
				for(int i2=0;i2<PST.size();i2++)
				{
				s3 = false;
				for (String e2 : a3) 
				   {
				//System.out.println(Pro); 
				//System.out.println("Gender value:"+GE.get(i).getText());
				if(PST.get(i2).getText().equals(e2))
				{
				Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				  System.out.println("Province value:"+PST.get(i2).getText());
				  s3=true;
				  c3=c3+1;
				  if(c3==14) 
					{
						 System.out.println("Province value: Matches");
					}
				 break;
				}

				}

				if(!s3) 
				{
				System.out.println("Province value:"+ PST.get(i2).getText());
				System.out.println("Province value:Not Matches");
				}
				}
				Actions can=new Actions(Driver);
			 	can.moveToElement(AddressCancel).build();
			 	can.click(AddressCancel).perform();
			 	AddressCancel.click();
WorkInfo.click();
EmployeeStatus.click();
List<WebElement> EmpSta=Driver.findElements(By.xpath("//div[@id='mui-component-select-employmentStatusId']//following::ul[2]//li"));
System.out.println(EmpSta.size());
String[] WI = W.split("!"); 
boolean ES; 
int C=0;
for(int i3=0;i3<EmpSta.size();i3++)
{
ES = false;
for (String e1 : WI) 
   {
//System.out.println(Pro); 
//System.out.println("Gender value:"+GE.get(i).getText());
if(EmpSta.get(i3).getText().equals(e1))
{
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
  System.out.println("Employment Status value:"+EmpSta.get(i3).getText());
  ES=true;
  C=C+1;
  if(C==3) 
	{
		 System.out.println("Employment Status value: Matches");
	}
 break;
}

}

if(!ES) 
{
System.out.println("Employment Status value:"+ EmpSta.get(i3).getText());
System.out.println("Employment Status value:Not Matches");
}
}
JavascriptExecutor ex = (JavascriptExecutor)Driver;
ex.executeScript("arguments[0].click();", PayRate);
EmployeeAssignment.click();
 List<WebElement> EmpAssign=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
 System.out.println(EmpAssign.size());
 String[] EAL = L.split("!"); 
 boolean EA; 
 int A=0;
 for(int i4=0;i4<EmpAssign.size();i4++)
 {
 EA = false;
 for (String e1 : EAL) 
    {
 //System.out.println(Pro); 
 //System.out.println("Gender value:"+GE.get(i).getText());
 if(EmpAssign.get(i4).getText().equals(e1))
 {
 Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
   System.out.println("Employment Assignment Lookup 2 value:"+EmpAssign.get(i4).getText());
   EA=true;
   A=A+1;
   if(A==4) 
 	{
 		 System.out.println("Employment Assignment Lookup 2 value: Matches");
 	}
  break;
 }

 }

 if(!EA) 
 {
 System.out.println("Employment Assignment Lookup 2 value:"+ EmpAssign.get(i4).getText());
 System.out.println("Employment Assignment Lookup 2 value:Not Matches");
 }
 }
 Actions D = new Actions(Driver);
	D.sendKeys(Keys.ESCAPE).build().perform();
Thread.sleep(1000);
 Union.click();
	AddMembershipbutton.click();
	SelectUnion.click();
	 List<WebElement> U=Driver.findElements(By.xpath("//*[contains(text(),'Select a Union')]//following::ul[2]//li"));
	 System.out.println(U.size());
	 String[] UN = SU.split("!"); 
	 boolean S; 
	 int u=0;
	 for(int i5=0;i5<U.size();i5++)
	 {
	 S= false;
	 for (String e1 : UN) 
	    {
	 //System.out.println(Pro); 
	 //System.out.println("Gender value:"+GE.get(i).getText());
	 if(U.get(i5).getText().equals(e1))
	 {
	 Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	   System.out.println("Select a Union value:"+U.get(i5).getText());
	   S=true;
	   u=u+1;
	   if(u==5) 
	 	{
	 		 System.out.println("Select a Union value: Matches");
	 	}
	  break;
	 }

	 }

	 if(!S) 
	 {
	 System.out.println("Select a Union value:"+ U.get(i5).getText());
	 System.out.println("Select a Union value:Not Matches");
	 }
	 }
	 Actions Di = new Actions(Driver);
		Di.sendKeys(Keys.ESCAPE).build().perform();
	Thread.sleep(1000);
	 CustomField.click();
		EmployeeType.click();
		 List<WebElement> ET1=Driver.findElements(By.xpath("//div[@id='mui-component-select-10011']//following::ul[2]//li"));
		 System.out.println(ET1.size());
		 String[] ET2 = T.split("!"); 
		 boolean EY; 
		 int y=0;
		 for(int i6=0;i6<ET1.size();i6++)
		 {
		 EY = false;
		 for (String e1 : ET2) 
		    {
		 //System.out.println(Pro); 
		 //System.out.println("Gender value:"+GE.get(i).getText());
		 if(ET1.get(i6).getText().equals(e1))
		 {
		 Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		   System.out.println("Employee Type value:"+ET1.get(i6).getText());
		   EY=true;
		   y=y+1;
		   if(y==5) 
		 	{
		 		 System.out.println("Employee Type value: Matches");
		 	}
		  break;
		 }

		 }

		 if(!EY) 
		 {
		 System.out.println("Employee Type value:"+ ET1.get(i6).getText());
		 System.out.println("Employee Type value:Not Matches");
		 }
		 }
}
public void ImportEmployeesPageImageVerification() throws IOException, AWTException
{
	ImportEmployee.click();
	BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\ImportEmployees.png"));
	Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshot.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ImportEmployees.png"));
	BufferedImage actualImage = ImageScreenshot.getImage();
ImageDiffer imgdiffer = new ImageDiffer();
	   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
	if(imgdiff.hasDiff()==true)
	{
		System.out.println("Employee Management T1 Page: Import Employees Images are not same");
	}
	else
	{
	System.out.println("Employee Management T1 Page: Import Employees Images are same");
		}
}
public void CreateEmployeeLayout(String LN,String LT1,String VA,String VB,String VC,String VD,String VE,String VF,String VG,
		String VH,String VI,String VJ,String VK,String VL,String VM,String VN,String VO) throws IOException, AWTException
{
	ImportEmployee.click();
	CreateExcelLayout.click();
	GoBackbutton.click();
	CreateExcelLayout.click();
	LayoutName.click();
	LayoutName.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	LayoutName.sendKeys(LN);
	Undobutton.click();
	LayoutName.click();
	LayoutName.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	LayoutName.sendKeys(LN);
	To.click();
	List<WebElement> LT=Driver.findElements(By.xpath("//div[@id='mui-component-select-mapTo']//following::ul[2]//li"));
	 System.out.println(LT.size());
		for(int k=0;k<LT.size();k++)
		{
	 if(LT.get(k).getText().equals(LT1))
	 {
		 LT.get(k).click();
		 break;
	 }
		}
	
		 Actions D = new Actions(Driver);
			D.sendKeys(Keys.ESCAPE).build().perform();
			Header.click();
			
	
ASelectValue.click();
List<WebElement> A=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[1]//following::ul[2]//li"));
 System.out.println(A.size());
	for(int k=0;k<A.size();k++)
	{
 if(A.get(k).getText().equals(VA))
 {
	 A.get(k).click();
	 break;
 }
	}
Actions D1 = new Actions(Driver);
D1.sendKeys(Keys.ESCAPE).build().perform();
BSelectValue.click();
List<WebElement> B=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[2]//following::ul[2]//li"));
System.out.println(B.size());
	for(int k=0;k<B.size();k++)
	{
if(B.get(k).getText().equals(VB))
{
	 B.get(k).click();
	 break;
}
	}	
	Actions D2 = new Actions(Driver);
D2.sendKeys(Keys.ESCAPE).build().perform();
CSelectValue.click();
List<WebElement> C=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[3]//following::ul[2]//li"));
System.out.println(C.size());
for(int k=0;k<C.size();k++)
{
 if(C.get(k).getText().equals(VC))
 {
C.get(k).click();
 break;
 }
			}
Actions D3 = new Actions(Driver);
D3.sendKeys(Keys.ESCAPE).build().perform();
DSelectValue.click();
List<WebElement> DA=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[4]//following::ul[2]//li"));
System.out.println(DA.size());
for(int k=0;k<DA.size();k++)
{
if(DA.get(k).getText().equals(VD))
{
 DA.get(k).click();
break;
}
}
					 Actions D4 = new Actions(Driver);
						D4.sendKeys(Keys.ESCAPE).build().perform();
						ESelectValue.click();
						List<WebElement> EA=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[5]//following::ul[2]//li"));
						 System.out.println(EA.size());
							for(int k=0;k<EA.size();k++)
							{
						 if(EA.get(k).getText().equals(VE))
						 {
							 EA.get(k).click();
							 break;
						 }
							}
							 Actions D5= new Actions(Driver);
								D5.sendKeys(Keys.ESCAPE).build().perform();
								FSelectValue.click();
								List<WebElement> F=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[6]//following::ul[2]//li"));
								 System.out.println(F.size());
									for(int k=0;k<F.size();k++)
									{
								 if(F.get(k).getText().equals(VF))
								 {
									 F.get(k).click();
									 break;
								 }
									}
									 Actions D6 = new Actions(Driver);
										D6.sendKeys(Keys.ESCAPE).build().perform();
										GSelectValue.click();
										List<WebElement> G=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[7]//following::ul[2]//li"));
										 System.out.println(G.size());
											for(int k=0;k<G.size();k++)
											{
										 if(G.get(k).getText().equals(VG))
										 {
											 G.get(k).click();
											 break;
										 }
											}
											 Actions D7 = new Actions(Driver);
												D7.sendKeys(Keys.ESCAPE).build().perform();
												HSelectValue.click();
												List<WebElement> H=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[8]//following::ul[2]//li"));
												 System.out.println(H.size());
													for(int k=0;k<H.size();k++)
													{
												 if(H.get(k).getText().equals(VH))
												 {
													 H.get(k).click();
													 break;
												 }
													}
										 Actions D8 = new Actions(Driver);
										 D8.sendKeys(Keys.ESCAPE).build().perform();
										ISelectValue.click();
										List<WebElement> I=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[9]//following::ul[2]//li"));
										 System.out.println(I.size());
										for(int k=0;k<I.size();k++)
										{
										if(I.get(k).getText().equals(VI))
									 {
										I.get(k).click();
										break;
														 }
															}
Actions D9 = new Actions(Driver);
D9.sendKeys(Keys.ESCAPE).build().perform();
JSelectValue.click();
List<WebElement> J=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[10]//following::ul[2]//li"));
System.out.println(J.size());
for(int k=0;k<J.size();k++)
{
if(J.get(k).getText().equals(VJ))
{
	J.get(k).click();
	break;
																 
}
																	
}
Actions D10 = new Actions(Driver);
D10.sendKeys(Keys.ESCAPE).build().perform();
KSelectValue.click();
List<WebElement> KA=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[11]//following::ul[2]//li"));
System.out.println(KA.size());
for(int k=0;k<KA.size();k++)
{
if(KA.get(k).getText().equals(VK))
{
	KA.get(k).click();
	break;
																 
}
																	
}
Actions D11 = new Actions(Driver);
D11.sendKeys(Keys.ESCAPE).build().perform();
LSelectValue.click();
List<WebElement> L=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[12]//following::ul[2]//li"));
System.out.println(L.size());
for(int k=0;k<L.size();k++)
{
if(L.get(k).getText().equals(VL))
{
	L.get(k).click();
	break;
																 
}																	
}
Actions D12 = new Actions(Driver);
D12.sendKeys(Keys.ESCAPE).build().perform();
MSelectValue.click();
List<WebElement> M=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[13]//following::ul[2]//li"));
System.out.println(M.size());
for(int k=0;k<J.size();k++)
{
if(M.get(k).getText().equals(VM))
{
	M.get(k).click();
	break;
																 
}
																	
}

Actions D14 = new Actions(Driver);
D14.sendKeys(Keys.ESCAPE).build().perform();
NSelectValue.click();
List<WebElement> N=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[14]//following::ul[2]//li"));
System.out.println(N.size());
for(int k=0;k<N.size();k++)
{
if(N.get(k).getText().equals(VN))
{
	N.get(k).click();
	break;
																 
}																	
}

Actions D15 = new Actions(Driver);
D15.sendKeys(Keys.ESCAPE).build().perform();
OSelectValue.click();
List<WebElement> O=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[15]//following::ul[2]//li"));
System.out.println(O.size());
for(int k=0;k<O.size();k++)
{
if(O.get(k).getText().equals(VO))
{
	O.get(k).click();
	break;
																 
}																	
}
Actions D16= new Actions(Driver);
D16.sendKeys(Keys.ESCAPE).build().perform();
Createbutton.click();
		}


public void EditEmployeeLayout() throws InterruptedException
{
	
		//Driver=new chromeDriver(options);
	ImportEmployee.click();
	SelectLayout.click();
	//Driver.findElement(By.xpath("//div[@id='mui-component-select-selectedImportId']")).click();
	//Thread.sleep(1000);
	WebDriverWait wait = new WebDriverWait(Driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Automation')]")));
	WebElement Wb=Driver.findElement(By.xpath("//*[contains(text(),'Automation')]"));
	Actions A=new Actions(Driver);
	A.moveToElement(Wb).build();
	A.click(Wb).perform();
	
	ViewEdit.click();
	To.click();
	Driver.findElement(By.xpath("//div[@id='mui-component-select-mapTo']//following::ul[2]//li[17]")).click();
	Undobutton.click();
	To.click();
	Driver.findElement(By.xpath("//div[@id='mui-component-select-mapTo']//following::ul[2]//li[17]")).click();
	Actions D16 = new Actions(Driver);
	D16.sendKeys(Keys.ESCAPE).build().perform();
	PSelectValue.click();
    Driver.findElement(By.xpath("//*[contains(text(),'Skip')]")).click();
	Driver.findElement(By.xpath("//*[contains(text(),'Save')]")).click();
	
}

public void ValidateDownloadEmployeeLayout() throws InterruptedException
{
	ImportEmployee.click();
	SelectLayout.click();
	//Driver.findElement(By.xpath("//div[@id='mui-component-select-selectedImportId']")).click();
	//Thread.sleep(1000);
		

	WebDriverWait wait1 = new WebDriverWait(Driver, 60);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Automation')]")));
	WebElement Wb1=Driver.findElement(By.xpath("//*[contains(text(),'Automation')]"));
	Actions A1=new Actions(Driver);
	A1.moveToElement(Wb1).build();
	A1.click(Wb1).perform();
	DownloadFile.click();
}

public void ImportEmployeeLayout() throws InterruptedException
{
	ImportEmployee.click();
	SelectLayout.click();
	WebDriverWait wait1 = new WebDriverWait(Driver, 60);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Simple')]")));
	WebElement Wb1=Driver.findElement(By.xpath("//*[contains(text(),'Simple')]"));
	Actions A1=new Actions(Driver);
	A1.moveToElement(Wb1).build();
	A1.click(Wb1).perform();
	String ImportFile="F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\skillsmart-employee-template_New3.xlsx";
	Drophere.click();
	try {
		Robot robot = new Robot();
		StringSelection Selection = new StringSelection(ImportFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
			robot.setAutoDelay(2000);                                                                                
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	}
	Cancel.click();
	Thread.sleep(2000);
	ImportEmployee.click();
	SelectLayout.click();
	WebDriverWait wait2 = new WebDriverWait(Driver, 60);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Simple')]")));
	WebElement Wb2=Driver.findElement(By.xpath("//*[contains(text(),'Simple')]"));
	Actions A2=new Actions(Driver);
	A2.moveToElement(Wb2).build();
	A2.click(Wb2).perform();
	Drophere.click();

	try {
		Robot robot = new Robot();
		StringSelection Selection = new StringSelection(ImportFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
			robot.setAutoDelay(2000);                                                                                
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	}
Actions A=new Actions(Driver);
A.moveToElement(Importbutton).build();
A.click(Importbutton).perform();
	
}
public void ValidateImportEmployee(String FL,String S,String E,String S1,String S2,String CI,String ST,String ZI,
		String GE,String ETH,String P,String VT) throws InterruptedException
{
	
	WebElement Search=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[1]"));
	Search.sendKeys(FL);
	Actions Em1=new Actions(Driver);
	WebElement Emp1=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FL+"')]]"));
	Em1.moveToElement(Emp1).build();
	Em1.click(Emp1).perform();
	SSN.click();
	String SN=SSN.getAttribute("value");
	if(SN.equals(S))
	{
		System.out.println("SSN Matches");
	}
	else
	{
		System.out.println("SSN not Matches");
	}
	String EM=EmployeeId.getAttribute("value");
	EmployeeId.click();
	if(EM.equals(E))
	{
		System.out.println("EmployeeID Matches");
	}
	else
	{
		System.out.println("EmployeeID not Matches");
		
	}
	AddressHistory.click();
	EditAddress.click();
	Street1.click();
	String ST1=Street1.getAttribute("value");
	if(ST1.equals(S1))
	{
		System.out.println("Address: Street1 Matches");
	}
	else
	{
		System.out.println("Address:Street1 not Matches");
	}
	Street2.click();
	String ST2=Street2.getAttribute("value");
	if(ST2.equals(S2))
	{
		System.out.println("Address:Street2 Matches");
	}
	else
	{
		System.out.println("Address:Street2 not Matches");
		
	}
	City.click();
	String C=City.getAttribute("value");
	if(C.equals(CI))
	{
		System.out.println("Address:City Matches");
	}
	else
	{
		System.out.println("Address:City not Matches");
		
	}
	//State.click();
	String Sta=State.getText();
	if(Sta.equals(ST))
	{
		System.out.println("Address:State Matches");
	}
	else
	{
		System.out.println("Address:State not Matches");
		
	}
	Zip.click();
	
	String Z=Zip.getAttribute("value");
	if(Z.equals(ZI))
	{
		System.out.println("Address:Zip Code Matches");
	}
	else
	{
		System.out.println("Address:Zip Code not Matches");
		
	}
	AddressCancel.click();
	Actions AM=new Actions(Driver);
	WebElement EMP=Driver.findElement(By.xpath("(//*[contains(text(),'Employee')])[5]//following::button[1]"));
	AM.moveToElement(EMP).build();
	AM.click(EMP).perform();
	
	String G=GenderId.getText();
	if(G.equals(GE))
	{
		System.out.println("Gender Matches");
	}
	else
	{
		System.out.println("Gender not Matches");
		
	}
	String ET=EthnicityId.getText();
	if(ET.equals(ETH))
	{
		System.out.println("Ethnicity Matches");
	}
	else
	{
		System.out.println("Ethnicity not Matches");
		
	}
	String PH=Phone.getAttribute("value");
	if(PH.equals(P))
	{
		System.out.println("Phone Matches");
	}
	else
	{
		System.out.println("Phone not Matches");
		
	}
	String V=VeteranStatusToggle.getAttribute("value");
	if(V.toUpperCase().equals(VT))
	{
	System.out.println("Veteran Status Toggle selection is matching");
	}
	else
	{
		System.out.println("Veteran Status Toggle selection is not matching");
	}
	
}
public void EditImportEmployee(String FL,String HD,String ES,String AN,
		String UA,String SD,String ED,String ET1, String A,
		String JT,String PED,String PD,String BR,String OT,String DT,String FR,
		String Exp,String FND ) throws InterruptedException
{
	
	WebElement Search=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[1]"));
	Search.sendKeys(FL);
	Thread.sleep(2000);
	Actions Em1=new Actions(Driver);
	WebElement Emp1=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FL+"')]]"));
	Em1.moveToElement(Emp1).build();
	Em1.click(Emp1).perform();
	Driver.findElement(By.xpath("//*[contains(text(),'On Project')]//preceding::input[1]")).click();
	//WorkInfo
	 WorkInfo.click();
	    HireDate.click();
	    HireDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		HireDate.sendKeys(HD);
		Thread.sleep(2000);
		EmployeeStatus.click();
		 List<WebElement> EmpSta=Driver.findElements(By.xpath("//div[@id='mui-component-select-employmentStatusId']//following::ul[2]//li"));
		 System.out.println(EmpSta.size());
			for(int l=0;l<=EmpSta.size()-1;l++)
			{
				System.out.println(EmpSta.get(l).getText());
			}
			for(int k=0;k<EmpSta.size();k++)
			{
		 if(EmpSta.get(k).getText().equals(ES))
		 {
			 EmpSta.get(k).click();
			 break;
		 }
			}
			ApprenticeNumber.click();
	    ApprenticeNumber.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
		ApprenticeNumber.sendKeys(AN);
		Thread.sleep(2000);
		//Union
		Union.click();
		AddMembershipbutton.click();
		SelectUnion.click();
		 List<WebElement> U=Driver.findElements(By.xpath("//*[contains(text(),'Select a Union')]//following::ul[2]//li"));
		 System.out.println(U.size());
			for(int l=0;l<=U.size()-1;l++)
			{
				System.out.println(U.get(l).getText());
			}
			for(int k=0;k<U.size();k++)
			{
		 if(U.get(k).getText().equals(UA))
		 {
			 U.get(k).click();
			 break;
		 }
			}
			StartDate.click();
			StartDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			StartDate.sendKeys(SD);
			EndDate.click();
			EndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			EndDate.sendKeys(ED);
			Thread.sleep(1000);
			CustomField.click();
			EmployeeType.click();
			 List<WebElement> E1=Driver.findElements(By.xpath("//div[@id='mui-component-select-10011']//following::ul[2]//li"));
			 System.out.println(E1.size());
				for(int l=0;l<=E1.size()-1;l++)
				{
					System.out.println(E1.get(l).getText());
				}
				for(int k=0;k<E1.size();k++)
				{
			 if(E1.get(k).getText().equals(ET1))
			 {
				 E1.get(k).click();
				 break;
			 }
				}
		//PayRates
		//PayRate.click();
		JavascriptExecutor ex = (JavascriptExecutor)Driver;
		ex.executeScript("arguments[0].click();", PayRate);
		EmployeeAssignment.click();
		 List<WebElement> EmpAssign=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
		 System.out.println(EmpAssign.size());
			for(int l=0;l<=EmpAssign.size()-1;l++)
			{
				System.out.println(EmpAssign.get(l).getText());
			}
			for(int k=0;k<EmpAssign.size();k++)
			{
		 if(EmpAssign.get(k).getText().equals(A))
		 {
			 EmpAssign.get(k).click();
			 break;
		 }
			}
			AddEntry.click();
			Thread.sleep(3000);
			JavascriptExecutor x = (JavascriptExecutor)Driver;
			x.executeScript("arguments[0].click();", SelectType);
			Thread.sleep(2000);
			SelectType.click();
			 List<WebElement> J=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
			 System.out.println(J.size());
				for(int l=0;l<=J.size()-1;l++)
				{
					System.out.println(J.get(l).getText());
				}
				for(int k=0;k<J.size();k++)
				{
			 if(J.get(k).getText().equals(JT))
			 {
				 J.get(k).click();
				 break;
			 }
				}
				PayEffectiveDate.click();
				PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				PayEffectiveDate.sendKeys(PED);
				PayEndDate.click();
				PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				PayEndDate.sendKeys(PD);
				BaseRate.click();
				BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				BaseRate.sendKeys(BR);
				OTRate.click();
				OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				OTRate.sendKeys(OT);
				DTRate.click();
				DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				DTRate.sendKeys(DT);
				FringeRate.click();
				FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				FringeRate.sendKeys(FR);
				Confirm.click();
				Thread.sleep(1000);
					Validations.click();
					//AddValidationDocument.click();
					AddDocumentRow.click();
					Drophere.click();
					String strSel = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\347.pdf";
					try {
						Robot robot = new Robot();
						StringSelection Selection = new StringSelection(strSel);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
							robot.setAutoDelay(2000);                                                                                
							robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);
							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyRelease(KeyEvent.VK_V);
							robot.keyPress(KeyEvent.VK_ENTER);
							robot.keyRelease(KeyEvent.VK_ENTER);		
							
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}
					Expires.click();
					Expires.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Expires.sendKeys(Exp);
					
					//AddValidationDocument.click();
					
					ValidationConfirm.click();
					WebDriverWait i = new WebDriverWait(Driver, 60);
					i.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Save')])[1]")));
			    	Thread.sleep(3000);
					JavascriptExecutor te1 = (JavascriptExecutor)Driver;
					te1.executeScript("arguments[0].click();", SaveandClose);
					Thread.sleep(2000);
					WebDriverWait wai = new WebDriverWait(Driver, 60);
					wai.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()[contains(.,'"+FND+"')]]")));
					WebElement Search1=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[1]"));
					Search1.sendKeys(FND);
					Actions Em2=new Actions(Driver);
					WebElement Emp2=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FND+"')]]"));
					Em2.moveToElement(Emp2).build();
					Em2.click(Emp2).perform();
					DeleteEmployee.click();
					Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[2]")).click();
}
public WorkClassesPageT1 WClaunch() {
	// TODO Auto-generated method stub
	WorkClasses.click();
	return new WorkClassesPageT1();
}

}

/*	public String pdfcompare()throws IOException
	{
		
	
	
	1
	
	103
	201.
	
	//PDF Util
	//String FolderLocation="C:\\Users\\prince\\Downloads\\New";
		//String Actual="C:\\Users\\prince\\Downloads\\Do\\File1.pdf";
		//String Expect="F:\\347\\File2.pdf";
		/*PDFUtil Pdfutil=new PDFUtil();
		
		Pdfutil.setCompareMode(CompareMode.VISUAL_MODE);
		Pdfutil.highlightPdfDifference(true);
		Pdfutil.setImageDestinationPath(FolderLocation);
		Pdfutil.compare(Actual, Expect);*/
	//PDF Box
	/*File file=new File("C:\\Users\\prince\\Downloads\\Do\\File1.pdf");
	FileInputStream fis=new FileInputStream(file);
	PDDocument document=null;
	document=PDDocument.load(fis);
	String Data=new PDFTextStripper().getText(document);
	System.out.println(Data);
	return Data;*/
	
/*JavascriptExecutor ex = (JavascriptExecutor)Driver;
	ex.executeScript("arguments[0].click();", ReportDownload);
Driver.findElement(By.xpath("//div[@id='mui-component-select-selectedReport']")).click();
Driver.findElement(By.xpath("//*[contains(text(),'Contact List')]")).click();
Driver.findElement(By.xpath("//*[contains(text(),'Excel')]")).click();*/

/*	}
	}*/
