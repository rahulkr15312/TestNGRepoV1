package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestClosingOfBrowser {
	
	WebDriver driver;
	
	
	@Test
	void t1(){
		driver= new ChromeDriver();;
		driver.get("https://automationexercise.com/view_cart");
		
		String p1= driver.findElement(By.xpath("//td[@class='cart_price']/p[text()='Rs. 500']")).getText();
		System.out.println(p1);
	}	
	
//	@Test
//	void t1(){
//		driver= new ChromeDriver();;
//		driver.get("https://pib.gov.in/PressReleasePage.aspx?PRID=1885147#:~:text=as%20on%2031.10.-,2022.,the%20period%20Jan%20to%20Oct.");
//		Assert.assertEquals(true, true);
//	}
//	@Test
//	void t2(){
//		driver= new ChromeDriver();;
//		driver.get("https://pib.gov.in/PressReleasePage.aspx?PRID=1885147#:~:text=as%20on%2031.10.-,2022.,the%20period%20Jan%20to%20Oct.");
//		Assert.assertEquals(true, false);
//	}
//	
//	@Test
//	void t3(){
//		driver= new ChromeDriver();;
//		driver.get("https://pib.gov.in/PressReleasePage.aspx?PRID=1885147#:~:text=as%20on%2031.10.-,2022.,the%20period%20Jan%20to%20Oct.");
//		Assert.assertEquals(true, true);
//	}
//	
//@AfterMethod
//void tearDown() {
//	driver.close();
//}
}
