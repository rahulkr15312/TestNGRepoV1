package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassdemo {

	public static void main(String[] args) {
		RemoteWebDriver r;
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/how-to-enter-a-letter-in-uppercase-in-the-edit-box-using-actions-in-selenium#:~:text=We%20can%20enter%20a%20letter,Finally%20use%20build().");
		Actions act = new Actions(driver);
		
		//act.keyDown(driver.findElement(By.xpath("//input[@id='search-strings']")), Keys.SHIFT).sendKeys("shjdsh").keyUp(Keys.SHIFT).build().perform();
		
 act.moveToElement(driver.findElement(By.xpath("//input[@id='search-strings']"))).click().keyDown(Keys.SHIFT).sendKeys("shjdsh").keyUp(Keys.SHIFT).build().perform();
	driver = new EdgeDriver();
	}

}
