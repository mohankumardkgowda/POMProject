package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NCDR_AboutNCDR {

	WebDriver driver;

	public NCDR_AboutNCDR(WebDriver driver) {
		this.driver = driver;

	}
	By ncdr_element = By.linkText("NCDR");

	By ackButton = By.id("ackButton");

	public void ncdr_element() {
		// TODO Auto-generated method stub
		try {
			driver.findElement(ncdr_element).click();
	
			
		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
	}
	By Aboutncdr_element = By.xpath("//*[@id=\"MainContent_T24237157002_Col00\"]/nav/ul/li[1]/a");
    
	By Benefit_button= By.linkText("Benefits of Participating");
//	By dataelement_btn=By.linkText("Data elements and definitions");
	By Partnerbtn=By.linkText("Partners");
	By Trainingbtn=By.linkText("Training and Education");
	By Internationalbtn=By.linkText("International Participation");
	By Clinical_Trialbtn=By.linkText("Participation in Clinical Trials");
	
	
	
	public void about_ncdrelement() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
			driver.findElement(ackButton).click();
			driver.findElement(Aboutncdr_element).click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,500)");
			
		} catch (Exception e) {
			
			driver.findElement(Aboutncdr_element).click();
			//System.out.println("Exception caught" + e.getMessage());
		}
		driver.findElement(Benefit_button).click();
	//	driver.findElement(dataelement_btn).click();
		driver.findElement(Partnerbtn).click();
		driver.findElement(Trainingbtn).click();
		driver.findElement(Internationalbtn).click();
		driver.findElement(Clinical_Trialbtn).click();
		System.out.println(Thread.currentThread().getId());
		
	}
}
