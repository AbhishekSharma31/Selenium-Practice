package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigateCommands {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			NavigateCommands();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void NavigateCommands() {

		try {
			driver.navigate().to("https://www.amazon.com/");
			driver.findElement(By.linkText("Best Sellers")).click();
			//*[@id="nav-xshop"]/a[2]
			
			//html/body/header/div/div[2]/div[3]/div[2]/div/a[2]
			
			//driver.findElement(By.xpath("//span[contains(text(),'New Releases']")).click();
			driver.findElement(By.linkText("New Releases")).click();
			
			
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestNavigateCommands myObj = new TestNavigateCommands();
		myObj.invokeBrowser();

	}

}
