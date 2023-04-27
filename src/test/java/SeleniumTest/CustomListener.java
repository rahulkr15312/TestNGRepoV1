package SeleniumTest;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {

//	@Override		
//    public void onFinish(ITestContext arg0) {					
//        // TODO Auto-generated method stub				
//        		
//    }		
//
//    @Override		
//    public void onStart(ITestContext arg0) {					
//        // TODO Auto-generated method stub				
//        		
//    }		
//
//    @Override		
//    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
//        // TODO Auto-generated method stub				
//        		
//    }		
//
    @Override		
    public void onTestFailure(ITestResult result) {					
    	try {
			failedTestCasesScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
        		
    }		
//
//    @Override		
//    public void onTestSkipped(ITestResult arg0) {					
//        // TODO Auto-generated method stub				
//        		
//    }		
//
//    @Override		
//    public void onTestStart(ITestResult arg0) {					
//        // TODO Auto-generated method stub				
//        		
//    }		
//
//    @Override		
//    public void onTestSuccess(ITestResult arg0) {					
//        // TODO Auto-generated method stub				
//        		
//    }	

}
