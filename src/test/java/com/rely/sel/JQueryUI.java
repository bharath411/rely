package com.rely.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JQueryUI {

	WebDriver driver;
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Bharath\\Personal\\selenium-jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com");
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement iframeEle = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(iframeEle);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		System.out.println(drag.getText());
		
		WebElement drop = driver.findElement(By.cssSelector("#droppable"));
		System.out.println(drop.getText());
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
		
		String message = driver.findElement(By.cssSelector("#droppable")).getText();
		System.out.println(message);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		
	}
	
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Bharath\\Personal\\selenium-jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com");
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement iframeEle = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(iframeEle);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.cssSelector("#droppable"));
		
		Point point1 = drag.getLocation();
		int x1 = point1.getX();
		int y1 = point1.getY();
		
		Point point2 = drop.getLocation();
		int x2 = point2.getX();
		int y2 = point2.getY();
		
		int x = x2 - x1;
		int y = y2 - y1;
		
		System.out.println(x);
		System.out.println(y);
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(drag).moveByOffset(x, 10).release().build().perform();
		
		String message = driver.findElement(By.cssSelector("#droppable")).getText();
		System.out.println(message);
		
		
	}
}
