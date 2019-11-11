package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowserCommands {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.yatra.com");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {

		//driver.close();
		driver.quit();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestBrowserCommands obj = new TestBrowserCommands();
		obj.invokeBrowser();
		obj.closeBrowser();

	}

}
