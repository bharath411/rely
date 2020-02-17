package com.rely2;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExampleTest7 {

	@Test
	public void verifyProfile() {
		// Login
		// Click on profile
		System.out.println("verifyProfile");
		// Verify Profile
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before suite method");
	}
	
	@Test(groups= {"regression"})
	public void searchNewItem() {
		// Search Product
		// Click on Product
		System.out.println("searchProduct");
		// Verify Product
	}
	
	
}
