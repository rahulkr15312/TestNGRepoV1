package DataProviderDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestUtil {
	
	//@DataProvider()

	static String[][] getData() throws IOException{

	

	File myFile = new File("C:\\Users\\HP\\Documents\\demo.xlsx");

	FileInputStream fis= new FileInputStream(myFile);

	XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh=  wb.getSheetAt(0);

	int rowCount = sh.getLastRowNum();

	int colCount = sh.getRow(0).getLastCellNum();
	String[][] myData = new String[rowCount+1][colCount];
	
	//System.out.println(rowCount+" "+colCount);

	for(int i=0;i<=rowCount;i++){

	XSSFRow row= sh.getRow(i);
	for(int j=0;j<colCount;j++){

	XSSFCell cellData= row.getCell(j);

	DataFormatter formatter = new DataFormatter();

	String data = formatter.formatCellValue(cellData);
	
	

	myData[i][j]=data;
	
	System.out.print(data+" ");

	}
	
	System.out.println();
	}
	

	return myData;
		
		
//		List<String> list = new ArrayList<>();
//		
//		list.add("ekbdjjk");
//		list.add("wqdkmlw");
//		
//		return list.iterator();
		

	}
	
	public static void main(String[] args) throws IOException {
		
		File myFile = new File("C:\\Users\\HP\\Documents\\demo.xlsx");

		FileInputStream fi= new FileInputStream(myFile);
		
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		
		XSSFSheet sh= wb.getSheetAt(0);
		
		int rn= sh.getLastRowNum();
		int cn= sh.getRow(0).getLastCellNum();
		
		String[][] d= new String[rn+1][cn];
		
		for(int i=0;i<=rn;i++) {
			
			XSSFRow r= sh.getRow(i);
			
			for(int j=0;j<cn;j++) {
				
				XSSFCell cell= r.getCell(j);
				
				DataFormatter df= new DataFormatter();
				
				String s= df.formatCellValue(cell);
				
				d[i][j]=s;
				
				System.out.print(s+" ");

			}
			
			System.out.println();
			}
		}
		
		
	}


