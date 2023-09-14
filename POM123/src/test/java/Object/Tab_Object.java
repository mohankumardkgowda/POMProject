package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Tab_Object {

	WebDriver driver;

	public Tab_Object(WebDriver driver) {
		this.driver = driver;

	}

	By home_element = By.linkText("Home");
	By Quality_element = By.linkText("ACC Quality Summit");
	By About_element = By.linkText("About");
	By Get_element = By.linkText("Get Started");
	By New_element = By.linkText("News");

	public void homeelement() {
		// TODO Auto-generated method stub
		
		try {
			driver.findElement(home_element).click();

		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
	}
	public void Qualityelement() {
		// TODO Auto-generated method stub
		try {
			driver.findElement(Quality_element).click();

		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
	}
	public void About_element() {
		// TODO Auto-generated method stub
		try {
			driver.findElement(About_element).click();

		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
	}
	public void Get_element(String id, String pwd) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(Get_element).click();
			System.out.println(id+""+pwd);
		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
	}
	public void New_element() {
		// TODO Auto-generated method stub
		try {
			driver.findElement(New_element).click();

		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
	}
}
