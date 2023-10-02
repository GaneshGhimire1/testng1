package testng2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day5Title {

	ChromeDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
	}

	/*@Test(priority = 1, description = "login functionality")
	public void testOne() {
		String title = driver.getTitle();
		String expectedTitle = "WebDriverUniversity.com";
		if (title.equals("WebDriverUniversity.com")) {
			System.out.println("Test case pass");

		} else {
			System.out.println("Test case fail");
		}
		Assert.assertEquals(title, expectedTitle);

	}
*/
	
	
	@Test(priority = 2, description = "validate the home page url")
	
	
	public void testTwo() {
		String Url = driver.getCurrentUrl();
		boolean expected = Url.contains("webdriveruniversity");
		Assert.assertEquals(expected, true);

	}

	@AfterMethod
	public void CloseBrowse() {
		driver.close();
	}

}
