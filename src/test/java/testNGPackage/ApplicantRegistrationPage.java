package testNGPackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicantRegistrationPage {
	
	@Test

	public static void Test () throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://164.100.196.159/alpass/Web/home.aspx");
		driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLinkLUC']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//a[@title='Applicant Registration']")).click();
		//WebElement landUseCert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ContentPlaceHolder1_btnSendOTP']")));
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnSendOTP']")).click();
		WebElement eMailError = driver.findElement(By.xpath("//span[@id='ContentPlaceHolder1_RequiredFieldValidator1']"));
		boolean VisibilityOfEmailTextBox =eMailError.isDisplayed();
		String EmailError = eMailError.getText();
		System.out.println("Message against blank Email ID Submission: "+EmailError);
		WebElement MobileNumber = driver.findElement(By.xpath("//span[@id='ContentPlaceHolder1_RequiredFieldValidator2']"));
		boolean VisibilityOfMobileNoTextBox =MobileNumber.isDisplayed();
		String MobileNoError = MobileNumber.getText();
		System.out.println("Message against blank Mobile No. Submission: "+MobileNoError);
		Assert.assertTrue(VisibilityOfEmailTextBox&&VisibilityOfMobileNoTextBox);
		System.out.println("Error message during blank submission of Applicant Registration form is being displayed properly");
		WebElement EmailTextBox = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtEmailForOTP']"));
		EmailTextBox.sendKeys("nitin648952@gmail.com");
		WebElement MobileNumberTextBox = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtMobileForOTP']"));
		MobileNumberTextBox.sendKeys("7247884562");
		WebElement proceedButton = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnSendOTP']"));
		proceedButton.click();
		proceedButton.click();
		//driver.switchTo().activeElement();
		WebElement groupRadioButton = driver.findElement(By.xpath("//label[@for='ContentPlaceHolder1_rblUserType_2']"));
		groupRadioButton.click();
		Thread.sleep(2000);
		WebElement SubmitButton = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnFinalSubmit']"));
		SubmitButton.click();
		WebElement CompanyNameTextBox = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtIndCompName']"));
		CompanyNameTextBox.sendKeys("Company Name");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFname']")).sendKeys("FirstName");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtMiddleName']")).sendKeys("MiddleName");
		//driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtLName']")).sendKeys("Last Name");
        (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ContentPlaceHolder1_txtLName']")))).sendKeys("LastName");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_rblGender_1']")).click();
		driver.findElement(By.xpath("//textarea[@id='ContentPlaceHolder1_txtAddress']")).sendKeys("Address");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPinCode']")).sendKeys("487551");
		WebElement StateDropDown = driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlState']"));
		Select dropDownSelect = new Select(StateDropDown);
		dropDownSelect.selectByVisibleText("MADHYA PRADESH");
		Thread.sleep(5000);
		WebElement cityDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ContentPlaceHolder1_ddlCity']")));		
	    Select cityDropdownSelect = new Select(cityDropdown);
	    cityDropdownSelect.selectByIndex(1);
	    WebElement IDProofDropDown = driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlProofType']"));
	    Select IDProofDropDownSelect = new Select(IDProofDropDown);
	    IDProofDropDownSelect.selectByVisibleText("Driving License");
	    driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtIdProofNo']")).sendKeys("123456789");
	    driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_fuIdProof']")).sendKeys("D:/SeleniumPDF.pdf");
	    WebElement securityQuestionDropDown = driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlSeqQues']"));
	    Select securityQuestionDropDownSelect = new Select(securityQuestionDropDown);
	    securityQuestionDropDownSelect.selectByIndex(1);
	    driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtSeqAns']")).sendKeys("Security Answer");
	    driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("12345");
	    driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtConfPassword']")).sendKeys("12345");
	    driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnFinalSubmit']")).click();
	    //Thread.sleep(50000);
	    //driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
	   (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")))).click();
	    System.out.println("hank you for registering as Applicant with T&CP! Your registration number is OTR-APP291124481.To avail services you need to login in the portal.");
	    driver.quit();		
		//driver.quit();
	}
}
