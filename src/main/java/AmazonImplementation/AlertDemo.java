package AmazonImplementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws IOException {
//		WebDriver driver = new ChromeDriver();
//	 driver.get("");
//		
//		Alert alert = driver.switchTo().alert();
		int a[] = {0,0,1,1,0};
		String t="";
		for(int i=0;i<a.length;i++) {
		 t=t+String.valueOf(a[i]);
		}
		String n= t.charAt(t.length()-1)+t.substring(0, t.length()-1);
		
		System.out.println(n);
		
		char []z= n.toCharArray();
		System.out.println(	Arrays.toString(z));
		
		File file = new File("");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
	}

}
