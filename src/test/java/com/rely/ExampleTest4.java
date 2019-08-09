package com.rely;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleTest4 {

	@Test
	public void verifyUser() {
		// Login
		// Click on profile
		System.out.println("verifyUser");
		// Verify Profile
	}

	@Test
	public void verifyOrder() {
		
		// Login
		// Click on category
		System.out.println("verifyOrder");
		// Create category
		// verify category
		// close browser
		
	}
	
	
	
	@BeforeClass
	public void createData() {
		System.out.println("createData");
	}
	
	@AfterClass
	public void flushData() {
		System.out.println("flushData");
	}
}
