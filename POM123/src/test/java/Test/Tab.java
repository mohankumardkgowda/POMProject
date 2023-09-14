package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Object.Tab_Object;

public class Tab extends  url{

	Tab_Object objectrepo;
	ExtentTest testtab = extent.createTest("verifying tab");
	

	@Test(enabled=true)
	public void Verify_Tab() {
		testtab.info("verifying tab");
		objectrepo = new Tab_Object(driver);
		objectrepo.homeelement();
		objectrepo.Qualityelement();
		objectrepo.About_element();
		objectrepo.Get_element("value","pwdu");
		objectrepo.New_element();

	}
	@AfterTest
	public void aftertezt() {
		testtab.pass("tab verified");
		// driver.quit();
	}
}

