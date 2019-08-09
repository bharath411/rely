package com.rely;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest1 {

	WebDriver driver = null;

	@Test
	public void test1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Bharath\\Personal\\selenium-jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.opencart.com");
		String expectedTitle = "Dashboard";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test
	public void test2() {
		System.out.println("I am test2");
	}
}
