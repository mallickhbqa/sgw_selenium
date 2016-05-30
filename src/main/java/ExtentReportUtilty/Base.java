package ExtentReportUtilty;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.common.ExtentManager;

public abstract class Base {

	 protected ExtentReports extent;
	    protected ExtentTest test;
	    public WebDriver driver=null;
	    
	    final String filePath = "C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\ExtentReportFolder\\SGW.html";

	    @BeforeTest
		public  void openBrowser()
		{
		     driver=new FirefoxDriver();
			driver.get("https://www.newport-pleasure.com/Account/Login?ReturnUrl=%2f");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	    @AfterMethod
	    protected void afterMethod(ITestResult result) throws IOException {
	        if (result.getStatus() == ITestResult.FAILURE)
	        {
	            test.log(LogStatus.FAIL, result.getThrowable());
	        } 
	        else if (result.getStatus() == ITestResult.SKIP)
	        {
	            test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	        }
	        else
	        {
	            test.log(LogStatus.PASS, "Test passed");
	        }
	        if(result.getStatus() == ITestResult.FAILURE)
	        {
	        	String imgName=result.getMethod().getMethodName();
	        	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        	FileUtils.copyFile(screenshot, new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\FailTestMethod\\"+imgName+".png"));
	        	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\FailTestMethod\\"+imgName+".png"));
	        }
	        extent.endTest(test);        
	        extent.flush();
	    }
	    
	    @BeforeSuite
	    public void beforeSuite() {
	        extent = ExtentManager.getReporter(filePath);
	    }
	    
	    @AfterSuite
	    protected void afterSuite() throws IOException {
	    	
	    	test.assignAuthor("Mallick");
	        extent.close();
	       
	        File htmlFile = new File("C:\\Users\\mallickh\\Version_1_0\\src\\main\\java\\ExtentReportFolder\\SGW.html");
	    	Desktop.getDesktop().browse(htmlFile.toURI());
	    }

}
