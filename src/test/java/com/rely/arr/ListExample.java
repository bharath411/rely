package com.rely.arr;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ListExample {

	@Test
	public void test1() {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("bharath");
		list.add("kumar");
		list.add("reddy");
		list.add("hh");
		list.add("dss");
		list.add("sdf");
		list.add("tttt");
		list.add("eeee");
		list.add("wwww");
		
		int number = list.size();
		
		String st = list.get(4);
		
		for(int i =0;i<list.size(); i++ ) {
			System.out.println(list.get(i));
		}
		
		list.add(5, "bbbbb");
		list.remove(6);
		
		for (String string : list) {
			System.out.println(string);
		}
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		ArrayList<Student> batch = new ArrayList<Student>();
		
		Student st1 = new Student();
		batch.add(st1);
		

		
	}
}
