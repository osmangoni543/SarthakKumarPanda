package com.automation.TestNG.day6.DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class HowToReadFromExcel {
	
	//Step 1 = Add the poi Apache dependencies in your pom.xml file.
	//Step 2 = Create an Excel (.xlsx) Sheet
	//Step 3 = Make sure the data is correct and then paste it in the package.
	         //In case you want to update something in the Excel Sheet, you have to delete it from the package and update the original
	         //file and the paste in again in your package.
	//Step 4 = Create a method and pass the SheetName as input parameter (String).
	//Step 5 = Create the object of FileInputStream Class and in the constructor you will pass the path of the excel sheet.
	
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	@DataProvider(name="TNData")
	public static Object[][] readDataFromExcelSheet() throws Exception {
		Object[][] data = HowToReadFromExcel.readFromExcelSheet("LoginTN");
		return data;
	}
	
	
	public static Object[][] readFromExcelSheet(String sheetName) throws Exception {
	//Step 5 = Create the object of FileInputStream Class and in the constructor you will pass the path of the excel sheet.
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\TestNG\\day6\\DataDrivenTesting\\ExcelDataCode.xlsx");
	
	//Step 6 = Create the object of XSSFWorkbook class and pass the ip in it's constructor
		workbook = new XSSFWorkbook(ip);
		
	//Step 7 = using the reference workbook we will call the method known as getSheet(sheet name)
		sheet = workbook.getSheet(sheetName);
		
	//Step 8 = Once the sheet is created we need to define the rows and columns.
		int rows = sheet.getLastRowNum();
	    int cols = sheet.getRow(0).getLastCellNum();
	    
	//Step 9 = We have to create a 2-Dimensional object Array.
	    Object[][] data = new Object[rows][cols];
	    for(int i=0; i<rows; i++) {
	    	XSSFRow row = sheet.getRow(i+1);
	    	for(int j=0; j<cols; j++) {
	    		XSSFCell cell = row.getCell(j);
	    		
	    		
	//Step 10 = We have to determine the cellType or the dataType stored inside each cell.
	    		CellType cellType = cell.getCellType();
	    		
	    		switch(cellType){
	    		case STRING: data[i][j] = cell.getStringCellValue();
	    		break;
	    		case BOOLEAN: data[i][j] = cell.getBooleanCellValue();
	    		break;
	    		case NUMERIC: data[i][j] = Integer.toString((int)cell.getNumericCellValue());
	    		break;
	    		}	    	
	    	
	    	}
	    }
	    
	    return data;
	
	
	}
	

}
