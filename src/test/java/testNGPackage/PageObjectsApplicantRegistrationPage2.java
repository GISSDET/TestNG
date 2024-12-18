package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectsApplicantRegistrationPage2 {
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtEmailForOTP']")
	WebElement emailIDTextBox;
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtMobileForOTP']")
	WebElement mobileNumberTextBox;
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSendOTP']")
	WebElement proceedButton;
	WebDriver driver;
	public PageObjectsApplicantRegistrationPage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	public void emailIDTextBoxInput(String UserInput)
	{
		emailIDTextBox.sendKeys(UserInput);
	}
	public void mobileNumberTextBoxInput(String UserInput)
	{
		mobileNumberTextBox.sendKeys(UserInput);
	}
	public void proceedButtonClick()
	{
		proceedButton.click();
	}
}
