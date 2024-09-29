import SeleniumPractice.BrowserUtil;

public class LoginPageTest {

	public static void main(String[] args) throws Exception {
		BrowserUtil bUtil = new BrowserUtil();
		
		bUtil.launchBrowser("chrome");
		bUtil.launchUrl("https://www.google.com/");
		bUtil.getPageUrl();
		bUtil.getPageTitle();
		
		bUtil.launchUrl("https://www.amazon.com/");
	//	bUtil.closeBrowser();		
	}
}
