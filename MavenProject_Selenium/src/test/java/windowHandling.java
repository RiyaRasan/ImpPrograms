import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().window().maximize();
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parentWindowHandle= " + parentWindowHandle);
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linked')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube.com')]")).click();
			
		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);
		String title = null;
		
		for(String window: hList) {
			title = driver.switchTo().window(window).getTitle();
			
			if(!window.equals(parentWindowHandle)) {
				System.out.println("Closed window title = " + title);
				driver.switchTo().window(window).close();
			}
		}	
	}

}
