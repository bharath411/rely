package com.rely.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OpenCart2 {

	String browser = "chrome";
	WebDriver driver = null;

	
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
			System.out.println("browser doesn't match");
		}

		// Waiting synchronization
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void launchApp() {
		driver.get("https://demo.opencart.com/admin");
	}

	public void login() {
		// Type username
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("user");

		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("user123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
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

	public void clickOnProduct() {
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}

	public void closeBrowser() {
		driver.close();
	}

	@Test
	public void createCatTest() {
		launchBrowser();
		launchApp();
		login();
		clickOnCatalog();
		clickOnCategories();
		createCategory();
		closeBrowser();
	}

	@Test
	public void createProductTest() {
		launchBrowser();
		launchApp();
		login();
		clickOnCatalog();
		clickOnProduct();
		driver.findElement(By.xpath("//tbody/tr[3]//input")).click();
	}

	
}
