package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


//import com.sun.javafx.collections.MappingChange.Map;
//import com.sun.rowset.internal.Row;

import base.TestBase;
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestUtil extends TestBase{
	public static long Page_Load_Time=50;
	public static long Implicit_Time=30;
	public static String TESTDATA_SHEET_PATH_INPUTFILE = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\Automation Input File.xlsx";
	public static String TESTDATA_SHEET_PATH_BASELINE = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\Baseline File.xlsx";
	public static String TESTDATA_SHEET_PATH_IMPORTFILE="F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\skillsmart-employee-template.xlsx";
	//public static String FileDownloadpath="F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Download";
	//public static String TESTDATA_SHEET_PATH_BASELINE = "F:\\BaselineNew.xlsx";

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;

	public static void takeScreenshotAtEndOfTest() throws IOException {
			File scrFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		}	
		
		public static Object[][] getTestData(String[] SheetName,String mName) {
			FileInputStream file = null;
			Object[][] data = null;
			String strSheetName = null;
			try {
				file= new FileInputStream(TESTDATA_SHEET_PATH_INPUTFILE);
				//String FileExtensionName=FileName.substring(FileName.indexof("."));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				book = WorkbookFactory.create(file);
				
				switch(mName) {
				  case "AddNewSubcontractor":
					  strSheetName="AddSubcontractor";
					  break;
				  case "AddNewContacts":
					  strSheetName="AddContacts";
					  break;
				  case "OwnerEthnicityandGender":
					  strSheetName="OwnerEthnicityandGender";
					  break;
				  case "PayrollFieldsSelection":
				  strSheetName="PayrollFieldsSelection";
					  break;
				  case "SetupPagecreation":
					  strSheetName="T1Setup";
						  break;
				  case "SetupAddNewSubcontractor":
					  strSheetName="T1SetupAddSubcontractor";
					break;
					
				  case "AddEmployeeTest":
					  strSheetName="T1AddEmployee";
					break;
				  case "CreateEmployeeLayoutTest":
					  strSheetName="T1ImportEmployee";
					break;
					
				  case "EditImportEmployeeTest":
					  strSheetName="T1EditImport";
					break; 
					
				  case "AddEmployeeTest1":
					  strSheetName="T1AddEmployee1";
					break; 
					
				  case "WorkClassSelection":
					  strSheetName="T1WorkClasses";
					break;
					
				  case "ValidateManualPayrollCreation":
					  strSheetName="T1ManualPayroll";
					break;
					
				  case "EditManualPayroll":
					  strSheetName="T1EditPayroll";
					break;
				}
				
				
				sheet= book.getSheet(strSheetName);
				 data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
				
				for (int i = 0; i < sheet.getPhysicalNumberOfRows()-1; i++) {
					for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
						data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
						System.out.println(data[i][k]);
					}
				}
				
				
		
		}
			 catch (Exception e) {
				e.printStackTrace();
				System.out.println(e+"");
			}
			return data; 
			}
		public static Object[][] getTestDataBaseline(String[] SheetName,String mName) {
			FileInputStream file = null;
			Object[][] data = null;
			String SSheetName = null;
			try {
				file= new FileInputStream(TESTDATA_SHEET_PATH_BASELINE);
				//String FileExtensionName=FileName.substring(FileName.indexof("."));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				book = WorkbookFactory.create(file);
				
				
				
				switch(mName) {
				
				  case "HomePageDropdownVerification":
					  SSheetName="HomePage";
					break;
				  case "DashboardPageDropdownVerification":
					  SSheetName="DashboardPage";
					break;
				  case "DetailsPageDropdownVerification":
					  SSheetName="DetailsPage";
					  break;
				  case "AddSubcontracorDropdownVerification":
					  SSheetName="AddSubcontractor";
					break;
				  case "SetupPageDropdownVerification":
					  SSheetName="T1Setup";
					break;
				  case "DashboardPageT1DropdownVerification":
					  SSheetName="T1DashboardPage";
					break;
					
				  case "DetailsPageT1DropdownVerification":
					  SSheetName="T1DetailsPage";
					break;
					
				  case "EmployeeManagementdropdownVerification":
					  SSheetName="T1EmployeeManagement";
					break;
					
					  
				}
				
				
				sheet= book.getSheet(SSheetName);
				 data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
				
				for (int i = 0; i < sheet.getPhysicalNumberOfRows()-1; i++) {
					for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
						data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
						System.out.println(data[i][k]);
					}
				}
				
			
		}
			 catch (Exception e) {
				e.printStackTrace();
				System.out.println(e+"");
			}
			return data; 
			}

		public static boolean isFileDownloaded(String fileDownloadpath, String fileName) {

			boolean flag = false;

			File directory = new File(fileDownloadpath);

			File[] content = directory.listFiles();

			for (int i = 0; i < content.length; i++) {
				System.out.println(content.length);
			if (content[i].getName().equals(fileName))
			return flag=true;
			 		}
			return flag;
			}
		
		public static Object[][] ImportTest(String[] SheetName,String m) {
			FileInputStream file = null;
			Object[][]data = null;
			String strSheetName = null;
			try {
				file= new FileInputStream(TESTDATA_SHEET_PATH_IMPORTFILE);
				//String FileExtensionName=FileName.substring(FileName.indexof("."));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				book = WorkbookFactory.create(file);
				
				switch(m) {
				  case "ImportedEmployeeTest":
					  strSheetName="Employees";
					 break;
					  
				}
				
				
				sheet= book.getSheet(strSheetName);
				/*data = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
				for(int i=0;i<12;i++)
				{
				Cell S=sheet.getRow(1).getCell(i);
				System.out.println(S);
				}*/
				
				data = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
				
				 for (int i = 0; i <sheet.getPhysicalNumberOfRows()-1; i++) {
						for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
							data[i][k] = sheet.getRow(i+1).getCell(k).toString();
							System.out.println(data[i][k]);
						}
					}
				
				
				
				
		
		}
			 catch (Exception e) {
				e.printStackTrace();
				System.out.println(e+"");
			}
			return data; 
			}
			}










