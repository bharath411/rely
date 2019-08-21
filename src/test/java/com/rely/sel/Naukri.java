package com.rely.sel;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Naukri {

	WebDriver driver;

	@Test
	public void test1() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		System.setProperty("webdriver.chrome.driver", "C:\\Bharath\\Personal\\selenium-jars\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");

		// driver.quit();// all windows
		// driver.close();// closes only active window

		String mainHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {

			if (!mainHandle.equals(handle)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}

		driver.switchTo().window(mainHandle);
		
		//TakesScreenshot tdriver = (TakesScreenshot)driver;
		File source =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Bharath\\sample.jpeg");

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
