package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{
	//FileInputStream
	//XSSFWorkbook
    //XSSFSheet
	//creating as non primitive data type as predefined class
	
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	//i=row j=column
	public static String readStringData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\manoj\\Desktop\\ExcelRead.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");    //predefined class   ////to fetch row
		XSSFRow r=s.getRow(i);//non prim data type class ////to fetch column
		XSSFCell c=r.getCell(j); //to fetch column-predefined method
		return c.getStringCellValue();
		
	}
	
	public static double readIntegerData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\manoj\\Desktop\\ExcelRead.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(i);     //non prim data type  ////to fetch row
		XSSFCell c=r.getCell(j);    //to fetch column
		return c.getNumericCellValue();
	}
}
