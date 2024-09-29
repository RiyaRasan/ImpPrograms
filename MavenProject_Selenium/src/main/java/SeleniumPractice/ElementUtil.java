package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class ElementUtil {
	
	//WebDriver is made private and it's value is set using constructor. Hence, implementing Encapsulation.
	private WebDriver driver;
	
	//Constructor
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	} 
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
}
