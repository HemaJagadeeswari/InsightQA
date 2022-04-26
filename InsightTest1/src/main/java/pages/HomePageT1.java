package pages;

import java.awt.AWTException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
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

public class HomePageT1 extends TestBase{
	
	@FindBy(xpath="//*[contains(text(),'Dashboard')]")
	WebElement Dashboard;
	
	@FindBy(xpath="//*[contains(text(),'Select a Project')]")
	WebElement Section;
	
	@FindBy(xpath="//*[contains(text(),'Prev. Wage Project -')]//following::button[1]")
	WebElement Project;
	
	public HomePageT1()
	{
		PageFactory.initElements(Driver,this);
		
	}
	
	public void HomePageImageVerification() throws IOException, AWTException
	{
		WebDriverWait wait4 = new WebDriverWait(Driver, 50);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Prev. Wage Project -')]")));
		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\Automation File\\Baseline\\HomePageT1.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\Automation File\\UI Image\\HomePageT1.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
		ImageDiffer imgdiffer = new ImageDiffer();

		   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Home Page T1: Images are not same");
		}
		else
		{
			System.out.println("Home Page T1: Images are same");
		}
	}
    public String ValidateSection()
    {
    	WebDriverWait wait = new WebDriverWait(Driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Select a Project')]")));
    	return Section.getText();
    }
    
    public SetupPageT1 PageView() throws InterruptedException
    {
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Prev. Wage Project -')]//following::button[1]")));
    Project.click();
   // Dashboard.click();
		return new SetupPageT1();
		    }
}  
