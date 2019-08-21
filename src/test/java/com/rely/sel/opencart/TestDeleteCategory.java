package com.rely.sel.opencart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestDeleteCategory extends BaseTest{

	public void launchAdminApp() {
		driver.get(url+"/admin");
	}
	
	public void adminLogin(String user, String password) {
		
		WebElement ele = driver.findElement(By.id("input-username"));
		String nva = ele.getAttribute("name");
		System.out.println(nva);
		Rectangle re = ele.getRect();
		int h = re.getHeight();
		int w = re.getWidth();
		re.getX();
		re.getY();
		System.out.println("height : " + h + " ; Width : " + w);
		
		Dimension dim  = ele.getSize();
		dim.getHeight();
		dim.getWidth();
		String tag = ele.getTagName();
		System.out.println(tag);
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
		ele.clear();
		ele.sendKeys("bbbb");
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector(".btn-primary")).click();
	}
	
	public void deleteCatalog() {
		driver.findElement(By.cssSelector(".fa-trash-o")).click();
		
		Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		alert.accept();
		//alert.dismiss();
		//alert.sendKeys("avva");
	}
	
	
	@Test
	public void verifyDeleteCat() {
		launchAdminApp();
		adminLogin("demo","demo123");
		clickOnCatalog();
		clickOnCategories();
		deleteCatalog();
		createCategory();
	}
	
	@Test
	public void verifyDele() {
		launchAdminApp();
		adminLogin("bharath","bharath123");
		clickOnCatalog();
		clickOnCategories();
		deleteCatalog();
		createCategory();
	}
	
	
}
