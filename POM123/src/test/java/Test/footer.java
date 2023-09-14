package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Object.footer_object;
import Object.header_Object;

public class footer extends  url{

	
	
    footer_object objectrepo;
	ExtentTest testfooter = extent.createTest("verifying footer tab");
	
	@Test(enabled=true)
	public void Verify_Tab() throws InterruptedException {
		
		testfooter.info("verifying footer");
		objectrepo = new footer_object(driver);
		objectrepo.footer_element("a");
	
	}
	@AfterTest
	public void aftertezt() 
	{
		testfooter.pass("footer verified");
		extent.flush();
		// driver.quit();
	}
}


