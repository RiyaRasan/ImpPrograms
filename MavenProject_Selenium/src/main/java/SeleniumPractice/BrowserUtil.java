package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserUtil {

	WebDriver driver;
	
	/**
	 * @description Use this method to launch any browser
	 * @param browserName
	 * @return 
	 * @return driver
	 */
	public WebDriver launchBrowser(String browserName) throws Exception{
		
		System.setProperty("org.slf4j.LoggerFactory","org.apache.logging.log4j.simple.SimpleLoggerContextFactory"); 
		
		browserName = browserName.toLowerCase();
		System.out.println("Browser name--> " +  browserName);
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			System.out.println("Enter correct browser name");
			break;
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	
	/**
	 * @description Use this, method to launch the url.
	 * @param url
	 * @throws Exception 
	 */
	
	public void launchUrl(String url) throws Exception {
		if(url == null) {
			System.out.println("url is null");
			throw new Exception("URLNULLEXCEPTION");
		}
		if(url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}
		
		if (url.indexOf("http") != 0 && url.indexOf("https") != 0) {
			System.out.println("http(s) is missing in url");
			throw new Exception("HTTP(s)MISSINGEXCEPTION");
		}

		driver.get(url);
	}
	
	/**
	 * @description Use this method to get title of a page
	 * @return title
	 */
	public String getPageTitle() {
		String title = driver.getTitle();
		
		if(title!=null) {
			return title;
		}else {
			System.out.println("Title is null");
			return null;
		}
	}
	
	
	/**
	 * @description get url of current page
	 * @return
	 */
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		
		System.out.println("url of page : " + url);
		
		if (url != null) {
			return url;
		} else {
			System.out.println("getting null title....");
			return null;
		}
	}
	
	/**
	 * @description Use this method to close the browser
	 */
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
			System.out.println("Browser is closed");
		}
	}
	
	/**
	 * @description Use this method to close all the browsers
	 */
	
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
			System.out.println("All browsers windows are closed");
		}
	}
	
	
	
}
