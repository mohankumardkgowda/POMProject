package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class url {
	
	WebDriver driver;
	
	public ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("newtabextent.html");

	@BeforeTest()
	public void beforetezt() {
		
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		
		 
		extent.attachReporter(spark);
		driver.get("https://cvquality.acc.org/");
		driver.manage().window().maximize();
	}
}
