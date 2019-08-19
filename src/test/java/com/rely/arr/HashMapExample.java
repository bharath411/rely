package com.rely.arr;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class HashMapExample {

	@Test
	public void test1() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "one");
		map.put(2, "two");

		map.put(null, "null");
		map.put(null, "second null");

		String s1 = map.get(1);

		Set<Integer> keys = map.keySet();

		for (Integer key : keys) {
			String value = map.get(key);
			System.out.println(value);
		}


		keys = map.keySet();

		Iterator<Integer> it = keys.iterator();
		
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(map.get(i));
			
		}
		
		HashMap<Student, String> map1 = new HashMap<Student, String>();// not synchronized
		
		Hashtable<Integer,String> ha = new Hashtable<Integer,String>();// synchronized
		
		TreeMap<Student, String> map2 = new TreeMap<Student, String>();
		
		
	}
}
