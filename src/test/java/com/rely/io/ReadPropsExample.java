package com.rely.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropsExample {

	@Test
	public void test1() {
		
		
		try {
			File file = new File("C:\\Bharath\\app.properties");
			FileInputStream fis = new FileInputStream(file);
			
			Properties pr = new Properties();
			pr.load(fis);
			
			String value = pr.getProperty("url");
			System.out.println(value);
			
			String val2 = pr.getProperty("sdfdsfs");
			System.out.println(val2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
