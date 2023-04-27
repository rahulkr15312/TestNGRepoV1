package SeleniumTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void clickOn(WebDriver driver,int timeOut, WebElement element ) {
		new WebDriverWait(driver, Duration.ofSeconds(timeOut)).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public static void sendKeys(WebDriver driver,Duration timeOut, WebElement element, String str ) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(str);
	}
	
}
