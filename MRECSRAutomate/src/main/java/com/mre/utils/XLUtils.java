package com.mre.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mre.base.BaseSetup;

public class XLUtils extends BaseSetup{
public static ArrayList<String> getInputData(String path , String sheetName ,String testCaseName , String rowName ) throws IOException {
		
		ArrayList<String> arrayListString=new ArrayList<String>();
		//String usInputTestData = System.getProperty("user.dir")+"\\src\\main\\java\\com\\mre\\qa\\testdata"+"\\USInput.xlsx\\";
		FileInputStream fInputStream=new FileInputStream(path);
		XSSFWorkbook workBook=new XSSFWorkbook(fInputStream);
		int sheets=workBook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
		if(workBook.getSheetName(i).equalsIgnoreCase(sheetName))
		{
		XSSFSheet sheet=workBook.getSheetAt(i);
		//Identify Testcases coloum by scanning the entire 1st row

		Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
		Row firstRow= rows.next();
		Iterator<Cell> iteratorCellRow=firstRow.cellIterator();//row is collection of cells
		int k=0;
		int coloumn = 0;
		while(iteratorCellRow.hasNext())
		{
		Cell value=iteratorCellRow.next();

		if(value.getStringCellValue().equalsIgnoreCase(testCaseName))
		{
		coloumn=k;

		}

		k++;
		}

		////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
		while(rows.hasNext())
		{

		Row r=rows.next();

		if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(rowName))
		{

		////after you grab purchase testcase row = pull all the data of that row and feed into test

		Iterator<Cell>  iteratorCellColumn=r.cellIterator();
		while(iteratorCellColumn.hasNext())
		{
			Cell cell= iteratorCellColumn.next();
			if(cell.getCellType()==CellType.STRING)
			{

				arrayListString.add(cell.getStringCellValue());

			}
			else{
				arrayListString.add(NumberToTextConverter.toText(cell.getNumericCellValue()));

			}
			}
		}
		}
		}
		}
		return arrayListString;

	}
	public static ArrayList<String> setOutputTestData(String path , String sheetName ,String testCaseName , String rowName ) throws IOException{

		//String usOutputTestData = System.getProperty("user.dir")+"\\src\\main\\java\\com\\mre\\qa\\testdata"+"\\USOutput.xlsx\\";
		FileInputStream fInputStream=new FileInputStream(path);
		XSSFWorkbook workBook=new XSSFWorkbook(fInputStream);
		int sheets=workBook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
		if(workBook.getSheetName(i).equalsIgnoreCase(sheetName))
		{
		XSSFSheet sheet=workBook.getSheetAt(i);
	   
		
		Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
		Row firstRow= rows.next();
		Iterator<Cell> iteratorCellRow=firstRow.cellIterator();//row is collection of cells
		int k=0;
		int coloumn = 0;
		while(iteratorCellRow.hasNext())
		{
		Cell value=iteratorCellRow.next();

		if(value.getStringCellValue().equalsIgnoreCase(testCaseName))
		{
		coloumn=k;

		}

		k++;
		}

		////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
		while(rows.hasNext())
		{
		Row r=rows.next();
		if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(rowName))
		{

			
			for(int j = 1; j <arrayListStringOutput.size() ; j++){
    			r.createCell(j).setCellValue(arrayListStringOutput.get(j));
		    }
			fInputStream.close();
		    FileOutputStream outputStream = new FileOutputStream(path);
		    //write data in the excel file
		    workBook.write(outputStream);
		    //close output stream
		    outputStream.close();
		}
		}
		}
		}
		return arrayListStringOutput;
		

	}

	
}
