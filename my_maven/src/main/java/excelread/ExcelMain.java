package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		String s = ExcelCode.readStringData(0,0);
		double d = ExcelCode.readIntegerData(0,1);
		
		//String s1 = ExcelCode.readStringData(0,1);
		//double d1 = ExcelCode.readIntegerData(0,2);
		System.out.println(s);
		System.out.println(d);
		//System.out.println(s1);
		//System.out.println(d1);
	}

}
