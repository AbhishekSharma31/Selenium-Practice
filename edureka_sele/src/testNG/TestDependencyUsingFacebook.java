package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDependencyUsingFacebook {

	WebDriver driver;

	@Test
	public void openBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

			driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "openBrowser" })
	public void loginToFacebook() {

		driver.findElement(By.id("email")).sendKeys("abhishek");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).submit();
	}
}
