package testNGPackage;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir") + "\\ExtentReports\\eReport.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		ExtentTest eTest1 = extent.createTest("TestOne");
		eTest1.pass("Test One Passed");
		ExtentTest eTest2 = extent.createTest("TestTwo");
		eTest2.fail("Test Two failed");
		ExtentTest eTest3 = extent.createTest("TestThree");
		//eTest3.skip("Test Three skipped");
		eTest3.log(Status.INFO, "Process INFO");
		eTest3.log(Status.WARNING, "Process Warning");
		eTest3.log(Status.PASS, "Process Passed");
		eTest3.log(Status.FAIL, "Process FAILED");
		eTest3.log(Status.SKIP, "Process SKIPPED");
		extent.flush();
        Desktop.getDesktop().browse(file.toURI());
	}

}
