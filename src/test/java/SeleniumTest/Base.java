package SeleniumTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
	public void initialization() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com");
	}
public void failedTestCasesScreenshot(String methodNmae) throws IOException {
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	
	File src= ts.getScreenshotAs(OutputType.FILE);
	
	File trg= new File("C:\\Users\\HP\\eclipse-workspace\\BDDCucumberFramework\\src\\test\\java\\SeleniumTest\\ss1.png");
	FileUtils.copyFile(src, trg);
	
	FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("C:\\Users\\HP\\eclip"
			+ "se-workspace\\BDDCucumberFramework\\src\\test\\java\\SeleniumTest\\"+methodNmae+".png"));
	
	
	Alert alert = driver.switchTo().alert();
	
	Actions act;
	
//	Action action = null;
//	action.;
	
}
}
