package com.rely.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileExample {

	@Test
	public void test2() {

		File file = new File("C:\\Bharath\\sample.txt");
		try {
			FileReader fd = new FileReader(file);
			BufferedReader bd = new BufferedReader(fd);
			String st = "";
			while ((st = bd.readLine()) != null) {
				System.out.println(st);
			}
			bd.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void test3() {

		File file = new File("C:\\Bharath\\sample.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			char ch = 0;
			int ii = 0;		
			while( (ii= bis.read()) != -1) {
				ch = (char) ii;
				System.out.print(ch);
			}
			bis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
