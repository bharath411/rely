package com.rely;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest2 {

	@Test
	public void verifyProductCreation() {
		System.out.println("verifyProductCreation");
	}
	
	@Test()
	public void verifyCategoriesCreation() {
		System.out.println("verifyCategoriesCreation");
		Assert.fail(" Mandatory failed");
	}
	
	@Test
	public void verifyProductUpdate() {
		System.out.println("verifyProductUpdate");
	}
	
	@Test(dependsOnMethods="verifyCategoriesCreation")
	public void verifyCatDeletion() {
		System.out.println("verifyCatDeletion");
	}
	
	// Alphabetical Order
}
