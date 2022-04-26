package pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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


public class DashboardPageT1 extends TestBase{
	
	@FindBy(xpath="//*[contains(text(),'Prev. Wage Project -')]//following::button[1]")
	WebElement ProjectSelection;
	
	@FindBy(xpath="//*[contains(text(),'Change')]//preceding::p[1]")
	WebElement ProjectName;
	
	@FindBy(xpath="//*[contains(text(),'Select Contract')]//following::p[1]")
	WebElement ProjectNumber;
	
	@FindBy(xpath="//*[contains(text(),'Total Award Amount')]")
	WebElement Section1;
	
	@FindBy(xpath="//*[contains(text(),'Total paid to date')]")
	WebElement Section2;
	
	@FindBy(xpath="//*[contains(text(),'Total % Spent to date')]")
	WebElement Section3;
	
	@FindBy(id="mui-component-select-tabValue")
	WebElement Entity;
	
	@FindBy(xpath="//*[contains(text(),'Total Amount Awarded')]")
	WebElement Section4;
	
	@FindBy(xpath="//*[contains(text(),'Total % of Project')]")
	WebElement Section5;
	
	@FindBy(xpath="(//*[contains(text(),'Total paid to date')])[2]")
	WebElement Section6;
	
	@FindBy(xpath="(//*[contains(text(),'Total % Spent to date')])[2]")
	WebElement Section7;
	
	@FindBy(xpath="//*[contains(text(),'TOTAL WORKERS*')]")
	WebElement Section8;
	
	@FindBy(xpath="//*[contains(text(),'TOTAL HOURS WORKED ON PROJECT*')]")
	WebElement Section9;
	
	
	@FindBy(xpath="//*[contains(text(),'Notifications')]")
	WebElement Section10;
	
	@FindBy(xpath="//*[contains(text(),'* Data is retrieved')]")
	WebElement DefaultMessage;
	
	@FindBy(xpath="//*[contains(text(),'Details')]")
	WebElement DetailspageLaunch;
	
	public DashboardPageT1()
	{
		
		PageFactory.initElements(Driver,this);
		
	}
	public String ValidateProjectName()
	{
		return ProjectName.getText();
	}

	public String ValidateProjectNumber()
	{
		return ProjectNumber.getText();
	}
	
	public void DashboardPageImageVerification() throws IOException {
		WebDriverWait wait4 = new WebDriverWait(Driver, 40);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Total Award Amount')]")));
		
	BufferedImage expectedImageDP = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\DashboardTier1Image1.png."));
	
		
		Screenshot ImageScreenshotDP= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshotDP.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\DashboardTier1Image1.png"));
		BufferedImage actualImageDP = ImageScreenshotDP.getImage();


		ImageDiffer imgdifferD = new ImageDiffer();

	   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageDP, actualImageDP);
	if(imgdiffD.hasDiff()==true)
	{
		System.out.println("Images are not same");
	}
	else
	{
		System.out.println("Images are same");
	}
		
		BufferedImage expectedImageP = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\DashboardTier1Image2.png."));
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Notifications')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
	Screenshot ImageScreenshot1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot1.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\DashboardTier1Image2.png"));
		
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
	public String ValidateFirstSection() throws InterruptedException
	{
		//ProjectSelection.click();
		Thread.sleep(1000);
		return Section1.getText();
	}
	
	public String ValidateSecondSection()
	{
		return Section2.getText();
	}
	
	public String ValidateThirdSection()
	{
		return Section3.getText();
	}
	

	
	public String ValidateFourthSection()
	{
		return Section4.getText();
	}
	
	public String ValidateFifthSection()
	{
		return Section5.getText();
	}
	
	public String ValidateSixthSection()
	{
		return Section6.getText();
	}
	
	public String ValidateSeventhSection()
	{
		return Section7.getText();
	}
	
	public String ValidateEighthSection()
	{
		return Section8.getText();
	}
	
	public String ValidateNinthSection()
	{
		return Section9.getText();
	}
	
	public String ValidateTenthSection()
	{
		return Section10.getText();
	}
	
	public DetailsPageT1 DetailsPageLaunch()
	{
		 DetailspageLaunch.click();
		 return new DetailsPageT1();
		 
	}

	public String ValidateDefaultMessage() {

		return DefaultMessage.getText();
	}

	public void ValidateEntity() {
		
		Driver.findElement(By.xpath("//*[@id='mui-component-select-tabValue']")).click();
		List<WebElement> list= Driver.findElements(By.xpath("//div[@id='menu-tabValue']//li//p"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
		}
	}
	public void DashboardPageDDNVerification(String EN) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Total Award Amount')]")));
		Driver.findElement(By.xpath("//*[@id='mui-component-select-tabValue']")).click();
		List<WebElement> E= Driver.findElements(By.xpath("//div[@id='menu-tabValue']//li//p"));
		System.out.println(E.size());
		String[] arr = EN.split("!"); 
		 Boolean strFlag;  
        for(int i=0;i<E.size();i++)
		{
        	strFlag=false;
        	int count=0;
        	for (String N : arr) 
    		   {
        	//System.out.println(Pro); 
			//System.out.println("Entity Name value:"+E.get(i).getText());
	  if(E.get(i).getText().equals(N))
	  {
		  System.out.println("Entity Name value:"+E.get(i).getText());
		  strFlag=true;
		  count=count+1;
		  if(count==16) 
			{
				 System.out.println("Entity Name value: Matches");
			}
		  break;

	  }
     		   }   
         	if(!strFlag) {
        		System.out.println("Entity Name value:"+ E.get(i).getText());
        		System.out.println("Entity Name value:Not Matches");
        	}
 		}
	}

}
