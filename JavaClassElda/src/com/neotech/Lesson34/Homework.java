package com.neotech.Lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Homework {

	public static void main(String[] args) throws IOException {
		String filePath ="/Users/Elda/Downloads/Homework.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);

		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Companies");
//1
		List<String> l = new ArrayList<>();

		Row a = sheet.getRow(2);
		int cols = a.getLastCellNum();

		for (int b = 0; b < cols; b++) {

			l.add(a.getCell(b).toString());
		}
//2
		Set<Double> set = new HashSet<>();

		int row = sheet.getPhysicalNumberOfRows();

		for (int i = 1; i < row; i++) {
			set.add(sheet.getRow(i).getCell(4).getNumericCellValue());

		}
		System.out.println(set);
	}
}
