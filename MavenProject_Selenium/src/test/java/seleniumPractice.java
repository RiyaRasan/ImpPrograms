import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumPractice {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		driver.get("https://the-internet.herokuapp.com/");
//		driver.manage().window().maximize();		
		
		
//		1) Select Class
//		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
//		WebElement ele=driver.findElement(By.id("dropdown"));
//		
//		Select s = new Select(ele);
//		s.selectByIndex(0);
//		s.selectByValue("1");//Option 1
//		s.selectByVisibleText("Option 2");
		
//		2) Actions Class	
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
		
		//Mouse hovering using Actions class
//		Actions a = new Actions(driver);
		
//		a.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Furniture']"))).build().perform();
//		driver.findElement(By.xpath("//a[text()='Bedsheets']")).click();
		
		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		driver.manage().window().maximize();
//		Actions a = new Actions(driver);
//		
//		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1' and text()='Oslo']"));
//		WebElement norway = driver.findElement(By.xpath("//div[@id='box101' and text()='Norway']"));
////	a.dragAndDrop(oslo, norway).build().perform();
//		a.clickAndHold(oslo).moveToElement(norway).release().build().perform();
		
		
		
//		//Keyboard actions
//		driver.get("https://demo.guru99.com/");
//		driver.manage().window().maximize();
//		
//		WebElement email = driver.findElement(By.name("emailid"));
//		Actions a = new Actions(driver);
//		a.moveToElement(email).click().keyDown(Keys.SHIFT).sendKeys("riya.rasanbhaire@gmail.com").keyUp(Keys.SHIFT).build().perform();

				
		
////	3) File upload
//		driver.get("https://demo.guru99.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[contains(text(),'Selenium') and @class='dropdown-toggle']")).click();
//		driver.findElement(By.xpath("//a[text()='File Upload']")).click();
//		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\riyar\\OneDrive\\Desktop\\Sample.txt");
////		
//		
////	4) Alert
//		
////	5) TakesScreenshot
//		TakesScreenshot t= (TakesScreenshot)driver;
//		File ob = t.getScreenshotAs(OutputType.FILE);
//		Files.copy(ob, new File("C:\\Users\\riyar\\OneDrive\\Desktop\\Sample.jpg"));	
		
		
////	6) Count links in a website
//		driver.get("https://demo.guru99.com/");
//		driver.manage().window().maximize();
//		
//		List<WebElement> li = driver.findElements(By.tagName("a"));
//		System.out.println("Total links=" + li.size());
		
		
//		driver.quit();
	}

}
