package SeleniumTest;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popupTest {

	public  void PopupTest() {
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver= new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dummysoftware.com/popupdummy_testpage.html");
		String pw=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@value='Safe New Window']")).click();
		
		
		Set<String> set=driver.getWindowHandles();
		System.out.println(pw);
		System.out.println(set);
		

	}
	@Test
public  void poshan() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		Random rand = new Random();
		
		
		for(int i=0;i<20;i++) {
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 ChromeDriver driver = new ChromeDriver(chromeOptions);
		
		 driver.get("https://poshanabhiyaan.gov.in/login");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("mow&cd-1021609");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("mow&cd-1021609");
		
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(5000);
		Select s1 = new Select(driver.findElement(By.xpath("//*[@name='SelectTheme']")));
		//s1.selectByVisibleText("Promotion and popularization of Shree Anna/ Millets for nutritional wellbeing");
		s1.selectByIndex(4);
		
		Select s2 = new Select(driver.findElement(By.xpath("//*[@name='SelectLevel']")));
		s2.selectByVisibleText("AWC");
		
Thread.sleep(2000);
		Select s3 = new Select(driver.findElement(By.xpath("//*[@name='awc_center']")));
		s3.selectByVisibleText("Bagari Harijan Samudayik Bhawan-102");
		
		int randomNum = rand.nextInt(24) + 1;
		
		Select s4 = new Select(driver.findElement(By.xpath("//*[@name='SelectActivity']")));
		s4.selectByIndex(randomNum);
		
		
		//driver.findElement(By.xpath("//*[@name='SelectDateFrom']")).sendKeys(Keys.ENTER);
		
		int r1 = rand.nextInt(10) + 5;
		int r2 = rand.nextInt(10) + 5;
		int r3 = rand.nextInt(10) + 5;
		int r4 = rand.nextInt(10) + 5;
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='CountAdultMale']")).sendKeys(String.valueOf(r1));
		
		
		driver.findElement(By.xpath("//*[@name='CountAdultFemale']")).sendKeys(String.valueOf(r2));
		
		
		
		driver.findElement(By.xpath("//*[@name='CountChildMale']")).sendKeys(String.valueOf(r3));
		
		
		driver.findElement(By.xpath("//*[@name='CountChildFemale']")).sendKeys(String.valueOf(r4));
		
		Thread.sleep(5000);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@type='submit']")));
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	}
}
