package com.rely.arr;

import java.util.HashSet;

import org.testng.annotations.Test;

public class SetExample {

	@Test
	public void test1() {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("bharath");
		set.add("kumar");
		set.add("bharath");
		
		System.out.println(set.size());
		
		for(String s : set  ) {
			System.out.println(s);
		}
		
		set.add(null);
		
		set.remove("bharath");
	
		
	}
}
