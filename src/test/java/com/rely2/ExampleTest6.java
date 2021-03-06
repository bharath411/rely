package com.rely2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleTest6 {

	@Test
	public void verifyProfile() {
		// Login
		// Click on profile
		System.out.println("verifyProfile");
		// Verify Profile
	}

	@Test(groups= {"regression"})
	public void searchProduct() {
		// Search Product
		// Click on Product
		System.out.println("searchProduct");
		// Verify Product
	}
	
	@Test(groups= {"smoke","regression"})
	public void verifyProductCreation() {
		// Login
		// Click on product
		// Create Product
		System.out.println("verifyProductCreation");
		// verify product
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am afterSuite");
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
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Browser launched");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser closed");
	}
	
	@BeforeClass
	public void init() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("Tear Down");
	}
}
