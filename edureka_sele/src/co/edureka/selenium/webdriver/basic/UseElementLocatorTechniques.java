package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseElementLocatorTechniques {

	WebDriver driver;

	public void invokeBrowser(String url) {

		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void elementLocatorTechniquesUsingAmazon() {

		try {
			invokeBrowser("https://www.amazon.com");
			driver.findElement(By.linkText("New Releases")).click();

			driver.navigate().back();

			driver.findElement(By.partialLinkText("Customer")).click();

			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple Laptops");
			driver.findElement(By.className("nav-input")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void elementLocatorTechniquesUsingFacebook() {

		try {
			invokeBrowser("https://www.facebook.com");
			driver.findElement(By.name("firstname")).sendKeys("Abhishek");
			driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
			// driver.navigate().back();

			/*
			 * <input id="abc"class ="xyz" /> // //By.cssSelector(tag#id_value);
			 * //By.cssSelector(tag.classValue); //By.cssSelector(input#abc);
			 * //By.cssSelector(tag.xyz);
			 * 
			 * X-Path 
			 * Absolute - html/reference node
			 * Relative - //any tag which acts as a reference node 
			 */
			//html/body/header/div/div[1]/div[2]/div/a[2]/span[1]
			//#nav-link-accountList > span:nth-child(1)

			// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple Laptops");
			// driver.findElement(By.className("nav-input")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeBrowser() {

		driver.close();
		// driver.quit();

	}

	public static void main(String[] args) {

		UseElementLocatorTechniques obj = new UseElementLocatorTechniques();

		// obj.elementLocatorTechniquesUsingAmazon();
		obj.elementLocatorTechniquesUsingFacebook();

		obj.closeBrowser();

	}

}
