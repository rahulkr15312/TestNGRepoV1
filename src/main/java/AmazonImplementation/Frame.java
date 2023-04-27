package AmazonImplementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws IOException {
		
////		WebDriverManager.chromedriver().setup();
////		WebDriver  driver = new ChromeDriver();
////		
////		driver.get("//");
////		
////		driver.switchTo().frame(0);
////		
////		String text= driver.findElement(By.xpath("//")).getText();
//		
//		int[] a= {1,8,7,3,0,5,7};
//		int max=-1;
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		int secondMax=-1;
//		for(int j=0;j<a.length;j++) {
//			
//			if(a[j]==max) {
//				continue;
//			}
//			else if(a[j]>secondMax) {
//				secondMax=a[j];
//			}
//		}
//		
//		System.out.println(secondMax);
//		
//		for(int k=0;k<a.length;k++) {
//			if(a[k]==secondMax) {
//				System.out.print(k+" ");
//			}
//		}
		
		
		
		
		JSONParser parser = new JSONParser();
	      try {
	         Object obj = parser.parse(new FileReader("C:\\Users\\HP\\Documents\\data.json"));
	         JSONObject jsonObject = (JSONObject)obj;
	         String name = (String)jsonObject.get("userName");
	         Long Salary = (Long) jsonObject.get("Salary");
	         String DOJ = (String) jsonObject.get("DOJ");
	         System.out.println("Name: " + name);
	         System.out.println("Slary: " + Salary);
	         System.out.println("DOJ:"+ DOJ);
//	         Iterator iterator = (Iterator) subjects.iterator();
//	         while (((java.util.Iterator) iterator).hasNext()) {
//	            System.out.print(iterator.next());
//	         }
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
		
		}

}
