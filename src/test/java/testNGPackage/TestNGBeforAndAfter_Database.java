package testNGPackage;

	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import org.openqa.selenium.chrome.ChromeDriver;
    import java.util.ArrayList;
    import java.util.List;
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
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;


	public class TestNGBeforAndAfter_Database {
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
		@Test(dataProvider="loginData")
		void testMethod(String username, String password) throws InterruptedException
		{
			/*WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://164.100.196.159/alpass/Web/");
			driver.manage().window().maximize();
			Thread.sleep(2000);*/
			driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLinkLUC']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
			
			driver.findElement(By.xpath("//a[normalize-space()='Consultant/Applicant']")).click();
			driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtUserName']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPassword']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnLogin']")).click();
			boolean status = false;
			try {
			status = driver.findElement(By.xpath("//span[@id='Label5']")).isDisplayed();
			}
			catch (Exception e) {}
			
			System.out.println(status);
				if(status)
			{
				System.out.println("passed");
				System.out.println(username);
				driver.findElement(By.xpath("//a[@href='Logout.aspx']")).click();
				driver.get("https://164.100.196.159/alpass/Web/");
			}
			else 
			{
				System.out.println("Failed");
				driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
				driver.get("https://164.100.196.159/alpass/Web/uLogin.aspx");
				Assert.assertTrue(false);
				System.out.println(username);
				
			}
			
		}
		@AfterTest
		void tearDown()
		{
			driver.quit();
			System.out.println ("Quit");
		}
		@DataProvider(name="loginData")
		Object[][] loginData() throws IOException
		{
			
			 List<Object[]> dataList = new ArrayList<>();
	        String url = "jdbc:postgresql://10.125.242.65:5433/adminboundary";
	        String user = "gisadmin";
	        String password = "gisadmin";
	        Connection connection = null;

	        try {
	            // 1. Connect to the test server
	            connection = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to the test server!");

	            // 2. Execute a query to fetch data
	            Statement statement = connection.createStatement();
	            String query = "select * from vw_userregistration limit 100"; // Replace with your table name
	            ResultSet resultSet = statement.executeQuery(query);

	            // 3. Process the result set
	            while (resultSet.next()) {
	                // Replace with your column names and types
	                String loginid = resultSet.getString("loginid");
	                String passwd = resultSet.getString("pwd");
	                dataList.add(new Object[]{loginid, passwd});
	                System.out.println("ID: " + loginid + ", Name: " + passwd);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	        
	        Object[][] data = new Object[dataList.size()][];
	        for (int i = 0; i < dataList.size(); i++) {
	            data[i] = dataList.get(i);
	        }
	        
	        return data;
	            
		}
	}

