package Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class header_Object {

	private static final String key = "Campaigns";
	WebDriver driver;
	// Accreditation,Campaigns,Clinical Toolkits

	public header_Object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="ackButton") WebElement ackButton;
	@FindBy(xpath = "//li[@class='nav-item dropdown ']/a[contains(text(), '" + key + "')]") public WebElement header_element;
	@SuppressWarnings("unused")
	public void ncdrelement(String txt) throws InterruptedException {
		// TODO Auto-generated method stub
		if (key == "NCDR")

		{
			try {
				Thread.sleep(3000);
			    ackButton.click();
				header_element.click();

			} catch (Exception e) {
				header_element.click();
				System.out.println("Exception caught" + e.getMessage());
			}
			Thread.sleep(3000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,50)");
			int i=1;
		      List<WebElement> subelementcount = driver.findElements(By.xpath("//*[@id=\"MainContent_T24237157002_Col00\"]/nav/ul/li"));

         int total=subelementcount.size();
		for(i++; i<=total; i++) 
			{
		Thread.sleep(2000);	
		WebElement subelement= driver.findElement(By.xpath("//*[@id=\"MainContent_T24237157002_Col00\"]/nav/ul/li["+ i +"]/a"));
		subelement.click();
		driver.navigate().back();
		Thread.sleep(2000);
			}
		} else if (key == "Accreditation") {
			try {
				Thread.sleep(5000);
			    ackButton.click();
				header_element.click();

			} catch (Exception e) {
				header_element.click();
				System.out.println("Exception caught" + e.getMessage());
			}

			Thread.sleep(5000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,50)");
			int i=1;
		      List<WebElement> subelementcount = driver.findElements(By.xpath("//*[@id=\"MainContent_T24237157002_Col00\"]/nav/ul/li"));

         int total=subelementcount.size();
		for(i++; i<=total; i++) 
			{
		Thread.sleep(2000);	
		WebElement subelement= driver.findElement(By.xpath("//*[@id=\"MainContent_T24237157002_Col00\"]/nav/ul/li["+ i +"]/a"));
		subelement.click();
		driver.navigate().back();
		Thread.sleep(2000);
			}
		} else if (key == "Campaigns") {
			try {
				Thread.sleep(5000);
			    ackButton.click();
				header_element.click();

			} catch (Exception e) {
				header_element.click();
				System.out.println("Exception caught" + e.getMessage());
			}
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,50)");
			int i=5;
			for(i++; i<=9; i++) 
			{
		Thread.sleep(2000);
        WebElement subelement= driver.findElement(By.xpath("//*[@id=\"MainContent_C05"+i+"_Col01\"]/a"));
		subelement.click();
		driver.navigate().back();
		Thread.sleep(2000);
			}
			
		}
	    else if (key == "Clinical Toolkits") {
	    	try {
			Thread.sleep(5000);
		    ackButton.click();
			header_element.click();
		} catch (Exception e) {
			header_element.click();
			System.out.println("Exception caught" + e.getMessage());
		}

	    	Thread.sleep(5000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,50)");
			int i=1;
		      List<WebElement> subelementcount = driver.findElements(By.xpath("//*[@id=\"MainContent_T24237157002_Col00\"]/nav/ul/li"));

         int total=subelementcount.size();
		for(i++; i<=total; i++) 
			{
		Thread.sleep(2000);	
		WebElement subelement= driver.findElement(By.xpath("//*[@id=\"MainContent_T24237157002_Col00\"]/nav/ul/li["+ i +"]/a"));
		subelement.click();
		driver.navigate().back();
		Thread.sleep(2000);
			}

	}else {
		System.out.println("Wrong key");
	}
	}	
	
}
