package com.jpet.excelutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class jpet_exceldata {
	public  String excel_username(int i) throws IOException 
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell =row.getCell(0);
		cell.setCellType(CellType.STRING);
		String un =cell.getStringCellValue();
		return un;
	}
			
	
	public  String excel_password(int i) throws IOException 
	{ 
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell1 =row.getCell(1);
		cell1.setCellType(CellType.STRING);
		String pwd =cell1.getStringCellValue();
		return pwd;
		
	}
	public  String Firstname(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell2 =row.getCell(2);
		cell2.setCellType(CellType.STRING);
		String Fname =cell2.getStringCellValue();
		return Fname;
	}

	public  String Lastname(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell3 =row.getCell(3);
		cell3.setCellType(CellType.STRING);
		String Lname =cell3.getStringCellValue();
		return Lname;
	}
	public  String Email(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell4 =row.getCell(4);
		cell4.setCellType(CellType.STRING);
		String Email =cell4.getStringCellValue();
		return Email;
	}
	public  String Phone(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell5 =row.getCell(5);
		cell5.setCellType(CellType.STRING);
		String Phone =cell5.getStringCellValue();
		return Phone;
	}
	public  String Address1(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell6 =row.getCell(6);
		cell6.setCellType(CellType.STRING);
		String Address1 =cell6.getStringCellValue();
		return Address1;
	}
	public  String Address2(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell7 =row.getCell(7);
		cell7.setCellType(CellType.STRING);
		String Address2 =cell7.getStringCellValue();
		return Address2;
	}
	public  String City(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell8 =row.getCell(8);
		cell8.setCellType(CellType.STRING);
		String City =cell8.getStringCellValue();
		return City;
	}
	public  String State(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell9 =row.getCell(9);
		cell9.setCellType(CellType.STRING);
		String State =cell9.getStringCellValue();
		return State;
	}
	public  String Zip(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell10 =row.getCell(10);
		cell10.setCellType(CellType.STRING);
		String Zip =cell10.getStringCellValue();
		return Zip;
	}
	public  String Country(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\test_data\\Jpet_Register.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell11 =row.getCell(11);
		cell11.setCellType(CellType.STRING);
		String Country =cell11.getStringCellValue();
		return Country;
	}	
}
