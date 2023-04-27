package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceBooktest {

	
	@Test
	void login() {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 ChromeDriver driver = new ChromeDriver(chromeOptions);
		 
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(Keys.ENTER);
		
		Assert.assertEquals("The email address or mobile number you entered isn't connected to an account. Find your account and log in.",driver.findElement(By.xpath("//*[@id='email_container']/div[2]")).getText());
	}
}
