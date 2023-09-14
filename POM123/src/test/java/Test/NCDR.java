package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Object.GooglePage;
import Object.NCDR_AboutNCDR;

public class NCDR extends  url{

	GooglePage objectrepo;
	NCDR_AboutNCDR AboutNCDRrepo;
	ExtentTest testncdr = extent.createTest("verifying NCDR tab");

	@Test(enabled=false)
	public void SearchOperation() throws InterruptedException {
		GooglePage page = new GooglePage(driver);
		page.searchgoogle("facebook");
		
	}

	@Test(enabled=false)
	public void VerifyandACCESS() {
		objectrepo = new GooglePage(driver);
		objectrepo.ClickFB();
	}

	
	@Test(enabled=true)
	public void Verify_NCDR_AboutNCDR() {
		testncdr.info("verifying tab NCDR");
		AboutNCDRrepo = new NCDR_AboutNCDR(driver);
		AboutNCDRrepo.ncdr_element();
		AboutNCDRrepo.about_ncdrelement();
	}
	@AfterTest
	public void aftertezt() {
		testncdr.pass("NCDR verified");
		// driver.quit();
	}
}








 