package SeleniumTest;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	
	@Test
	void MyCalender() {
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		Random rand = new Random();
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 ChromeDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html"); 
		
		driver.findElement(By.xpath("//*[@id='datepicker']"));
		
		SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy");
		
		String aDate = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
