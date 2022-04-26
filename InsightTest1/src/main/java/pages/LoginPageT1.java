package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.TestUtil;

public class LoginPageT1 extends TestBase{

	//Page Factory -OR
	@FindBy(name="email_adress")
	@CacheLookup
	WebElement emailaddress;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="(//*[contains(text(),'Login')])[2]")
	WebElement Loginbutton;
	
	@FindBy(xpath="//div[@id='scroll-dialog-content']")
	WebElement TermsandConditions;
	
	@FindBy(xpath="//button/span[text()='Deny']")
	WebElement Deny;
	
	@FindBy(xpath="//button/span[text()='Accept']")
	WebElement Accept;
	
	@FindBy(xpath="//button/span[text()='Yes']")
	WebElement Yes;
	
	public LoginPageT1()
	{
		PageFactory.initElements(Driver,this);
		
	}
	public  HomePageT1 LoginT1(String UNT1,String PWT1)
	{
		emailaddress.sendKeys(UNT1);
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		password.sendKeys(PWT1);
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Loginbutton.click();
		try
		{
			Thread.sleep(3000);
		
		Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		if(Driver.getPageSource().contains("Deny"))
		{
	Deny.click();
	Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Loginbutton.click();
	Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Accept.click();
	//Accept.click();
			}
		}
		catch (Exception e)
			{
			    System.out.println("Deny Button is not there");
			}
				
		return new HomePageT1();
	}
}
