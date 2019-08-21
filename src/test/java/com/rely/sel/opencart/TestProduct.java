package com.rely.sel.opencart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestProduct extends BaseTest{

	
	public void search(String product) {
		driver.findElement(By.name("search")).sendKeys(product);
		driver.findElement(By.cssSelector(".fa-search")).click();
	}
	
	public void clickOnSearchResult() {
		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'product-layout')]//h4/a"));
		System.out.println(elements.size());
		
		if(elements.size()>0) {
			driver.findElement(By.xpath("//div[contains(@class,'product-layout')]//h4/a")).click();
		}else {
			String message = driver.findElement(By.xpath("//div[@id='content']/p[2]")).getText();
			System.out.println(message);
		}
		
	}
	
	@Test
	public void verifyProductName1() {
		search("iphone");
		clickOnSearchResult();
	}
	
	@Test
	public void verifyProductName2() {
		WebElement target = driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions actions  = new Actions(driver);
		actions.moveToElement(target).build().perform();
		driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
	}
	
	@Test
	public void verifyProductSorting() {
		WebElement target = driver.findElement(By.xpath("//a[text()='Components']"));
		Actions actions  = new Actions(driver);
		actions.moveToElement(target).build().perform();
		driver.findElement(By.xpath("//a[text()='Monitors (2)']")).click();
		
		WebElement selectElement = driver.findElement(By.id("input-sort"));
		Select select = new Select(selectElement);
		
		//Selected Options
		WebElement selectedOption = select.getFirstSelectedOption();
		String actualSelectValue = selectedOption.getText();
		Assert.assertEquals(actualSelectValue, "Default");
		
		//select one option from dropdown by visible text
		select.selectByVisibleText("Price (High > Low)");
		
		selectElement = driver.findElement(By.id("input-sort"));
		select = new Select(selectElement);
		List<WebElement> list = select.getOptions();
		for (WebElement webElement : list) {
			String v =webElement.getText();
			System.out.println(v);
		}
		
	}
}

