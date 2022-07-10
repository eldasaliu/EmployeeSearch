package com.neotech.Lesson33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
String filePath="\\Users\\Elda\\Downloads ";

FileInputStream fis=new FileInputStream(filePath);
//Read the workbook(the whole excel file
Workbook book =new XSSFWorkbook(filePath);
//Accessing the sheet that i want to read
Sheet sheet =book.getSheet("Sheet1");
//Accessing the row that i want to read

Row row =sheet .getRow(0);
//Accessing the cell that i want to read
Cell cell =row.getCell(1);

//Getting data or information from the cell
String info=cell.toString();
System.out.println();

	}

}
