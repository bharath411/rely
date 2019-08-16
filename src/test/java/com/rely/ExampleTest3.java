package com.rely;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleTest3 {

	@Test
	public void verifyProfile() {
		// Login
		// Click on profile
		System.out.println("verifyProfile");
		// Verify Profile
	}

	@Test
	public void searchProduct() {
		// Search Product
		// Click on Product
		System.out.println("searchProduct");
		// Verify Product
	}
	
	@Test
	public void verifyProductCreation() {
		// Login
		// Click on product
		// Create Product
		System.out.println("verifyProductCreation");
		// verify product
	}

	@Test
	public void verifyCatCreate() {
		
		// Login
		// Click on category
		System.out.println("verifyCatCreate");
		// Create category
		// verify category
		// close browser
		
	}
	
	@BeforeMethod(groups= {"srs"})
	public void launchBrowser() {
		System.out.println("Browser launched");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser closed");
	}
}
