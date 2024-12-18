package testNGPackage;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement
{
	public static void main (String[]args ) throws IOException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://164.100.196.159/alpass/Web/home.aspx");
		driver.navigate().to("https://164.100.196.159/alpass/Web/home.aspx");
		Actions action = new Actions(driver);
		(action.moveToElement(driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLinkLUC']")))).click();
		(action.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Login']")))).click();
		(action.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Consultant/Applicant']")))).click();
		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
		File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
		File Destination = new File ("F:/Eclipse/MoveToElement.png");
		FileUtils.copyFile(source, Destination);
		System.out.println("passed");
		driver.quit();
	}

}
