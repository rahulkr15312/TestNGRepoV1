package SeleniumTest;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(CustomListener.class)
public class TakeScreenshotClass extends Base {
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
    @Test
	public void TakeScreenshotMethod() {
		
		
		Assert.assertEquals(false, true);

	}
    @Test
   	public void TakeScreenshotMethod1() {
   		
   		
   		Assert.assertEquals(false, true);

   	}

}
