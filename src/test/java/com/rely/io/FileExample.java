package com.rely.io;

import java.io.BufferedReader;
import java.io.File;
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
			while((st = bd.readLine())!=null) {
				System.out.println(st);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
