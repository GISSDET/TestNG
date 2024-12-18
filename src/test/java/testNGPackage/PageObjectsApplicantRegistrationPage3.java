package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectsApplicantRegistrationPage3
{
	
	WebDriver driver;
	@FindBy (xpath ="//label[@for='ContentPlaceHolder1_rblUserType_2']")
	WebElement GroupRadioButton;

	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_txtIndCompName']")
	WebElement CompanyNameTextBox;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_txtFname']")
	WebElement FirstNameTextBox;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_txtMiddleName']")
	WebElement MiddleNameTextBox;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_txtLName']")
	WebElement LastNameTextBox;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_rblGender_1']")
	WebElement GenderRadioButton;
	
	@FindBy (xpath ="//textarea[@id='ContentPlaceHolder1_txtAddress']")
	WebElement AddressTextBox;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_txtPinCode']")
	WebElement pinCodeTextBox;
	
	@FindBy (xpath ="//select[@id='ContentPlaceHolder1_ddlState']")
	WebElement StateDropDown;
	
	@FindBy (xpath ="//select[@id='ContentPlaceHolder1_ddlCity']")
	WebElement CityDropDown;
	
	@FindBy (xpath ="//select[@id='ContentPlaceHolder1_ddlProofType']")
	WebElement idProofDropDown;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_txtIdProofNo']")
	WebElement idProofNumberTextBox;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_fuIdProof']")
	WebElement idProofBrowseButton;
	
	@FindBy (xpath ="//select[@id='ContentPlaceHolder1_ddlSeqQues']")
	WebElement securityQuestionDropDown;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_txtSeqAns']")
	WebElement securityQuestionAnswerTextBox;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_txtPassword']")
	WebElement EnterPasswordTextBox;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_txtConfPassword']")
	WebElement ConfirmPasswordTextBox;
	
	@FindBy (xpath ="//input[@id='ContentPlaceHolder1_btnFinalSubmit']")
	WebElement submitButton;
	
	@FindBy (xpath ="//button[@class='confirm btn btn-lg btn-primary']")
	WebElement confirmationButton;
	
	
	public PageObjectsApplicantRegistrationPage3(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	public void GroupRadioButton()
	{
		GroupRadioButton.click();
	}
	public void CompanyNameTextBox(String UserData)
	{
		CompanyNameTextBox.sendKeys(UserData);
	}
	public void FirstNameTextBox(String UserData)
	{
		FirstNameTextBox.sendKeys(UserData);
	}
	public void MiddleNameTextBox(String UserData)
	{
		MiddleNameTextBox.sendKeys(UserData);
	}
	public void LastNameTextBox(String UserData)
	{
		LastNameTextBox.sendKeys(UserData);
	}
	public void GenderRadioButton()
	{
		GenderRadioButton.click();
	}
	public void AddressTextBox(String UserData)
	{
		AddressTextBox.sendKeys(UserData);
	}
	public void pinCodeTextBox(String UserData)
	{
		pinCodeTextBox.sendKeys(UserData);
	}
	public void StateDropDown(int index)
	{
		Select select = new Select(StateDropDown);
		select.selectByIndex(index);
	}
	public void CityDropDown(int index)
	{
		Select select = new Select(CityDropDown);
		select.selectByIndex(index);
	}
	public void idProofDropDown(int index)
	{
		Select select = new Select(idProofDropDown);
		select.selectByIndex(index);
	}
	public void idProofNumberTextBox(String UserData)
	{
		idProofNumberTextBox.sendKeys(UserData);
	}
	public void idProofBrowseButton(String UserData)
	{
		idProofBrowseButton.sendKeys(UserData);
	}
	public void securityQuestionDropDown(int index)
	{
		Select select = new Select(securityQuestionDropDown);
		select.selectByIndex(index);
	}
	public void securityQuestionAnswerTextBox(String UserData)
	{
		securityQuestionAnswerTextBox.sendKeys(UserData);
	}
	public void EnterPasswordTextBox(String UserData)
	{
		EnterPasswordTextBox.sendKeys(UserData);
	}
	public void ConfirmPasswordTextBox(String UserData)
	{
		ConfirmPasswordTextBox.sendKeys(UserData);
	}
	public void submitButton()
	{
		submitButton.click();
	}
	public void confirmationButton()
	{
		confirmationButton.click();
	}
	
}
