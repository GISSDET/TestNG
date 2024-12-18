package testNGPackage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
                                                                                                        

public class ApplicationRegistrationPageTest {
	WebDriver driver;
	@BeforeTest
	void setup() throws InterruptedException
	{
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://164.100.196.159/alpass/Web/");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLinkLUC']")).click();
		//System.out.println ("Executed");
	}
	@Test
	void registrationTest() throws InterruptedException
	{
		PageObjectsApplicantRegistrationPage test = new PageObjectsApplicantRegistrationPage(driver);
		test.layoutPermissionButtonClick();
		test.registerButtonClick();
		Thread.sleep(2000);
		test.applicantRegButtonClick();
		ExtentReports extent = new ExtentReports();
		File file = new File("F:/Eclipse/eReport.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		extent.flush();
	    Thread.sleep(3000);
		PageObjectsApplicantRegistrationPage2 test2 = new PageObjectsApplicantRegistrationPage2(driver);
		test2.emailIDTextBoxInput("TestUs878666@gmail.com");
		test2.mobileNumberTextBoxInput("9577666265");
		test2.proceedButtonClick();
		Thread.sleep(7000);
		PageObjectsApplicantRegistrationPage3 Test3 =new PageObjectsApplicantRegistrationPage3(driver);
		Test3.GroupRadioButton();
		Thread.sleep(7000);
		Test3.CompanyNameTextBox("String UserData");
		Test3.FirstNameTextBox("StringUserData");
		Test3.MiddleNameTextBox("StringUserData");
		Test3.LastNameTextBox("StringUserData");
		Test3.GenderRadioButton();
		Test3.AddressTextBox("String UserData");
		Test3.pinCodeTextBox("487551");
		Test3.StateDropDown(1);
		Thread.sleep(3000);
		Test3.CityDropDown(1);
		Test3.idProofDropDown(1);
		Test3.idProofNumberTextBox("123456");
		Test3.idProofBrowseButton("D:/SeleniumPDF.pdf");
		Thread.sleep(3000);
		Test3.securityQuestionDropDown(1);
		Test3.securityQuestionAnswerTextBox("String UserData");
		Test3.EnterPasswordTextBox("12345");
		Test3.ConfirmPasswordTextBox("12345");
		Test3.submitButton();
		Thread.sleep(3000);
		Test3.confirmationButton();
	}
}
