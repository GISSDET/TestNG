package testNGPackage;

	import org.openqa.selenium.*;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class LoginPage {
	         WebDriver driver;
		/*public static void main(String[] args) {
			WebDriver driver;
			// TODO Auto-generated method stub
			//WebDriver driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://164.100.196.159/alpass/Web/");*/
			@FindBy(xpath = "//a[@id='navbarDropdownMenuLinkLUC']")
		    public WebElement layoutPermission;
			@FindBy (xpath = "//a[normalize-space()='Login']")
			public WebElement login;
			@FindBy(xpath = "//a[normalize-space()='Consultant/Applicant']")
			public WebElement consultant;
			public LoginPage(WebDriver driver)
			{
				
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
			
			public void layoutPermissionclick()
			{
				layoutPermission.click();
			}
			public void loginClick()
			{
				login.click();
			}
			public void consultantClick()
			{
				consultant.click();
			}
			

		}


