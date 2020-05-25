package Testing.extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports {
	ExtentReports extent;
	
	@BeforeTest
	public void extentReports()
	{
		//extentreports // extentsparkreporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Demo extent reports");
		reporter.config().setDocumentTitle("Test Results");

		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("tester", "sushanth");
		
	}
	
	@Test
	public void urlOpen()
	{	
		extent.createTest("Initial demo");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sushanth\\Desktop\\Sushanth\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rambabu.ca");
		System.out.println(driver.getTitle());
		extent.flush();

	}

}
