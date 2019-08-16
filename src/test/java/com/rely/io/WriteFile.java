package com.rely.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class WriteFile {

	@Test
	public void test1() {
		
		String st = "I am learning java";
		
		File file  = new File("C:\\Bharath\\newtext.txt");
		try {
			FileWriter writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(st);
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test2() {
		
		String str = "I am learning java";
		
		File file  = new File("C:\\Bharath\\sample.txt");
		try {
			
			FileReader fd = new FileReader(file);
			BufferedReader bd = new BufferedReader(fd);
			String st = "";
			String fStr = "";
			while ((st = bd.readLine()) != null) {
				fStr= fStr + st;
			}
			fStr = fStr + str;
			FileWriter writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(fStr);
			
			bw.close();
			bd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test3() {
		
		String str = "I am bharath";
		byte[] arr = str.getBytes(); 
		File file = new File("C:\\Bharath\\sample2.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(arr);
			bos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
