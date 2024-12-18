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
public class NegativeLogin {
	public static void main (String[]args ) throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://164.100.196.159/alpass/Web/");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLinkLUC']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Consultant/Applicant']")).click();
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtUserName']")).sendKeys("rathiprakhar");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnLogin']")).click();
		driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtUserName']")).clear();
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPassword']")).clear();
		//driver.get("https://164.100.196.159/alpass/Web/uLogin.aspx");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtUserName']")).sendKeys("rathiprakhar02@gmail.com");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnLogin']")).click();
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnLogin']")).click();
		//button[@class='confirm btn btn-lg btn-primary']
		//Alert alert = driver.switchTo().alert();
		//String alertTest = alert.getText();
		//System.out.println(alertTest);
		//alert.accept();
	}
}

