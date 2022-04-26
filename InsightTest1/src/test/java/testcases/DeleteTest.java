package testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DashboardPage;
import pages.DetailsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SubcontractorPage;
import util.TestUtil;
public class DeleteTest extends TestBase{
	
	HomePage homepage;
	DashboardPage Dashboardpage;
	LoginPage Loginpage;
	DetailsPage Detailspage;
	SubcontractorPage Subcontractorpage;
	
	public DeleteTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		Loginpage=new LoginPage();
		homepage=Loginpage.Login(prop.getProperty("UserName"),prop.getProperty("Password"));
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Dashboardpage=homepage.Projectselection();
		Detailspage=Dashboardpage.DetailsPageLaunch();
		Subcontractorpage=Detailspage.ValidateSubcontractorPageLaunch();
		}
	
	@Test(priority=0,description="Dashboard Page:Project Name Value Test")
	public void SubcontractorDeletion() throws InterruptedException
	{
		String Name="Automation Q3 Sample Subcontractor : 12347878etr";
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Only Show Active')]//following::input[1]"));
		S.sendKeys(Name);
		Driver.findElement(By.xpath("//*[contains(text(),'"+Name+"')]")).click();
		if(Driver.getPageSource().contains("Delete"))
				{
                  Driver.findElement(By.xpath("//*[contains(text(),'Delete')]")).click();
                  Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[2]")).click();
                  System.out.println("Subcontractor got Deleted");
				}
		else {
			System.out.println("Subcontractor is not Deleted Since Contact is avaliable");
		Driver.findElement(By.xpath("//*[contains(text(),'Contacts')]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//button[@title='Delete']")).click();
		 Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[2]")).click();
         System.out.println("Contacts got Deleted");
         Driver.findElement(By.xpath("(//*[contains(text(),'Save')])[2]")).click();
         WebElement S1=Driver.findElement(By.xpath("//*[contains(text(),'Only Show Active')]//following::input[1]"));
 		S1.sendKeys(Name);
 		Driver.findElement(By.xpath("//*[contains(text(),'"+Name+"')]")).click();
         Thread.sleep(2000);
         //Driver.findElement(By.xpath("//*[contains(text(),'Address')]//preceding::span[1]")).click();
         Driver.findElement(By.xpath("//*[contains(text(),'Delete')]")).click();
         Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[2]")).click();
         System.out.println("Subcontractor got Deleted");
		}		
		}
}
