package com.rely.sel.opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	
	String browser = "chrome";
	WebDriver driver = null;
	String url = "https://demo.opencart.com";
	
	@BeforeMethod
	public void launchBrowser() {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Bharath\\Personal\\selenium-jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Bharath\\Personal\\selenium-jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Bharath\\Personal\\selenium-jars\\InternetExplorer.exe");
			driver = new InternetExplorerDriver();
		} else {
			Assert.fail("browser doesn't match");
		}

		// Waiting synchronization
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(url);
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
		//driver.close();
	}
	
	
	public void clickOnCatalog() {
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
	}

	public void clickOnCategories() {
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
	}

	public void createCategory() {
		driver.findElement(By.cssSelector(".fa-plus")).click();
		driver.findElement(By.cssSelector("#input-name1")).sendKeys("Cat1");
		driver.findElement(By.cssSelector("#input-meta-title1")).sendKeys("Meta Title 1");
		driver.findElement(By.cssSelector(".fa-save")).click();

	}
}
