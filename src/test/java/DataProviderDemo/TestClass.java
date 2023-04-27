package DataProviderDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	
	
	
	@Test(dataProvider="getData", dataProviderClass=TestUtil.class)
	
	void demo(String uname) throws IOException, InterruptedException {
		
		//String[][] myData= TestUtil.getData();
		
//		WebDriver driver = new ChromeDriver();
//		
//		System.out.println(uname+" "+pword);
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//Thread.sleep(10000);
//		driver.findElement(By.name("username")).sendKeys(uname);
//		
//		driver.findElement(By.name("password")).sendKeys(pword);
//		
//		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		
		System.out.println(uname);
		
	}

}
