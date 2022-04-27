package base;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.TestUtil;
import util.WebEventListener;

public class TestBase {
	public static WebDriver Driver;
	public static Properties prop;
	public String browsername;
	public static EventFiringWebDriver e_driver;
	public static String sheetName[]= {"AddSubcontractor","ContactList","OwnerEthnicityandGender","PayrollFieldsSelection","T1Setup","T1SetupAddSubcontractor","T1AddEmployee","T1ImportEmployee","T1AddEmployee1","T1WorkClasses","T1ManualPayroll","T1EditPayroll"};
	public static String SheetName1[]= {"HomePage","DashboardPage","DetailsPage","AddSubcontractor","T1Setup","T1DashboardPage","T1DetailsPage","T1EmployeeManagement"};
	public static String SheetName2[]= {"Employees"};
	public TestBase()
	{
	try
	{
prop= new Properties();
FileInputStream Config=new FileInputStream("F:\\Skillsmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\config\\config.properties");
prop.load(Config);
	}

	catch(Exception E)
	{
		E.printStackTrace();
	}
}
	public void initialization() 
	{
		try
		{
		browsername=prop.getProperty("Browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("download.default_directory", "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Download");
			chromePrefs.put("download.prompt_for_download",false);
			//ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);

			Driver=new ChromeDriver(options);
			/*String Downloadpath=System.getProperty("user.dir");
			System.out.println(Downloadpath);
			ChromeOptions Option=new ChromeOptions();
			HashMap<String,Object> prefs=new HashMap<String, Object>();
			prefs.put("download.defualt_directory","/directory/path");
			Option.setExperimentalOption("prefs",prefs);*/
			
		}
		
		EventFiringWebDriver e_driver = new EventFiringWebDriver(Driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		WebEventListener eventListener = new WebEventListener();
		e_driver.register(eventListener);
		Driver = e_driver;
		
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		
		Driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.get(prop.getProperty("Url"));
		
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}
}