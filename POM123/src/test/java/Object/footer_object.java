package Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class footer_object {

	
	
	private static final String key = "About";
	WebDriver driver;
	// Accreditation,Campaigns,Clinical Toolkits

	public footer_object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="ackButton") WebElement ackButton;
	@FindBy(xpath = "//li[@class='nav-footer']//a[contains(text(), '" + key + "')]") public WebElement footer_element;
	@FindBy(xpath="//div[@class='row']//a[contains(text(), 'Learn More...')]") WebElement learn;
	@SuppressWarnings("unused")
	public void footer_element(String txt) throws InterruptedException {
		// TODO Auto-generated method stub
	if (key == "Get Started" || key == "Home" || key == "About"|| key == "News"|| key == "Terms of Service"|| key == "Privacy Policy"|| key == "Registered User Agreement"|| key == "Home")

		{
			try {
				Thread.sleep(3000);
			    ackButton.click();
			    footer_element.click();
			    learn.click();

			} catch (Exception e) {
				footer_element.click();
				   learn.click();
				System.out.println("Exception caught" + e.getMessage());
			}
			Thread.sleep(3000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,50)");
			
		
	}else {
		System.out.println("Wrong key");
	}
	}		
	
	
}


