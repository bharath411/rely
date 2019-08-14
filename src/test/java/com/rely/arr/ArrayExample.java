package com.rely.arr;

import org.testng.annotations.Test;

public class ArrayExample {

	@Test
	public void test1() {
		
		int i = 10; 
		int j[] =  {1,2,4,5,6} ;
		String st[]  = {"aa","ds","ewrew","wqrewfew"};
	
		System.out.println(st.length);
		System.out.println(j.length);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(st);
		
		for(int k=0;k<5; k++) {
			System.out.println(j[k]);
		}
		
		int[] m = {23,4,3,5};
		
		int n[] = new int[32];
		
		n[0] = 1;
		n[1] = 10;
		n[2] = 30;
		
		for(int k = 0; k< n.length;k++) {
			System.out.println(n[k]);
		}
		
		String st2[] = new String[5];
 	}
	
	@Test
	public void test2() {
		
		// Reverse a string.
		String name = "Kristipati Bharath Kumar Reddy";
		
		int size = name.length();
		char ar[] = new char[size];
		
		for(int i = 0; i<ar.length;i++) {
			ar[i] = name.charAt( i);
		}
		
		String reverse = "";
		
		for(int i= ar.length-1;i>=0;i--) {
			reverse = reverse + ar[i];
		}
		System.out.println(reverse);
	}
	
	@Test
	public void test3() {
		
		// Reverse a string.
		String name = "Kristipati Bharath Kumar Reddy";
		char ar[] = name.toCharArray();
		
				
		String reverse = "";
		
		for(int i= ar.length-1;i>=0;i--) {
			reverse = reverse + ar[i];
		}
		System.out.println(reverse);
	}
	
	@Test
	public void test4() {
		String name = "Kristipati Bharath Kumar Reddy";
		
		String reverse = "";
		for (int i = name.length()-1; i >=0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
	}
	
	
	
	
	
}
