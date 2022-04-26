package pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.events.KeyEvent;

import base.TestBase;

import java.awt.AWTException;
import java.awt.Robot;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;



public class HomePage extends TestBase{
	
	@FindBy(xpath="//*[contains(text(),'Project Portfolio')]")
	WebElement Section1;
	
	@FindBy(xpath="//*[contains(text(),'Select a Project')]")
	WebElement Section2;
	
	@FindBy(xpath="//*[contains(text(),'Employees')]")
	WebElement Tab1;
	
	@FindBy(xpath="//*[contains(text(),'Contractors')]")
	WebElement Tab2;
	
	@FindBy(xpath="//*[contains(text(),'Prev. Wage Project -')]//following::button[1]")
	WebElement ProjectSelection;
	
	@FindBy(xpath="//*[contains(text(),'Table View')]")
	WebElement TableView;
	
	@FindBy(xpath="//*[contains(text(),'SINGLE CONTRACTS')]")
	WebElement SingleContractors;
	
	@FindBy(xpath="//*[contains(text(),'SEARCH BY CONTRACTOR')]")
	WebElement SearchByContractor;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement Search;
	
	@FindBy(xpath="//input[@name='search']//following::button[1]")
	WebElement Searchbutton;
	
	@FindBy(xpath="//input[@name='search']//following::button[2]")
	WebElement Closebutton;
	
	@FindBy(xpath="//*[contains(text(),'P3')]//following::div[5]")
	WebElement Arrowbutton;
	
	@FindBy(xpath="//*[contains(text(),'Employees')]")
	WebElement Employees;
	
	@FindBy(xpath="(//*[contains(text(),'Cross Project Employees')])[1]")
	WebElement CrossProjectEmployees;
	
	@FindBy(xpath="//*[contains(text(),'Employee Details')]")
	WebElement EmployeeDetails;
	
	@FindBy(xpath="//*[contains(text(),'Contractors')]")
	WebElement Contractors;
	
	@FindBy(xpath="(//*[contains(text(),'Cross Project Contractors')])[1]")
	WebElement CrossProjectContractors;
	
	@FindBy(xpath="//*[contains(text(),'Contractor Details')]")
	WebElement ContractorDetails;
	
	
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(Driver,this);
		
	}
	
	public void HomePageImageVerification() throws IOException, AWTException
	{
		WebDriverWait wait4 = new WebDriverWait(Driver, 50);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Prev. Wage Project -')]")));
		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\HomePage1.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\HomePage1.png"));
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
		BufferedImage expectedImage1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\HomePage2.png"));
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Copy Subs')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
	Screenshot ImageScreenshot1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot1.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\HomePage2.png"));
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
		
		WebElement l=Driver.findElement(By.xpath("//*[contains(text(),'Prev. Wage Project -')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", l);
	      //Thread.sleep(800);
	      BufferedImage expectedImage2 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\HomePage3.png"));
		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Screenshot ImageScreenshot2= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot2.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\HomePage3.png"));

		BufferedImage actualImage2 = ImageScreenshot2.getImage();
		ImageDiffer imgdiffer2 = new ImageDiffer();

		   ImageDiff imgdiff2 = imgdiffer2.makeDiff(expectedImage2, actualImage2);
		if(imgdiff2.hasDiff()==true)
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
		Thread.sleep(3000);
		return Section1.getText();
	}
	
	public String ValidateSecondSection() 
	{
		
		return Section2.getText();
	}
	
	public String ValidateFirstTab()
	{
		return Tab1.getText();
	}
	
	public void Employeesview() throws IOException, AWTException
	{
		Employees.click();
		WebDriverWait wait= new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Cross Project Employees')]")));
	    CrossProjectEmployees.click();
	      //Thread.sleep(800);
	    BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\CrossProjectEmployees.png"));
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\CrossProjectEmployees.png"));

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
	    BufferedImage expectedImage1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\EmployeeDetails.png"));
		EmployeeDetails.click();
		Screenshot ImageScreenshot1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot1.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\EmployeeDetails.png"));

		BufferedImage actualImage1 = ImageScreenshot.getImage();
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
	}
	
	public String ValidateSecondTab()
	{
		return Tab2.getText();
	}
	
	public void Contractorsview() throws IOException, AWTException
	{
		Contractors.click();
		WebDriverWait wait= new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Cross Project Contractors')]")));
	    CrossProjectContractors.click();
	      //Thread.sleep(800);
	    BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\CrossProjectEmployees.png"));
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\CrossProjectContractors.png"));

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
		BufferedImage expectedImage1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\ContractorDetails.png"));
		ContractorDetails.click();
		Screenshot ImageScreenshot1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot1.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ContractorDetails.png"));

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
	}
	
	public void HomePageDDNVerification(String P)
	{
		List<WebElement> Pr=Driver.findElements(By.xpath("//*[contains(text(),'Select a Project')]//following::div[1]//p"));
		 System.out.println(Pr.size());
		 String[] arr = P.split("!"); 
		 int count=0;
		   boolean strFlag;
         for(int i=0;i<Pr.size();i++)
 		{
        	 strFlag = false;
         	for (String Pro : arr) 
     		   {
         	//System.out.println(Pro); 
			//System.out.println("Project Name value:"+Pr.get(i).getText());
	  if(Pr.get(i).getText().equals(Pro))
	  {
		  System.out.println("Project Name value:"+Pr.get(i).getText());
		  strFlag=true;
		  count=count+1;
		  if(count==12) 
			{
				 System.out.println("Project Name value: Matches");
			}
		  break;

	  }
     		   }   
         	if(!strFlag) {
        		System.out.println("Project Name value:"+ Pr.get(i).getText());
        		System.out.println("Project Name value:Not Matches");
        	}
 		}
	}

	
	
	public void SearchByContractorviewImageVerification() throws IOException, AWTException
	{
		WebDriverWait wait1 = new WebDriverWait(Driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Table View')]")));
		TableView.click();
		WebDriverWait wait2 = new WebDriverWait(Driver, 50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'SEARCH BY CONTRACTOR')]")));
		SearchByContractor.click();
	    BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SearchContractor1.png"));
		Screenshot SearchContractor1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(SearchContractor1.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SearchContractor1.png"));
		BufferedImage actualImage = SearchContractor1.getImage();
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
		
		
		
		BufferedImage expectedImage1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SearchContractor2.png"));
		
		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		WebElement l=Driver.findElement(By.xpath("//*[contains(text(),'Spoof User')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", l);
		Screenshot SearchContractor2= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(SearchContractor2.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SearchContractor2.png"));

		BufferedImage actualImage1 = SearchContractor2.getImage();

		ImageDiffer Diff = new ImageDiffer();
		   ImageDiff Dif= Diff.makeDiff(expectedImage1, actualImage1);
			if(Dif.hasDiff()==true)
			{
				System.out.println("Images are not same");
			}
			else
			{
				System.out.println("Images are same");
			}
	}
	
	public void SearchByContractorviewSearch() throws IOException, AWTException
	{
		WebDriverWait wait1 = new WebDriverWait(Driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Table View')]")));
		TableView.click();
		WebDriverWait wait2 = new WebDriverWait(Driver, 50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'SEARCH BY CONTRACTOR')]")));
		SearchByContractor.click();
	    Search.sendKeys("123");
	    Searchbutton.click();
	    BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SearchByContractorviewSearch1.png"));
	    Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    ((JavascriptExecutor) Driver).executeScript("window.scrollBy(0,40000)");
	    Screenshot ImageScreenshotS= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);
		
		ImageIO.write(ImageScreenshotS.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SearchByContractorviewSearch1.png"));
		BufferedImage actualImage1 = ImageScreenshotS.getImage();

		ImageDiffer Diff = new ImageDiffer();
		   ImageDiff Dif= Diff.makeDiff(expectedImage, actualImage1);
			if(Dif.hasDiff()==true)
			{
				System.out.println("Images are not same");
			}
			else
			{
				System.out.println("Images are same");
			}
			BufferedImage expectedImage1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SearchByContractorviewSearch2.png"));
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Mortenson')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
		Screenshot SearchContractor2= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(SearchContractor2.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SearchByContractorviewSearch2.png"));

		BufferedImage actualImage = SearchContractor2.getImage();

		ImageDiffer Diff1 = new ImageDiffer();
		   ImageDiff Dif1= Diff.makeDiff(expectedImage1, actualImage);
			if(Dif1.hasDiff()==true)
			{
				System.out.println("Images are not same");
			}
			else
			{
				System.out.println("Images are same");
			}
			Arrowbutton.click();
		   BufferedImage SearchSub = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SearchByContractorviewSub1.png"));
		    Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		    ((JavascriptExecutor) Driver).executeScript("window.scrollBy(0,40000)");
		    Screenshot SearchSub1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);
			
			ImageIO.write(SearchSub1.getImage(), "png",
					new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SearchByContractorviewSub1.png"));
			BufferedImage actualImage2 = SearchSub1.getImage();

			ImageDiffer Diff2 = new ImageDiffer();
			   ImageDiff Dif2= Diff2.makeDiff(SearchSub, actualImage2);
				if(Dif.hasDiff()==true)
				{
					System.out.println("Images are not same");
				}
				else
				{
					System.out.println("Images are same");
				}
				BufferedImage SearchSub3 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SearchByContractorViewSub2.png"));
				WebElement S1=Driver.findElement(By.xpath("//*[contains(text(),'Sample')]"));
			      // Javascript executor
			      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S1);
			Screenshot SearchSub4= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

			Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			ImageIO.write(SearchSub4.getImage(), "png",
					new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SearchByContractorviewSub2.png"));

		BufferedImage actualImage3= SearchSub4.getImage();

			ImageDiffer Diff3 = new ImageDiffer();
			   ImageDiff Dif3= Diff.makeDiff(SearchSub3, actualImage3);
				if(Dif3.hasDiff()==true)
				{
					System.out.println("Images are not same");
				}
				else
				{
					System.out.println("Images are same");
				}
				Closebutton.click();
				
	    
		
	}
	public void SingleContractorsImageVerification() throws IOException, AWTException
	{
		WebDriverWait wait1 = new WebDriverWait(Driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Table View')]")));
		TableView.click();
		WebDriverWait wait2 = new WebDriverWait(Driver, 50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'SINGLE CONTRACTS')]")));
		SingleContractors.click();
	   BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SingleContractor1.png"));
		Screenshot SingleContractor= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(SingleContractor.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SingleContractor1.png"));
		BufferedImage actualImage = SingleContractor.getImage();
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
		WebElement B=Driver.findElement(By.xpath("//*[contains(text(),'Basic')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", B);
		BufferedImage expectedImage1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SingleContractor2.png"));
			Screenshot SingleContractor1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

			Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			ImageIO.write(SingleContractor1.getImage(), "png",
					new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SingleContractor2.png"));
			BufferedImage actualImage1 = SingleContractor1.getImage();
			ImageDiffer imgdiffer1 = new ImageDiffer();

			  ImageDiff imgdiff1 = imgdiffer1.makeDiff(expectedImage1, actualImage1);
			if(imgdiff1.hasDiff()==true)
			{
				System.out.println("Images are not same");
			}
			else
			{
				System.out.println("Images are same");
			}
		
		BufferedImage expectedImage2 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SingleContractor3.png"));
		WebElement P=Driver.findElement(By.xpath("//*[contains(text(),'Prev. Wage Project -')]"));
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", P);
	      Screenshot SingleContractor2= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

			Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			ImageIO.write(SingleContractor2.getImage(), "png",
					new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SingleContractor3.png"));

			BufferedImage actualImage2 = SingleContractor2.getImage();
		ImageDiffer Diff = new ImageDiffer();
		ImageDiff Dif= Diff.makeDiff(expectedImage2, actualImage2);
			if(Dif.hasDiff()==true)
			{
				System.out.println("Images are not same");
			}
			else
			{
				System.out.println("Images are same");
			}
	}
	public DashboardPage Projectselection()
	{
		WebDriverWait wait4 = new WebDriverWait(Driver, 70);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Prev. Wage Project -')]//following::button[1]")));
		ProjectSelection.click();
		return new DashboardPage();
		
	}




	

}
