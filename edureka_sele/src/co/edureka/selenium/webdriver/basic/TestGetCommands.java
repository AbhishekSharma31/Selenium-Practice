package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {
	
	WebDriver driver; 
	
	
	
	public void invokeBrowser() {
	
		try {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			getCommands();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getCommands() {
		
		try {
			driver.get("https://www.amazon.in/");
			String titleOfThepage = driver.getTitle();
			System.out.println("title of the page is" + titleOfThepage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentURL = driver.getCurrentUrl();
			System.out.println("Current of the URL is of the page is" + currentURL);
			//System.out.println("Current Page source of the URL is of the page is" + driver.getPageSource());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	public static void main(String[] args) {

		TestGetCommands myObj = new TestGetCommands();
		myObj.invokeBrowser();
		
		
		
		
		
	}

}
