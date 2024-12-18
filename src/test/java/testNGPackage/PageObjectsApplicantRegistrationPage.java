package testNGPackage;

import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObjectsApplicantRegistrationPage {
	 WebDriver driver;

	@FindBy(xpath="//a[@id='navbarDropdownMenuLinkLUC']")
	WebElement layoutPermissionButton;
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement registerButton;
	@FindBy(xpath="//a[@title='Applicant Registration']")
	WebElement applicantRegButton;
	
	public PageObjectsApplicantRegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	public void layoutPermissionButtonClick()
	{
		layoutPermissionButton.click();
	}
	public void registerButtonClick()
	{
		registerButton.click();
	}
	public void applicantRegButtonClick()
	{
		applicantRegButton.click();
	}
	
	
}
