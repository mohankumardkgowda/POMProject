package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GooglePage {

	WebDriver driver;

	public GooglePage(WebDriver driver) {
		this.driver = driver;

	}

	By Homebutton = By.linkText("Home");
	
	By ncdr_element = By.linkText("NCDR");
	
	public void searchgoogle(String Searchinput) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(Homebutton).click();
			Thread.sleep(3000);
			driver.findElement(ncdr_element);
			
			
			//driver.findElement(ncdr_element).click();
			Actions ncdr_action = new Actions(driver);
			ncdr_action.moveToElement((WebElement) ncdr_element).perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,500)");
			
		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
	}
	
	public void ClickFB() {
		try {
		//	driver.findElement(FBLink).click();

		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
	}
}
