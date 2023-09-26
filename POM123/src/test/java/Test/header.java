package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Object.header_Object;

public class header extends  url{

	header_Object objectrepo;
	ExtentTest testheader = extent.createTest("verifying header tab");
	
	@Test(enabled=true)
	public void Verify_Tab() throws InterruptedException {
		System.out.print("abc");
		testheader.info("verifying header");
		objectrepo = new header_Object(driver);
		objectrepo.ncdrelement("a");
	

	}
	@AfterTest
	public void aftertezt() 
	{
		testheader.pass("header verified");
		extent.flush();
		// driver.quit();
		//driver.quit();//driver.quit();//driver.quit();
	}
}

