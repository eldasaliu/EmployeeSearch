package com.neotech.Review10;

import java.io.FileInputStream;
import java.io.IOException;

import com.neotech.review10.Cell;
import com.neotech.review10.Row;
import com.neotech.review10.Sheet;
import com.neotech.review10.Workbook;
import com.neotech.review10.XSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) throws IOException {

		String fullPath = System.getProperty("user.dir") + "/extra/Excel.xlsx";

		FileInputStream fis = new FileInputStream(fullPath);

		// Get the whole excel file
		Workbook book = new XSSFWorkbook(fis);

		// Google: apache poi read excel file example

		// Get the sheet from the file
		Sheet sheet = book.getSheet("Sheet1");

		// Get the row (with index 3) from the sheet
		Row row3 = sheet.getRow(3);

		// Get the cell from (with index 1) the row
		Cell cell1 = row3.getCell(1);

		// Print the information of the cell
		System.out.println(cell1.toString());

		// Let's get all the headers of the sheet and print them
		Row headerRow = sheet.getRow(0);

		// How many cells are in the header row?
		int cellNumber = headerRow.getLastCellNum();

		System.out.println("------------------------");
		for (int i = 0; i < cellNumber; i++) {
			String cellData = headerRow.getCell(i).toString();
			System.out.print(cellData + "\t");
		}
		System.out.println();

		System.out.println("------------------------");

		// How many rows are in the sheet?
		int rows = sheet.getPhysicalNumberOfRows();

		// I am skipping row with index 0, because I already printed it
		for (int row = 1; row < rows; row++) {

			for (int cell = 0; cell < cellNumber; cell++) {
				String cellInfo = sheet.getRow(row).getCell(cell).toString();
				System.out.print(cellInfo + "\t\t");
			}
			System.out.println();

		}

	}

}

}
