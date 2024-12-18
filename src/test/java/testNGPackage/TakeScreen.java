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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
public class TakeScreen {
	public static void main(String []args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://164.100.196.159/alpass/Web/");
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement landUseCert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbarDropdownMenuLink']")));
		//landUseCert.click();
		//Fluent Wait
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20)) // Maximum wait time
                .pollingEvery(Duration.ofSeconds(2)) // Check every 2 seconds
                .ignoring(NoSuchElementException.class); // Ignore this exception
	    WebElement element =wait.until(driverInstance -> driverInstance.findElement(By.xpath("//a[@id='navbarDropdownMenuLink']")));
		element.click();
	    wait.until(driverInstance -> driverInstance.findElement(By.xpath("//a[@title='Apply for Certificate']")));
		TakesScreenshot takeScreenShot = (TakesScreenshot)driver;
		File file = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File descFile = new File("F:/Eclipse/screenshot.png");
		FileUtils.copyFile(file,descFile);
		System.out.println("Screenshot saved successfully!");
		driver.quit();
	}

}
