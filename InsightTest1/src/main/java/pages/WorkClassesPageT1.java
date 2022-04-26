package pages;

import java.awt.AWTException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
import org.testng.annotations.Test;

import base.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;

public class WorkClassesPageT1 extends TestBase{

	@FindBy(xpath="//*[contains(text(),'Work Classes')]")
	WebElement WorkClasses;
	
	@FindBy(xpath="//*[contains(text(),'SELECT WORK CLASSES')]")
	WebElement SelectWorkClasses;
	
	@FindBy(id="searchTxt")
	WebElement Search;

	@FindBy(xpath="//button[@title='Clear Search']")
	WebElement Clear;
	
	@FindBy(xpath="//*[contains(text(),'Save')]")
	WebElement Save;
	
	@FindBy(xpath="//*[contains(text(),'PAYROLL MAPPING')]")
	WebElement PayrollMapping;
	
	@FindBy(xpath="//*[contains(text(),'Your Value')]//following::div[10]")
	WebElement WorkClass1;
	
	@FindBy(xpath="//*[contains(text(),'Your Value')]//following::div[15]")
	WebElement WorkClass2;
	
	@FindBy(xpath="//*[contains(text(),'Your Value')]//following::div[20]")
	WebElement WorkClass3;
	
	@FindBy(xpath="//*[contains(text(),'Undo Changes')]")
	WebElement UndoChanges;
	
	@FindBy(xpath="//*[contains(text(),'Save Mappings')]")
	WebElement SaveMappings;
	
	@FindBy(xpath="//*[contains(text(),'Work Classes')]//following::div[1]")
	WebElement PayrollEntry;
	
	@FindBy(id="mui-component-select-selectedDateRange")
	WebElement SelectPayrollPeriod;
	
	@FindBy(xpath="//*[contains(text(),'Cancel')]")
	WebElement Cancel;
	
	@FindBy(xpath="//*[contains(text(),'Create')]")
	WebElement Create;
	
	public WorkClassesPageT1()
	{
		PageFactory.initElements(Driver,this);
	}
	
	public String ValidateSelectWorkClassesTab()
	{
		return SelectWorkClasses.getText();
	}
	
	public String ValidatePayrollMappingTab()
	{
		return PayrollMapping.getText();
	}
	
	
	public void WorkClassesPageImageVerification() throws IOException, AWTException, InterruptedException
	{
		WebDriverWait wai = new WebDriverWait(Driver, 60);
		wai.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Bicycle Mechanic')]")));
		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\WorkClassesPage1.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\WorkClassesPage1.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
		ImageDiffer imgdiffer = new ImageDiffer();

		 ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Work Classes: Page1 Images are not same");
		}
		else
		{
			System.out.println("Work Classes: Page1 Images are same");
		}
		
		Thread.sleep(1000);
		BufferedImage expectedImage1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\WorkClassesPage2.png"));
				WebElement S1=Driver.findElement(By.xpath("//*[contains(text(),'Cell')]"));
			      // Javascript executor
			      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S1);
			Screenshot ImageScreenshot1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				ImageIO.write(ImageScreenshot1.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\WorkClassesPage2.png"));
			BufferedImage actualImage1 = ImageScreenshot1.getImage();
		ImageDiffer imgdiffer1 = new ImageDiffer();

				   ImageDiff imgdiff1 = imgdiffer.makeDiff(expectedImage1, actualImage1);
				if(imgdiff1.hasDiff()==true)
				{
					System.out.println("Work Classes: Page2 Images are not same");
				}
				else
				{
					System.out.println("Work Classes: Page2 Images are same");
				}
		BufferedImage expectedImage2 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\WorkClassesPage3.png"));
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'QA Analyst')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
	Screenshot ImageScreenshot2= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot2.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\WorkClassesPage3.png"));
	BufferedImage actualImage2 = ImageScreenshot1.getImage();
		ImageDiffer imgdiffer2 = new ImageDiffer();

		   ImageDiff imgdiff2 = imgdiffer.makeDiff(expectedImage2, actualImage2);
		if(imgdiff2.hasDiff()==true)
		{
			System.out.println("Work Classes: Page3 Images are not same");
		}
		else
		{
			System.out.println("Work Classes: Page3 Images are same");
		}
		WebElement l=Driver.findElement(By.xpath("//*[contains(text(),'WC 2')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", l);
	      //Thread.sleep(800);
	    BufferedImage expectedImage3 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\WorkClassesPage4.png"));
		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Screenshot ImageScreenshot3= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot3.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\WorkClassesPage4.png"));

		BufferedImage actualImage3 = ImageScreenshot.getImage();
		ImageDiffer imgdiffer3 = new ImageDiffer();

		   ImageDiff imgdiff3 = imgdiffer.makeDiff(expectedImage3, actualImage3);
		if(imgdiff2.hasDiff()==true)
		{
			System.out.println("Work Classes: Page4 Images are not same");
		}
		else
		{
			System.out.println("Work Classes: Page4 Images are same");
		}
		
	}
	public void PayrollMappingPageImageVerification() throws IOException, AWTException
	{
		PayrollMapping.click();
		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\PayrollMapping.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\PayrollMapping.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
		ImageDiffer imgdiffer = new ImageDiffer();

		 ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Work Classes: Payroll Mapping Images are not same");
		}
		else
		{
			System.out.println("Work Classes: Payroll Mapping Images are same");
		}
}
	public void ValidateWorkClassSelection(String S, String W,String WCN1,String WCN2,String W1, String W2,String W3)
	{
		Search.sendKeys(S);
		Driver.findElement(By.xpath("//*[contains(text(),'"+W+"')]//preceding::input[1]")).click();
		Clear.click();
		Save.click();
		PayrollMapping.click();
		WebElement WC1=Driver.findElement(By.xpath("//*[contains(text(),'"+WCN1+"')]//following::div[2]"));
		WC1.sendKeys(W1);
		WebElement WC2=Driver.findElement(By.xpath("//*[contains(text(),'"+WCN2+"')]//following::div[2]"));
		WC2.sendKeys(W2);
		WebElement WC3=Driver.findElement(By.xpath("//*[contains(text(),'"+W+"')]//following::div[2]"));
		WC3.sendKeys(W2);
		UndoChanges.click();
		WC1.sendKeys(W1);
		WC2.sendKeys(W2);
		WC3.sendKeys(W3);

		SaveMappings.click();
			
	}
	
	public PayrollEntryPageT1 PayrollEntrylaunch() throws InterruptedException {
		// TODO Auto-generated method stub
		Actions A1=new Actions(Driver);
		WebElement W=Driver.findElement(By.xpath("//*[contains(text(),'Work Classes')]//following::div[1]"));
		A1.moveToElement(W).build();
		A1.click(W).perform();
		return new PayrollEntryPageT1();
	}
}