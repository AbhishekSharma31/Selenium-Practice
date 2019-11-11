package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAssertions {

	WebDriver driver;

	@BeforeTest

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEquality() {
		Assert.assertEquals(true, isEqual(10, 10));
		System.out.print("Abhishek Sharma");
	}

	public boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void getTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Gmail");
		System.out.print("Abhishek");
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();

	}
}
