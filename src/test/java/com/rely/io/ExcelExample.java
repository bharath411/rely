package com.rely.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelExample {

	@Test
	public void test1() {
		
		File file = new File("C:\\Bharath\\Login.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(1);
			XSSFCell cell = row.getCell(1);
			
			String st = cell.getStringCellValue();
			
			cell = row.getCell(0);
			int db = (int)cell.getNumericCellValue();
			System.out.println(st);
			System.out.println(db);
			String sss = db+"";
			String ssss = String.valueOf(db);
			cell = row.getCell(3);
			boolean bb = cell.getBooleanCellValue();
			System.out.println(bb);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		
		File file = new File("C:\\Bharath\\Login.xls");
		try {
			FileInputStream fis = new FileInputStream(file);
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet sheet = workbook.getSheet("Sheet1");
			
			HSSFRow row = sheet.getRow(1);
			HSSFCell cell = row.getCell(1);
			
			String st = cell.getStringCellValue();
			
			cell = row.getCell(0);
			int db = (int)cell.getNumericCellValue();
			System.out.println(st);
			System.out.println(db);
			String sss = db+"";
			String ssss = String.valueOf(db);
			cell = row.getCell(3);
			boolean bb = cell.getBooleanCellValue();
			System.out.println(bb);
			
			HSSFRow row2 = sheet.getRow(2);
			HSSFCell cell2 = row2.getCell(1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

