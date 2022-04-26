package pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;

public class LoginPage extends TestBase{

//Page Factory -OR
@FindBy(name="email_adress")
@CacheLookup
WebElement emailaddress;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="(//*[contains(text(),'Login')])[2]")
WebElement Loginbutton;

@FindBy(xpath="//img[@src='api/lookup/v2/site/logo']")
WebElement Logo;


@FindBy(xpath="(//*[contains(text(),'Forgot')])[1]")
WebElement ForgotPassword;

@FindBy(xpath="//*[contains(text(),'enter your')]//following::input[1]")
WebElement Email;

@FindBy(xpath="//*[contains(text(),'Cancel')]")
WebElement Cancel;

@FindBy(xpath="//*[contains(text(),'OK')]")
WebElement Okbutton;


//Page Object
public LoginPage()
{
	PageFactory.initElements(Driver,this);
	
}

public static String ValidateLoginPageTitle()
{
	return Driver.getTitle();
}


public void LoginPageImageVerification() throws IOException {
BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\LoginPage.png"));
	Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshot.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\LoginPage.png"));

	
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

public void ForgotPasswordImageVerification() throws IOException {
	ForgotPassword.click();
    BufferedImage expectedImageFP = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\ForgotPassword.png."));
	Screenshot ImageScreenshotFP= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshotFP.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ForgotPassword.png"));

	
	BufferedImage actualImageFP = ImageScreenshotFP.getImage();


	ImageDiffer imgdiffer = new ImageDiffer();

   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImageFP, actualImageFP);
if(imgdiff.hasDiff()==true)
{
	System.out.println("Images are not same");
}
else
{
	System.out.println("Images are same");
}
}

public void ForgotPassword(String FP) {
	ForgotPassword.click();
	Email.sendKeys(FP);
	Cancel.click();
	ForgotPassword.click();
	Email.sendKeys(FP);
	Okbutton.click();
}

public HomePage Login(String UN,String PW)
{
	emailaddress.sendKeys(UN);
	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	password.sendKeys(PW);
	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Loginbutton.click();
	if(Driver.getPageSource().contains("Failed"))
	{
	String UI1=Driver.findElement(By.xpath("//*[contains(text(),'Failed')]")).getText();
	System.out.println(UI1);
	String SI1="Failed to authenticate";
		if(SI1.equals(UI1))
		{
			System.out.println("Failed to Authenticate alert Matches");	
			//System.out.println(UI);
		}
		
	}
	else
	{
		System.out.println("Proper User Information");
	}
	return new HomePage();
}

}
