package AmazonImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NAquiz {

	
	@Test
	void stateTest() {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor j  =  (JavascriptExecutor)driver;
		 
		 
		 driver.get("https://petdiseasealerts.org/forecast-map/#/");
		 
		 j.executeScript("window.scrollBy(0,350)", "");
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 driver.findElement(By.xpath("//*[@name='California']")).click();
	}

}
